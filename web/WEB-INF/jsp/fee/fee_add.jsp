﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>etCTOSS</title>
    <link type="text/css" rel="stylesheet" media="all" href="../styles/global.css" />
    <link type="text/css" rel="stylesheet" media="all" href="../styles/global_color.css" />
    <script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
    <script language="javascript" type="text/javascript">
        //保存结果的提示

        function showResultDiv(flag) {
            var divResult = document.getElementById("save_result_info");
            if (flag)
                divResult.style.display = "block";
            else
                divResult.style.display = "none";
        }

        //切换资费类型
        function feeTypeChange(type) {
            var inputArray = document.getElementById("main").getElementsByTagName("input");
            if (type == 1) {
                inputArray[4].readonly = true;
                inputArray[4].value = "";
                inputArray[4].className += " readonly";
                inputArray[5].readonly = false;
                inputArray[5].className = "width100";
                inputArray[6].readonly = true;
                inputArray[6].className += " readonly";
                inputArray[6].value = "";
            }
            else if (type == 2) {
                inputArray[4].readonly = false;
                inputArray[4].className = "width100";
                inputArray[5].readonly = false;
                inputArray[5].className = "width100";
                inputArray[6].readonly = false;
                inputArray[6].className = "width100";
            }
            else if (type == 3) {
                inputArray[4].readonly = true;
                inputArray[4].value = "";
                inputArray[4].className += " readonly";
                inputArray[5].readonly = true;
                inputArray[5].value = "";
                inputArray[5].className += " readonly";
                inputArray[6].readonly = false;
                inputArray[6].className = "width100";
            }
        }

        var name_falg = false;
        function doSubmit() {

            var v_name = $("#name").val();
            if (v_name == "") {
                $("#name_error").text("资费名为空");
                $("#name_error").addClass("error_msg");
                return false;
            }
            $.ajax({
                        type: "POST",
                        url: "checkName.from",
                        async: "false",
                        data: {"name": v_name},
                        success: function (ok) {
                            if (ok) {
                                $("#name_error").text("资费名可用");
                                $("#name_error").removeClass("error_msg");
                                name_falg = true;
                            } else {
                                $("#name_error").text("资费名被占用");
                                $("#name_error").addClass("error_msg");
                                name_falg = false;
                            }

                        }
                    }
            )
            return name_falg;
            //                return false;//阻止提交
            //                return true;//允许提交 }

    </script>
</head>
<body>
<!--Logo区域开始-->
<div id="header">
    <img src="../images/logo.png" alt="logo" class="left" />
    <a href="#">[退出]</a>
</div>
<!--Logo区域结束-->
<!--导航区域开始-->
<div id="navi">
    <ul id="menu">
        <li><a href="../index.html" class="index_off"></a></li>
        <li><a href="../role/role_list.html" class="role_off"></a></li>
        <li><a href="../admin/admin_list.html" class="admin_off"></a></li>
        <li><a href="../fee/fee_list.html" class="fee_on"></a></li>
        <li><a href="../account/account_list.html" class="account_off"></a></li>
        <li><a href="../service/service_list.html" class="service_off"></a></li>
        <li><a href="../bill/bill_list.html" class="bill_off"></a></li>
        <li><a href="../report/report_list.html" class="report_off"></a></li>
        <li><a href="../user/user_info.html" class="information_off"></a></li>
        <li><a href="../user/user_modi_pwd.html" class="password_off"></a></li>
    </ul>
</div>
<!--导航区域结束-->
<!--主要区域开始-->
<div id="main">
    <div id="save_result_info" class="save_fail">保存失败，资费名称重复！</div>
    <form action="add.from" onsubmit="return doSubmit();" method="post" class="main_form">
        <div class="text_info clearfix"><span>资费名称：</span></div>
        <div class="input_info">
            <input type="text" class="width300" name="name" id="name" />
            <span class="required">*</span>

            <div class="validate_msg_short" id="name_error">50长度的字母、数字、汉字和下划线的组合</div>
        </div>
        <div class="text_info clearfix"><span>资费类型：</span></div>
        <div class="input_info fee_type">
            <input type="radio" name="cost_type" id="monthly" value="1" onclick="feeTypeChange(1);" />
            <label for="monthly">包月</label>
            <input type="radio" name="cost_type" value="2" checked="checked" id="package" onclick="feeTypeChange(2);" />
            <label for="package">套餐</label>
            <input type="radio" name="cost_type" value="3" id="timeBased" onclick="feeTypeChange(3);" />
            <label for="timeBased">计时</label>
        </div>
        <div class="text_info clearfix"><span>基本时长：</span></div>
        <div class="input_info">
            <input type="text" class="width100" name="base_duration" />
            <span class="info">小时</span>
            <span class="required">*</span>

            <div class="validate_msg_long">1-600之间的整数</div>
        </div>
        <div class="text_info clearfix"><span>基本费用：</span></div>
        <div class="input_info">
            <input type="text" class="width100" name="base_cost" />
            <span class="info">元</span>
            <span class="required">*</span>

            <div class="validate_msg_long error_msg">0-99999.99之间的数值</div>
        </div>
        <div class="text_info clearfix"><span>单位费用：</span></div>
        <div class="input_info">
            <input type="text" class="width100" name="unit_cost" />
            <span class="info">元/小时</span>
            <span class="required">*</span>

            <div class="validate_msg_long error_msg">0-99999.99之间的数值</div>
        </div>
        <div class="text_info clearfix"><span>资费说明：</span></div>
        <div class="input_info_high">
            <textarea class="width300 height70" name="descr"></textarea>

            <div class="validate_msg_short error_msg">100长度的字母、数字、汉字和下划线的组合</div>
        </div>
        <div class="button_info clearfix">
            <input type="submit" value="保存" class="btn_save" />
            <input type="button" value="取消" class="btn_save" />
        </div>
    </form>
</div>
<!--主要区域结束-->
<div id="footer">
    <span>[hf520]</span>
    <br />
    <span>hf520版权所有(C)</span>
</div>
</body>
</html>

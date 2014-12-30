package org.hf520.netctoss.Controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kevin on 2014/12/30.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/tologin")
    public String toLogin(){
        return "login/login";
    }
}

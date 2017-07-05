package com.cjm.Controllers;

import com.cjm.Entities.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cjm on 7/5/17.
 */

@RestController
public class UserControllers {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser() {
        return "user name is cjm.";
    }

    @RequestMapping("/userinfo")
    public UserInfo getUserInfo() {
        return new UserInfo("cjm", "123");
    }
}

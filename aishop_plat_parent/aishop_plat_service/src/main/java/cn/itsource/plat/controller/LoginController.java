package cn.itsource.plat.controller;

import cn.itsource.basic.util.AjaxResult;
import cn.itsource.plat.domain.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    @ApiOperation("json登录接口")
    public AjaxResult login(@RequestBody User user){
        String username =user.getUsername();
        String password =user.getPassword();
        System.out.println(user);
        if ("admin".equals(username)&&"admin".equals(password)){
            return AjaxResult.cg();
        }
        return AjaxResult.diy().setMessage("登录失败").setSuccess(false);
    }

    @PostMapping("/logins")
    @ApiOperation("post提交登录接口")
    public AjaxResult login( String username,String password){
        if ("admin".equals(username)&&"admin".equals(password)){
            return AjaxResult.cg();
        }
        return AjaxResult.diy().setMessage("登录失败").setSuccess(false);
    }

}

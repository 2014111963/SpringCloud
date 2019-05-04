package com.example.demo.MyEmail.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.MyEmail.Annotation.UserLoginToken;
import com.example.demo.MyEmail.Model.Util.User;
import com.example.demo.MyEmail.Service.Impl.TokenService;
import com.example.demo.MyEmail.Service.Impl.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zzc
 * @date 2019-04-08 20:51
 */

@RestController
@RequestMapping("api")
public class UserApiController {
    @Autowired
    UserService userService;
    @Autowired
    TokenService tokenService;
    //登录
    @PostMapping("/login")
    public Object login(@RequestBody User user){
        JSONObject jsonObject=new JSONObject();
        User userForBase=userService.findByUsername(user);
        if(userForBase==null){
            jsonObject.put("message","登录失败,用户不存在");
            return jsonObject;
        }else {
            if (!userForBase.getPassword().equals(user.getPassword())){
                jsonObject.put("message","登录失败,密码错误");
                return jsonObject;
            }else {
                String token = tokenService.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                return jsonObject;
            }
        }
    }
    @UserLoginToken
    @GetMapping("/getMessage")
    public String getMessage(){
        return "你已通过验证";
    }
}

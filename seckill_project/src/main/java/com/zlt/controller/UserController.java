package com.zlt.controller;

import com.zlt.dao.UserMapper;
import com.zlt.domain.User;
import com.zlt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.xml.ws.spi.http.HttpContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired(required = false)
    UserMapper userMapper;

    @GetMapping("/findAllUser")
    @ResponseBody
    public List<User> findAll(){
        List<User> users= userService.findAllUser();
        return users;
    }
    @GetMapping("/insertUser")
    @ResponseBody
    public String insertUser(User user){
        userService.insertUser(user);
        return "添加成功";
    }
    @GetMapping("/updateUser")
    @ResponseBody
    public String updateUser(User user){
        userService.updateUser(user);
        return "更新成功";
    }
    @GetMapping("/selectUserById")
    @ResponseBody
    public User selectUserById(Integer userId){
        return userService.findUserById(userId);
    }
    @GetMapping("/deleteUser")
    @ResponseBody
    public String deleteUser(Integer userId){
        userService.deleteUser(userId);
        return "删除成功";
    }

    @PostMapping("/login")
    public Map<String,Object> login(String username, String password, HttpSession session){
        Map<String,Object> map=new HashMap<>();
        User user = userService.getUserByName(username);

        if(user == null){
            map.put("status",2);
            map.put("userId",null);
            return map;
        }else{
            if(user.getUserPwd().equals(password)){
                map.put("status",1);
                map.put("userId",user.getUserId());
                return map;
            }else{
                map.put("status",0);
                map.put("userId",null);
                return map;
            }
        }

    }


    @GetMapping("/regist")
    public int regist(String username, String password,String useremail,String repassword){
        User user = userService.getUserByName(username);
        if(user != null){
            return 0;
        }else if(password.equals(repassword) ){
            User regist=new User();
            regist.setUserName(username);
            regist.setUserPwd(password);
            regist.setUserEmail(useremail);
            userService.insertUser(regist);
            return 1;
        }else{
            return 2;
        }

    }
    @RequestMapping("/checkLogin")
    @ResponseBody
    public int checkLogin(Integer userId){
        if(userId == null || userId == -1){
            return 0;
        }else{
            return  1;
        }


    }

    @GetMapping("/doLogin")
    @ResponseBody
    public String doLogin(String userName,String userPwd){
        User user =userService.findUserById(4);
        String name=user.getUserName();
        String pwd=user.getUserPwd();
        if(userName.equals(name)&&userPwd.equals(pwd)){
            return "1";
        }
        else return "";
    }

}

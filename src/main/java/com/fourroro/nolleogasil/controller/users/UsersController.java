package com.fourroro.nolleogasil.controller.users;

import com.fourroro.nolleogasil.service.users.UsersServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UsersController {
    private final UsersServiceImpl usersService;

    @Autowired
    public UsersController(UsersServiceImpl usersService) {
        this.usersService = usersService;
    }

    //회원가입
    @GetMapping("/register")
    public String registerForm(){
        return "users/registerForm";
    }

    @PostMapping("/registerForm")
    public String register(){
        //코드수행

        return "redirect:/main";
    }

    //회원정보 수정

    //회원탈퇴

    //회원 조회
}

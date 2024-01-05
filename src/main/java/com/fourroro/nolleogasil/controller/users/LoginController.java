package com.fourroro.nolleogasil.controller.users;

import com.fourroro.nolleogasil.entity.users.Users;
import com.fourroro.nolleogasil.service.users.KakaoService;
import com.fourroro.nolleogasil.service.users.UsersServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class LoginController {
    private final UsersServiceImpl usersService;
    private final KakaoService kakaoService;

    public LoginController(UsersServiceImpl usersService, KakaoService kakaoService) {
        this.usersService = usersService;
        this.kakaoService = kakaoService;
    }

    //kakao login
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String login(Model model){
        model.addAttribute("kakaoUrl", kakaoService.getKakaoLogin());

        return "";
    }

    /*
    @GetMapping("/callback")
    public ResponseEntity<Users> callback(HttpServletRequest request) throws Exception{
        <Users> 맞나?
    }
     */
}

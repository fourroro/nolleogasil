package com.fourroro.nolleogasil.controller.users;

import com.fourroro.nolleogasil.entity.users.Users;
import com.fourroro.nolleogasil.service.users.UsersServiceImpl;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UsersController {
    private final UsersServiceImpl usersService;

    @Autowired
    public UsersController(UsersServiceImpl usersService) {
        this.usersService = usersService;
    }

    //회원가입 -> 카카오 로그인 사용하면 닉네임만 설정하면 되나?
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
    @GetMapping("/update/{u_id}")
    public String updateForm(@PathVariable long u_id, Model model){
        Users users = usersService.findById(u_id);
        model.addAttribute("users", users);

        return "users/update";
    }

    @PostMapping("/update/{u_id}")
    public String updateUsers(@ModelAttribute("modifyUsersForm") ModifyUsersForm modifyUsersForm,
                              RedirectAttributes rttr, HttpSession session){
        usersService.updateUsers(modifyUsersForm);
        session.setAttribute("userSession", modifyUsersForm.getAccount());

        return "redirect:/main";
    }

    //회원탈퇴
    @RequestMapping("/delete")
    public String deleteUsers(Users users, Model model, HttpSession session){
        usersService.deleteUsers(users.getU_Id());
        session.removeAttribute("userSession");
        return "/main";
    }

    //회원 조회
}

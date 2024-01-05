package com.fourroro.nolleogasil.controller.users;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;

public class LogoutController {
    @RequestMapping("/users/logout")
    public String logout(HttpSession session, HttpServletRequest request) throws Exception{
        session = request.getSession();
        session.removeAttribute("userSession");
        session.invalidate();

        return "redirect:/main";
    }
}

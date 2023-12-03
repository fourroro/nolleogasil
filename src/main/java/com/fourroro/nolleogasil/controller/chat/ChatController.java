package com.fourroro.nolleogasil.controller.chat;


import com.fourroro.nolleogasil.entity.chat.Chat;
import com.fourroro.nolleogasil.service.chat.ChatServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequiredArgsConstructor
public class ChatController {

    private final ChatServiceImpl chatServiceImpl;
    private final SimpMessagingTemplate template; //특정 broker로 메세지 전달

    public Chat sendMessage(Chat chat) {



    }

}

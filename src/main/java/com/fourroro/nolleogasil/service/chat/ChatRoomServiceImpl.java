package com.fourroro.nolleogasil.service.chat;


import com.fourroro.nolleogasil.dto.chat.RequestChatRoom;
import com.fourroro.nolleogasil.entity.chat.ChatRoom;
import com.fourroro.nolleogasil.repository.chat.ChatRoomRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Slf4j
public class ChatRoomServiceImpl {
    private final ChatRoomRepository chatRoomRepository;

    public Long createChatRoom(RequestChatRoom requestChatRoom) {
    }

}

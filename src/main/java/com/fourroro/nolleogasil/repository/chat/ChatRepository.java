package com.fourroro.nolleogasil.repository.chat;

import com.fourroro.nolleogasil.dto.chat.ChatRoomDto;
import com.fourroro.nolleogasil.entity.chat.Chat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public interface ChatRepository {

    public List<ChatRoomDto> findAllRooms(); //채팅방 모두 반환
    public ChatRoomDto findRoomById(String name); //
}

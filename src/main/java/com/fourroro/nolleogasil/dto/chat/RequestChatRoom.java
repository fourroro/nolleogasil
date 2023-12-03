package com.fourroro.nolleogasil.dto.chat;


import lombok.Builder;
import lombok.Getter;

@Getter
public class RequestChatRoom {
    //채팅방 개설시 요청받는 ChatRoom form DTO
    private Long masterId; //개설자
    private String name;
    private int maxNum;

    @Builder
    public RequestChatRoom(Long masterId, String name, int maxNum) {
        this.masterId = masterId;
        this.name = name;
        this.maxNum = maxNum;
    }




}

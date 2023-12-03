package com.fourroro.nolleogasil.entity.chat;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ChatRoom")
@Getter @Setter
@NoArgsConstructor
public class ChatRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "room_id")
    private Long room_id;
    private String room_name; //채팅방 이름
    private Long master_id; //채팅방 개설자
    private int maxNum; //채팅방 최대 참여자수

    @Builder
    public ChatRoom(Long master_id, String room_name, int maxNum){
        this.master_id = master_id;
        this.room_name = room_name;
        this.maxNum = maxNum;
    }



    public static ChatRoom createRoom(Long master_id, String name, int maxNum) {
        return ChatRoom.builder()
                .master_id(master_id)
                .room_name(name)
                .maxNum(maxNum)
                .build();

    }


}

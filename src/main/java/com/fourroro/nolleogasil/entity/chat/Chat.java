package com.fourroro.nolleogasil.entity.chat;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Table(name="Chat")
@Getter
@Setter
@NoArgsConstructor
public class Chat {

    @Id
    @Column(name="chat_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long chat_id;

    private Long room_id;
    private String message;
    private String sender;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "room_id")
    private ChatRoom chatRoom;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime sendDate;

    @Builder
    public Chat(ChatRoom room, String sender, String message) {
        this.chatRoom = room;
        this.sender = sender;
        this.message = message;
        this.sendDate = LocalDateTime.now();
    }

    public static Chat createChat(ChatRoom room, String sender, String message) {
        return Chat.builder()
                .room(room)
                .sender(sender)
                .message(message)
                .build();
    }


}

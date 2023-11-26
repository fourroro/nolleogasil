package com.fourroro.nolleogasil.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "u_id", nullable = false)
    private Long u_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String pwd;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private int gender;

    @Column(nullable = false)
    private float mateTemp;

    //후에 필요한 정보대로 변경
    @Builder
    public Users(Long u_id, String name, String email, String pwd, String nickname, String phone, int gender, float mateTemp) {
        this.u_id = u_id;
        this.name = name;
        this.email = email;
        this.pwd = pwd;
        this.nickname = nickname;
        this.phone = phone;
        this.gender = gender;
        this.mateTemp = mateTemp;
    }
}

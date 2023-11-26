package com.fourroro.nolleogasil.dto;

import com.fourroro.nolleogasil.entity.Users;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UsersDto {
    private Long u_id;
    private String name;
    private String email;
    private String pwd;
    private String nickname;
    private String phone;
    private int gender;
    private float mateTemp;

    /*
    public Users toEntity(){
        Users users = Users.builder()
                .u_id(u_id)
                .name(name)
                .email(email)
                .pwd(pwd)
                .nickname(nickname)
                .phone(phone)
                .gender(gender)
                .mateTemp(mateTemp)
                .build();

        return users;
    }
*/
    @Builder
    public UsersDto(Long u_id, String name, String email, String pwd, String nickname, String phone, int gender, float mateTemp){
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

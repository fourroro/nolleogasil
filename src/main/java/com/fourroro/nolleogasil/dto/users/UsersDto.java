package com.fourroro.nolleogasil.dto.users;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class UsersDto {
    @NotNull
    private Long u_id;
    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String pwd;
    @NotNull
    private String nickname;
    @NotNull
    private String phone;
    @NotNull
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

package com.fourroro.nolleogasil.entity.mate;

import com.fourroro.nolleogasil.entity.users.Users;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MateMember")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@IdClass(MateMemberPK.class)
public class MateMember {

    //Users:MateMember = N:1 단방향 연관관계
    @Id
    @ManyToOne
    @JoinColumn(name = "u_id")
    private Users user;

    //Mate:MateMember = N:M 양방향 연관관계
    @Id
    @ManyToOne
    @JoinColumn(name = "mate_id")
    private Mate mate;
    private int gender;
    private float mateTemp;

    @Builder
    public MateMember(Users user, Mate mate, int gender, float mateTemp) {
        this.user = user;
        this.mate = mate;
        this.gender = gender;
        this.mateTemp = mateTemp;
    }
}

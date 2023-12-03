package com.fourroro.nolleogasil.entity.users;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Wish")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Wish {

    @Id
    private long w_id;

    //Users:Wish = N:1 단방향 연관관계
    @ManyToOne
    @JoinColumn(name = "u_id")
    private Users user;

    private String location;
    private int locationCat;

    @Builder
    public Wish(long w_id, Users user, String location, int locationCat) {
        this.w_id = w_id;
        this.user = user;
        this.location = location;
        this.locationCat = locationCat;
    }
}

package com.fourroro.nolleogasil.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Wish")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@IdClass(WishPK.class)
public class Wish {

    @Id
    //@ManyToOne
    //@JoinColumn(name = "u_id")
    private long u_id;
    @Id
    private String location_id;
    private int locationCat;

    @Builder
    public Wish(long u_id, String location_id, int locationCat) {
        this.u_id = u_id;
        this.location_id = location_id;
        this.locationCat = locationCat;
    }
}

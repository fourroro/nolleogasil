package com.fourroro.nolleogasil.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Mate")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Mate {

    @Id
    private long mate_id;
    private long u_id;

    //Mate : MateMember = 1 : N 양방향? 단방향?
//    private List<MateMember> members;

    private String place;
    @Temporal(TemporalType.DATE)
    private Date day;
    @Temporal(TemporalType.TIME)
    private Date time;
    private int gender;
    private int foodCat;
    private String comments;

    @Builder
    public Mate(long mate_id, long u_id, String place, Date day, Date time, int gender, int foodCat, String comments) {
        this.mate_id = mate_id;
        this.u_id = u_id;
        this.place = place;
        this.day = day;
        this.time = time;
        this.gender = gender;
        this.foodCat = foodCat;
        this.comments = comments;
    }
}

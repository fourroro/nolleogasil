package com.fourroro.nolleogasil.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
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

    @Id
    private long member_id;
    @Id
    private long mate_id;
    private int gender;
    private float mateTemp;

    //MateMember : Mate = N : 1 양방향? 단방향?

    @Builder
    public MateMember(long member_id, long mate_id, int gender, float mateTemp) {
        this.member_id = member_id;
        this.mate_id = mate_id;
        this.gender = gender;
        this.mateTemp = mateTemp;
    }
}

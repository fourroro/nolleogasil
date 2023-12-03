package com.fourroro.nolleogasil.dto.mate;

import lombok.Getter;

@Getter
public class MateMemberDto {

    private long u_id;          //PK  //mate 참가자 id
    private long mate_id;       //PK  //해당 mate 공고 글 id
    private int gender;         //참가자 성별
    private float mateTemp;     //참가자 mate온도
}

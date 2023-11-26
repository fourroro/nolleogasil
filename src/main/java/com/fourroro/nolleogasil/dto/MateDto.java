package com.fourroro.nolleogasil.dto;

import com.fourroro.nolleogasil.entity.MateMember;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class MateDto {

    private long mate_id;                   //PK //mate 공고 글 id
    private long u_id;                      //mate 공고 글 올린 사용자
    private List<MateMember> members;       //mate에 참여하는 member 정보들
    private String place;                   //장소
    private Date day;                      //날짜
    private Date time;                      //시간
    private int gender;                     //선호하는 성별
    private int foodCat;                    //한식, 일식, 양식, 중식 총 4개 中 1
    private String comments;                //추가로 올리고 싶은 comments
}

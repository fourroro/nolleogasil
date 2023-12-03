package com.fourroro.nolleogasil.dto.travelpath;

import com.fourroro.nolleogasil.entity.travelpath.Keywords;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class TravelPathDto {

    private long path_id;                 //PK
    private String departure;             //출발지
    private String arrival;               //도착지
    private Date startDate;               //여행 시작날짜
    private Date endDate;		          //여행 마지막날짜
    private String result;                //검색 결과
    private List<Keywords> keywords;      //검색한 키워드 (를 이용한 타이틀도 좋을 듯)
}

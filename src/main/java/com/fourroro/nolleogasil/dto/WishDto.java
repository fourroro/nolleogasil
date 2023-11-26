package com.fourroro.nolleogasil.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
public class WishDto {

    private long u_id;              //PK  //사용자 id
    private String location_id;     //PK  //전화번호 or 주소로 할 예정
    private int locationCat;        //맛집, 카페, 관광지, 숙소 총 4개 中 1

}

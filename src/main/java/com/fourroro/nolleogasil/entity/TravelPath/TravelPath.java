package com.fourroro.nolleogasil.entity.TravelPath;
import com.fourroro.nolleogasil.entity.users.Users;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="TravelPath")
@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) //기본 생성자
@AllArgsConstructor //전체 변수 생성하는 생성자
@Embeddable
public class TravelPath implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long path_id;                 //PK
    private String departure;             //출발지
    private String arrival;               //도착지
    @Temporal(TemporalType.DATE)          //오라클 - timestamp 사용 (필요할 시 변경)
    private Date startDate;               //여행 시작날짜
    @Temporal(TemporalType.DATE)          //오라클 - timestamp 사용 (필요할 시 변경)
    private Date endDate;		          //여행 마지막날짜
    private String result;                //검색 결과

    @ManyToOne
    @JoinColumn(name="word_id")
    @Embedded
    private Keywords keywords;             //검색한 키워드 (를 이용한 타이틀도 좋을 듯)

    @ManyToOne
    @JoinColumn(name="u_id")
    private Users user;    		          //사용자_id
//    @Embedded
//    private Answer answer;     	      //검색 결과

}

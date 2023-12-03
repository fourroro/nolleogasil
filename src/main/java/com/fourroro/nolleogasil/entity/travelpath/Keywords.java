package com.fourroro.nolleogasil.entity.travelpath;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name="Keywords")
@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) //기본 생성자
@AllArgsConstructor //전체 변수 생성하는 생성자
@Embeddable
public class Keywords implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long word_id;           //PK
    private String keyword;         //키워드
}

package com.fourroro.nolleogasil.repository.travelpath;

import com.fourroro.nolleogasil.entity.travelpath.TravelPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TravelPathRepository extends JpaRepository<TravelPath, Long> {
    //save(), findById(), count(), delete() 등은 자동 상속

    //여행경로 테이블에 여행 정보 저장하기(Insert)
    //save()

    //저장한 여행경로(ChatGpt 검색결과) 수정하기(Update)
    @Query("update TravelPath t set t.result = :result where t.path_id = :path_id and t.u_id = :u_id")
    public void updateResult(@Param("path_id") long path_id, @Param("u_id") long u_id, @Param("result") String result);

    //저장한 여행경로 삭제하기(Delete)
    @Query("delete TravelPath t where t.path_id = :path_id and t.u_id = :u_id")
    public void deleteByIdAndUser(@Param("path_id") long path_id, @Param("u_id") long u_id);

    //사용자가 저장한 여행경로 모두 불러오기
    @Query("select * from TravelPath where t.u_id = :u_id")
    public List<TravelPath> findAllByUser(@Param("u_id") long u_id);

    //사용자가 저장한 여행경로 하나 불러오기 (id에 따라)
    public Optional<TravelPath> findById(@Param("path_id") long path_id);


}

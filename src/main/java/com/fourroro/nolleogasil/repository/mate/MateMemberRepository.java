package com.fourroro.nolleogasil.repository.mate;

import com.fourroro.nolleogasil.entity.mate.MateMember;
import com.fourroro.nolleogasil.entity.users.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MateMemberRepository extends JpaRepository<MateMember, Long> {
    //save()(=persist())
    //메이트의 프로필 조회->Users의 findByU_id사용

    //mateMember 수
    public long countByM_id(long m_id);

    //해당 Mate의 member조회
    public List<MateMember> findByM_id(long u_id);

    //1명의 mateMember 조회
    public MateMember findByU_idAndM_id(long u_id, long m_id);

    //where절을 어떻게 해야할지!!
    //mateTemp 부여
    @Query("update MateMember m set m.mateTemp = :mateTemp where m.user.u_id = :u_id")
    public void updateMateTemp(@Param("mateTemp")float mateTemp, @Param("u_id")long u_id, @Param("mate_id")long mate_id);

    //mateMember 삭제
    public void deleteByU_idAndMate_id(long u_id, long m_id);
}

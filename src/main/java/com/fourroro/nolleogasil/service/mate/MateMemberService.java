package com.fourroro.nolleogasil.service.mate;

import com.fourroro.nolleogasil.entity.mate.MateMember;

import java.util.List;

public interface MateMemberService {

    //mateMember 추가
    public void insertMateMember(MateMember member);

    //mateMember 수
    public long countMateMember(long m_id);

    //해당 mate의 member 조회
    public List<MateMember> findMemberList(long m_id);

    //1명의 mateMember 조회
    public MateMember findMember(long u_id, long m_id);

    //mateTemp 부여
    public void updateMateTemp(float mateTemp, long u_id, long m_id);

    //mateMember 삭제
    public void deleteMateMember(long u_id, long m_id);
}

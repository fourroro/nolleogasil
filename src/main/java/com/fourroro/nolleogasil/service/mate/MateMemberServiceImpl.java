package com.fourroro.nolleogasil.service.mate;

import com.fourroro.nolleogasil.entity.mate.MateMember;
import com.fourroro.nolleogasil.repository.mate.MateMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MateMemberServiceImpl implements MateMemberService {

    @Autowired
    private MateMemberRepository memberRepository;
    public void setMateMemberRepository(MateMemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Transactional
    public void insertMateMember(MateMember member) {
        memberRepository.save(member);
    }

    public long countMateMember(long m_id) {
        return memberRepository.countByM_id(m_id);
    }

    public List<MateMember> findMemberList(long m_id) {
        return memberRepository.findByM_id(m_id);
    }

    public MateMember findMember(long u_id, long m_id) {
        return memberRepository.findByU_idAndM_id(u_id, m_id);
    }

    @Transactional
    public void updateMateTemp(float mateTemp, long u_id, long m_id) {
        memberRepository.updateMateTemp(mateTemp, u_id, m_id);
    }

    @Transactional
    public void deleteMateMember(long u_id, long m_id) {
        memberRepository.deleteByU_idAndMate_id(u_id, m_id);
    }
}

package com.fourroro.nolleogasil.service.mate;

import com.fourroro.nolleogasil.entity.mate.Mate;

import java.util.List;

public interface MateService {

    //mate공고 추가
    public void insertMate(Mate mate);

    //mate공고 글 개수
    public long countMate();

    //모든 mate목록 조회
    public List<Mate> findAllMate();

    //Mate이력 조회
    public List<Mate> findMateRecord(long u_id);

    //Mate공고 글 조회
    public Mate findMate(long m_id);

    //Mate공고 글 삭제
    public void deleteMate(long m_id);
}

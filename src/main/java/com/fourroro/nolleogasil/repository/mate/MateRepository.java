package com.fourroro.nolleogasil.repository.mate;

import com.fourroro.nolleogasil.entity.mate.Mate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MateRepository extends JpaRepository<Mate, Long> {
    //save()(=persist())
    //count()

    //모든 Mate공고 조회
    public List<Mate> findAll();

    //Mate이력 조회
    public List<Mate> findByU_id(long u_id);

    //Mate공고 글 조회
    public Mate findByM_id(long m_id);

    //Mate공고 글 삭제
    public void deleteByM_id(long m_id);
}

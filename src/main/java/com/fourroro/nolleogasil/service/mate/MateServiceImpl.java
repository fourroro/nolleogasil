package com.fourroro.nolleogasil.service.mate;

import com.fourroro.nolleogasil.entity.mate.Mate;
import com.fourroro.nolleogasil.repository.mate.MateRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateServiceImpl implements MateService {

    @Autowired
    private MateRepository mateRepository;
    public void setMateRepository(MateRepository mateRepository) {
        this.mateRepository = mateRepository;
    }

    @Transactional
    public void insertMate(Mate mate) {
        mateRepository.save(mate);
    }

    public long countMate() {
        return mateRepository.count();
    }

    public List<Mate> findAllMate() {
        return mateRepository.findAll();
    }

    @Override
    public List<Mate> findMateRecord(long u_id) {
        return mateRepository.findByU_id(u_id);
    }

    public Mate findMate(long m_id) {
        return mateRepository.findByM_id(m_id);
    }

    @Transactional
    public void deleteMate(long m_id) {
        mateRepository.deleteByM_id(m_id);
    }
}

package com.fourroro.nolleogasil.repository.users;

import com.fourroro.nolleogasil.entity.users.Wish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WishRepository extends JpaRepository<Wish, Long> {
    //save()(=persist())
    //count()
    //deleteAll()

    //wish목록 조회
    public List<Wish> findByU_id(long u_id);

    //1개의 wish 조회
    public Wish findByU_idAndW_id(long u_id, long w_id);
}

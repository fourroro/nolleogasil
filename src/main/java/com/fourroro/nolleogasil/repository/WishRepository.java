package com.fourroro.nolleogasil.repository;

import com.fourroro.nolleogasil.entity.Wish;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WishRepository extends CrudRepository<Wish, String> {

    //save(), findById(), count(), delete()등은 자동 상속

    //u_id로 wishList 조회
    List<Wish> findByU_id(long u_id);

    //추가 기능 생각해보기
}

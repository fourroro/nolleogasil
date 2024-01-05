package com.fourroro.nolleogasil.service.users;

import com.fourroro.nolleogasil.entity.users.Wish;

import java.util.List;

public interface WishService {

    //wish 추가
    public void insertWish(Wish wish);

    //wish목록 조회
    public List<Wish> findWishList(long u_id);

    //1개의 wish 조회
    public Wish findWish(long u_id, long w_id);

    //wish 삭제
    public void deleteWish(long w_id);


}

package com.fourroro.nolleogasil.service.users;

import com.fourroro.nolleogasil.entity.users.Wish;
import com.fourroro.nolleogasil.repository.users.WishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WishServiceImpl implements WishService {

    @Autowired
    private WishRepository wishRepository;
    public void setWishRepository(WishRepository wishRepository) {
        this.wishRepository = wishRepository;
    }

    //!!!Dto를 이용해서 가져온 후 서비스단에서 entity로 변경 후 추가해줘야 할듯?
    //entity변경하는 함수 짜놔서 사용
    @Transactional
    public void insertWish(Wish wish) {
        wishRepository.save(wish);
    }

    public List<Wish> findWishList(long u_id) {
        return wishRepository.findByU_id(u_id);
    }

    public Wish findWish(long u_id, long w_id) {
        return wishRepository.findByU_idAndW_id(u_id, w_id);
    }

    @Transactional
    public void deleteWish(long w_id) {
        wishRepository.deleteById(w_id);
    }
}

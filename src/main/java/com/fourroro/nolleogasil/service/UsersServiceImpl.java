package com.fourroro.nolleogasil.service;

import com.fourroro.nolleogasil.entity.Users;
import com.fourroro.nolleogasil.repository.UsersRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UsersServiceImpl implements  UsersService{
    private UsersRepository usersRepository;

    @Override
    public Users findById(long u_id) {
        return usersRepository.findById(u_id);
    }

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    //회원저장

    @Override
    public void updateUsers(Users users) {
    //회원정보 수정
    }

    @Override
    public void deleteUsers(long u_id) {
        usersRepository.deleteById(u_id);
    }
}

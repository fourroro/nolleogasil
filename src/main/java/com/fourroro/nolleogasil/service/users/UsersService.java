package com.fourroro.nolleogasil.service.users;

import com.fourroro.nolleogasil.entity.users.Users;

import java.util.List;

public interface UsersService {
    public Users findById(long u_id);

    public List<Users> findAll();

    //회원저장

    //회원정보 수정
    public void updateUsers(Users users);

    public void deleteUsers(long u_id);
}

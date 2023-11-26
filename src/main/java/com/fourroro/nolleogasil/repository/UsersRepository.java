package com.fourroro.nolleogasil.repository;

import com.fourroro.nolleogasil.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsersRepository extends JpaRepository<Users, Long> {
    //insert
    //update
    @Query("update Users " +
            "set pwd = :users.pwd, nickname = :users.nickname " +
            "where u_id = :users.u_id")
    Users updateUsers(Users users);

    //delete
    void deleteById(long u_id);

    //find
    Users findById(long u_id);
}

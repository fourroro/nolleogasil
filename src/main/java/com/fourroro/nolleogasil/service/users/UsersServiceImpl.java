package com.fourroro.nolleogasil.service.users;

import com.fourroro.nolleogasil.entity.users.Users;
import com.fourroro.nolleogasil.repository.users.UsersRepository;
import com.fourroro.nolleogasil.service.users.UsersService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepository usersRepository;
    public void setUsersRepository(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    @Override
    public Users findById(long u_id) {
        return usersRepository.findById(u_id);
    }

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    //회원저장
    //save() -> 카카오 회원가입 사용에 따라 변경
//    @Transactional
//    public Long join(Users users){
//        //validateDuplicateUsers(users); //중복회원검증
//        usersRepository.save(users);
//
//        return users.getU_Id();
//    }
//
//    private void validateDuplicateUsers(Users users){
//        List<Users> findUsers = usersRepository.findByEmail(users.getEmail());
//
//        if(!findUsers.isEmpty()){
//            throw new IllegalAccessException("이미 존재하는 회원입니다.");
//        }
//    }

    @Override
    @Transactional
    public void updateUsers(Users users) {
    //회원정보 수정
        usersRepository.updateUsers(users);
    }

    @Override
    @Transactional
    public void deleteUsers(long u_id) {
        usersRepository.deleteById(u_id);
    }
}

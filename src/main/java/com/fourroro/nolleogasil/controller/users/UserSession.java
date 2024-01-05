package com.fourroro.nolleogasil.controller.users;

import com.fourroro.nolleogasil.entity.users.Users;

public class UserSession {
    private Users users;

    public UserSession(Users users){
        this.users = users;
    }

    public Users getUsers(){
        return users;
    }

    public void setUsers(Users users){
        this.users = users;
    }
}

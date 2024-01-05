package com.fourroro.nolleogasil.controller.users;

import com.fourroro.nolleogasil.entity.users.Users;

public class ModifyUsersForm {
    private Users account;

    public ModifyUsersForm(Users account){
        this.account = account;
    }

    public Users getAccount(){
        return account;
    }

    public void setAccount(Users account){
        this.account = account;
    }
}

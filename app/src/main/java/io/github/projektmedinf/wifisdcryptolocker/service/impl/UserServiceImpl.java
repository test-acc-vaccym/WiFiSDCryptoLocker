package io.github.projektmedinf.wifisdcryptolocker.service.impl;

import android.content.Context;
import io.github.projektmedinf.wifisdcryptolocker.data.dao.UserDao;
import io.github.projektmedinf.wifisdcryptolocker.data.dao.impl.UserDaoImpl;
import io.github.projektmedinf.wifisdcryptolocker.model.Userdata;
import io.github.projektmedinf.wifisdcryptolocker.service.UserService;
import io.github.projektmedinf.wifisdcryptolocker.utils.DatabaseHelper;

/**
 * Created by stiefel40k on 20.04.17.
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public UserServiceImpl(Context context){
        userDao = new UserDaoImpl(context);
    }

    @Override
    public Userdata getUserByUserName(String userName) {
        return userDao.getUserByUserName(userName);
    }

    @Override
    public long insertUser(String userName, String password) {
        return userDao.insertUser(userName, password);
    }
}

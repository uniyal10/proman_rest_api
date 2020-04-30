package com.upgrad.proman.service.dao;

import com.upgrad.proman.service.entity.UserEntity;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;
    public UserEntity createuser(UserEntity userEntity){

        entityManager.persist(userEntity);
        return  userEntity;

    }


}

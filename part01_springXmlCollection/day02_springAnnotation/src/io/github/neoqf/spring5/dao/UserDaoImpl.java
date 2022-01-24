package io.github.neoqf.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @author LQF
 */
@Repository(value = "userDaoImpl")
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("dao add..........");

    }

}

package jm.task.core.jdbc_and_hibernate.service;

import jm.task.core.jdbc_and_hibernate.dao.UserDao;
import jm.task.core.jdbc_and_hibernate.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc_and_hibernate.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc_and_hibernate.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDaoHibernateImpl();

    public UserServiceImpl() {

    }

    @Override
    public void createUsersTable() {
        userDao.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
        System.out.println("User ? ?????? - " + name + " " + lastName + " ???????? ? ???? ??????");
    }

    @Override
    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}
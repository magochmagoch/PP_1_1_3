package jm.task.core.jdbc_and_hibernate;

import jm.task.core.jdbc_and_hibernate.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc_and_hibernate.model.User;
import jm.task.core.jdbc_and_hibernate.service.UserService;
import jm.task.core.jdbc_and_hibernate.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Сан", "Саныч", (byte) 60);
        userService.saveUser("Макс", "Штирлиц", (byte) 35);
        userService.saveUser("Иоганн", "Бах", (byte) 19);
        userService.saveUser("Жорик", "Вартанов", (byte) 40);
        List<User> listsOfUsers = userService.getAllUsers();
        for (User user : listsOfUsers) {
            System.out.println(user.toString());
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
        UserDaoHibernateImpl.closeSessionFactory();
    }
}
package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ak", "47", (byte)47);
        userService.saveUser("Piska", "Otvalisca", (byte)55);
        System.out.println(userService.getAllUsers());
        userService.removeUserById(1);
        userService.cleanUsersTable();
        userService.dropUsersTable();




    }
}

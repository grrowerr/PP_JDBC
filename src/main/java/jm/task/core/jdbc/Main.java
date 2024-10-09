package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("James", "Bond", (byte) 25);
        userService.saveUser("Jane", "Dawson", (byte) 22);
        userService.saveUser("Mike", "Nike", (byte) 30);
        userService.saveUser("Stuart", "Little", (byte) 28);

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
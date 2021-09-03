package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService USER_SERVICE = new UserServiceImpl();

    public static void main(String[] args) {
        USER_SERVICE.createUsersTable();
        USER_SERVICE.saveUser("Anton", "Dubovtcev", (byte) 31);
        USER_SERVICE.saveUser("Marat", "Bylallov", (byte) 29);
        USER_SERVICE.saveUser("Sergey", "Kislyakov", (byte) 35);
        USER_SERVICE.saveUser("Volodya", "Triodin", (byte) 40);
        USER_SERVICE.getAllUsers();
        USER_SERVICE.cleanUsersTable();
        USER_SERVICE.dropUsersTable();
    }
}



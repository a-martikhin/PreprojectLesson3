package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService userService = new UserServiceImpl();
    private static final User USER1 = new User("Anton", "Dubovtcev", (byte) 31);
    private static final User USER2 = new User("Marat", "Bylallov", (byte) 29);
    private static final User USER3 = new User("Sergey", "Kislyakov", (byte) 35);
    private static final User USER4 = new User("Volodya", "Triodin", (byte) 40);

    public static void main(String[] args) {
        userService.createUsersTable();
        userService.saveUser(USER1.getName(), USER1.getLastName(), USER1.getAge());
        userService.saveUser(USER2.getName(), USER2.getLastName(), USER2.getAge());
        userService.saveUser(USER3.getName(), USER3.getLastName(), USER3.getAge());
        userService.saveUser(USER4.getName(), USER4.getLastName(), USER4.getAge());
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}



package jm.task.core.jdbc;

import com.mysql.cj.xdevapi.Result;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.*;

public class Main {
    public static void main(String[] args){
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("Anton", "Dubovtcev", (byte)31);
        userDaoJDBC.saveUser("Marat", "Bylallov", (byte)29);
        userDaoJDBC.saveUser("Sergey", "Kislyakov", (byte)35);
        userDaoJDBC.saveUser("Volodya", "Triodin", (byte)40);
        System.out.println(userDaoJDBC.getAllUsers());
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();
    }
}



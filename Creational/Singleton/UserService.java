package Creational.Singleton;
import Creational.Singleton.Database;

public class UserService{
    private final Database database;

    public UserService(){
        this.database = Database.getInstance();
    }

    public void createUser(){
        this.database.connect();
        System.out.println("Creating user");
    }
}
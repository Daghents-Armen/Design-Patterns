package Creational.Singleton;

import Creational.Singleton.Database;
import Creational.Singleton.UserService;

public class Main{
   public static void main(String[] args){
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        System.out.println(db1 == db2);

        UserService service = new UserService();
        service.createUser();
    }
}
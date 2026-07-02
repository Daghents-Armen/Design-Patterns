package Creational.Builder;
import Creational.Builder.User;
public class Main {
    public static void main(String[] args){
        User user = User.builder()
                    .name("James")
                    .age(26)
                    .email("james@gmail.com")
                    .build();
        System.out.println(user);

        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getEmail());
    }

}

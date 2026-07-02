import Factories.MacFactory;
import Factories.WindowFactory;

public class Main {
    public static void main(String[] args){
        LoginScreen loginScreen = new LoginScreen(new MacFactory());
        LoginScreen loginScreen2 = new LoginScreen(new WindowFactory());

        loginScreen.render();
        loginScreen2.render();
    }
}

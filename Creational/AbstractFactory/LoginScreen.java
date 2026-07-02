import Buttons.Button;
import CheckBoxes.CheckBox;
import Factories.GuiFactory;

public class LoginScreen {
    private final GuiFactory factory;

    public LoginScreen(GuiFactory factory){
            this.factory = factory;
        };

    void render(){
        Button btn = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();

        btn.render();
        checkBox.render();
    }
}

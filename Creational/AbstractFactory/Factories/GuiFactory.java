package Factories;
import Buttons.Button;
import CheckBoxes.CheckBox;

public interface GuiFactory {
    Button createButton();
    CheckBox createCheckBox();
}

package Factories;

import Buttons.Button;
import Buttons.WindowButton;
import CheckBoxes.CheckBox;
import CheckBoxes.WindowCheckBox;

public class WindowFactory implements GuiFactory{
    @Override
    public Button createButton(){
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckBox(){
        return new WindowCheckBox();
    }
}

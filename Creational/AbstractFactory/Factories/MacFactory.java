package Factories;

import Buttons.Button;
import Buttons.MacButton;
import CheckBoxes.CheckBox;
import CheckBoxes.MacCheckBox;

public class MacFactory implements GuiFactory{
    @Override
    public Button createButton(){
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox(){
        return new MacCheckBox();
    }

}

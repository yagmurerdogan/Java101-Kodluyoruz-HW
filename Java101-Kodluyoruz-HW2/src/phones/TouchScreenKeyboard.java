package phones;

import interfaces.IKeyboard;

public class TouchScreenKeyboard implements IKeyboard {
    private String keyboardType = "Touch Screen Keyboard";
    @Override
    public String showKeyboardType() {
        return keyboardType;
    }
}

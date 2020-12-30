package phones;

import interfaces.IKeyboard;

public class PushButtonKeyboard implements IKeyboard {
    private String keyboardType = "Push Button Keyboard";
    @Override
    public String showKeyboardType() {
        return keyboardType;
    }
}

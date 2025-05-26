package org.example.DataTransferObject;

import org.example.Input.KeyboardEventType;
import org.example.Input.MouseEventType;

import java.io.Serial;
import java.io.Serializable;

public class KeyboardDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final int keyCode;

    private final KeyboardEventType keyboardEventType;

    public KeyboardDTO(int keyCode, KeyboardEventType keyboardEventType){
        this.keyCode = keyCode;
        this.keyboardEventType = keyboardEventType;
    }

    public int getKeyCode() {
        return this.keyCode;
    }

    public KeyboardEventType getKeyboardEventType() {
        return this.keyboardEventType;
    }

}

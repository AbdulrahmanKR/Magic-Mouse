package org.example.Input;

import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import org.example.DataTransferObject.KeyboardDTO;
import org.example.DataTransferObject.MouseDTO;

import java.awt.event.MouseListener;

public interface InputListener {

    void onMouseInput(MouseDTO e);
    void onKeyboardInput(KeyboardDTO e);

}

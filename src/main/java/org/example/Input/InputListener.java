package org.example.Input;

import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;

import java.awt.event.MouseListener;

public interface InputListener {

    void onMouseInput(NativeMouseEvent e);
    void onKeyboardInput(NativeKeyEvent e);

}

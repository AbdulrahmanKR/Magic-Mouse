package org.example.Input;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import com.github.kwhat.jnativehook.keyboard.SwingKeyAdapter;
import org.example.DataTransferObject.KeyboardDTO;
import org.example.Utils.Converter;

import java.awt.event.KeyEvent;

public class Keyboard extends SwingKeyAdapter {

    private InputListener inputListener;

    public Keyboard(InputListener inputListener){
        this.inputListener = inputListener;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        inputListener.onKeyboardInput(Converter.toDTO(KeyboardEventType.PRESS,keyEvent));
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        inputListener.onKeyboardInput(Converter.toDTO(KeyboardEventType.RELEASE,keyEvent));
    }
}
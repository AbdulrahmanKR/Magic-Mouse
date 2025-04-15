package org.example.Input;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class Keyboard implements NativeKeyListener {

    private InputListener inputListener;

    public Keyboard(InputListener inputListener){
        this.inputListener = inputListener;
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {

        if (e.getKeyCode() == NativeKeyEvent.VC_ESCAPE) {
            try {
                GlobalScreen.unregisterNativeHook();
            } catch (NativeHookException nativeHookException) {
                nativeHookException.printStackTrace();
            }
        }

        inputListener.onKeyboardInput(e);
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
        inputListener.onKeyboardInput(e);
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
        inputListener.onKeyboardInput(e);
    }


}

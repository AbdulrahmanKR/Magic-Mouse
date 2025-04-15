package org.example.Input;

import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseInputListener;

public class Mouse implements NativeMouseInputListener {

    private InputListener inputListener;

    public Mouse(InputListener inputListener){
        this.inputListener = inputListener;
    }

    @Override
    public void nativeMouseClicked(NativeMouseEvent e) {
        inputListener.onMouseInput(e);
    }

    @Override
    public void nativeMousePressed(NativeMouseEvent e) {
        inputListener.onMouseInput(e);
    }
    @Override
    public void nativeMouseReleased(NativeMouseEvent e) {
        inputListener.onMouseInput(e);
    }

    @Override
    public void nativeMouseMoved(NativeMouseEvent e) {
        inputListener.onMouseInput(e);
    }

    @Override
    public void nativeMouseDragged(NativeMouseEvent e) {
        inputListener.onMouseInput(e);
    }

}

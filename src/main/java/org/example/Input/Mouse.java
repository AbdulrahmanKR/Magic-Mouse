package org.example.Input;

import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseInputListener;
import org.example.DataTransferObject.MouseDTO;
import org.example.Utils.Converter;

public class Mouse implements NativeMouseInputListener {

    private InputListener inputListener;

    public Mouse(InputListener inputListener){
        this.inputListener = inputListener;
    }

    @Override
    public void nativeMouseClicked(NativeMouseEvent e) {
        inputListener.onMouseInput(Converter.toDTO(MouseEventType.CLICK,e));
    }

    @Override
    public void nativeMousePressed(NativeMouseEvent e) {
        inputListener.onMouseInput(Converter.toDTO(MouseEventType.PRESS,e));
    }
    @Override
    public void nativeMouseReleased(NativeMouseEvent e) {
        inputListener.onMouseInput(Converter.toDTO(MouseEventType.RELEASE,e));
    }

    public void nativeMouseMoved(NativeMouseEvent e) {
        inputListener.onMouseInput(Converter.toDTO(MouseEventType.MOVE,e));
    }

    @Override
    public void nativeMouseDragged(NativeMouseEvent e) {
        inputListener.onMouseInput(Converter.toDTO(MouseEventType.DRAG,e));
    }

}

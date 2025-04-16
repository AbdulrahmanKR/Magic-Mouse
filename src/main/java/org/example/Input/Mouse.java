package org.example.Input;

import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseInputListener;
import org.example.DataTransferObject.MouseDTO;

public class Mouse implements NativeMouseInputListener {

    private InputListener inputListener;

    public Mouse(InputListener inputListener){
        this.inputListener = inputListener;
    }

    @Override
    public void nativeMouseClicked(NativeMouseEvent e) {
        inputListener.onMouseInput(toDTO(MouseEventType.CLICK,e));
    }

    @Override
    public void nativeMousePressed(NativeMouseEvent e) {
        inputListener.onMouseInput(toDTO(MouseEventType.PRESS,e));
    }
    @Override
    public void nativeMouseReleased(NativeMouseEvent e) {
        inputListener.onMouseInput(toDTO(MouseEventType.RELEASE,e));
    }

    @Override
    public void nativeMouseMoved(NativeMouseEvent e) {
        inputListener.onMouseInput(toDTO(MouseEventType.MOVE,e));
    }

    @Override
    public void nativeMouseDragged(NativeMouseEvent e) {
        inputListener.onMouseInput(toDTO(MouseEventType.DRAG,e));
    }

    /**
     * Converts a native mouse event to a serializable DTO for transport.
     */
    private MouseDTO toDTO(MouseEventType mouseType, NativeMouseEvent e){
        return new MouseDTO(mouseType,e.getButton(),e.getX(),e.getY());
    }

}

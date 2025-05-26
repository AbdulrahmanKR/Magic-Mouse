package org.example.Input;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import org.example.DataTransferObject.KeyboardDTO;
import org.example.DataTransferObject.MouseDTO;
import org.example.Network.Network;

public class InputManager implements InputListener {

    private final Network network;

    public InputManager( Network network){
        this.network = network;
    }

    @Override
    public void onMouseInput(MouseDTO e) {
        try {
            network.sendMouseInput(e);
        }catch (NullPointerException ex){
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void onKeyboardInput(KeyboardDTO e) {
        network.sendKeyboardInput(e);
    }

    public void startListeningToInputs(Mouse mouse, Keyboard keyboard){
        try {
            GlobalScreen.registerNativeHook();
        }
        catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());

            System.exit(1);
        }

        GlobalScreen.addNativeKeyListener(keyboard);
        GlobalScreen.addNativeMouseMotionListener(mouse);
        GlobalScreen.addNativeMouseListener(mouse);
    }

    public void stopListeningToInputs(Mouse mouse, Keyboard keyboard){
        try {
            GlobalScreen.unregisterNativeHook();
        }catch (NativeHookException ex){
            System.err.println("There was a problem removing the native hook.");
            System.err.println(ex.getMessage());
        }

        GlobalScreen.removeNativeKeyListener(keyboard);
        GlobalScreen.removeNativeMouseMotionListener(mouse);
        GlobalScreen.removeNativeMouseListener(mouse);
    }

}

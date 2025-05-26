package org.example.DataTransferObject;

import org.example.Input.MouseEventType;

import java.io.Serial;
import java.io.Serializable;

/**
 * Data Transfer Object (DTO) representing a mouse event.
 *
 * This class is used to transfer mouse event data (e.g. position, button, type)
 * between systems, from the server to a client.
 */
public class MouseDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final MouseEventType mouseType;

    private final int buttonId;

    private final int x;

    private final int y;

    public MouseDTO(MouseEventType mouseType, int buttonId, int x, int y) {
        this.mouseType = mouseType;
        this.buttonId = buttonId;
        this.x = x;
        this.y = y;
    }

    public MouseEventType getMouseEventType() {
        return mouseType;
    }

    public int getButtonId() {
        return buttonId;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

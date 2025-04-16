package org.example.DataTransferObject;

import org.example.Input.MouseEventType;

/**
 * Data Transfer Object (DTO) representing a mouse event.
 *
 * This class is used to transfer mouse event data (e.g. position, button, type)
 * between systems, such as from a server to a client.
 */
public class MouseDTO {

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

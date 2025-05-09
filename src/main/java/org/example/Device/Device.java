package org.example.Device;

import org.example.Device.Screen.Screen;

import java.net.InetAddress;

public abstract class Device {

    private final InetAddress IP;

    private int position;

    private boolean isActive;

    private final Screen screen;

    public Device(InetAddress ip, int position, boolean isActive, Screen screen) {
        IP = ip;
        this.position = position;
        this.isActive = isActive;
        this.screen = screen;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null)
            return false;

        if (!(obj instanceof Device))
            return false;

        if (this == obj)
            return true;

        Device d = (Device) obj;
        return this.getIP().equals(d.getIP());

    }

    public InetAddress getIP() {
        return IP;
    }

    public int position() {
        return position;
    }

    public void setPosition(int screenPosition) {
        this.position = position;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Screen getScreen() {
        return screen;
    }

    public abstract boolean isHost();
}

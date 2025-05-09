package org.example.Screen;

import java.awt.*;

public class Screen {

    private int width;
    private int height;

    public Screen(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.width  = (int) screenSize.getWidth();
        this.height = (int) screenSize.getHeight();
    }

    public Screen(int width, int height){
        this.width  = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}

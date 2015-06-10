package com.javarush.test.level14.lesson08.home05;

/**
 * Created on 6/10/15.
 *
 * @author sadv1r
 * @version 0.1
 */
public class Computer {
    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer() {
        this.keyboard = new Keyboard();
        this.mouse = new Mouse();
        this.monitor = new Monitor();
    }

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {

        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }
}

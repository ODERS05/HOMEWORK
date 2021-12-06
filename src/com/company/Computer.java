package com.company;

public class Computer {
    private Display display;
    private String marka;
    private String color;
    private HardDisk hardDisk;
    private Klavishi klavishi;

    public Computer(Display display, String marka, String color, HardDisk hardDisk, Klavishi klavishi) {
        this.display = display;
        this.marka = marka;
        this.color = color;
        this.hardDisk = hardDisk;
        this.klavishi = klavishi;
    }

    public Computer(Display display) {

        this.display = display;
    }

    public Display getDisplay() {

        return display;
    }

    public void setDisplay(Display display) {

        this.display = display;
    }

    public String getMarka() {

        return marka;
    }

    public void setMarka(String marka) {

        this.marka = marka;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public HardDisk getHardDisk() {

        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {

        this.hardDisk = hardDisk;
    }

    public Klavishi getKlavishi() {

        return klavishi;
    }

    public void setKlavishi(Klavishi klavishi) {

        this.klavishi = klavishi;
    }

    @Override
    public String toString(){
        return marka + " " + color + " . Display:" + display;
    }
}


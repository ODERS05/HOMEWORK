package com.company;

public class HardDisk {
    private int size;
    private int partial;

    public HardDisk(int size, int partial) {
        this.size = size;
        this.partial = partial;
    }

    public int getSize() {

        return size;
    }

    public void setSize(int size) {

        this.size = size;
    }

    public int getPartial() {

        return partial;
    }

    public void setPartial(int partial) {

        this.partial = partial;
    }

    @Override
    public String toString(){
        return size + " " + partial;
    }
}

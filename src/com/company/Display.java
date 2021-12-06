package com.company;

public class Display {
    private int size;
    private String proizvoditel;
    String typeMatrica;

    public Display(int size, String proizvoditel, String typeMatrica) {
        this.size = size;
        this.proizvoditel = proizvoditel;
        this.typeMatrica = typeMatrica;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public String getTypeMatrica() {
        return typeMatrica;
    }

    public void setTypeMatrica(String typeMatrica) {
        this.typeMatrica = typeMatrica;
    }

    @Override
    public String toString(){
        return size + " " + typeMatrica + " " + proizvoditel;
    }
}

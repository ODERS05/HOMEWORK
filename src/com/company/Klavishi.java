package com.company;

public class Klavishi {
    private Raskladka[] arrayRaskladok;
    private boolean hasPodsvetka;
    private boolean hisRightDigits;

    public Klavishi(Raskladka[] arrayRaskladok, boolean hasPodsvetka, boolean hisRightDigits) {
        this.arrayRaskladok = arrayRaskladok;
        this.hasPodsvetka = hasPodsvetka;
        this.hisRightDigits = hisRightDigits;
    }

    public Raskladka[] getArrayRaskladok() {

        return arrayRaskladok;
    }

    public void setArrayRaskladok(
            Raskladka[] arrayRaskladok) {
        this.arrayRaskladok = arrayRaskladok;
    }

    public boolean isHasPodsvetka() {

        return hasPodsvetka;
    }

    public void setHasPodsvetka(boolean hasPodsvetka) {

        this.hasPodsvetka = hasPodsvetka;
    }

    public boolean isHisRightDigits() {

        return hisRightDigits;
    }

    public void setHisRightDigits(boolean hisRightDigits) {

        this.hisRightDigits = hisRightDigits;
    }
}

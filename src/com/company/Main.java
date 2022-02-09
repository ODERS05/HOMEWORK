package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<String>song= new ArrayList<>();
        song.add("Ветер с моря дул");
        song.add("Ветер с моря дул");
        song.add("\n Нагонял беду");
        song.add("Нагонял беду");
        song.add("\n И сказал ты мне");
        song.add("И сказал ты мне");
        song.add("\n Больше не приду");
        song.add("Больше не приду");
        System.out.println(song);
        List<String>songList= new ArrayList<>();
        songList.add("Ветер с моря дул");
        songList.add("Ветер с моря дул");
        songList.add("\n Нагонял беду");
        songList.add("Нагонял беду");
        songList.add("\n И сказал ты мне");
        songList.add("И сказал ты мне");
        songList.add("\n Больше не приду");
        songList.add("Больше не приду");
        songList.remove("И сказал ты мне");
        songList.remove(4);
        System.out.println(songList);
        ArrayList<Integer>myNumList = new ArrayList<>();
        ArrayList<Integer>myNumList1 = new ArrayList<>();
        ArrayList<Integer>myNumList2 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int num = random.nextInt(0, 100);
            if (num % 2 == 0){
                myNumList1.add(num);
            }else myNumList2.add(num);
        }
        System.out.println(myNumList1);
        System.out.println(myNumList2);
        System.out.println(" 1. Массив это шкаф с ячейками в которых мы что либо храним" +
                "\n 2. Это более удобный массив в котором уже реализованы методы которые в обычном массиве мы реализовывавали сами" +
                        "\n 3. см 2" +
                        "\n 4. это класс-обертка который хранит в себе значение примитивного типа данных " +
                        "\n 5. add добавляет новую ячейку, а set изменяет ячейку присваевая ей другое значение");
    }
}

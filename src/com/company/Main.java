package com.company;

public class Main {

    public static void main(String[] args) {
	Thread t1 = new Thread(new ThreadClass("*"));
	Thread t2 = new Thread(new ThreadClass("/"));
	Thread t3 = new Thread(new ThreadClass("+"));
	Thread t4 = new Thread(new ThreadClass("-"));

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    }
    /* Нет, не можем т.к мы не знаем в какой очередности сработают потоки.
    1.Это то что выполняет мой код.
    2.Это ускорения скорости выполнения программы засчет разделения задач между потоками.
    3.Они нужны для того чтобы выполнять одновременно различные задачи
    4.Люди существа разные, каждый может решить задачу своим путем, что может привести к неразберихе или даже к конфликту.
    5.Оно дает доступ только одному потоку, другим же придется ждать пока другой поток не выйдет.
     */
}

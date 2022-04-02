package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
	// create table route(
        //	id integer primary key,
        //	num_of_route varchar (50)not null unique ,
        //	start_point varchar(100) not null unique,
        //	end_point varchar (100) not null unique
        //);
        //
        //create table buses(
        //	id integer primary key,
        //	bus_number varchar (100) not null unique,
        //	route_id integer  references route(id)
        //);
        //create table drivers (
        //	id integer primary key,
        //	fio varchar (100) not null
        //);
        //create table driver_buses(
        //	id integer primary key,
        //	drivers_id integer references drivers(id),
        //	buses_id integer references buses(id)
        //);
        //create table driver_log (
        //	id integer primary key,
        //	driver_buses_id integer references driver_buses(id),
        //	shift_start_time timestamp not null ,
        //	shift_end_time timestamp not null
        //);
        //
        //insert into route
        //values(1, '102', 'Ош базар','Тунгуч'),
        //(2, '195', '11-мкр','Колмо'),
        //(3, '32', 'Пригородное','Шоро');
        //
        //insert into buses
        //values (1,'B777GG', 1),
        //(2,'A3485BR',3),
        //(3,'G8888WP',2);
        //
        //insert into drivers
        //values (1, 'Ibraev Koshoy Sovetbekovich'),
        //(2, 'Janubekov Ruslan Azamatovich'),
        //(3, 'Pertov Petr Petrovich');
        //
        //insert into driver_buses
        //values  (1, 2, 3),
        //(2, 1, 2),
        //(3, 3, 1),
        //(4, 1, 3);
        //
        //insert into driver_log
        //values (1, 1, '2021-08-22 10:10:10-07', '2021-08-22 22:22:22-07'),
        //(2, 3, '2020-01-01 12:12:12-07', '2020-01-01 12:12:12-07'),
        //(3, 2, '2022-10-23 06:06:06-07', '2022-10-23 23:23:23-07');
    }
}

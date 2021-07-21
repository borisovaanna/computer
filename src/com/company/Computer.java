package com.company;

import java.util.Scanner;

//Создать класс компьютер. Поля: - процессор - оперативка - жесткий диск - ресурс полных циклов работы
//(включений/выключений) Методы: - метод описание(вывод всех полей) - метод включить, при включении
//может произойти сбой, при вывзове метода рандом загадывает число (0 либо 1), вы вводите число с клавиатуры,
//если угадали комп выключается, если нет сгорает.Если комп сгорел, при попытке включить нужно выдать сообщение
//что ему конец - выключить (аналогично включению) - при превышении лимита ресурса комп сгорает

import java.util.Scanner;

    public class Computer {
        public int CPU;
        public int RAM;
        public double HDD;
        public int cycles;
        public void display() {
            System.out.print(this.CPU + " " + this.RAM + " " + this.HDD + " " + this.cycles);
            System.out.println();
        }
        public void on() {
            if (cycles <= 0)
            {
                System.out.print("Error!");
                return;
            }
            Scanner scan = new Scanner(System.in);
            System.out.println("Write number 1 or 0: ");
            int num = scan.nextInt();
            int result = (int) (Math.random() * 2);
            if (num==result){
                System.out.print("You are lucky!");
            }
            else {
                System.out.print("Bad choice!");
            }
            cycles--;
        }
    }

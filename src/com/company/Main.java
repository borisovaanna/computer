package com.company;

        public class Main {

            public static void main(String[] args) {
                Computer pc = new Computer();
                pc.CPU = 64;
                pc.RAM = 355;
                pc.HDD = 2.5;
                pc.cycles = 3;
                pc.display();
                pc.on();
                while(true) {
                    pc.on();
                }

            }
        }

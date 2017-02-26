package com.company;

/**
 * Created by Андрій on 26.02.2017.
 */
public class Singleton {

        private static Singleton instance = null;

        public static Singleton getInstance() {
            if(instance == null) {
                instance = new Singleton();


            }
            return instance;
        }
    }


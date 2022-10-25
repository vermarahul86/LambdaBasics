package com.vermarahul.unit1.runnable;

public class RunnableExample {

    public static void main(String[] args){
        /*Classic way of old implementation where Lambda can be used.*/
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside runnable");
            }
        });
        myThread.run();

        /*Functional Interfaces */
        Thread myThread2 = new Thread(()-> System.out.println("Printed inside in-line Lambda"));
        myThread2.run();


    }


}

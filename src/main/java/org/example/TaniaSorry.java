package org.example;

public class TaniaSorry {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Tania please forgive me my mistake! " + "It was a stupid action of my kiddy character..." + "I would never betray you again...." + "I love you so much...");
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("      Love    Love\n" + "   LoveLove   LoveLove\n" + "LoveLoveLoveLoveLoveLove\n" + "LoveLoveLoveLoveLoveLove\n" + "LoveLoveLoveLoveLoveLove\n" + "  LoveLoveLoveLoveLove\n" + "    LoveLoveLoveLove\n" + "      LoveLoveLove\n" + "          Love");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();
    }
}

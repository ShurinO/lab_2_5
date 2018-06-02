package lab25;

import task.MyInit;
import task.MyInitTest;

public class Main {
    public static void main(String[] args) {
        MyInitTest myInitTest = new MyInitTest();

        //lab_2_5_2
        MyInit myInit1 = new MyInit();
        myInit1.printArray();
        System.out.println();
        MyInit myInit2 = new MyInit();
        myInit2.printArray();
    }
}

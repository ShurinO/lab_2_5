package task;

public class MyInit {
    private int[] array;
    {
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]= (int) (100 * Math.random());
        }
    }
    public void printArray(){
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+",");
        }
        System.out.print(array[array.length-1]);
    }
}
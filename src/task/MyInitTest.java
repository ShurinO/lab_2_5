package task;

public class MyInitTest {
    static {
        System.out.println("static initialization block 1");
    }
    static {
        System.out.println("static initialization block 2");
    }
    {
        System.out.println("initialization block 1");
    }
    {
        System.out.println("initialization block 2");
    }

    private MyInitTest(int i) {
        System.out.println("constructor 1");
    }

    public MyInitTest() {
        this(2);
        System.out.println("constructor 2");
    }
}

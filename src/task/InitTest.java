package task;

public class InitTest {
    private int id;
    private static int nextId;
    static {
        nextId = (int)(999*Math.random()+1);
    }
    {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
}

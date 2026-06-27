import java.util.HashMap;
import java.util.Map;

public class Array {
    private int length = 0;
    Map<String, Object> data = new HashMap<>();


    public Array() {
        System.out.println("Initialized");
//        this.length = 0;
//        this.data = new HashMap<>();
    }


    public void push(Object value) {
        String index = String.valueOf(this.length);
        this.data.put((index), value);
        this.length++;
    }

    public void pop() {
//        this.data.remove(data.lastkey());
        this.length--;
    }

    public int length() {

        return this.length;
    }

    public static void main(String[] args) {
        Array arr = new Array();
        arr.push("Daniel");
        arr.push("Ball");
        arr.push("Cat");
        arr.push("1");
        System.out.println("Custom Array data" + arr.data);
        System.out.println("Custom Array length " + arr.length());
    }
}

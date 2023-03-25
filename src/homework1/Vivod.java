package homework1;

public class Vivod {
    public static void main(String[] args) {
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1_000_000;
        long l = 0xffffffffL;
        char c = 'a';
        double d = .00001234;
        boolean bool = true;
        System.out.println(b + " " + s + " " + i + " " + l + " " + c + " " + d + " " + bool);
    }
}

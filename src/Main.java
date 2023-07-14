public class Main {
    public static int add(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + add(n / 10);
        }
    }

    public static void main(String[] args) {
        int number = 256;
        int result = add(number);
        System.out.println(result);
    }
}

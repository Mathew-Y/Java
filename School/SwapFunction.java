public class practice {

    static void swap(int x, int y) {

        int temp;
        temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 20;
        swap(a, b);
        System.out.println("a value: " + a + "\nb value: " + b);
    }

}


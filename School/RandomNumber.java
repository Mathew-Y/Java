public class RandomNumber {

    public static void main(String[] args) {
        int randomNum = 0;

        for(int i = 0; i < 10; i++) {
            randomNum = (int)(Math.random() * 3) + 1 - 1;
            System.out.println(randomNum);
        }
    }
}

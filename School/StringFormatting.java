public class StringFormatting {

    public static void main(String[] args) {

        // Inefficient
        String info = "";

        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";

        System.out.println(info);

        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is Roger.");
        s.append(" ");
        s.append("I am a skydiver.");

        System.out.println(s.toString());

        System.out.println("Here is some text.\tThat was a tab.\nThat was a new line");

        System.out.printf("Total cost %d; quantity is %d\n", 5, 120);

        for(int i = 0; i < 20; i++) {
            System.out.printf( "%-2d: some text here%n", i);
        }


    }
}

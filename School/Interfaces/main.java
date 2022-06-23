package Interfaces;

public class main {

    public static void main(String[] args) {

        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Bob");
        person1.greet();

        info info1 = new Machine();
        info1.showInfo();

        info info2 = person1;
        info2.showInfo();

        outputInfo(mach1);
        outputInfo(person1);
    }

    private static void outputInfo(info info) {
        info.showInfo();
    }

}

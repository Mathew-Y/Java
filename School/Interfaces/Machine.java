package Interfaces;

public class Machine implements info {

    private int id = 7;

    public void start() {
        System.out.println("Machine started.");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine ID is: " + id);
    }
}

package lesson02;

public class Drinks {

    private int coast;
    private String name;

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drinks(int coast, String name) {
        this.coast = coast;
        this.name = name;

    }
}

public abstract class Beverage {
    String size;
    String description;

    public String getDescription() {
        return this.description + ", "+size;
    }

    public abstract double cost();

    public String getSize() {
        return this.size;
    }

    public void setSize(String s) {
        this.size = s;
    }
}

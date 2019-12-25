public class Shop {
    private String name;
    private int count;
    private String adress;

    public Shop(){}

    public Shop(String name, int count, String adress) {
        this.name = name;
        this.count = count;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", adress='" + adress + '\'' +
                '}';
    }
}

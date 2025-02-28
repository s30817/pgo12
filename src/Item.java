public class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void show(){
        System.out.println("Item name: "+ name);
    }

    @Override
    public String toString() {
        return "ID: "+ id + ", " +"Name: " + name;
    }
}
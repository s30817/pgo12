import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items=new ArrayList<>();
        items.add(new Item(1,"Telefon"));
        items.add(new Item(2,"Laptop"));
        items.add(new Item(3,"Komputer stacjonarny"));
        items.add(new Item(4,"Klawiatura"));
        items.add(new Item(5,"Myszka"));

        for (Item item : items){
            item.show(); }

        HashMap<Integer,String> itemsMap=new HashMap<>();
        for (Item item : items){
            itemsMap.put(item.getId(),item.getName());
        }
        for (Map.Entry<Integer,String>entry : itemsMap.entrySet()){
            System.out.println("ID: " + entry.getKey() + ", Nazwa: " + entry.getValue());
        }

        items.add(new Item(6,"Sluchawki"));
        items.add(new Item(7,"Tablet"));
        items.add(new Item(8,"Mikrofon"));
        items.add(new Item(9,"Glosniki"));
        items.add(new Item(10,"Zasilacz"));
        items.add(new Item(11,"Monitor"));
        items.add(new Item(12,"Drukarka"));
        items.add(new Item(13,"Kamera"));
        items.add(new Item(14,"Skaner"));
        items.add(new Item(15,"Kierownica Komputerowa"));
        List<Item>itemList=items.subList(0,5);
        HashSet<Item>itemHashSet=new HashSet<>(itemList);
        for (Item item: itemHashSet){
            System.out.println(item);
        }

    }
}
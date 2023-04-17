package ba.edu.ibu.collections;

public class Node2<Item> {
    Item data;
    Node2<Item> next;
    Node2<Item> prev;

    public Node2(Item item) {
        data = item;
    }
}

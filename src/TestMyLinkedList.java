public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("Apple");
        myLinkedList.add("Banana");
        myLinkedList.add("Orange");
        myLinkedList.add("Grapes");

        System.out.println("MyLinkedList: " + myLinkedList);
        System.out.println("Size: " + myLinkedList.size());
        System.out.println("Element at index 2: " + myLinkedList.get(2));

        myLinkedList.remove(1);
        System.out.println("After removing element at index 1: " + myLinkedList);
        System.out.println("Size: " + myLinkedList.size());
    }
}

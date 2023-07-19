public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("Apple");
        myArrayList.add("Banana");
        myArrayList.add("Orange");
        myArrayList.add("Grapes");

        System.out.println("MyArrayList: " + myArrayList);
        System.out.println("Size: " + myArrayList.size());
        System.out.println("Element at index 2: " + myArrayList.get(2));

        myArrayList.remove(1);
        System.out.println("After removing element at index 1: " + myArrayList);
        System.out.println("Size: " + myArrayList.size());
    }
}


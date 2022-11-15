public class Main {
    public static void main(String[] args) {

        LL list = new LL();
        list.insertFirst(17);
        list.insertFirst(8);
        list.insertFirst(2);
        list.insertFirst(3);

        list.insertEnd(99);

        list.insert(100,3);

        list.display();

        int d = list.deleteFirst();
        System.out.println(d);

        list.display();

//        System.out.println(list.deleteLast());
//        list.display();

        System.out.println(list.delete(2));
        list.display();

    }
}
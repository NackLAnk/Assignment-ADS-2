public class Main {
    public static <T> void main(String[] args) {
        MyArrayList Alist = new MyArrayList();
        MyLinkedList Llist = new MyLinkedList();

        Alist.add(5);
        Alist.add(15);
        Alist.add(25);
        Alist.add(45);
        Alist.add(45);
        Alist.add(55);
        Alist.add(65);

        System.out.println(Alist.get(3)); // тест дубликатов
        System.out.println(Alist.get(4));

        Alist.dublicateDeleater(); // убираю дубликат с помощью метода

        System.out.println(Alist.get(3)); // проверяю на удаление дубликата
        System.out.println(Alist.get(4));



    }
}

public class Main {
    public static <T> void main(String[] args) {
        MyArrayList Alist = new MyArrayList();
        MyLinkedList Llist = new MyLinkedList();

        Alist.add(1);
        Alist.add(1);
        Alist.add(2);
        Alist.add(3);
        Alist.add(2);
        Alist.add(1);
        Alist.add(3);
        // тест дубликатов
        System.out.println(Alist.get(0));
        System.out.println(Alist.get(1));
        System.out.println(Alist.get(2));
        System.out.println(Alist.get(3));
        System.out.println(Alist.get(4));
        System.out.println(Alist.get(5));




        System.out.println("-------------------------");

        Alist.dublicateDeleater(); // убираю дубликат с помощью метода
        Alist.dublicateDeleater();
        Alist.dublicateDeleater();
        Alist.dublicateDeleater();


        System.out.println(Alist.get(0)); // проверяю на удаление дубликата
        System.out.println(Alist.get(1));
        System.out.println(Alist.get(2));
        System.out.println(Alist.get(3));
        System.out.println(Alist.get(4));
        System.out.println(Alist.get(5));



    }
}

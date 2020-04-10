import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<String>> listInList = new LinkedList<>();
        List<String> stringList = new LinkedList<>();
        List<Integer> intList = new LinkedList<>();
        listInList.add(stringList);
        listInList.add(stringList);

        //TODO: toString() a Object
        // partOne();
        //partTwo();
    }

    private static void partTwo() {
        List<Notebook> notebooks = new LinkedList<>();
        notebooks.add(new Notebook("Dell", 1000));
        notebooks.add(new Notebook("HP", 1300));
        notebooks.add(new Notebook("Manta", 500));

        List<List<Notebook>> notebooksInNotebooks = new LinkedList<>();

        notebooksInNotebooks.add(notebooks);

        for (List<Notebook> notebooksInNotebook : notebooksInNotebooks) {
            //System.out.println(notebooksInNotebook);
            for (Notebook notebook : notebooksInNotebook) {
                System.out.println("TEST " + notebook);
            }
        }

        //TODO: Comparable

        notebooks.sort(new NotebookComparator());
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
    }

    private static void partOne() {
        List<String> myList = new LinkedList<>();
        List<String> myOtherList = new ArrayList<>();

        List<Integer> ints = new LinkedList<>();

        ints.add(1);
        ints.add(2);
        ints.add(4);
        ints.add(0);

        ints.sort(new IntsComparator());

        for (Integer anInt : ints) {
            System.out.println(anInt);
        }


        System.out.println("------");

        myOtherList.add("John");
        myOtherList.add("Jacka");
        myOtherList.add("Adam");


        myList.add("Jakub");
        myList.add("Klaudia");
        myList.add("Kasia");
        myList.add("Joanna");
        myList.add("Michał");

        myList.remove("Kasia");
        myList.remove(0);
        myList.add(2, "Jonasz");


        System.out.println(myList.indexOf("Michał"));

        System.out.println(myList.isEmpty());

        myList.add(myOtherList.get(0));

        Collections.sort(myList);

        //myList.addAll(myOtherList);

        for(String iter : myList) {
            System.out.println(iter);
        }

        System.out.println("-----");
        Iterator<String> iterator = myList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

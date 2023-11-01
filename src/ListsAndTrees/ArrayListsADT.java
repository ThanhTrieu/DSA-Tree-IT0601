package ListsAndTrees;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsADT {
    //create list with no parameter
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();

    // constructor
    public ArrayListsADT(List<String> strLists){
        this.list1 = strLists;
    }

    public void  addElementToArrayList(){
        for (int i = 1; i <= 5; i++) {
            list1.add("0" + i);
        }
        System.out.println("Init lists = ");
        printData(list1);
    }

    public void addAllElement(){
        list2.addAll(list1);
        list2.add("0" + 6);
        System.out.println("After add 06 , list2 = ");
        printData(list2);
    }

    public void getElement(int index){
        String element = list1.get(index);
        System.out.println("element = " + element);
        System.out.println(list1);
    }

    public void changeValueElement(int index, String value){
        list1.set(index, value);
        printData(list1);
    }

    public void removeElement(int index){
        list1.remove(index);
        printData(list1);
    }

    public void throughArrayList(){
        for(String i : list1){
            System.out.println(i);
        }
    }

    public void getSize(){
        int size = list1.size();
        System.out.println(size);
    }
    public void findElement(String element, int type){
        if(type == 0){
            // indexOf
            int pos = list1.indexOf(element);
            System.out.println(pos);
        } else {
            // lastIndexOf
            int pos2 = list1.lastIndexOf(element);
            System.out.println(pos2);
        }
    }

    public void removeAllElement(){
        printData(list2);
        System.out.println("**********");
        list2.removeAll(list1);
        printData(list1);
        System.out.println("**********");
        printData(list2);
    }
    public void clearLists(){
        list1.clear();
        printData(list1);
    }
    public void changeToArray(){
        Object[] obj =  list1.toArray();
        printData(list1);
        // duyet mang
        for(Object j : obj){
            System.out.println(j);
        }
    }

    private static void printData(List<String> list) {
        System.out.println(list);
    }
}

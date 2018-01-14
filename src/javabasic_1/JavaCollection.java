package javabasic_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JavaCollection {
    public static void main(String[] args) {
        testArrayList();
    }

    public static void testArrayList() {
        List<Integer> arraylist = new ArrayList<Integer>();
        for (int i = 0;i<5;i++) {
            arraylist.add(i);
        }
        for (int i : arraylist) {
            System.out.println(i);
        }
    }

    public static void testHashMap() {
        HashMap<String, String> hashMap = new HashMap<>();

    }
}

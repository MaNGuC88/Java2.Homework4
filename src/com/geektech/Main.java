package com.geektech;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner a1 = new Scanner(System.in);
        Scanner a2 = new Scanner(System.in);
        Scanner a3 = new Scanner(System.in);
        Scanner a4 = new Scanner(System.in);
        Scanner a5 = new Scanner(System.in);
        String A1 = a1.nextLine();
        String A2 = a2.nextLine();
        String A3 = a3.nextLine();
        String A4 = a4.nextLine();
        String A5 = a5.nextLine();
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add(A1);
        arrayList1.add(A2);
        arrayList1.add(A3);
        arrayList1.add(A4);
        arrayList1.add(A5);
        Iterator<String> iterator1 = arrayList1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println("-----------------------");

        Scanner b1 = new Scanner(System.in);
        Scanner b2 = new Scanner(System.in);
        Scanner b3 = new Scanner(System.in);
        Scanner b4 = new Scanner(System.in);
        Scanner b5 = new Scanner(System.in);
        String B1 = b1.nextLine();
        String B2 = b2.nextLine();
        String B3 = b3.nextLine();
        String B4 = b4.nextLine();
        String B5 = b5.nextLine();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add(B1);
        arrayList2.add(B2);
        arrayList2.add(B3);
        arrayList2.add(B4);
        arrayList2.add(B5);
        System.out.println("-----------------------");
        Iterator<String> iterator2 = arrayList2.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        System.out.println("-----------------------");

        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add(arrayList1.get(0));
        arrayList3.add(arrayList2.get(4));
        arrayList3.add(arrayList1.get(1));
        arrayList3.add(arrayList2.get(3));
        arrayList3.add(arrayList1.get(2));
        arrayList3.add(arrayList2.get(2));
        arrayList3.add(arrayList1.get(3));
        arrayList3.add(arrayList2.get(1));
        arrayList3.add(arrayList1.get(4));
        arrayList3.add(arrayList2.get(0));
        System.out.println(arrayList3);
        System.out.println("-----------------------");

        arrayList3.sort(Comparator.comparing(String::length));
        Iterator<String> iterator3 = arrayList3.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }
    }
}

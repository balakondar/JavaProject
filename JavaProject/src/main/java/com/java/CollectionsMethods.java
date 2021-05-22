/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 91996
 */
public class CollectionsMethods {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(7);
        Collections.sort(list);
        System.out.println("sorting List :" + list);
        Collections.shuffle(list);
        System.out.println("Shuffle :" + list);
        
        System.out.println("binarySearch :" + Collections.binarySearch(list,4));


        List<Integer> list1 = new ArrayList<>();
        list1.add(89);
        list1.add(2);
        list1.add(9);
       // Collections.disjoint(list1, list);
        System.out.println("Disjoint :" + Collections.disjoint(list1, list));
    }

}

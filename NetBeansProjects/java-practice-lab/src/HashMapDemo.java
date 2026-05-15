/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rashi
 */
// File Name : HashMapDemo.java

import java.util.HashMap;

public class HashMapDemo
{

    public static void main(String[] args)
    {

        // Creating HashMap
        HashMap<Integer,String> map = new HashMap<>();


        // Adding data
        map.put(101,"Rashi");

        map.put(102,"Rahul");

        map.put(103,"Aman");


        // Printing map
        System.out.println("Map : " + map);


        // Accessing value using key
        System.out.println("Value : " + map.get(102));


        // Removing value
        map.remove(103);

        System.out.println("After Remove : " + map);


        // Checking key
        System.out.println(map.containsKey(101));


        // Size of map
        System.out.println("Size : " + map.size());

    }

}

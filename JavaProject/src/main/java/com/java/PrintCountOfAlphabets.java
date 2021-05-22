/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author 91996
 */
public class PrintCountOfAlphabets {
    
    public static String PrintAlphabetsCount(String originalString)
    {
        
        String CountAlphaString="";
        Map<Character, Integer> treeMap=new TreeMap<>();
        
        for(int i=0;i<originalString.length();i++){
           
            if(treeMap.containsKey(originalString.charAt(i))){  
                int count=Integer.parseInt(treeMap.get(originalString.charAt(i)).toString());                
                treeMap.put(originalString.charAt(i), Integer.valueOf(count+1));                
            }else{
                treeMap.put(originalString.charAt(i),Integer.valueOf(1)) ;
            }            
        }
        Set<Map.Entry<Character, Integer>> entry=treeMap.entrySet();
         Iterator<Entry<Character, Integer>> itr = entry.iterator();
      
      // Display elements
      while(itr.hasNext()) {
         Map.Entry<Character, Integer> me = (Entry<Character, Integer>)itr.next();
         CountAlphaString+=me.getKey().toString()+me.getValue();
      }
      return CountAlphaString;
    }
    
    public static void main (String arg[]){
       String countAlpofStr= PrintCountOfAlphabets.PrintAlphabetsCount("aaaabbbcccdd");
        System.out.println("PrintCountOfAlphabets :"+countAlpofStr);
        
        
    }
    
}

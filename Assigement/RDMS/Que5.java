package com.Module;

import java.util.HashSet;
import java.util.Set;

public class Que5
{

    public static void main(String[] args) 
    {
        String str1 = "WX";
        String str2 = "YZ";
        Set<String> interleavings = new HashSet<>();
        
        
        generateInterleavings(str1, str2, "", interleavings);
        
        
        System.out.println("The interleaving strings are: " + interleavings);
    }
    
    
    private static void generateInterleavings(String str1, String str2, String result, Set<String> interleavings) {
        if (str1.isEmpty() && str2.isEmpty()) {
            interleavings.add(result);
            return;
        }
        
        if (!str1.isEmpty()) {
            generateInterleavings(str1.substring(1), str2, result + str1.charAt(0), interleavings);
        }
        
        if (!str2.isEmpty()) {
            generateInterleavings(str1, str2.substring(1), result + str2.charAt(0), interleavings);
        }
    }
}

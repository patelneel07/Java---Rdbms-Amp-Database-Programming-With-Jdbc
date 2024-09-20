package com.Module;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Que6
{
    public static void main(String[] args) 
    {
        String inputString = "successes";
        char secondMostFrequentChar = findSecondMostFrequentCharacter(inputString);
        
        if (secondMostFrequentChar != '\0') 
        {
            System.out.println("The second most frequent char in the string is: " + secondMostFrequentChar);
        } else
        {
            System.out.println("No second most frequent character found.");
        }
    }

    public static char findSecondMostFrequentCharacter(String str) 
    {
    
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
    
        for (char c : str.toCharArray()) 
        {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

    
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = 
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        
        maxHeap.addAll(frequencyMap.entrySet());

        
        maxHeap.poll();
        
        
        Map.Entry<Character, Integer> secondMost = maxHeap.poll();
        return (secondMost != null) ? secondMost.getKey() : '\0';
    }
}

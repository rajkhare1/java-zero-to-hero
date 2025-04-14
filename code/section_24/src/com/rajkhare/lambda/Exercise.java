package com.rajkhare.lambda;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

    public static void main(String[] args) {
        transformStringList();
    }
    
    // Method to apply string transformation
    public static List<String> transformStringList() {
          List<String> words = List.of("hello", "world", "java", "lambda");
          List<String> result = new ArrayList<>();
            
          // Write your logic below
        StringTransformer transformToUpperCase = (s) -> s.toUpperCase();
        for (String word : words) {
            result.add(transformToUpperCase.transform(word));
        }
        
          return result;
    }

}
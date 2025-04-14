package com.rajkhare.lambda;

@FunctionalInterface
public interface StringTransformer {
    
    String transform(String input);
    
}
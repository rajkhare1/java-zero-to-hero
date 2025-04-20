package com.rajkhare.method.reference;

public class InstanceMethodReference {

    public static void main(String[] args) {
        ArithmeticOperation operation = (a,b) -> {
            int sum = a + b;
            System.out.println(sum);
            return sum;
        };
        operation.performOperation(2,3);

        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
        ArithmeticOperation methodReference = instanceMethodReference::performAddition;
        methodReference.performOperation(2,3);

        ArithmeticOperation methodReferenceSub = instanceMethodReference::performSubstraction;
        methodReferenceSub.performOperation(2,3);
    }

    public  int performAddition(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public  int performSubstraction(int a, int b) {
        int diff = a - b;
        System.out.println(diff);
        return diff;
    }

}

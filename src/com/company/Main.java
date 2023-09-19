package com.company;

public class Main {

    public static void main(String[] args) {
        int intOperandA, intOperandB, intSum, intProduct, intDifference, intQuotient, intModulo;
        double doubleOperandA, doubleOperandB, doubleSum, doubleProduct, doubleDifference, doubleQuotient, doubleModulo;

        intOperandA = 15;
        intOperandB = 13;

        doubleOperandA = 1.5;
        doubleOperandB = 2.5;

        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo = doubleOperandA % doubleOperandB;

        System.out.println("The sum using the ints of " + intOperandA + " + " + intOperandB + " is " + intSum);
        System.out.println("The product using the ints of " + intOperandA + " * " + intOperandB + " is " + intProduct);
        System.out.println("The difference using the ints of " + intOperandA + " - " + intOperandB + " is " + intDifference);
        System.out.println("The quotient using the ints of " + intOperandA + " / " + intOperandB + " is " + intQuotient);
        System.out.println("The modulus using the ints of " + intOperandA + " % " + intOperandB + " is " + intModulo);

        System.out.println("The sum using the doubles of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product using the ints of " + doubleOperandA + " * " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference using the ints of " + doubleOperandA + " - " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient using the ints of " + doubleOperandA + " / " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("The modulus using the ints of " + doubleOperandA + " % " + doubleOperandB + " is " + doubleModulo);
    }
}


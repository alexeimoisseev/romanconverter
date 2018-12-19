package com.documill.assignment;

import com.documill.assignment.RomanToDecimal;

public class Main {
    public static final void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Please specify one arguement with Roman number");
            System.exit(1);
        }
        try {
            System.out.println(RomanToDecimal.convert(args[0]));
        } catch(IllegalArgumentException e) {
            System.err.println("Input is not a valid Roman number");
            System.exit(1);
        }
    }
}

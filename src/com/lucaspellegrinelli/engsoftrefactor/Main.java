package com.lucaspellegrinelli.engsoftrefactor;

public class Main {
    public static void main(String[] args) {
        Customer m = new Customer("");
        System.out.println(m.statement());
        System.out.println(m.htmlStatement());
    }
}

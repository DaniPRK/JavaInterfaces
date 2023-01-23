package Interfaces;

import java.sql.SQLOutput;

public class Main {
    static CocheCRUD cocheCrud = new CocheCRUDImpl();
    public static void main(String[] args) {

        System.out.println(cocheCrud);


    }
}
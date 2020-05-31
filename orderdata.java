package sample;

import java.io.File;
import java.io.IOException;
//creating file orderinfo
public class orderdata {
    public static void main(String[] args) {
        try {
            File orderdata = new File("orderinfo.txt");
            if (orderdata.createNewFile()) {
                System.out.println("File created: " + orderdata.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (
                IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
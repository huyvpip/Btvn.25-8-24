/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap.ifelse;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaitapIfelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
        int x =scanner.nextInt();
        if (x>0){
            System.out.println("Postive");
        }else if (x<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
    
}

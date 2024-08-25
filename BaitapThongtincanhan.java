/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap.thongtincanhan;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaitapThongtincanhan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println("nhap nam sinh:");
        int year = Integer.parseInt(scanner.next());
        System.out.println("nhap tuoi:");
        int old = Integer.parseInt(scanner.next());
        System.out.println("nhap gioi tinh");
        String sex = scanner.next();
        System.out.println("GPA");
        float gpa = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("nhap que quan");
        String homeTown = scanner.nextLine();
        System.out.println(name+"-"+year+"-"+old+"-"+sex+"-"+gpa+"-"+homeTown);
    }
    
}

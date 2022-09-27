/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21task2skorohodov;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV21Task2Skorohodov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("первое число : ");
        int number = scanner.nextInt();
        System.out.print("второе число : ");
        int name = scanner.nextInt();
        int otv = number+name;
        System.out.println("сумма : " + otv);
    }
    
}

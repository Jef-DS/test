/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.betavzw.devops.testing;

import java.util.Scanner;

/**
 *
 * @author Jef
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef eerste getal: ");
        int getal1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Geef tweede getal: ");
        int getal2 = Integer.parseInt(scanner.nextLine());
        
    }
}

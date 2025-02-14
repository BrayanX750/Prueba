/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectete;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Proyectete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        Scanner stdin;
        stdin = new Scanner(System.in);
        System.out.println("Hola mundete!\n Como estas hoy?");
        input = stdin.nextLine();
        System.out.println("Me vale verga jajajaj");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Mentira bro como te sientes?");
        input = stdin.nextLine();
        System.out.println("Ohh ya bro");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tambien me vale verga Xdxd");
        System.out.println("Adios brouu");
    }
}

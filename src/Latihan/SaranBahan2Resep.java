/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class SaranBahan2Resep {
    public static void main(String[] args) {
        String identitas = "najwa kusuma mustafa / xr5 / 28";
        System.out.println("Identiras : "+ identitas);
        
        System.out.print("\nSaran Resep dari Bahan milik anda\n");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bahan Pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.print("Masukkan no pilihan Anda :");
        int bahan1 = scanner.nextInt();
    }
}

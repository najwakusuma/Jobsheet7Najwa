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
        if(bahan1 == 1 || bahan1 == 2)
        {
            System.out.println("Bahan Kedua: ");
            if(bahan1 == 1){
                System.out.println("1. Susu");
                System.out.println("2. Minyak Goreng");
                System.out.println("3.Tidak ada");
            }else{
                System.out.println("1. Minyak Goreng");
                System.out.println("2. Roti");
                System.out.println("3. Tidak ada");
            }
            System.out.print("masukkan no pilihan anda :");
            int bahan2 = scanner.nextInt();
            
            if(bahan2 >= 1 && bahan2 <= 3)
        {
            if(bahan1==1)
                switch(bahan2)
                {
                    case 1 : System.out.println(
                             "Anda dapat membuat milk shake banana");break;
                    case 2 : System.out.println(
                             "Anda dapat membuat pisang goreng");break;
                    case 3 : System.out.println(
                             "Anda dapat membuat pisang rebus");
                }
            else
                switch(bahan2)
                {
                    case 1 : System.out.println(
                             "Anda dapat membuat telur mata sapi");break;
                    case 2 : System.out.println(
                             "Anda dapat membuat sandwich telur");break;
                    case 3 : System.out.println(
                             "Anda dapa membuat telur rebus");
                }
        }else
            System.out.println("Mohon Maaf, Pilihan tidak ditemukan,"+ "tidak dapat memberikan saran resep");
        }else
            System.out.println("mohon maaf, pilihan tidak ditemukan," + "tidak dapat memberikan saran resep");
            }
        }
    


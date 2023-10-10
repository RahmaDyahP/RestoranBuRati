
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rahma Dyah
 */
public class Restoran1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean status = true;
        int Harga = 0;
        int total = 0;
        do{
        
            System.out.println("List Menu Makanan \n 1.Sate Ayam : 15000 \n 2.Sate Tahu : 10000 \n 3.Sate Kambing : 25000 \n  4.Gulai Kambing : 20000 \n 5.Es Teh : 5000 \n 6.Es Jeruk : 10000 \n" + "");
            System.out.println("Silakan Ingin Pesan Apa?");
            int Menu = input.nextInt();

            switch (Menu) {
                case 1:
                    Harga = 15000;
                    total += Harga;
                    break;
                case 2:
                    Harga = 10000;
                    total += Harga;
                    break;
                case 3:
                    Harga = 25000;
                    total += Harga;
                    break;
                case 4:
                    Harga = 20000;
                    total += Harga;
                    break;
                case 5:
                    Harga = 5000;
                    total += Harga;
                    break;
                case 6:
                    Harga = 10000;
                    total += Harga;
                    break;

                default:
                    Harga = 0;
                    break;

            }
            
            System.out.println("Apakah beli lagi? (ya/tidak)");
            String lagi = input.next();
            if (lagi.equalsIgnoreCase("tidak")) {
                status = false;
            }

            System.out.println("Total : " + total);
        } while (status);
        
        
        System.out.println("Uang yang dibayarkan : ");
        int bayar = input.nextInt();
        if (bayar<total){
            System.out.println("Uang anda kurang");
        }
        else if (bayar>total){
            System.out.println("Uang anda lebih");
            double uang = bayar-total;
            System.out.println("Uang kembalian : "+uang);
        }
        else{
            System.out.println("Uang anda pas");
            
          
        }
                
                
        
        
                
            
}
}

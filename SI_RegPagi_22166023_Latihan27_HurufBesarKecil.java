/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166023_latihan27_huruf.besar.kecil;
import java.util.Scanner;
/**
 *
 * @author user
 * NAMA : Peni Nurul Fauzah
 * KELAS : PBO27
 * NIM : 22166023
 * DESKRIPSI PROGRAM : Huruf Besar Kecil
 */
public class SI_RegPagi_22166023_Latihan27_HurufBesarKecil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Formatting Kalimat");

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        String kalimatHurufBesar = kalimat.toUpperCase();
        String kalimatHurufKecil = kalimat.toLowerCase();

        System.out.println("==HASIL FORMATTING==");
        System.out.println("Huruf Besar : " + kalimatHurufBesar);
        System.out.println("Huruf Kecil : " + kalimatHurufKecil);
    }
    
}

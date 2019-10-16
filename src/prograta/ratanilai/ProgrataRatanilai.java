/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prograta.ratanilai;

import java.util.Scanner;

/**
  * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deksripsi Program : Program ini berisi program untuk menampilkan nilai 
 * rata-rata dari beberapa siswa/siswi
 */
public class ProgrataRatanilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        Nilai nilai1 = new Nilai();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nilai1.jumlahSiswa = scanner.nextInt();
        nilai1.inputHitungNilai(nilai1.jumlahSiswa, nilai1.nilai);
        System.out.println("Maka, Rata-rata Nilainya adalah : " + nilai1.rataRataNilai());
    }
    
}

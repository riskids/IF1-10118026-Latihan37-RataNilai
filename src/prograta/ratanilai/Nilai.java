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
public class Nilai {
    public int jumlahSiswa;
    public double ratanilai;
    public double jumlahnilai;
    public double nilai;
    
    public void inputHitungNilai(int jumSiswa, double Nilai){
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        while (i <= jumSiswa) {
            System.out.print("Nilai Mahasiswa ke-"+ i +" : ");
            Nilai = scanner.nextInt();
            jumlahnilai = jumlahnilai + Nilai;
            i = i + 1;
        }
        System.out.println("");
        
    }
    public double rataRataNilai(){
        
        return ratanilai = jumlahnilai / jumlahSiswa;
    }
}

package pboif2.pkg10119065.latihan22.latihanperhitunganlingkaran;
import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan perhitungan lingkaran
 */
public class PBOIF210119065Latihan22LatihanPerhitunganLingkaran {

    public static double jariLingkaran(int diameter){
        double jarijari = diameter / 2;
        return jarijari;
    }
    public static double luasLingkaran(int diameter){
        double luas = 3.14 * Math.pow(jariLingkaran(diameter), 2); //Math pow untuk menghitung pangkat
        return luas;
    }
    public static double kelilingLingkaran(int diameter){
        double keliling = 2 * 3.14 * jariLingkaran(diameter);
        return keliling;
    }
    
    public static String lingkaran(int diameter){
        String satuan = " cm";
        
        System.out.println("Jari-jari lingkaran "+jariLingkaran(diameter) + satuan);
        System.out.println("Luas Lingkaran "+luasLingkaran(diameter) + satuan);
        System.out.println("Keliling Lingkaran "+kelilingLingkaran(diameter) + satuan);
        return satuan;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai diameter lingkaran : ");
        int diameter;
        diameter = sc.nextInt();
        
        if(diameter == (int)diameter){
            lingkaran(diameter);
        } else {
            System.out.println("Nilai diameter tidak sesuai");
        }
       System.out.println("(Developed by : Fachriansyah Muhammad Nur Ihsan)");  
    }
    
}

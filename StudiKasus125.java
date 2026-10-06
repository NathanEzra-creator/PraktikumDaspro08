import java.util.Scanner;
public class StudiKasus125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon = 0, totalBayar, kembalian, kurang;
        
        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar : ");
        uangBayar = sc.nextInt();
        
        totalHarga = jumlahCup * hargaPerCup;
        System.out.println("Total harga\t: Rp " + totalHarga);
        
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        System.out.println("Diskon\t\t: Rp " + diskon);
        
        totalBayar = totalHarga - diskon;
        System.out.println("Total bayar\t: Rp " + totalBayar);
        
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian\t: Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }
    }
}
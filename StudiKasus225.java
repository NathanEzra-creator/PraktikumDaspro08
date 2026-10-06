import java.util.Scanner;
public class StudiKasus225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();
        
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = sc.nextLine();
        
        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = sc.nextInt();
        
        String status = "";
        
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Peringkat juara (1/2/3/0) : ");
            int peringkat = sc.nextInt();
            
            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    status = "Dana penghargaan diberikan.";
                } else {
                    int kurang = 4 - jumlahDokumen;
                    status = "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.";
            }
            
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            
            System.out.print("Status pendanaan PKM (1 lolos/0 tidak) : ");
            int statusPKM = sc.nextInt();
            
            if (statusPKM == 1) {
                if (jumlahDokumen == 4) {
                    status = "Dana penghargaan diberikan.";
                } else {
                    int kurang = 4 - jumlahDokumen;
                    status = "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Tidak lolos pendanaan. Dana penghargaan tidak diberikan.";
            }
            
        } else {
            status = "Kegiatan lainnya tidak memperoleh dana penghargaan.";
        }
        
        System.out.println("Status : " + status);
    }
}
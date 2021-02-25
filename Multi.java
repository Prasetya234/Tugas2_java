import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        
        // Membuat Array dan Scanner
        String[][] osis = new String[2][3];
        Scanner scan = new Scanner(System.in);

        // mengisi setiap mja
        for(int adi = 0; adi < osis.length; adi++){
            for(int safa = 0; safa < osis[adi].length; safa++){
                System.out.format("Siapa yang akan menjadi ketua osis tahun ini (%d,%d) Safa atau adi? ", adi, safa);
                osis[adi][safa] = scan.nextLine();
            }
        }

        // menampilkan isi Array
        System.out.print("Daftar ketua Osis");
        System.out.println("-------------------------------------------------------------------------");
        for(int adi = 0; adi < osis.length; adi++){
            for(int safa = 0; safa < osis[adi].length; safa++){
                System.out.format("| %s | \t", osis[adi][safa]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------------------------------------------------------");
    }
}

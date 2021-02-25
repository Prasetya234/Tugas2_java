import java.util.Scanner;

class Array {  
    public static void main(String[] args) {
        
        // membuat array buah-buahan
        String[] teman = new String[5];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for( int i = 0; i < teman.length; i++ ){
            System.out.print("Siapa nama teman mu yang ke-" + i + " ? ");
            teman[i] = scan.nextLine();
        }
        System.out.println("-------------------");

        // menampilkan semua isi array
        for( String b : teman ){
            System.out.println("Hay! " + b);
        }
    }
}

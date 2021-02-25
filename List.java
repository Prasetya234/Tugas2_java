import java.util.ArrayList;

class Kamu {
    public static void main(String[] args) {
        
        // membuat objek array list
        ArrayList<String> coc = new ArrayList<>();

        // mengisi camp tentara dengan 5 pasukan yan berbeda
        coc.add("Giant");
        coc.add("ballon");
        coc.add("larva hound");
        coc.add("Golems");
        coc.add("Hog Rider");
        coc.add("Valkyries");

        // menghapus Giant dari Camp tentara
        coc.remove("Giant");

        System.out.println(coc);

        // menampilkan banyak isi Camp tentara
        System.out.println("Camp tentara kamu berisi " + coc.size() +" pasukan");
    }
}
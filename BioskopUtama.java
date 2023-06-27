package UAS; // untuk mengelompokkan kelas-kelas yang terkait 

public class BioskopUtama {  //ini merupakan class yang bernama BioskopUtama
    //psvm adalah sebuah method dalam bahasa pemrograman Java. Fungsi method ini adalah untuk menjalankan program
    public static void main(String args[]) {
               
        //buat object 
        Menu MN = new Menu(); //digunakan untuk menambahkan objek baru yang berupa Menu MN

        
        System.out.print("\n"); //ini untuk membuat baris baru pada layar
        System.out.println(" ======================================================= "); //ini untuk mencetak ke layar
        System.out.println(" ============= SELAMAT DATANG DI BIOSKOP =============== "); //ini untuk mencetak ke layar
        System.out.println(" ======================================================= "); //ini untuk mencetak ke layar
        
        MN.Pilihan();//ini untuk memanggil method yang bernama Pilihan
   
    }
}


package UAS; // untuk mengelompokkan kelas-kelas yang terkait 
import java.util.Scanner; // ini berguna untuk memasukkan paket Scanner

public class Kursi { //ini merupakan class yang bernama Kursi

    Scanner input = new Scanner(System.in); //digunakan untuk membaca string dari pilihan yang akan diinputkan nanti
    String pilih; //berupa tipe data String untuk variabel pilih
    String infotempat; //berupa tipe data String untuk variabel infotempat

    void infoKursi(){ //ini merupakan sebuah method yang menyatakan bahwa method tersebut bersifat public
        // Membuat array dengan tipe data yaitu String
        String[][] kursi = { {"A1", "A2", "A3", "A4", "A5"}, {"B1", "B2", "B3", "B4", "B5"}, 
                             {"C1", "C2", "C3", "C4", "C5"}, {"D1", "D2", "D3", "D4", "D5"}};

        // menampilkan isi Array
        for(int bar = 0; bar < kursi.length; bar++){ //bagian ini untuk menetapkan suatu kondisi tertentu
            for(int kol = 0; kol < kursi[bar].length; kol++){ //bagian ini untuk menetapkan suatu kondisi tertentu
                System.out.format("| %s | \t", kursi[bar][kol]); //ini untuk mencetak dengan format tertentu ke layar
            }
            System.out.println(""); //ini untuk mencetak ke layar
        }
        System.out.print("\n"); //ini digunakan untuk membuat baris baru yang akan ditampilkan di layar
        System.out.println("------------------- LAYAR BIOSKOP ----------------------"); //ini untuk mencetak ke layar

    }

    void infotempat(){ //ini merupakan sebuah method yang menyatakan bahwa method tersebut bersifat public
        System.out.print("\n"); //ini digunakan untuk membuat baris baru yang akan ditampilkan di layar
        System.out.println(" ------------- Pemilihan Tempat Duduk ------------------ "); //ini untuk mencetak ke layar
        System.out.print("Silahkan Masukan Tempat Duduk Yang Ingin Dipesan : "); //ini untuk mencetak ke layar
        pilih = input.nextLine();  //digunakan untuk menginputkan data dari baris yang diingikan
          
        /*switch case dibawah ini digunakan untuk percabangan kode program 
        dimana kita membandingkan isi sebuah variabel dengan beberapa nilai.*/
        switch(pilih){
            case "A1": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | A1 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "B1": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | B1 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "C1": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | C1 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "D1": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | D1 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "A2": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | A2 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "B2": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | B2 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "C2": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | C2 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "D2": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | D2 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "A3": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | A3 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "B3": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | B3 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "C3": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | C3 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "D3": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | D3 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "A4": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | A4 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "B4": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | B4 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "C4": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | C4 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "D4": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | D4 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "A5": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | A5 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "B5": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | B5 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "C5": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | C5 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            case "D5": // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.println("Tempat Duduk Yang Dipilih Adalah | D5 |"); //ini untuk mencetak ke layar
                break; //digunakan untuk mengakhiri sebuah eksekusi dalam statement
            default: //ini digunakan untuk pernyataan yang akan dieksekusi jika case tidak sesuai dengan nilai yang ditentukan.
                System.out.println("Maaf Daftar Tempat Duduk Tidak Tersedia"); //ini untuk mencetak ke layar
        }
    }
}
      
          
          

   

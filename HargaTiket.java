package UAS; // untuk mengelompokkan kelas-kelas yang terkait 
import java.util.Scanner; // ini berguna untuk memasukkan paket Scanner

public class HargaTiket {  //ini merupakan class yang bernama HargaTiket
    
    infoharga info = new infoharga(45000, 55000); //digunakan untuk menambahkan objek baru
    
    int pilih; //berupa tipe data integrer untuk variabel pilih
    int harga; //berupa tipe data integrer untuk variabel harga
    int jumlahtiket; //berupa tipe data integrer untuk variabel jumlahtiket
    int totalharga; //berupa tipe data integrer untuk variabel totalharga
   
    Scanner input = new Scanner(System.in); //digunakan untuk membaca string dari pilihan yang akan diinputkan nanti

    void infoHarga() //ini merupakan sebuah method yang menyatakan bahwa method tersebut bersifat public
    {
        // Cetak daftar harga tiket
        System.out.println("Harga Tiket Hari Biasa : Rp" + info.getHarikerja()); //ini untuk mencetak ke layar dan memanggil info.getHarikerja()
        System.out.println("Harga Tiket Hari Libur : Rp" + info.getHarilibur());//ini untuk mencetak ke layar dan memanggil info.getHarilibur()      
    }

    void pilihharidantransaksi() //ini merupakan sebuah method yang menyatakan bahwa method tersebut bersifat public
    {
      System.out.print("\n"); //ini untuk membuat baris baru pada layar
      System.out.println(" ------------- Pemilihan Hari & Transaksi ------------- ");//ini untuk mencetak ke layar
      System.out.println("1. Hari Kerja = Senin - Jumat");//ini untuk mencetak ke layar
      System.out.println("2. Hari Libur = Sabtu Dan Minggu"); //ini untuk mencetak ke layar
      System.out.print("\n");//ini untuk mencetak ke layar
      System.out.print("Silahkan Pilih Hari Anda Saat Ini : "); //ini untuk mencetak ke layar
      pilih = input.nextInt(); //digunakan untuk menginputkan data yang diingikan

      if(pilih == 1) //disini kita menggunakan konsep percabangan if else 
      {
        harga = info.getHarikerja(); //jika memilih 1 maka akan menampikan info harga pada hari kerja
      }
      else  //disini kita menggunakan konsep percabangan if else 
      {
        harga = info.getHarilibur(); //jika memilih 2 maka akan menampikan info harga pada hari libur
     
      
      System.out.print("Silahkan Masukan Jumlah Tiket Yang Ingin Dibeli : "); //ini untuk mencetak ke layar
      jumlahtiket = input.nextInt(); //digunakan untuk menginputkan jumlah tiket yang diingikan

      /*looping dibawah ini Perulangan jenis for ini digunakan untuk 
      melakukan perintah pengulangan yang telah diketahui jumlah banyaknya.*/
      //jadi looping dibawah ini digunakan untuk mencari total harga dari pemesanan tiket
      for(int i = 0 ; i < jumlahtiket ; i +=1)  //bagian ini untuk menetapkan suatu kondisi tertentu
      {
        if(jumlahtiket == jumlahtiket)  //bagian ini untuk menetapkan suatu kondisi tertentu
        {
          totalharga = harga * jumlahtiket;  //bagian ini untuk memasukan rumus dari variabel yang bernama totalharga
        }
      }
      System.out.println("Total Harga Yang Harus Anda Bayar : Rp " +totalharga); //ini untuk mencetak ke layar dan memanggil variabel totalharga
      System.out.print("\n"); //ini untuk membuat baris baru pada layar
     
    }  
  }
} 







package UAS; // untuk mengelompokkan kelas-kelas yang terkait 
import java.util.Scanner; // ini berguna untuk memasukkan paket Scanner

public class Jadwal {  //ini merupakan class yang bernama Jadwal
  int pilih; // ini merupakan sebuah tipe data int untuk variabel pilih
  Film ff; //digunakan untuk menambahkan objek baru yang berupa Film

  Scanner input = new Scanner(System.in); //digunakan untuk membaca string dari pilihan yang akan diinputkan nanti
    
  void infoJadwal(){ //ini merupakan sebauh method yang menyatakan bahwa method tersebut bersifat public
    System.out.println("1. 10:00 AM  | Black Widow"); //digunakan untuk menampilkan ke layar
    System.out.println("2. 13:00 PM  | Avengers"); //digunakan untuk menampilkan ke layar
    System.out.println("3. 16:00 PM  | Spider-Man"); //digunakan untuk menampilkan ke layar
    System.out.println("4. 19:00 PM  | Avatar"); //digunakan untuk menampilkan ke layar
    System.out.println("5. 22:00 PM  | Iron Man"); //digunakan untuk menampilkan ke layar
  }
    void pilihJadwal() //ini merupakan sebauh method yang menyatakan bahwa method tersebut bersifat public
    {
      System.out.print("\n"); //digunakan untuk menampilkan ke layar
      System.out.println(" ----------------- Pemilihan Film ---------------------- "); //digunakan untuk menampilkan ke layar
      System.out.print("Silahkan Masukan Nomor Judul Film Yang Ingin Dipesan : "); //digunakan untuk menampilkan ke layar
      pilih = input.nextInt(); //digunakan untuk menginputkan nomor judul film yang diingikan
  
      if(pilih == 1) // ini merupakan sebuah percabangan
      {
        ff = new film1(); //digunakan untuk menambahkan objek baru
        ff.judul(); //ini untuk memanggil method yang bernama judul
      }
      else if (pilih == 2) // ini merupakan sebuah percabangan
      {
        ff = new film2(); //digunakan untuk menambahkan objek baru
        ff.judul(); //ini untuk memanggil method yang bernama judul
      }
      else if (pilih == 3) // ini merupakan sebuah percabangan
      {
        ff = new film3(); //digunakan untuk menambahkan objek baru
        ff.judul(); //ini untuk memanggil method yang bernama judul
      }
      else if (pilih == 4) // ini merupakan sebuah percabangan
      {
        ff = new film4(); //digunakan untuk menambahkan objek baru
        ff.judul(); //ini untuk memanggil method yang bernama judul
      }
      else if (pilih == 5) // ini merupakan sebuah percabangan
      {
        ff = new film5(); //digunakan untuk menambahkan objek baru
        ff.judul(); //ini untuk memanggil method yang bernama judul
      }
      else // ini merupakan sebuah percabangan
      {
        System.out.println(" Maaf Daftar Film Tidak Tersedia "); //digunakan untuk menampilkan ke layar
      }
      
    }
  }

// ini merupakan class yang bernama Film
class Film {
  void judul(){ //ini merupakan sebauh method yang menyatakan bahwa method tersebut bersifat public
    System.out.println(""); //digunakan untuk menampilkan ke layar
  }

}

// ini merupakan class yang bernama film1
// extends digunakan untuk mewariskan method dan property dari kelas induknya
// extend dibawah untun mewariskan method dan property dari class Film
class film1 extends Film{
  void judul(){ //ini merupakan sebauh method yang menyatakan bahwa method tersebut bersifat public
    System.out.println("Film Yang Dipilih Adalah Black Widow Pada Jam 10.00 AM"); //digunakan untuk menampilkan ke layar
  }
}

// ini merupakan class yang bernama film2
// extends digunakan untuk mewariskan method dan property dari kelas induknya
// extend dibawah untun mewariskan method dan property dari class Film
class film2 extends Film{
  void judul(){ //ini merupakan sebauh method yang menyatakan bahwa method tersebut bersifat public
    System.out.println("Film Yang Dipilih Adalah Avengers: Endgame Pada Jam 13.00 AM"); //digunakan untuk menampilkan ke layar
  }
}

// ini merupakan class yang bernama film3
// extends digunakan untuk mewariskan method dan property dari kelas induknya
// extend dibawah untun mewariskan method dan property dari class Film
class film3 extends Film{
  void judul(){ //ini merupakan sebauh method yang menyatakan bahwa method tersebut bersifat public
    System.out.println("Film Yang Dipilih Adalah Spider-Man Pada Jam 16.00 AM"); //digunakan untuk menampilkan ke layar
  }
}

// ini merupakan class yang bernama film4
// extends digunakan untuk mewariskan method dan property dari kelas induknya
// extend dibawah untun mewariskan method dan property dari class Film
class film4 extends Film{
  void judul(){ //ini merupakan sebauh method yang menyatakan bahwa method tersebut bersifat public
    System.out.println("Film Yang Dipilih Adalah Avatar Pada Jam 19.00 AM"); //digunakan untuk menampilkan ke layar
  }
}

// ini merupakan class yang bernama film5
// extends digunakan untuk mewariskan method dan property dari kelas induknya
// extend dibawah untun mewariskan method dan property dari class Film
class film5 extends Film{
  void judul(){ //ini merupakan sebauh method yang menyatakan bahwa method tersebut bersifat public
    System.out.println("Film Yang Dipilih Adalah Iron Man Pada Jam 22.00 AM"); //digunakan untuk menampilkan ke layar
}
}


package UAS; // untuk mengelompokkan kelas-kelas yang terkait 

// Abstract: menyediakan interface yang dapat diimplementasikan oleh kelas-kelas turunannya
abstract class Bioskop1 {  //ini merupakan class yang bernama Bioskop1
   
  abstract void daftarJadwal(); //baris ini berguna untuk menampilkan menu daftar jadwal film
  abstract void daftarKursi(); //baris ini berguna untuk menampilkan menu daftar tempat kursi
  abstract void daftarHarga(); //baris ini berguna untuk menampilkan menu daftar harga film
  abstract void pembelianTiket(); //baris ini berguna untuk memproses cara membeli tiket bioskop
  abstract void kembali(); //baris ini berguna untuk memproses agar dapat kembali ke menu utama
}


package UAS; // untuk mengelompokkan kelas-kelas yang terkait 
import java.util.Scanner; // ini berguna untuk memasukkan paket Scanner

public class Menu { //ini merupakan class yang bernama menu

    public void Pilihan(){ //ini merupakan sebauh method yang menyatakan bahwa method tersebut bersifat public
        HargaTiket total = new HargaTiket(); //digunakan untuk menambahkan objek baru yang berupa harga tiket
        Bioskop2 bioskop = new Bioskop2(); //digunakan untuk menambahkan objek baru yang berupa bioskop2
        Jadwal waktu = new Jadwal(); //digunakan untuk menambahkan objek baru yang berupa jadwal
        Kursi kursi = new Kursi(); //digunakan untuk menambahkan objek baru yang berupa kursi
        Pembayaran bayar = new Pembayaran(); //digunakan untuk menambahkan pbjek baru yang berupa pembayaran
        int pilihan; // ini merupakan sebuah tipe data int untuk variabel pilihan
        char respon; //ini merupakan sebauh tipe data char untuk variabel respon

        Scanner input = new Scanner(System.in); //digunakan untuk membaca string dari pilihan yang akan diinputkan nanti

        do { //ini meruapakan sebuah kode awal untuk perulangan
            System.out.print("\n");
            System.out.println(" ==================== Menu Utama ===================== "); //ini untuk mencetak ke layar
            System.out.println("1. Daftar Film"); //ini untuk mencetak ke layar
            System.out.println("2. Daftar Harga"); //ini untuk mencetak ke layar
            System.out.println("3. Tempat Duduk"); //ini untuk mencetak ke layar
            System.out.println("4. Pembelian Tiket"); //ini untuk mencetak ke layar
            System.out.println("5. Exit"); //ini untuk mencetak ke layar
            System.out.print("Masukkan Pilihan Anda: "); //ini untuk mencetak ke layar
            
           
            pilihan = input.nextInt(); //digunakan untuk menginputkan data yang diingikan
            
           
            /*switch case dibawah ini digunakan untuk percabangan kode program 
             dimana kita membandingkan isi sebuah variabel dengan beberapa nilai.*/
            switch (pilihan) { // switch digunakan untuk mengeksekuusi pada setiap label case 
                case 1: // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                bioskop.daftarJadwal(); // berhungsi untuk memanggil method yang bernama daftarJadwal
                waktu.infoJadwal(); // berhungsi untuk memanggil method yang bernama infoJadwal
                
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.print("Apakah Ingin Kembali Ke Menu Utama Y / T ?  "); //digunakan untuk menampilkan ke layar
                respon = input.next().charAt(0); //digunakan untuk menginputkan data yang diingikan
                if (respon == 'Y'){ // ini merupakan sebauh percabangan
                Pilihan(); // digunakan untuk memanggil method yang bernama Pilihan ketika dijalankannya salah satu pilihan percabangan
            
                }   
                else if (respon == 'T'){ // ini meruapakan sebuah percabangan
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.print("Terima Kasih Telah Berkunjung Ke Bioskop"); //digunakan untuk menampilkan ke layar
                }
                
                else // ini meruapakan sebuah percabangan
                {
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println("Maaf Layanan Tidak Tersedia "); //digunakan untuk menampilkan ke layar
                }
                break; //untuk mengakhiri setiap case
                
                case 2: // ini merupakan sebuah label case percabangan yang kedua yang berguna untuk menajalankan aksi
                bioskop.daftarHarga(); // berhungsi untuk memanggil method yang bernama daftarHarga
                total.infoHarga(); // berhungsi untuk memanggil method yang bernama infoHarga
                
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.print("Apakah Ingin Kembali Ke Menu Utama Y / T ?  ");  //digunakan untuk menampilkan ke layar
                respon = input.next().charAt(0); //digunakan untuk menginputkan data yang diingikan
                if (respon == 'Y'){ // ini merupakan sebuah percabangan
                Pilihan(); // digunakan untuk memanggil method yang bernama Pilihan ketika dijalankannya salah satu pilihan percabangan
              
                }   
                else if (respon == 'T'){ //ini meruapakan sebuah percabangan
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.print("Terima Kasih Telah Berkunjung Ke Bioskop"); //digunakan untuk menampilkan ke layar
                }
                
                else // ini meruapakan sebuah percabangan
                {
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println("Maaf Layanan Tidak Tersedia "); //digunakan untuk menampilkan ke layar
                }
                break; //untuk mengakhiri setiap case

                case 3: // ini merupakan sebuah label case percabangan yang ketiga yang berguna untuk menajalankan aksi
                bioskop.daftarKursi(); // berhungsi untuk memanggil method yang bernama daftarKursi
                kursi.infoKursi(); // berhungsi untuk memanggil method yang bernama infoKursi
                
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.print("Apakah Ingin Kembali Ke Menu Utama Y / T ?  "); //digunakan untuk menampilkan ke layar
                respon = input.next().charAt(0); //digunakan untuk menginputkan data yang diingikan
                if (respon == 'Y'){ // ini merupakan sebuah percabangan
                Pilihan(); // digunakan untuk memanggil method yang bernama Pilihan ketika dijalankannya salah satu pilihan percabangan
              
                }   
                else if (respon == 'T'){ //ini meruapakan sebuah percabangan
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.print("Terima Kasih Telah Berkunjung Ke Bioskop"); //digunakan untuk menampilkan ke layar
                }
                
                else // ini meruapakan sebuah percabangan
                {
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println("Maaf Layanan Tidak Tersedia "); //digunakan untuk menampilkan ke layar
                }
                break; //untuk mengakhiri setiap case

                case 4: // ini merupakan sebuah label case percabangan yang keempat yang berguna untuk menajalankan aksi
                bioskop.pembelianTiket(); // berhungsi untuk memanggil method yang bernama pembelianTiket
                waktu.pilihJadwal();// berhungsi untuk memanggil method yang bernama pilihJadwal
                kursi.infotempat();// berhungsi untuk memanggil method yang bernama infotempat
                total.pilihharidantransaksi(); // berhungsi untuk memanggil method yang bernama pilihharidantransaksi
                bayar.Bayar(); // berhungsi untuk memanggil method yang bernama bayar
                break; //digunakan untuk menampilkan ke layar
                
                case 5: // ini merupakan sebuah label case percabangan yang kelima yang berguna untuk menajalankan aksi
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println(" ------ Terima Kasih Telah Berkunjung Ke Bioskop ------- "); //digunakan untuk menampilkan ke layar
                break; //digunakan untuk menampilkan ke layar
                

        default: //ini meruapakan sebuah keluaran untuk pemilihan aksi yang tidak valid
          System.out.print("\n"); //digunakan untuk menampilkan ke layar
          System.out.println(" ------ Terima Kasih Telah Berkunjung Ke Bioskop ------- "); //digunakan untuk menampilkan ke layar
          break; //digunakan untuk menampilkan ke layar
        }
    } while (pilihan > 5); //ini meruapakan sebuah kode akhir untuk perulangan
}
    
}

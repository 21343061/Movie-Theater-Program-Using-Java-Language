package UAS; // untuk mengelompokkan kelas-kelas yang terkait 
import java.util.Scanner; // ini berguna untuk memasukkan paket Scanner
import javax.swing.JOptionPane; // ini berguna untuk memasukkan paket JOptionPane

public class Pembayaran { //ini merupakan class yang bernama pembayaran
    
    public void Bayar(){ //ini merupakan sebauh method yang menyatakan bahwa method tersebut bersifat public.
    int pilihan; //ini merupakan sebauh tipe data int untuk variabel pilihan
    int saldo; //ini merupakan sebauh tipe data int untuk variabel saldo
    
    Scanner input = new Scanner(System.in); //digunakan untuk membaca string dari pilihan yang akan diinputkan nanti

        do { //ini meruapakan sebuah kode awal untuk perulangan
            System.out.print("\n"); //digunakan untuk menampilkan ke layar
            System.out.println("Selanjutnya Anda Akan Dialihkan Ke Bagian Pembayaran"); //digunakan untuk menampilkan ke layar
            System.out.println(" -------------------- Pembayaran ----------------------- "); //digunakan untuk menampilkan ke layar
            System.out.println("Silahkan Pilih Metode Pembayaran Yang Anda inginkan : "); //digunakan untuk menampilkan ke layar
            System.out.println("1. Bank BRI"); //digunakan untuk menampilkan ke layar
            System.out.println("2. Bank Mandiri"); //digunakan untuk menampilkan ke layar
            System.out.println("3. Bank BNI"); //digunakan untuk menampilkan ke layar
            System.out.println("4. Bank BCA"); //digunakan untuk menampilkan ke layar
            System.out.println("5. Shopeepay"); //digunakan untuk menampilkan ke layar
            System.out.println("6. Gopay"); //digunakan untuk menampilkan ke layar
            System.out.println("7. Dana"); //digunakan untuk menampilkan ke layar
            System.out.print("Masukkan Pilihan Anda: "); //digunakan untuk menampilkan ke layar
            pilihan = input.nextInt(); //digunakan untuk menginputkan data yang diingikan
            
           
            switch (pilihan) { // switch digunakan untuk mengeksekuusi pada setiap label case 
                case 1: // ini merupakan sebuah label case percabangan yang pertama yang berguna untuk menajalankan aksi
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println(" --------------------- Bank BRI ----------------------- "); //digunakan untuk menampilkan ke layar
                System.out.println("Masukkan Saldo Sesuai Dengan Total Harga"); //digunakan untuk menampilkan ke layar
                System.out.print("Silahkan Masukan Saldo Anda : Rp "); //digunakan untuk menampilkan ke layar
                saldo = input.nextInt(); //digunakan untuk menginputkan data yang diingikan
                JOptionPane.showMessageDialog(null, "Selamat Anda Berhasil Memesan Tiket Bioskop"); //digunakan untuk menampilkan pesan/informasi
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println(" ------------------------------------------------------ "); //digunakan untuk menampilkan ke layar
                System.out.println(" ---- Selamat Anda Berhasil Memesan Tiket Bioskop ----- "); //digunakan untuk menampilkan ke layar
                System.out.println(" ------------------------------------------------------ "); //digunakan untuk menampilkan ke layar
                break; //untuk mengakhiri setiap case
                
                case 2: // ini merupakan sebuah label case percabangan yang kedua yang berguna untuk menajalankan aksi
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println(" ------------------- Bank Mandiri --------------------- "); //digunakan untuk menampilkan ke layar
                System.out.println("Masukkan Saldo Sesuai Dengan Total Harga"); //digunakan untuk menampilkan ke layar
                System.out.print("Silahkan Masukan Saldo Anda : Rp "); //digunakan untuk menampilkan ke layar
                saldo = input.nextInt(); //digunakan untuk menginputkan data yang diingikan
                JOptionPane.showMessageDialog(null, "Selamat Anda Berhasil Memesan Tiket Bioskop"); //digunakan untuk menampilkan pesan/informasi
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println(" ------------------------------------------------------ "); //digunakan untuk menampilkan ke layar
                System.out.println(" ---- Selamat Anda Berhasil Memesan Tiket Bioskop ----- "); //digunakan untuk menampilkan ke layar
                System.out.println(" ------------------------------------------------------ "); //digunakan untuk menampilkan ke layar
                break; //untuk mengakhiri setiap case
                
                case 3: // ini merupakan sebuah label case percabangan yang ketiga yang berguna untuk menajalankan aksi
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println(" --------------------- Bank BNI ----------------------- "); //digunakan untuk menampilkan ke layar
                System.out.println("Masukkan Saldo Sesuai Dengan Total Harga"); //digunakan untuk menampilkan ke layar
                System.out.print("Silahkan Masukan Saldo Anda : Rp "); //digunakan untuk menampilkan ke layar
                saldo = input.nextInt(); //digunakan untuk menginputkan data yang diingikan
                JOptionPane.showMessageDialog(null, "Selamat Anda Berhasil Memesan Tiket Bioskop"); //digunakan untuk menampilkan pesan/informasi
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println(" ------------------------------------------------------ "); //digunakan untuk menampilkan ke layar
                System.out.println(" ---- Selamat Anda Berhasil Memesan Tiket Bioskop ----- "); //digunakan untuk menampilkan ke layar
                System.out.println(" ------------------------------------------------------ "); //digunakan untuk menampilkan ke layar
                break; //untuk mengakhiri setiap case

                case 4: // ini merupakan sebuah label case percabangan yang keempat yang berguna untuk menajalankan aksi
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println(" --------------------- Bank BCA ----------------------- "); //digunakan untuk menampilkan ke layar
                System.out.println("Masukkan Saldo Sesuai Dengan Total Harga"); //digunakan untuk menampilkan ke layar
                System.out.print("Silahkan Masukan Saldo Anda : Rp "); //digunakan untuk menampilkan ke layar
                saldo = input.nextInt(); //digunakan untuk menginputkan data yang diingikan
                JOptionPane.showMessageDialog(null, "Selamat Anda Berhasil Memesan Tiket Bioskop"); //digunakan untuk menampilkan pesan/informasi
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println(" ------------------------------------------------------ "); //digunakan untuk menampilkan ke layar
                System.out.println(" ---- Selamat Anda Berhasil Memesan Tiket Bioskop ----- "); //digunakan untuk menampilkan ke layar
                System.out.println(" ------------------------------------------------------ "); //digunakan untuk menampilkan ke layar
                break; //untuk mengakhiri setiap case
                
                case 5: // ini merupakan sebuah label case percabangan yang kelima yang berguna untuk menajalankan aksi
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println(" -------------------- Shopeepay ----------------------- "); //digunakan untuk menampilkan ke layar
                System.out.println("Masukkan Saldo Sesuai Dengan Total Harga"); //digunakan untuk menampilkan ke layar
                System.out.print("Silahkan Masukan Saldo Anda : Rp "); //digunakan untuk menampilkan ke layar
                saldo = input.nextInt(); //digunakan untuk menginputkan data yang diingikan
                JOptionPane.showMessageDialog(null, "Selamat Anda Berhasil Memesan Tiket Bioskop"); //digunakan untuk menampilkan pesan/informasi
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println(" ------------------------------------------------------ "); //digunakan untuk menampilkan ke layar
                System.out.println(" ---- Selamat Anda Berhasil Memesan Tiket Bioskop ----- "); //digunakan untuk menampilkan ke layar
                System.out.println(" ------------------------------------------------------ "); //digunakan untuk menampilkan ke layar
                break; //untuk mengakhiri setiap case
                
                case 6: // ini merupakan sebuah label case percabangan yang keenam yang berguna untuk menajalankan aksi
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println(" ---------------------- Gopay ------------------------- "); //digunakan untuk menampilkan ke layar
                System.out.println("Masukkan Saldo Sesuai Dengan Total Harga"); //digunakan untuk menampilkan ke layar
                System.out.print("Silahkan Masukan Saldo Anda : Rp "); //digunakan untuk menampilkan ke layar
                saldo = input.nextInt(); //digunakan untuk menginputkan data yang diingikan
                JOptionPane.showMessageDialog(null, "Selamat Anda Berhasil Memesan Tiket Bioskop"); //digunakan untuk menampilkan pesan/informasi
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println(" ------------------------------------------------------ "); //digunakan untuk menampilkan ke layar
                System.out.println(" ---- Selamat Anda Berhasil Memesan Tiket Bioskop ----- "); //digunakan untuk menampilkan ke layar
                System.out.println(" ------------------------------------------------------ "); //digunakan untuk menampilkan ke layar
                break; //untuk mengakhiri setiap case

                case 7: // ini merupakan sebuah label case percabangan yang ketujuh yang berguna untuk menajalankan aksi
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println(" ----------------------- Dana ------------------------- "); //digunakan untuk menampilkan ke layar
                System.out.println("Masukkan Saldo Sesuai Dengan Total Harga"); //digunakan untuk menampilkan ke layar
                System.out.print("Silahkan Masukan Saldo Anda : Rp "); //digunakan untuk menampilkan ke layar
                saldo = input.nextInt(); //digunakan untuk menginputkan data yang diingikan
                JOptionPane.showMessageDialog(null, "Selamat Anda Berhasil Memesan Tiket Bioskop"); //digunakan untuk menampilkan pesan/informasi
                System.out.print("\n"); //digunakan untuk menampilkan ke layar
                System.out.println(" ------------------------------------------------------ "); //digunakan untuk menampilkan ke layar
                System.out.println(" ---- Selamat Anda Berhasil Memesan Tiket Bioskop ----- "); //digunakan untuk menampilkan ke layar
                System.out.println(" ------------------------------------------------------ "); //digunakan untuk menampilkan ke layar
                break; //untuk mengakhiri setiap case
          
          default://ini merupakan sebuah keluaran untuk pemilihan aksi yang tidak valid
          System.out.print("\n"); //digunakan untuk menampilkan ke layar
          System.out.println(" ------ Terima Kasih Telah Berkunjung Ke Bioskop ------- "); //digunakan untuk menampilkan ke layar 
          break; //untuk mengakhiri setiap case
        }
    } while (pilihan > 7); //ini merupakan sebuah kode akhir untuk perulangan
}
}
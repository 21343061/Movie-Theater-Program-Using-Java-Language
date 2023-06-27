package UAS; // untuk mengelompokkan kelas-kelas yang terkait 

// ini merupakan class yang bernama Bioskop2
// extends digunakan untuk mewariskan method dan property dari kelas induknya
// extend dibawah untun mewariskan method dan property dari class Bioskop1
public class Bioskop2 extends Bioskop1{

    //override dibawah berfungsi sebagai pembuatan ulang method dari superclass untuk subclass.
    @Override
    //Method void adalah method yang tidak mengembalikan nilai apapun setelah dieksekusi. Artinya, hanya melakukan sebuah proses.
    void daftarJadwal(){ //ini merupakan sebuah method yang menyatakan bahwa method tersebut bersifat public
        System.out.print("\n"); //ini untuk membuat baris baru pada layar
        System.out.println(" ======================================================= "); //ini untuk mencetak ke layar
        System.out.println(" ================= JADWAL FILM BIOSKOP ================= "); //ini untuk mencetak ke layar
        System.out.println(" ======================================================= "); //ini untuk mencetak ke layar
    }
    void daftarKursi(){ //ini merupakan sebuah method yang menyatakan bahwa method tersebut bersifat public
        System.out.print("\n"); //ini untuk membuat baris baru pada layar
        System.out.println(" ======================================================= "); //ini untuk mencetak ke layar
        System.out.println(" ================ TEMPAT DUDUK BIOSKOP ================= ");//ini untuk mencetak ke layar
        System.out.println(" ======================================================= "); //ini untuk mencetak ke layar
    }
    void daftarHarga(){ //ini merupakan sebuah method yang menyatakan bahwa method tersebut bersifat public
        System.out.print("\n"); //ini untuk membuat baris baru pada layar
        System.out.println(" ======================================================= "); //ini untuk mencetak ke layar
        System.out.println(" ============= DAFTAR HARGA FILM BIOSKOP =============== ");//ini untuk mencetak ke layar
        System.out.println(" ======================================================= "); //ini untuk mencetak ke layar
    }
    void pembelianTiket(){ //ini merupakan sebuah method yang menyatakan bahwa method tersebut bersifat public
        System.out.print("\n"); //ini untuk membuat baris baru pada layar
        System.out.println(" ======================================================= "); //ini untuk mencetak ke layar
        System.out.println(" =============== PEMBELIAN TIKET BIOSKOP =============== ");//ini untuk mencetak ke layar
        System.out.println(" ======================================================= "); //ini untuk mencetak ke layar
    }
    void kembali(){ //ini merupakan sebuah method yang menyatakan bahwa method tersebut bersifat public
        System.out.print("\n"); //ini untuk membuat baris baru pada layar
        System.out.println(" =============== Kembali Ke Menu Utama ================= ");//ini untuk mencetak ke layar
    }
}


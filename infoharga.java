package UAS; // untuk mengelompokkan kelas-kelas yang terkait 

public class infoharga {  //ini merupakan class yang bernama infoharga
    // Encapsulation: menyembunyikan implementasi detail dari kelas infoharga
    private int harikerja; //berupa tipe data private integrer untuk variabel harikerja
    private int harilibur; //berupa tipe data private integrer untuk variabel harilibur

    
    public infoharga(int harikerja, int harilibur) { //ini merupakan sebuah method yang menyatakan bahwa method tersebut bersifat public
        this.harikerja = harikerja; //this digunakan untuk mengakses variabel harikerja karena berupa private int
        this.harilibur = harilibur; //this digunakan untuk mengakses variabel harilibur karena berupa private int
    }
    
    public int getHarikerja() { //ini merupakan sebuah method yang menyatakan bahwa method tersebut bersifat public
        return harikerja; //return disini untuk berfungsi untuk mengembalikan nilai int hari kerja ke private lagi
    }
    public void setHarikerja(int harikerja) { //ini merupakan sebuah method yang menyatakan bahwa method tersebut bersifat public
        this.harikerja = harikerja; //this digunakan untuk mengakses variabel harikerja karena berupa private int
    }
    public int getHarilibur() { //ini merupakan sebuah method yang menyatakan bahwa method tersebut bersifat public
        return harilibur; //return disini untuk berfungsi untuk mengembalikan nilai int hari kerja ke private lagi
    }
    public void setHarilibur(int harilibur) { //ini merupakan sebuah method yang menyatakan bahwa method tersebut bersifat public
        this.harilibur = harilibur; //this digunakan untuk mengakses variabel harikerja karena berupa private int
    }

    
}

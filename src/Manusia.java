public class Manusia {

    String nama;
    int umur;
    int tinggibadan;
    String warnamata;
    String warnarambut;

    public Manusia(){

    }

    public void speak(){
        System.out.println("Hallo, Nama Saya " + nama);
        System.out.println("Tinggi Badan Saya " + tinggibadan + "cm");
        System.out.println("Umur Saya " + umur + " Tahun");
        System.out.println("Warna Mata Saya " + warnamata);
        System.out.println("Warna Rambut Saya " + warnarambut);
    }

    public void eat(){
        System.out.println("eating..... ");
    }

    public void walk(){
        System.out.println("walking.... ");
    }

    public void work(){
        System.out.println("working.... ");
    }

}

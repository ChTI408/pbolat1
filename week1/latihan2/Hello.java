package week1.latihan2;

public class Hello {
    public static void main(String[] args) {
        // Mengeprint
        System.out.println("Halo nama saya adalah Geirarldo Marxcielle");
        System.out.println("Saya adalah mahasiswa Teknik Informatika Universitas Dian Nuswantoro");
        System.out.println("Saya sedang menulis program java");

        float phi = 3.14f;
        int diameterling = 10;
        int alassegitiga = 6;
        int tinggisegitiga = 8;
        int diametertabung = 5;
        int tinggitabung = 10;

        System.out.println("Keliling Lingkaran dengan diameter 10: " + diameterling * phi * 2);
        System.out.println("Luas segitiga siku dengan alas 6 dan tinggi 8: " + alassegitiga * tinggisegitiga / 2);
        System.out.println("Volume tabung dengan diameter 5 dan tinggi 10: "
                + diametertabung * diametertabung * phi * tinggitabung);

    }
}

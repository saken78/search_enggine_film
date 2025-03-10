// not finish yet, 

import java.util.Scanner;
import java.util.Arrays;

public class search_enggine {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] daftarSeries = {""};
        String[] daftarFilm = {"Avengers", "Spider-Man", "Batman", "Superman", "Thor"};
        // PROJECT SEARCH ENGGINE FILM
        // film.toLowerCase().contains(cari.toLowerCase()) → mencari kata di mana saja, bukan hanya awalan.
                /*. Bedanya startsWith() vs contains()
                Metode	Mencari di Awalan?	Mencari di Mana Saja?
                startsWith()	✅ Ya	❌ Tidak
                contains()	❌ Tidak	✅ Ya */

        System.out.println("");
        System.out.println("98. Film");
        System.out.println("99. Tv Series");
        System.out.println(" ");
        System.out.print("Masukan pilihan anda : ");
        int index = userInput.nextInt();
        System.out.println("Tunggu sebentar");

        switch (index) {
            case 98:
                System.out.println(" ");
                System.out.println("Anda mau mencari Film dengan genre apa : ");
                System.out.println("1. Action ");
                System.out.println("2. Thriller ");
                System.out.println("3. Crime ");
                System.out.println(" ");
                System.out.print("Masukan Pilihan anda : ");
                int genre = userInput.nextInt();
                switch (genre) {
                    case 1:
                        System.out.println(" ");
                        System.out.println("Tunggu Sebentar");
                        System.out.print("Masukan judul film  : ");
                        String judulFilm = userInput.next();
                        Arrays.stream(daftarFilm)
                                .filter(film -> film.toLowerCase().contains(judulFilm.toLowerCase()))
                                .forEach(film -> System.out.println("- " + film));
                        break;
                    case 2:
                        System.out.println(" ");
                        System.out.println("Tunggu Sebentar");
                        System.out.print("Masukan judul film  : ");
                        judulFilm = userInput.next();
                        Arrays.stream(daftarFilm)
                                .filter(film -> film.toLowerCase().contains(judulFilm.toLowerCase()))
                                .forEach(film -> System.out.println("- " + film));
                        break;
                    case 3:
                        System.out.println(" ");
                        System.out.println("Tunggu Sebentar");
                        System.out.print("Masukan judul film  : ");
                        judulFilm = userInput.next();
                        Arrays.stream(daftarFilm)
                                .filter(film -> film.toLowerCase().contains(judulFilm.toLowerCase()))
                                .forEach(film -> System.out.println("- " + film));
                        break;
                    default:
                        System.out.println(" ");
                        System.out.println("Menu tidak ditemukan");
                        break;

                }

            case 99 :
                System.out.println(" ");
                System.out.println("Anda mau mencari Film dengan genre apa : ");
                System.out.println("1. Action ");
                System.out.println("2. Thriller ");
                System.out.println("3. Crime ");
                System.out.println(" ");
                System.out.print("Masukan Pilihan anda : ");
                genre = userInput.nextInt();
                switch (genre) {
                    case 1:
                        System.out.println(" ");
                        System.out.println("Tunggu Sebentar");
                        System.out.print("Masukan judul film  : ");
                        String judulSeries = userInput.next();
                        Arrays.stream(daftarSeries)
                                .filter(film -> film.toLowerCase().contains(judulSeries.toLowerCase()))
                                .forEach(film -> System.out.println("- " + film));
                        break;
                    case 2:
                        System.out.println(" ");
                        System.out.println("Tunggu Sebentar");
                        System.out.print("Masukan judul film  : ");
                        judulSeries = userInput.next();
                        Arrays.stream(daftarSeries)
                                .filter(film -> film.toLowerCase().contains(judulSeries.toLowerCase()))
                                .forEach(film -> System.out.println("- " + film));
                        break;
                    case 3:
                        System.out.println(" ");
                        System.out.println("Tunggu Sebentar");
                        System.out.print("Masukan judul film  : ");
                        judulSeries = userInput.next();
                        Arrays.stream(daftarSeries)
                                .filter(film -> film.toLowerCase().contains(judulSeries.toLowerCase()))
                                .forEach(film -> System.out.println("- " + film));
                        break;
                    default:
                        System.out.println(" ");
                        System.out.println("Menu tidak ditemukan");
                        break;
                }


        }














        }
}



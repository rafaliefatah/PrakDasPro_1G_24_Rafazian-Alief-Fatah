import java.util.Scanner;

public class FilmMain23 {
    public static void main(String[] args) throws Exception {
        Scanner sc23 = new Scanner(System.in);
        ProgramFilm23 film = new ProgramFilm23();
        String judul;
        int id,pilihan,urutan;
        double rating;

        do {
        System.out.println();
        System.out.println("============================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("============================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film - DESC");
        System.out.println("10. Keluar");
        System.out.println("============================");
        pilihan = sc23.nextInt();
        sc23.nextLine();

        switch (pilihan) {
            case 1:
                System.out.println("Masukkan Data Film Posisi Awal");
                System.out.println("ID Film: ");
                id = sc23.nextInt();
                sc23.nextLine();
                System.out.println("Judul Film: ");
                judul = sc23.nextLine();
                System.out.println("Rating Film:");
                rating = sc23.nextDouble();
                Film23 identitasFilm = new Film23(id, judul, rating);
                film.addFirst(identitasFilm);
                break;
            case 2:
                System.out.println("Masukkan Data Film Posisi Akhir");
                System.out.println("ID Film: ");
                id = sc23.nextInt();
                sc23.nextLine();
                System.out.println("Judul Film: ");
                judul = sc23.nextLine();
                System.out.println("Rating Film:");
                rating = sc23.nextDouble();
                identitasFilm = new Film23(id, judul, rating);
                film.addLast(identitasFilm);
                break;
            case 3:
                System.out.println("Masukkan Data Film");
                System.out.println("ID Film: ");
                id = sc23.nextInt();
                sc23.nextLine();
                System.out.println("Judul Film: ");
                judul = sc23.nextLine();
                System.out.println("Rating Film:");
                rating = sc23.nextDouble();
                System.out.println("Data film ini akan masuk di urutan ke-");
                urutan = sc23.nextInt();
                sc23.nextLine();
                identitasFilm = new Film23(id, judul, rating);
                film.add(identitasFilm, urutan);
                break;
            case 4:
                film.removeFirst();
                break;
            case 5:
                film.removeLast();
                break;
            case 6:
                System.out.println("Masukkan urutan film yang ingin dihapus: ");
                urutan = sc23.nextInt();
                sc23.nextLine();
                film.remove(urutan);
                break;
            case 7:
                film.print();
                break;
            case 8:
                System.out.println("Cari Data: ");
                System.out.println("Masukkan ID film yang dicari: ");
                id = sc23.nextInt();
                sc23.nextLine();
                film.search(id);
                break;
            case 9:
                film.sorting();
                System.out.println("Data telah diurutkan");
                break;
            case 10:
                System.out.println("Keluar");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
        } while (pilihan!=10);
    }
}
package Pertemuan10;

public class SearchNilai24 {
    public static void main(String[] args) {
        int arrNilai[] = {80,85,78,96,90,82,86},key = 90,hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key==arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();
        System.out.println("Nilai "+key+" ketemu di indeks ke-"+hasil);
        System.out.println();
    }
}
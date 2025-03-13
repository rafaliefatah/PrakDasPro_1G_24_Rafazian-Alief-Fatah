public class Tugas1_23 {
    double nilaiUTS[];
    double nilaiUAS[];

    Tugas1_23(int el) {
        nilaiUTS = new double[el];
        nilaiUAS = new double[el];
    }

    double nilaiUtsRendah(double arr[], int l, int r) {
        if (l==r) {
            return arr[l];
        }
        int mid = (l+r)/2;
        double lsum = nilaiUtsRendah(arr, l, mid);
        double rsum = nilaiUtsRendah(arr, mid + 1, r);

        double rendah;
        if (lsum<rsum) {
            rendah=lsum;
        } else {
            rendah=rsum;
        }
        return rendah;
    }

    double nilaiUtsTinggi(double arr[], int l, int r) {
        if (l==r) {
            return arr[l];
        }
        int mid = (l+r)/2;
        double lsum = nilaiUtsTinggi(arr, l, mid);
        double rsum = nilaiUtsTinggi(arr, mid + 1, r);

        double tinggi;
        if (lsum>rsum) {
            tinggi=lsum;
        } else {
            tinggi=rsum;
        }
        return tinggi;
    }

    double rataUAS() {
        double total=0;
        for (int i = 0; i < nilaiUAS.length; i++) {
            total+=nilaiUAS[i];
        }
        double rata = total/nilaiUAS.length;
        return rata;
    }
}
public class Film23 {
    int id;
    String judul;
    double rating;

    public Film23(int id, String judul, double rating) {
        this.id=id;
        this.judul=judul;
        this.rating=rating;
    }

    public void identitasFilm() {
        System.out.println("ID Film: "+id);
        System.out.println("Judul Film: "+judul);
        System.out.println("IMDB Rating: "+rating);
    }
}
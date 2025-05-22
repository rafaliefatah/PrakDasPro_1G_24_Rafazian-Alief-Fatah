public class NodeFilm23 {
    Film23 film;
    NodeFilm23 prev,next;

    NodeFilm23 (NodeFilm23 prev, Film23 film, NodeFilm23 next) {
        this.prev=prev;
        this.film=film;
        this.next=next;
    }
}
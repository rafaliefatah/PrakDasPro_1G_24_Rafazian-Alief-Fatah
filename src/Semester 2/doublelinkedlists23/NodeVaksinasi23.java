public class NodeVaksinasi23 {
    AntrianVaksinasi23 antri;
    NodeVaksinasi23 prev,next;

    NodeVaksinasi23 (NodeVaksinasi23 prev, AntrianVaksinasi23 antri, NodeVaksinasi23 next) {
        this.prev=prev;
        this.antri=antri;
        this.next=next;
    }
}
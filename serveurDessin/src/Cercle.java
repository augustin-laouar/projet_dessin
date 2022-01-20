public class Cercle extends Forme{
    private int rayon; // en pixels
    public Cercle(Point centre, int rayon){
        this.ListePoints.add(centre); // un seul point qui sera le centre
        this.rayon = rayon;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }
}

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class TestDessin {
    public static void main(String args[]){
        try {
            Dessin D = new Dessin("Test de dessin",500,500);
            Ecouteur f = new Ecouteur();
            D.addWindowListener(f);
            Point p = new Point(400,400);
            Cercle c = new Cercle(p,50);
            D.dessiner(c);
            D.afficher();
        }

        catch(InterruptedException e){
            System.out.println("Erreur\n");
        }

    }
}

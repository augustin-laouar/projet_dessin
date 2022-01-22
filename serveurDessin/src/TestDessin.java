import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.text.Normalizer;

public class TestDessin {
    public static void main(String args[]){
        try {
            Dessin D = new Dessin("Test de dessin",500,500);
            Ecouteur f = new Ecouteur();
            D.addWindowListener(f);
            Point p = new Point(10,60);
        //  Cercle c = new Cercle(p,50);

          //  D.afficher();
            //test pour dessiner un trait
           Point p2 = new Point(60,15);
           Point p3 = new Point(100,25);
           Point p4 = new Point(80,35);
            Point p5 = new Point(150,45);
            Point p6= new Point(10,60);
            Forme f1 = new Forme();
            f1.ListePoints.add(p);
            f1.ListePoints.add(p2);
            f1.ListePoints.add(p3);
            f1.ListePoints.add(p4);
            f1.ListePoints.add(p5);
            f1.ListePoints.add(p6);

            D.dessiner(f1);
            D.afficher();
        }

        catch(InterruptedException e){
            System.out.println("Erreur\n");
        }

    }
}

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.text.Normalizer;

public class TestDessin {
    public static void main(String args[]){
        try {
            Dessin D = new Dessin("Test de dessin",1000,1000);
            Ecouteur f = new Ecouteur();
            D.addWindowListener(f);
            Point p = new Point(410,460);
        //  Cercle c = new Cercle(p,50);

          //  D.afficher();
            //test pour dessiner un trait
           Point p2 = new Point(460,415);
          // Point p3 = new Point(500,425);
          // Point p4 = new Point(480,435);
           // Point p5 = new Point(550,445);
          //  Point p6= new Point(410,460);
            Forme f1 = new Forme();
            f1.ListePoints.add(p);
            f1.ListePoints.add(p2);
           // f1.ListePoints.add(p3);
            //f1.ListePoints.add(p4);
          //  f1.ListePoints.add(p5);
          //  f1.ListePoints.add(p6);

            D.dessiner(f1);
            D.afficher();
        }

        catch(InterruptedException e){
            System.out.println("Erreur\n");
        }

    }
}

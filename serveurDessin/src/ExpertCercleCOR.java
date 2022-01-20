import java.awt.*;
import java.awt.geom.Ellipse2D;

public class ExpertCercleCOR extends ExpertDessinCOR {

    protected ExpertCercleCOR(ExpertDessinCOR suivant) {
        super(suivant);
    }

    @Override
    public boolean Dessiner(Forme f, Graphics2D g) {
        if(f instanceof Cercle){
            Cercle c = (Cercle)f;
            Shape s = new Ellipse2D.Double(c.ListePoints.get(0).getX(),c.ListePoints.get(0).getY(),c.getRayon(),c.getRayon());
            g.draw(s);
            return true;
        }
        return false;
    }
}

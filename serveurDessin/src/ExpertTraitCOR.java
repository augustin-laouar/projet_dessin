import java.awt.*;

public class ExpertTraitCOR extends ExpertDessinCOR{


    protected ExpertTraitCOR(ExpertDessinCOR suivant) {
        super(suivant);
    }
    public boolean Dessiner(Forme f, Graphics2D g) {
        if( f.ListePoints.size() ==2)
        {
            g.drawLine(f.ListePoints.get(0).getX(),f.ListePoints.get(0).getY(),f.ListePoints.get(1).getX(),f.ListePoints.get(1).getY());

            return true;

        }
        else{
            return false;
        }

    }
}

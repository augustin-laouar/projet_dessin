//package ExpertCOR;
import java.awt.*;

public abstract class ExpertDessinCOR extends ExpertDessin {
    protected ExpertDessinCOR suivant;

    protected ExpertDessinCOR(ExpertDessinCOR suivant){
        this.suivant = suivant;
    }

    public boolean DessinerForme(Forme f, Graphics2D g){ //tu dois utiliser cette methode
        boolean result;
        result = Dessiner(f,g);
        if(!result){
            if(this.suivant != null){
                return this.suivant.DessinerForme(f,g);
            }
            else{
                return false;
            }
        }
        else{
            return result;
        }
    }
    public abstract boolean Dessiner(Forme f, Graphics2D g);
}

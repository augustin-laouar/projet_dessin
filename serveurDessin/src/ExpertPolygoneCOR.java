import java.awt.*;

public class ExpertPolygoneCOR extends ExpertDessinCOR{
    protected ExpertPolygoneCOR(ExpertDessinCOR suivant) {
        super(suivant);
    }


    public boolean Dessiner(Forme f, Graphics2D g) {
        if(f.ListePoints.size()>2)
        {
            //on va parcourir tous les points pour stocker les x dans un tableau
            //et les y dans un autre tableau
            int []x = new int[f.ListePoints.size()];
            int []y= new int[f.ListePoints.size()];
            for(int i=0;i< f.ListePoints.size();i++) {
                x[i] = f.ListePoints.get(i).getX();
                y[i] = f.ListePoints.get(i).getY();
            }
            Polygon p = new Polygon(x, y,x.length );

            g.drawPolygon(p);


            return true;
        }
        else{
            return false;
        }
    }
}

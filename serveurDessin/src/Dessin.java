import java.awt.*;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferStrategy;

public class Dessin extends Frame {
    private BufferStrategy strategie;
    private Graphics2D graphics;
    private int width;
    private int height;
    public Dessin(String msg, int w, int h) throws InterruptedException {
        super(msg);
        width = w;
        height = h;
        this.setBounds(200,200,width,height);
        this.setVisible(true);
        this.setIgnoreRepaint(true);
        this.createBufferStrategy(2);
        Thread.sleep(150);
        strategie = this.getBufferStrategy();
        graphics = (Graphics2D) strategie.getDrawGraphics();

    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void afficher(){
        strategie.show();
    }
    public void effacer(){
        graphics.setColor(Color.white);
        graphics.fillRect(0,0,width,height);
    }
    public void dessiner(Forme f){
        Cercle c = (Cercle)f;
        Shape s = new Ellipse2D.Double(c.ListePoints.get(0).getX(),c.ListePoints.get(0).getY(),c.getRayon(),c.getRayon());
        graphics.draw(s);
    }

}

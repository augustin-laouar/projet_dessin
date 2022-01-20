import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurBouton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Appel à action perfomed");
    }
}

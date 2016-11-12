import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Compelete extends JFrame{
    private static final long serialVersionUID = 1L;
    
    public Compelete(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon img= new ImageIcon("img.png");
        JLabel lb = new JLabel(img);
        add(lb);
        setSize(716, 570);
        setVisible(true);
    }
}
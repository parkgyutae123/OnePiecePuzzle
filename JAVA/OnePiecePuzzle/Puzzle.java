import java.awt.*; 
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionListener; 
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*; 


public class Puzzle extends JFrame implements MouseMotionListener, ActionListener
{ 
    private static final long serialVersionUID=1L;
    Puzzle compelete=null;
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9,
                lb10, lb11, lb12, lb13 ,lb14, lb15, lb16, lb17;
    ImageIcon img1, img2, img3, img4, img5, img6, img7, img8,
                img9, img10, img11, img12, img13, img14, img15, img16,img17;
    public Puzzle() 
    { 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        Container pane = getContentPane();
        pane.setBackground(Color.MAGENTA);
        this.makeMenuAndEventHandle();
        img1 = new ImageIcon("img1.png"); 
        img2 = new ImageIcon("img2.png"); 
        img3 = new ImageIcon("img3.png"); 
        img4 = new ImageIcon("img4.png"); 
        img5 = new ImageIcon("img5.png"); 
        img6 = new ImageIcon("img6.png"); 
        img7 = new ImageIcon("img7.png"); 
        img8 = new ImageIcon("img8.png"); 
        img9 = new ImageIcon("img9.png"); 
        img10 = new ImageIcon("img10.png"); 
        img11 = new ImageIcon("img11.png"); 
        img12 = new ImageIcon("img12.png"); 
        img13 = new ImageIcon("img13.png"); 
        img14 = new ImageIcon("img14.png"); 
        img15 = new ImageIcon("img15.png"); 
        img16 = new ImageIcon("img16.png");
        img17 = new ImageIcon("img17.png");
        
        lb1 = new JLabel(); 
        lb2 = new JLabel(); 
        lb3 = new JLabel(); 
        lb4 = new JLabel(); 
        lb5 = new JLabel(); 
        lb6 = new JLabel(); 
        lb7 = new JLabel(); 
        lb8 = new JLabel(); 
        lb9 = new JLabel();
        lb10 = new JLabel();
        lb11 = new JLabel();
        lb12 = new JLabel();
        lb13 = new JLabel();
        lb14 = new JLabel();
        lb15 = new JLabel();
        lb16 = new JLabel();
        lb17 = new JLabel();
        
        lb1.setIcon(img1); 
        lb2.setIcon(img2); 
        lb3.setIcon(img3); 
        lb4.setIcon(img4); 
        lb5.setIcon(img5); 
        lb6.setIcon(img6); 
        lb7.setIcon(img7); 
        lb8.setIcon(img8); 
        lb9.setIcon(img9); 
        lb10.setIcon(img10); 
        lb11.setIcon(img11); 
        lb12.setIcon(img12); 
        lb13.setIcon(img13); 
        lb14.setIcon(img14); 
        lb15.setIcon(img15); 
        lb16.setIcon(img16); 
        lb17.setIcon(img17); 
        
        pane.add(lb1);
        pane.add(lb2);
        pane.add(lb3);
        pane.add(lb4);
        pane.add(lb5);
        pane.add(lb6);
        pane.add(lb7);
        pane.add(lb8);
        pane.add(lb9);
        pane.add(lb10);
        pane.add(lb11);
        pane.add(lb12);
        pane.add(lb13);
        pane.add(lb14);
        pane.add(lb15);
        pane.add(lb16);
        pane.add(lb17);
        
        int[] xPoint = new int[17];
        int[] yPoint = new int[17];
        for(int a=0; a<17; a++)//이미지 위치 랜덤하게 뿌리기 위함
        {
            xPoint[a] = (int)(Math.random()*616+1);
            yPoint[a] = (int)(Math.random()*470+1);
        }
        lb1.setBounds(xPoint[0], yPoint[0], 145, 124); 
        lb2.setBounds(xPoint[1], yPoint[1], 150, 123); 
        lb3.setBounds(xPoint[2], yPoint[2], 195, 124); 
        lb4.setBounds(xPoint[3], yPoint[3], 233, 123); 
        lb5.setBounds(xPoint[4], yPoint[4], 190, 118); 
        lb6.setBounds(xPoint[5], yPoint[5], 184, 117); 
        lb7.setBounds(xPoint[6], yPoint[6], 189, 117); 
        lb8.setBounds(xPoint[7], yPoint[7], 157, 117); 
        lb9.setBounds(xPoint[8], yPoint[8], 203, 138); 
        lb10.setBounds(xPoint[9], yPoint[9], 161, 138); 
        lb11.setBounds(xPoint[10], yPoint[10], 135, 138); 
        lb12.setBounds(xPoint[11], yPoint[11], 120, 197); 
        lb13.setBounds(xPoint[12], yPoint[12], 145, 196); 
        lb14.setBounds(xPoint[13], yPoint[13], 149, 194); 
        lb15.setBounds(xPoint[14], yPoint[14], 148, 197); 
        lb16.setBounds(xPoint[15], yPoint[15], 160, 196);
        lb17.setBounds(xPoint[16], yPoint[16], 216, 136); 
        //마우스 모션 리스너 등록 
        lb1.addMouseMotionListener(this); 
        lb2.addMouseMotionListener(this); 
        lb3.addMouseMotionListener(this); 
        lb4.addMouseMotionListener(this); 
        lb5.addMouseMotionListener(this); 
        lb6.addMouseMotionListener(this); 
        lb7.addMouseMotionListener(this); 
        lb8.addMouseMotionListener(this);
        lb9.addMouseMotionListener(this); 
        lb10.addMouseMotionListener(this); 
        lb11.addMouseMotionListener(this); 
        lb12.addMouseMotionListener(this); 
        lb13.addMouseMotionListener(this); 
        lb14.addMouseMotionListener(this); 
        lb15.addMouseMotionListener(this); 
        lb16.addMouseMotionListener(this); 
        lb17.addMouseMotionListener(this); 
        this.setSize(766, 620); 
        this.setVisible(true);  
        this.setTitle("OnePiece Puzzle!!! 메뉴창에 정답이있어요 .");
        
    } 
    
    public void makeMenuAndEventHandle()
    {
        JMenuBar bar = new JMenuBar();
        JMenu main = new JMenu("메뉴");
        JMenuItem subMenu = new JMenuItem("정답");
        subMenu.addActionListener(this);
        main.add(subMenu);
        bar.add(main);
        setJMenuBar(bar);
    }
    
    public void actionPerformed(ActionEvent evt){
        Compelete im= new Compelete();
    }

    //라벨을 드레드할때 
    @Override 
    public void mouseDragged(MouseEvent e) { 
        if(e.getSource() == lb1) 
            lb1.setLocation(e.getXOnScreen()-lb1.getSize().width/4, 
                e.getYOnScreen()-lb1.getSize().height/2); 
        if(e.getSource() == lb2) 
            lb2.setLocation(e.getXOnScreen()-lb2.getSize().width/4, 
                e.getYOnScreen()-lb2.getSize().height/2); 
        if(e.getSource() == lb3) 
            lb3.setLocation(e.getXOnScreen()-lb3.getSize().width/4, 
                e.getYOnScreen()-lb3.getSize().height/2); 
        if(e.getSource() == lb4) 
            lb4.setLocation(e.getXOnScreen()-lb4.getSize().width/4, 
                e.getYOnScreen()-lb4.getSize().height/2); 
        if(e.getSource() == lb5) 
            lb5.setLocation(e.getXOnScreen()-lb5.getSize().width/4, 
                e.getYOnScreen()-lb5.getSize().height/2); 
        if(e.getSource() == lb6) 
            lb6.setLocation(e.getXOnScreen()-lb6.getSize().width/4, 
                e.getYOnScreen()-lb6.getSize().height/2);
        if(e.getSource() == lb7) 
            lb7.setLocation(e.getXOnScreen()-lb7.getSize().width/4, 
                e.getYOnScreen()-lb7.getSize().height/2); 
        if(e.getSource() == lb8) 
            lb8.setLocation(e.getXOnScreen()-lb8.getSize().width/4, 
                e.getYOnScreen()-lb8.getSize().height/2);
        if(e.getSource() == lb9) 
            lb9.setLocation(e.getXOnScreen()-lb9.getSize().width/4, 
                e.getYOnScreen()-lb9.getSize().height/2); 
        if(e.getSource() == lb10) 
            lb10.setLocation(e.getXOnScreen()-lb10.getSize().width/4, 
                e.getYOnScreen()-lb10.getSize().height/2); 
        if(e.getSource() == lb11) 
            lb11.setLocation(e.getXOnScreen()-lb11.getSize().width/4, 
                e.getYOnScreen()-lb11.getSize().height/2); 
        if(e.getSource() == lb12) 
            lb12.setLocation(e.getXOnScreen()-lb12.getSize().width/4, 
                e.getYOnScreen()-lb12.getSize().height/2); 
        if(e.getSource() == lb13) 
            lb13.setLocation(e.getXOnScreen()-lb13.getSize().width/4, 
                e.getYOnScreen()-lb13.getSize().height/2); 
        if(e.getSource() == lb14) 
            lb14.setLocation(e.getXOnScreen()-lb14.getSize().width/4, 
                e.getYOnScreen()-lb14.getSize().height/2); 
        if(e.getSource() == lb15) 
            lb15.setLocation(e.getXOnScreen()-lb15.getSize().width/4, 
                e.getYOnScreen()-lb15.getSize().height/2); 
        if(e.getSource() == lb16) 
            lb16.setLocation(e.getXOnScreen()-lb16.getSize().width/4, 
                e.getYOnScreen()-lb16.getSize().height/2);     
        if(e.getSource() == lb17) 
            lb17.setLocation(e.getXOnScreen()-lb17.getSize().width/4, 
                e.getYOnScreen()-lb17.getSize().height/2);        
    }  
    
    @Override 
    public void mouseMoved(MouseEvent e) { 
    }  
    

    public static void main(String[] args) 
    { 
        Puzzle frame = new Puzzle(); 
    } 
}


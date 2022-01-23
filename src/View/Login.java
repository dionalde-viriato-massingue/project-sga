
package View;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import SGA.Controller.*;
import SGA.Model.UsuarioDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Login extends JFrame implements ActionListener,FocusListener{
    JPanel p1,p2;
    ImageIcon IMG1,IMG2,IMG3,IMG4,IMG5;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2;
    JPasswordField pf1;
    JButton b1,b2;
   
   // JRoundedPanel r;
    public Login(){ 
        setLayout(null);
    setTitle("Image");
    setBounds(-10,0,1500,1000);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
   IMG1 = new ImageIcon(getClass().getResource("www.png"));
    l3 = new JLabel(IMG1);
    l3.setBounds(400,102,503,100);
    
    IMG2 = new ImageIcon(getClass().getResource("a2.png"));
    l4 = new JLabel(IMG2);
    l4.setBounds(-80, 65, 300,40);
    
    IMG3 = new ImageIcon(getClass().getResource("a3.png"));
    l5 = new JLabel(IMG3);
    l5.setBounds(-80, 112, 300,40);
    
    IMG4 = new ImageIcon(getClass().getResource("k6_1.png"));
    l6 = new JLabel(IMG4);
    l6.setBounds(0,202,503,400);
    
    IMG5 = new ImageIcon(getClass().getResource("z6.png"));
    l7 = new JLabel(IMG5);
    l7.setBounds(860,129,503,500);
       
    p1= new JPanel();
    p1.setLayout(null);
    p1.setBounds(-10,0,1500,1000);
    p1.setBackground(new Color(0,56,86));
    p1.add(l3);
    p1.add(l6);
    p1.add(l7);
    
    p2= new JPanel();
    p2.setBounds(400,230,500,300);
    p2.setBackground(new Color(172,224,241));
    p2.setBorder(new RoundBtn(15));
    p2.setLayout(null);
    l1= new JLabel("ENTRAR NO SISTEMA");
    
    l1.setBounds(195, 4, 300,70);
    t1= new JTextField("Introduzir Nome");
    t1.setBounds(100, 70, 300,30);
    t1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
     t1.setForeground(Color.GRAY);
     t1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.gray));
    t1.addActionListener(this);
        t1.addFocusListener(this);
    

     pf1 = new JPasswordField (20);
        pf1.setBounds(100, 120, 300,30);
        pf1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        pf1.setForeground(Color.GRAY);
        pf1.setText("Introduzir Senha");
        pf1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.gray));
          pf1.addActionListener(this);
        pf1.addFocusListener(this);
     

     b1  = new JButton("Entrar");
        b1.setFont(new Font("Segoe UI", Font.BOLD, 16));
        b1.setForeground(Color.WHITE);
        b1.setBorder(new RoundBtn(15));
        b1.setBounds(140, 180, 200,30);
        b1.setBackground(new Color(8, 84, 121));
        b1.setFocusable(false);
         b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
         b1.addActionListener(this);
     
  
    p2.add(l5);
    p2.add(l4);
    p2.add(l1);
    p2.add(b1);
    p2.add(t1);
    p2.add(pf1);
    add(p2);
     add(p1);
    setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      boolean cont;
      if(e.getSource()==b1){
         String nome=t1.getText();
         String senha=pf1.getText();
         
           UsuarioController pc= new UsuarioController(nome,senha);
         
         cont = pc.result();  
         if(cont ==  true){
             new Home(senha,nome);
             dispose();
             
         }else{ t1.setText("");
         pf1.setText("");
         }
         
        
        
          
        }
      
    }

        @Override
    public void focusGained(FocusEvent e) {
        if(e.getSource() == t1){
            if(t1.getText().equals("Introduzir Nome")){
                t1.setText("");
                t1.setForeground(new Color(0, 0, 0));
            }
        }else if(e.getSource() == pf1){
            if(pf1.getText().equals("Introduzir Senha")){
                pf1.setForeground(new Color(0, 0, 0));
                pf1.setText("");
            }
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(e.getSource() == t1){
            if(t1.getText().equals("Introduzir Nome") || t1.getText().equals("")){
                t1.setText("Introduzir Nome");
                t1.setForeground(new Color(153, 153, 153));
            }
        }
        if(e.getSource() == pf1){
           if(pf1.getText().equals("Introduzir Senha") || pf1.getText().equals("")){
                pf1.setText("Introduzir Senha");
                pf1.setForeground(new Color(153, 153, 153));    
            }  
        }
    }

  

   
    }


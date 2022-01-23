
package View;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Inscric extends JFrame implements ActionListener{
      JTextField t0,t1,t2;
    JPanel p1,p2,p3,p4;
    ImageIcon IMG0,IMG1,IMG2,IMG3,IMG4,IMG5,IMG6,IMG7,IMG8,IMG9,
            ImgCad,ImgCan,ImgVol;
    JLabel l1,l2,l3,l4,l5,l6,lb,l9,l10, labCurso,labNac,labProv,labC4,labC5;
    JButton b1,b2,b3,b4,b5,b6,b7,seach,vGeral,cadE,cadD,cadN,bCad,bCan;
    JComboBox cbIdade, cbCurso,cbNac,cbProv,cbC4,cbC5;
    Color c1,c2;
    Font f;
    static String codg;
    String cod, name;
    public Inscric (String cod, String name){
        this.cod=cod;
        this.name=name;
    setLayout(null);
    setTitle("Image");
    setBounds(-10,0,1500,1000);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    c1= new Color(226,252,253); 
    c2= new Color(0,0,0); 
    f= new Font("Arial",Font.BOLD,20);
    
     l10= new JLabel("Inscricao de Cadeiras");
      l10.setFont(f);
     l10.setBounds(308,220,300,23);
     
    l5= new JLabel("Nome:");
     l5.setBounds(310,278, 200,98);
     t0= new JTextField(15);
     t0.setBounds(360,310, 200,28);
     
     l6= new JLabel("Codigo: ");
     l6.setBounds(310,398, 200,98);
     t2= new JTextField("20192220");
     t2.setBounds(360,430, 200,28);
    
     
     l9= new JLabel("Curso:");
     l9.setBounds(623,278, 200,98);
     String [] curso= {"Informatica","Mecanica","Eletronica","Quimica"};
     cbIdade = new JComboBox(curso);
      cbIdade.setBounds(695,310, 110,28);
      
      labCurso= new JLabel("Cadeira 1:");
     labCurso.setBounds(623,398, 200,98);
     String [] cadeira1= {"POO2","BD2","ADA","IP","M.Solidos","Termodinamica","M.Eletricas","Q.Organica","AM3"};
     cbCurso = new JComboBox(cadeira1);
     cbCurso .setBounds(695,430, 110,28);
      
      labNac= new JLabel("Cadeira 2:");
     labNac.setBounds(850,278, 200,98);
     String [] cadeira2= {"POO2","BD2","ADA","IP","M.Solidos","Termodinamica","M.Eletricas","Q.Organica","AM3"};
     cbNac = new JComboBox(cadeira2);
      cbNac .setBounds(920,310, 110,28);
      
      labProv= new JLabel("Cadeira 3:");
     labProv.setBounds(850,398, 200,98);
     String [] cadeira3= {"POO2","BD2","ADA","IP","M.Solidos","Termodinamica","M.Eletricas","Q.Organica","AM3"};
     cbProv = new JComboBox(cadeira3);
      cbProv .setBounds(920,430, 110,28);
      
      labC4= new JLabel("Cadeira 4:");
     labC4.setBounds(1075,278, 200,98);
     String [] cadeira4= {"POO2","BD2","ADA","IP","M.Solidos","Termodinamica","M.Eletricas","Q.Organica","AM3"};
     cbC4 = new JComboBox(cadeira4);
      cbC4.setBounds(1150,310, 110,28);
      
      labC5= new JLabel("Cadeira 5:");
     labC5.setBounds(1075,398, 200,98);
     String [] cadeira5= {"POO2","BD2","ADA","IP","M.Solidos","Termodinamica","M.Eletricas","Q.Organica","AM3"};
     cbC5 = new JComboBox(cadeira5);
      cbC5.setBounds(1150,430, 110,28);
     
     
    ImgCad = new ImageIcon(getClass().getResource("Inscrever.png"));
    bCad= new JButton(ImgCad);
    bCad.setBounds(430,550,130,42);
    bCad.setBackground(new Color(172,234,242));
   bCad.setFocusPainted(false);
   bCad.setBorderPainted(false);
   bCad.addActionListener(this);
   
   
   
     ImgCan = new ImageIcon(getClass().getResource("cancelar.png"));
    bCan= new JButton(ImgCan);
    bCan.setBounds(1000,550,130,42);
    bCan.setBackground(new Color(172,234,242));
   bCan.setFocusPainted(false);
   bCan.setBorderPainted(false);
   bCan.addActionListener(this);
    
    
    
    IMG1 = new ImageIcon(getClass().getResource("k1.png"));
    l1 = new JLabel(IMG1);
    l1.setBounds(1080,-18,503,100);
    
    IMG2 = new ImageIcon(getClass().getResource("k2.png"));
    seach= new JButton(IMG2);
    seach.setOpaque(false);
    seach.setBackground(new Color(0,56,86));
    seach.setFocusPainted(false);
    seach.setBorderPainted(false);
    seach.setBounds(930,8,50,40);
    
    IMG3 = new ImageIcon(getClass().getResource("k3.png"));
    l4 = new JLabel(IMG3);
    l4.setBounds(-150,-18,503,100);
    
    IMG4 = new ImageIcon(getClass().getResource("z7.png"));
    IMG5 = new ImageIcon(getClass().getResource("k5.png"));
    IMG6 = new ImageIcon(getClass().getResource("k6.png"));
    IMG7 = new ImageIcon(getClass().getResource("docentes.png"));
    IMG8 = new ImageIcon(getClass().getResource("k7.png"));
    
   
    l2= new JLabel("Dionalde Massingue");
    l2.setFont(f);
    l2.setForeground(c1);
    l2.setBackground(new Color(0,56,86));
    l2.setBounds(1085,-18,503,100);
    t1= new JTextField("Pesquisar"); 
    t1.setBounds(520,15,403,30);
    
    
    
    b1= new JButton("HOME",IMG4);
    b1.setBackground(new Color(62,164,179));
    //b1.setOpaque(true);
    b1.setForeground(c2);
    b1.setFocusPainted(false);
    b1.setBorderPainted(false);
   // b1.setFont(f);
    //b1.setForeground(c1);
   // b1.setBackground(c1);
    b1.setBounds(-29,63,195,90);
    b1.addActionListener(this);
    
    b2= new JButton("ESTUDANTE",IMG5);
     b2.setBackground(new Color(62,164,179));
     b2.setForeground(c2);
    b2.setFocusPainted(false);
    b2.setBorderPainted(false);
    b2.setBounds(-10,155,182,90);
    b2.addActionListener(this);
    
     b3= new JButton("INSCRICAO",IMG6);
      b3.setBackground(new Color(172,224,241));
      b3.setForeground(c2);
    b3.setFocusPainted(false);
    b3.setBorderPainted(false);
    b3.setBounds(-10,247,182,90);
    b3.addActionListener(this);
    
    b4= new JButton("DOCENTE",IMG7);
     b4.setBackground(new Color(62,164,179));
     b4.setForeground(c2);
    b4.setFocusPainted(false);
    b4.setBorderPainted(false);
    b4.setBounds(0,339,182,90);
    b4.addActionListener(this);
    
    IMG0 = new ImageIcon(getClass().getResource("T1.png"));
     b7= new JButton("FUNCIONARIO",IMG0);
      b7.setBackground(new Color(62,164,179));
      b7.setForeground(c2);
    b7.setFocusPainted(false);
    b7.setBorderPainted(false);
    b7.setBounds(-4,431,182,90);
    b7.addActionListener(this);
    
     b5= new JButton("DEFINICOES",IMG8);
      b5.setBackground(new Color(62,164,179));
      b5.setForeground(c2);
    b5.setFocusPainted(false);
    b5.setBorderPainted(false);
    b5.setBounds(-10,523,182,90);
    b5.addActionListener(this);
    
    IMG9 = new ImageIcon(getClass().getResource("x3.png"));
     b6= new JButton("SAIR",IMG9);
      b6.setBackground(new Color(62,164,179));
      b6.setForeground(c2);
    b6.setFocusPainted(false);
    b6.setBorderPainted(false);
    b6.setBounds(-35,615,205,90);
    b6.addActionListener(this);
    
    
    p2 = new JPanel();
    p2.setLayout(null);
    p2.setBounds(-10,0,165,1000);
    p2.setBackground(new Color(0,56,86));
    p2.add(b1);
    p2.add(b2);
    p2.add(b3);
    p2.add(b4);
    p2.add(b5);
    p2.add(b6);
    p2.add(b7);
   

    
    p3 = new JPanel();
    p3.setLayout(null);
    p3.setBounds(-10,0,1500,63);
    p3.setBackground(new Color(0,56,86));
    p3.add(l1);
    p3.add(l2);
    p3.add(seach);
    p3.add(t1);
    p3.add(l4);
    
    vGeral= new JButton("Inscricao de Cadeiras");
    vGeral.setBounds(532,100,156,50);
    vGeral.setBackground(new Color(172,224,241));
    vGeral.setFocusPainted(false);
    vGeral.setBorderPainted(false);
    vGeral.addActionListener(this);
    
    cadE= new JButton("Cadastrar Estudante");
    cadE.setBounds(366,100,156,50);
    cadE.setBackground(new Color(62,164,179));
    cadE.setFocusPainted(false);
    cadE.setBorderPainted(false);
    cadE.addActionListener(this);
    
    cadD= new JButton("Cadastrar Docente");
    cadD.setBounds(200,100,156,50);
   cadD.setBackground(new Color(62,164,179)); 
   cadD.setFocusPainted(false);
    cadD.setBorderPainted(false);
    cadD.addActionListener(this);
    
    cadN= new JButton("Registro de Notas");
    cadN.setBounds(698 ,100,156,50);
   cadN.setBackground(new Color(62,164,179));
   cadN.setFocusPainted(false);
    cadN.setBorderPainted(false);
    cadN.addActionListener(this);
    
    p4 = new JPanel();
    p4.setLayout(null);
    p4.setBounds(190,90,1150,60);
    p4.setBackground(new Color(154,196,198));
    add(vGeral);
    add(cadE);
    add(cadD);
    add(cadN);
    
    p1 = new JPanel();
    p1.setLayout(null);
    p1.setBounds(-10,0,1500,1000);
    p1.setBackground(new Color(172,224,241));
   p1.add(l10);
    p1.add(l5);
    p1.add(t0);
    p1.add(l6);
    p1.add(t2);
    p1.add(l9);
    p1.add(cbIdade);
    p1.add(labNac);
    p1.add(cbNac);
    p1.add(labCurso);
    p1.add(cbCurso);
    p1.add(labProv);
     p1.add(cbProv);
     p1.add(labC4);
     p1.add(cbC4);
    p1.add(bCad);
    p1.add(bCan);
    p1.add(labC5);
    p1.add(cbC5);
    
    add(p4);
    add(p3);
    add(p2);
    add(p1);
    
    
    
    setVisible(true);}

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b1){
          b1.setBackground( new Color(172,224,241));
          b2.setBackground( new Color(8,99,148));
          b3.setBackground( new Color(8,99,148));
          b4.setBackground( new Color(8,99,148));
          b5.setBackground( new Color(8,99,148));
          b6.setBackground( new Color(8,99,148));
          b7.setBackground( new Color(8,99,148));
          new Home(cod, name);
      }
        if(e.getSource()==b2){
          b1.setBackground( new Color(8,99,148));
          b2.setBackground( new Color(172,224,241));
          b3.setBackground( new Color(8,99,148));
          b4.setBackground( new Color(8,99,148));
          b5.setBackground( new Color(8,99,148));
          b6.setBackground( new Color(8,99,148));
          b7.setBackground( new Color(8,99,148));
          new Estudant(cod, name);
         
      }
        if(e.getSource()==b3){
          b1.setBackground( new Color(8,99,148)); 
          b2.setBackground( new Color(8,99,148));
          b3.setBackground( new Color(172,224,241));
          b4.setBackground( new Color(8,99,148));
          b5.setBackground( new Color(8,99,148));
          b6.setBackground( new Color(8,99,148));
          b7.setBackground( new Color(8,99,148));
          new InscriHome(cod, name);
        }
        if(e.getSource()==b4){
          b1.setBackground( new Color(8,99,148)); 
          b2.setBackground( new Color(8,99,148));
          b3.setBackground( new Color(8,99,148));
          b4.setBackground( new Color(172,224,241));
          b5.setBackground( new Color(8,99,148));
          b6.setBackground( new Color(8,99,148));
          b7.setBackground( new Color(8,99,148));
          new VgeralD(cod, name);
        }
         if(e.getSource()==b5){
          b1.setBackground( new Color(8,99,148)); 
          b2.setBackground( new Color(8,99,148));
          b3.setBackground( new Color(8,99,148));
          b4.setBackground( new Color(8,99,148));
          b5.setBackground( new Color(172,224,241));
          b6.setBackground( new Color(8,99,148));
          b7.setBackground( new Color(8,99,148));
          new Definicoes(cod, name);
          dispose();
        }
         if(e.getSource()==b6){
           if(e.getSource()==b6){
            int  option=0;
        option = JOptionPane.showConfirmDialog(null,"Deseja sair?","Confime",JOptionPane.YES_NO_OPTION);
         if(option==JOptionPane.YES_OPTION){
          System.exit(0);
          
            }
        }
        }
         if(e.getSource()==b7){
          b1.setBackground( new Color(8,99,148)); 
          b2.setBackground( new Color(8,99,148));
          b3.setBackground( new Color(8,99,148));
          b4.setBackground( new Color(8,99,148));
          b5.setBackground( new Color(8,99,148));
          b6.setBackground( new Color(8,99,148));
          b7.setBackground( new Color(172,224,241));
        }
         if(e.getSource()==vGeral){
          new Inscric(cod, name);
          dispose();
          }
         if(e.getSource()==cadE){
          new Estudante();
           dispose();
          }
         if(e.getSource()==cadD){
          new Docente();
          dispose();
          
         }
         if(e.getSource()==cadN){
          new Notas(cod,name);
          dispose();
          
         }
      
    }
    
}

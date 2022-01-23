
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Home extends JFrame implements ActionListener{
     JTextField t1;
    JPanel p1,p2,p3,p4,p5;
    ImageIcon IMG0,IMG1,IMG2,IMG3,IMG4,IMG5,IMG6,IMG7,IMG8,IMG9;
    JLabel l1,l2,l3,l4,l5,homeL1, estud,conEstud, docent,conDocent,Funcion,
            consFunfuncion, consFunfuncion2, consFunfuncion3, duvidas,mGlob,te1,te2,te3, homeL2, estud2,conEstud2, conEstud3,conEstud4,docent2,
            conDocent2,conDocent3,Funcion2;
    JButton b1,b2,b3,b4,b5,b6,b7,matric,seach,vGeral,aprov;
    Color c1,c2;
    Font f,f0,f1;
    String cod,name;
    public Home(String cod, String name){
        this.cod=cod;
        this.name=name;
    setLayout(null);
    setTitle("Image");
    setBounds(-10,0,1500,1000);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    f0= new Font("Arial",Font.BOLD,20);
    f1= new Font("Arial",Font.BOLD,15);
    homeL1 = new JLabel("Sistema Integrado De Gestao Academica (SGA)");
    homeL1.setBounds(250,200,530,20);
    homeL1.setFont(f0); 
    
    homeL2 = new JLabel("Como Aceder o (SGA)?");
    homeL2.setBounds(850,250,530,20);
    homeL2.setFont(f0); 
    
    estud = new JLabel("Estudante:");
    estud.setBounds(350,300,530,20);
    estud.setFont(f1);
    
    estud2 = new JLabel("Estudante:");
    estud2.setBounds(850,300,530,20);
    estud2.setFont(f1);
    
    conEstud= new JLabel("Consulte a Seu Perfil e Historico Academico");
    conEstud.setBounds(440,300,530,20);
    
    conEstud2= new JLabel("Para aceder o Sistema use o seu email institucional. Caso");
    conEstud2.setBounds(950,300,530,20);
    
    conEstud3= new JLabel("esteja a aceder pela primeira vez, a sua senha inicial será");
    conEstud3.setBounds(950,315,530,20);
    
    conEstud4= new JLabel("o seu número de estudante.");
    conEstud4.setBounds(950,330,530,20);
    
    docent = new JLabel("Docente:");
    docent.setBounds(350,360,530,20);
    docent.setFont(f1);
    
    docent2 = new JLabel("Docente:");
    docent2.setBounds(850,360,530,20);
    docent2.setFont(f1);
    
    conDocent = new JLabel("Faca a Gestao do Seu Perfil e Turmas");
    conDocent.setBounds(440,360,530,20);
    
    conDocent2 = new JLabel("Os seus dados de acesso serão fornecidos pelos de");
    conDocent2.setBounds(950,360,530,20);
    
    conDocent3 = new JLabel("serviços registo académico da unidade orgânica.");
    conDocent3.setBounds(950,375,530,20);
    
    Funcion = new JLabel("Funcionario:");
    Funcion.setBounds(350,400,530,20);
    Funcion.setFont(f1);
    
    Funcion2 = new JLabel("Funcionario:");
    Funcion2.setBounds(850,420,530,20);
    Funcion2.setFont(f1);
    
    consFunfuncion = new JLabel("Faca a Gestao das Suas Actividades na Instituicao");
    consFunfuncion.setBounds(442,400,530,20);
    
    consFunfuncion2 = new JLabel("Os seus dados de acesso serão fornecidos pela Direcção");
    consFunfuncion2.setBounds(950,420,530,20);
    
    consFunfuncion3 = new JLabel("de Registo Académico");
    consFunfuncion3.setBounds(950,435,530,20);
    
    duvidas = new JLabel("duvidas?");
    duvidas.setBounds(250,450,530,20);
    duvidas.setFont(f0); 
    
    mGlob = new JLabel("Como Consultar a media Global das cadeiras feitas");
    mGlob.setForeground(Color.BLUE);
    mGlob.setBounds(350,500,530,20);
    
    te1 = new JLabel("Uma das Questoes mais levantadas pelos Estudantes desta Instituicao,");
    te1.setBounds(350,520,530,20);
    te2=new JLabel("tem a ver com a necessidade da consulta da media Global");
    te2.setBounds(350,535,530,20);
    te3=new JLabel("das Cadeiras feitas do Curso");
    te3.setBounds(350,550,530,20);
    
     p4 = new JPanel();
    p4.setLayout(null);
    p4.setBounds(200,245,3,380);
    p4.setBackground(new Color(0,56,86));
    
    p5 = new JPanel();
    p5.setLayout(null);
    p5.setBounds(800,245,3,380);
    p5.setBackground(new Color(0,56,86));
    
    p1 = new JPanel();
    p1.setLayout(null);
    p1.setBounds(-10,0,1500,1000);
    p1.setBackground(new Color(172,224,241));
    p1.add(homeL1);
    p1.add(estud);
    p1.add(docent);p1.add(docent2);
    p1.add(Funcion);p1.add(Funcion2);
    p1.add(conEstud);
     p1.add(conDocent);p1.add(conDocent2);p1.add(conDocent3);
     p1.add(consFunfuncion);p1.add(consFunfuncion2);p1.add(consFunfuncion3);
     p1.add(duvidas);
     p1.add(mGlob);
     p1.add(te1);
     p1.add(te2);
     p1.add(te3);
     p1.add(p4);
     p1.add(p5);
     p1.add(homeL2);
     p1.add(estud2);
     p1.add(conEstud2);
     p1.add(conEstud3);
     p1.add(conEstud4);
     
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
    
    c1= new Color(226,252,253); 
    c2= new Color(0,0,0); 
    f= new Font("Arial",Font.BOLD,20);
    l2= new JLabel(name);
    l2.setFont(f);
    l2.setForeground(c1);
    l2.setBackground(new Color(0,56,86));
    l2.setBounds(1085,-18,503,100);
    t1= new JTextField("Pesquisar"); 
    t1.setBounds(520,15,403,30);
    
    
    
    b1= new JButton("HOME",IMG4);
     //b1.setBackground( new Color(172,224,241));
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
      b3.setBackground(new Color(62,164,179));
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
    /*
     p4 = new JPanel();
    p4.setLayout(null);
    p4.setBounds(200,200,3,300);
    p4.setBackground(new Color(0,56,86));
    */
    add(p3);
    add(p2);
    add(p1);
    
    
    
    setVisible(true);}

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b1){
         new Home(cod,name);
         // dispose();
      }
        if(e.getSource()==b2){
          b1.setBackground( new Color(8,99,148));
          b2.setBackground( new Color(172,224,241));
          b3.setBackground( new Color(8,99,148));
          b4.setBackground( new Color(8,99,148));
          b5.setBackground( new Color(8,99,148));
          b6.setBackground( new Color(8,99,148));
          b7.setBackground( new Color(8,99,148));
          new Estudant(cod,name);
      }
        if(e.getSource()==b3){
            
          b1.setBackground( new Color(8,99,148)); 
          b2.setBackground( new Color(8,99,148));
          b3.setBackground( new Color(172,224,241));
          b4.setBackground( new Color(8,99,148));
          b5.setBackground( new Color(8,99,148));
          b6.setBackground( new Color(8,99,148));
          b7.setBackground( new Color(8,99,148));
          new InscriHome(cod,name);
        }
        if(e.getSource()==b4){
          b1.setBackground( new Color(8,99,148)); 
          b2.setBackground( new Color(8,99,148));
          b3.setBackground( new Color(8,99,148));
          b4.setBackground( new Color(172,224,241));
          b5.setBackground( new Color(8,99,148));
          b6.setBackground( new Color(8,99,148));
          b7.setBackground( new Color(8,99,148));
          new VgeralD(cod,name);
        }
         if(e.getSource()==b5){
          b1.setBackground( new Color(8,99,148)); 
          b2.setBackground( new Color(8,99,148));
          b3.setBackground( new Color(8,99,148));
          b4.setBackground( new Color(8,99,148));
          b5.setBackground( new Color(172,224,241));
          b6.setBackground( new Color(8,99,148));
          b7.setBackground( new Color(8,99,148));
          new Definicoes(cod,name);
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
           new Funcionario(cod,name);
          dispose();
        }
         
         }
      
}

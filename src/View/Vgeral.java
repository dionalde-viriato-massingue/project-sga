/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import SGA.Controller.EstudanteCadController;
import SGA.Model.EstudanteCadVO;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Vgeral extends JFrame implements ActionListener{
      JTextField t1;
    JPanel p1,p2,p3,p4,p5,p6;
    ImageIcon IMG0,IMG1,IMG2,IMG3,IMG4,IMG5,IMG6,IMG7,IMG8,IMG9;
    JLabel l1,l2,l3,l4,l5,dados,codi,codS,nome,nomeS,dataN,dataS,
        sexo,sexoS,curso,cursoS, facul,faculS, nac,nacS,prov,provS,cont,contS;
    JButton b1,b2,b3,b4,b5,b6,b7,matric,seach,vGeral,aprov;
    Color c1,c2;
    Font f;
    String cod, name;
    public Vgeral(String cod, String name){
        this.cod=cod;
        this.name=name;
    setLayout(null);
    setTitle("Image");
    setBounds(-10,0,1500,1000);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     EstudanteCadController estudanteController = new EstudanteCadController();
    ArrayList<EstudanteCadVO> list = estudanteController.getDados();
   
    c1= new Color(226,252,253); 
    c2= new Color(0,0,0); 
    f= new Font("Arial",Font.BOLD,20);
    
     dados = new JLabel("Dados do Estudante");
    dados.setBounds(240,188,300,50);
    dados.setFont(f);
    
    codi=new JLabel("Codigo:"); codS=new JLabel("20192220");
    codi.setBounds(240,280,300,20); codS.setBounds(390,280,300,20);
    
    nome=new JLabel("Nome:"); 
    nomeS= new JLabel(""+list.get(0).getNome());
    nome.setBounds(240,315,300,20); nomeS.setBounds(390,315,300,20);
    
    dataN=new JLabel("Data de Nascimento:"); dataS=new JLabel("28-08-1998");
    dataN.setBounds(240,350,300,20); dataS.setBounds(390,350,300,20);
    
    sexo=new JLabel("Sexo:"); sexoS=new JLabel("M");
    sexo.setBounds(240,385,300,20); sexoS.setBounds(390,385,300,20);
    
    curso=new JLabel("Curso:"); cursoS=new JLabel("Informatica");
    curso.setBounds(240,420,300,20); cursoS.setBounds(390,420,300,20);
    
    facul=new JLabel("Faculade:"); faculS=new JLabel("Engenharia");
    facul.setBounds(240,455,300,20); faculS.setBounds(390,455,300,20);
    
    nac=new JLabel("Nacionalidade:"); nacS=new JLabel("Mocambicana");
    nac.setBounds(240,490,300,20); nacS.setBounds(390,490,300,20);
    
    prov=new JLabel("Provincia:"); provS=new JLabel("Maputo");
    prov.setBounds(240,525,300,20); provS.setBounds(390,525,300,20);
    
    cont=new JLabel("Contacto:"); contS=new JLabel("+258 847569202");
    cont.setBounds(240,560,300,20); contS.setBounds(390,560,300,20);
    
    p1 = new JPanel();
    p1.setLayout(null);
    p1.setBounds(-10,0,1500,1000);
    p1.setBackground(new Color(172,224,241));
    p1.add(dados);
    p1.add(codi); p1.add(codS);
    p1.add(nome); p1.add(nomeS);
    p1.add(dataN); p1.add(dataS);
    p1.add(sexo); p1.add(sexoS);
    p1.add(curso); p1.add(cursoS);
    p1.add(facul); p1.add(faculS);
    p1.add(nac); p1.add(nacS);
    p1.add(prov); p1.add(provS);
    p1.add(cont); p1.add(contS);
    
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
     b2.setBackground(new Color(172,224,241));
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
    
    vGeral= new JButton("Visao Geral");
    vGeral.setBounds(200,100,124,50);
    vGeral.setBackground(new Color(172,224,241));
    vGeral.setFocusPainted(false);
    vGeral.setBorderPainted(false);
    vGeral.addActionListener(this);
    
    matric= new JButton("Matriculas");
    matric.setBounds(330,100,124,50);
    matric.setBackground(new Color(62,164,179));
    matric.setFocusPainted(false);
    matric.setBorderPainted(false);
    matric.addActionListener(this);
    
    aprov= new JButton("Aproveitamento");
    aprov.setBounds(460,100,124,50);
   aprov.setBackground(new Color(62,164,179));
   aprov.setFocusPainted(false);
    aprov.setBorderPainted(false);
    aprov.addActionListener(this);
    
    p4 = new JPanel();
    p4.setLayout(null);
    p4.setBounds(190,90,1150,60);
    p4.setBackground(new Color(154,196,198));
    add(vGeral);
    add(matric);
    add(aprov);
    
     p6 = new JPanel();
    p6.setLayout(null);
    p6.setBounds(200,275,3,310);
    p6.setBackground(new Color(0,56,86));
    
    p5 = new JPanel();
    p5.setLayout(null);
    p5.setBounds(800,275,3,310);
    p5.setBackground(new Color(0,56,86));
    add(p6);
    add(p5);
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
          new Vgeral(cod, name);
          }
         if(e.getSource()==matric){
          new Matricula(cod, name);
          }
         if(e.getSource()==aprov){
          new Aproveitamento(cod, name);
          
         }
      
    }
    
}

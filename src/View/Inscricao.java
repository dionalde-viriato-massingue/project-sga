
package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Inscricao extends JFrame  implements ActionListener {
    JPanel p1,p2,p3;
    ImageIcon IMG1,IMG2,IMG3,ImgCad,ImgCan,ImgVol ;
    JLabel l1,l2,l3,l4,l5,l6,l9,labNac,labCurso,labProv,labC4,labC5;
    Font f;
    Color c1;
    JButton bCad,bCan, bVol;
    JTextField t1,t2,t5;
    JComboBox cbIdade,cbNac,cbCurso,cbProv,cbC4,cbC5;
    public Inscricao(){
     
    
    setTitle("Inscricao do Estudante");
    setBounds(-10,0,1500,1000);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
    
     l5= new JLabel("Nome:");
     l5.setBounds(70,178, 200,98);
     t1= new JTextField(15);
     t1.setBounds(120,210, 200,28);
     
     l6= new JLabel("Codigo: ");
     l6.setBounds(70,250, 200,98);
     t2= new JTextField("20192220");
     t2.setBounds(120,286, 200,28);
    
     
     l9= new JLabel("Curso:");
     l9.setBounds(423,178, 200,98);
     String [] curso= {"Informatica","Mecanica","Eletronica","Quimica"};
     cbIdade = new JComboBox(curso);
      cbIdade.setBounds(475,212, 110,28);
      
      labCurso= new JLabel("Cadeira 1:");
     labCurso.setBounds(413,250, 200,98);
     String [] cadeira1= {"POO2","BD2","ADA","IP","M.Solidos","Termodinamica","M.Eletricas","Q.Organica","AM3"};
     cbCurso = new JComboBox(cadeira1);
     cbCurso .setBounds(475,284, 110,28);
      
      labNac= new JLabel("Cadeira 2:");
     labNac.setBounds(693,178, 200,98);
     String [] cadeira2= {"POO2","BD2","ADA","IP","M.Solidos","Termodinamica","M.Eletricas","Q.Organica","AM3"};
     cbNac = new JComboBox(cadeira2);
      cbNac .setBounds(764,212, 110,28);
      
      labProv= new JLabel("Cadeira 3:");
     labProv.setBounds(693,250, 200,98);
     String [] cadeira3= {"POO2","BD2","ADA","IP","M.Solidos","Termodinamica","M.Eletricas","Q.Organica","AM3"};
     cbProv = new JComboBox(cadeira3);
      cbProv .setBounds(764,284, 110,28);
      
      labC4= new JLabel("Cadeira 4:");
     labC4.setBounds(960,178, 200,98);
     String [] cadeira4= {"POO2","BD2","ADA","IP","M.Solidos","Termodinamica","M.Eletricas","Q.Organica","AM3"};
     cbC4 = new JComboBox(cadeira4);
      cbC4.setBounds(1030,210, 110,28);
      
      labC5= new JLabel("Cadeira 5:");
     labC5.setBounds(960,250, 200,98);
     String [] cadeira5= {"POO2","BD2","ADA","IP","M.Solidos","Termodinamica","M.Eletricas","Q.Organica","AM3"};
     cbC5 = new JComboBox(cadeira5);
      cbC5.setBounds(1030,283, 110,28);
     
     
    ImgCad = new ImageIcon(getClass().getResource("Inscrever.png"));
    bCad= new JButton(ImgCad);
    bCad.setBounds(230,500,130,42);
    bCad.setBackground(new Color(172,234,242));
   bCad.setFocusPainted(false);
   bCad.setBorderPainted(false);
   bCad.addActionListener(this);
   
   ImgVol = new ImageIcon(getClass().getResource("voltar_1.png"));
    bVol= new JButton(ImgVol);
    bVol.setBounds(570,500,130,42);
    bVol.setBackground(new Color(172,234,242));
   bVol.setFocusPainted(false);
   bVol.setBorderPainted(false);
   bVol.addActionListener(this);
   
     ImgCan = new ImageIcon(getClass().getResource("cancelar.png"));
    bCan= new JButton(ImgCan);
    bCan.setBounds(890,500,130,42);
    bCan.setBackground(new Color(172,234,242));
   bCan.setFocusPainted(false);
   bCan.setBorderPainted(false);
   bCan.addActionListener(this);
    
     IMG1 = new ImageIcon(getClass().getResource("k1.png"));
    l1 = new JLabel(IMG1);
    l1.setBounds(1080,-18,503,100);
    
    IMG2 = new ImageIcon(getClass().getResource("logoIncricao.png"));
    l3 = new JLabel(IMG2);
    l3.setBounds(380,0,503,170);
    
    IMG3 = new ImageIcon(getClass().getResource("k3.png"));
    l4 = new JLabel(IMG3);
    l4.setBounds(-150,-18,503,100);
    
    c1= new Color(226,252,253); 
    f= new Font("Arial",Font.BOLD,20);
    l2= new JLabel("Funcionario");
    l2.setFont(f);
    l2.setForeground(c1);
    l2.setBackground(new Color(0,56,86));
    l2.setBounds(1085,-18,503,100);
    
    p1 = new JPanel();
    p1.setLayout(null);
    p1.setBounds(-10,0,1500,1000);
    p1.setBackground(new Color(172,224,241));
    
    
    p3 = new JPanel();
    p3.setLayout(null);
    p3.setBounds(-10,0,1500,63);
    p3.setBackground(new Color(0,56,86));
    p3.add(l1);
    p3.add(l2);
    p3.add(l4); 
    
    p2 = new JPanel();
    p2.setLayout(null);
    p2.setBounds(63,68,1250,590);
    p2.setBackground(new Color(172,234,242));
    p2.add(l3);
    p2.add(l5);
    p2.add(t1);
    p2.add(l6);
    p2.add(t2);
    p2.add(l9);
    p2.add(cbIdade);
    p2.add(labNac);
    p2.add(cbNac);
    p2.add(labCurso);
    p2.add(cbCurso);
    p2.add(labProv);
     p2.add(cbProv);
     p2.add(labC4);
     p2.add(cbC4);
    p2.add(bCad);
    p2.add(bCan);
    p2.add(bVol);
    p2.add(labC5);
    p2.add(cbC5);
    add(p3);
    add(p2);
    add(p1);
    
    
    setVisible(true);}
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==bCad){
        JOptionPane.showMessageDialog(null,"Incricao feito com sucesso!! ");
        }
        if(e.getSource()==bVol){
        new test2();
        dispose();
        }
        if(e.getSource()==bCan){
        System.exit(0);
        }
    }

    }
    

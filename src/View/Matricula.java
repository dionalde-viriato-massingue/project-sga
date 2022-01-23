
package View;

import SGA.Controller.MatriculaController;
import SGA.Model.MatriculaVO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Matricula extends JFrame implements ActionListener {

    
    JTextField t1;
    JPanel p1,p2,p3,p4;
    ImageIcon IMG0,IMG1,IMG2,IMG3,IMG4,IMG5,IMG6,IMG7,IMG8,IMG9;
    JLabel l1,l2,l3,l4,l5,matri;
    JButton b1,b2,b3,b4,b5,b6,b7,matric,seach,vGeral,aprov;
    Color c1,c2;
    Font f;
    JTable table;
    String cod, name;
    public Matricula(String cod, String name) {
        this.cod=cod;
        this.name=name;
    setLayout(null);
    setTitle("Image");
    setBounds(-10,0,1500,1000);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
   
    
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
    
    matri= new JLabel("Historico de Matriculas");
    matri.setFont(f);
    matri.setForeground(Color.BLACK);
//    matric.setBackground(Color.BLACK);
    matri.setBounds(250,170,503,100);
    
 String [] col= {"Nome do Estudante","Curso","Ano","Valor","Pago"};
     DefaultTableModel tbM = new DefaultTableModel(null,col);
     tbM.setColumnCount(5);
     tbM.setRowCount(20);
  
     table = new JTable(tbM);
     table.setFont(new Font("Segoe UI", Font.PLAIN, 15));
     JScrollPane JS = new JScrollPane(table);
     listarMatricula(tbM);
     JS.setBounds(200,260,1000,300);
     
     p1 = new JPanel();
    p1.setLayout(null);
    p1.setBounds(-10,0,1500,1000);
    p1.setBackground(new Color(172,224,241));
    p1.add(matri);
    p1.add(JS);
    
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
    vGeral.setBackground(new Color(62,164,179));
    vGeral.setFocusPainted(false);
    vGeral.setBorderPainted(false);
    vGeral.addActionListener(this);
    
    matric= new JButton("Matriculas");
    matric.setBounds(330,100,124,50);
    matric.setBackground(new Color(172,224,241));
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
          b1.setBackground( new Color(8,99,148)); 
          b2.setBackground( new Color(8,99,148));
          b3.setBackground( new Color(8,99,148));
          b4.setBackground( new Color(8,99,148));
          b5.setBackground( new Color(8,99,148));
          b6.setBackground( new Color(172,224,241));
          b7.setBackground( new Color(8,99,148));
          System.exit(0);
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
    
     public void listarMatricula(DefaultTableModel model){
        try {
            
            model.setNumRows(0);
            MatriculaController avalContr = new MatriculaController();
            ArrayList<MatriculaVO> list = avalContr.getDados();
            
            for(int i=0;i<list.size();i++){
            model.addRow(new Object[]{
                list.get(i).getNomeEst(),
                list.get(i).getCurso(),
                list.get(i).getAno(),
                list.get(i).getValor(),
                list.get(i).getPago()
                
            });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "listar Matricula view "+e.getMessage());
        }
    }
}

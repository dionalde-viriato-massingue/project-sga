
package View;

import SGA.Controller.DocenteCadController;
import SGA.Model.DocenteCadDAO;
import SGA.Model.DocenteCadVO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;


public class Docente extends JFrame implements ActionListener {
   JPanel p1,p2,p3;
    ImageIcon IMG1,IMG2,IMG3,ImgCad,ImgCan,ImgVol ;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,labNac,labCurso,labProv,labSexo,
            lCod,labEstado, labNecessidade;
    Font f;
    Color c1;
    JButton bCad,bCan, bVol;
    JTextField tNome,tCod,tCont,tFacul,t5,t6,tData;
    JComboBox cbIdade,cbNac,cbCurso,cbProv;
    JRadioButton rbM,rbF,rbEstado,rbS,rbC,rbSim,rbNao;
    ButtonGroup bgS,bgE,bgN;
     DocenteCadController docenteCont = new DocenteCadController();
    ArrayList<DocenteCadVO> list = docenteCont.countDocentes();
    
    public Docente(){
        
    setTitle("Cadastro Docente");
    setBounds(-10,0,1500,1000);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     
    
     l5= new JLabel("Nome:");
     l5.setBounds(150,178, 200,98);
     tNome= new JTextField(15);
     tNome.setBounds(210,210, 200,28);
     
     l6= new JLabel("Codigo: ");
     l6.setBounds(150,250, 200,98);
     lCod= new JLabel(5000+list.size()+"");
     lCod.setBounds(210,286, 200,28);
    
     l7= new JLabel("Contacto: ");
     l7.setBounds(150,320, 200,98);
     tCont= new JTextField("8 ");
     tCont.setBounds(210,356, 200,28);
     
      l8= new JLabel("Faculdade: ");
     l8.setBounds(150,390, 200,98);
     tFacul= new JTextField(15);
     tFacul.setBounds(210,426, 200,28);
      
     
     l9= new JLabel("Nascimento:");
     l9.setBounds(530,178, 200,98);
     tData= new JTextField("yyyy-mm-dd");
     tData.setBounds(610,212, 70,28);
      
      labCurso= new JLabel("Cadeira:");
     labCurso.setBounds(530,250, 200,98);
     String [] curso= {"POO2","BD2","ADA","IP"};
     cbCurso = new JComboBox(curso);
     cbCurso .setBounds(590,280, 100,28);
      
      labNac= new JLabel("Pais:");
     labNac.setBounds(530,320, 200,98);
     String [] estado= {"Moz","RSA","ANGOLA","EUA"};
     cbNac = new JComboBox(estado);
      cbNac .setBounds(590,360, 100,28);
      
      labProv= new JLabel("Province:");
     labProv.setBounds(530,390, 200,98);
     String [] provincia= {"Maputo","Gaza","Pretoria","Luanda"};
     cbProv = new JComboBox(provincia);
      cbProv .setBounds(590,425, 100,28);
     
      labSexo= new JLabel("Sexo:");
     labSexo.setBounds(850,178, 200,98);
     rbM = new JRadioButton("M");
     rbM.setBounds(890,215, 50,28);
     rbM.setBackground(new Color(172,234,242));
     rbM.setFocusPainted(false);
     rbF = new JRadioButton("F");
     rbF.setBounds(940,215, 50,28);
     rbF.setBackground(new Color(172,234,242));
     rbF.setFocusPainted(false);
     
     bgS= new ButtonGroup();
     bgS.add(rbM);
     bgS.add(rbF);
     
    
     labEstado = new JLabel("Estado Civil:");
     labEstado.setBounds(850,250, 200,98);
     rbS= new JRadioButton("Solteiro");
     rbS.setBounds(930,250, 70,98);
     rbS.setBackground(new Color(172,234,242));
     rbS.setFocusPainted(false);
     rbC = new JRadioButton("Casado");
     rbC.setBounds(1000,250,70,98);
     rbC.setBackground(new Color(172,234,242));
     rbC.setFocusPainted(false);
     
   
    bgE= new ButtonGroup();
    bgE.add(rbS);
    bgE.add(rbC); 
    
     labNecessidade = new JLabel("Necessiade especial?:");
     labNecessidade.setBounds(850,320, 200,98);
     rbSim= new JRadioButton("Sim");
     rbSim.setBounds(990,320, 60,98);
     rbSim.setBackground(new Color(172,234,242));
     rbSim.setFocusPainted(false);
     rbNao = new JRadioButton("Nao");
     rbNao.setBounds(1050,320,70,98);
     rbNao.setBackground(new Color(172,234,242));
     rbNao.setFocusPainted(false);
     
     t6 = new JTextField("Se SIM, Qual?");
     t6.setBounds(845,418, 255,28);
     
   
    bgN = new ButtonGroup();
    bgN.add(rbSim);
    bgN.add(rbNao); 
     
    ImgCad = new ImageIcon(getClass().getResource("inscrever.png"));
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
    
    IMG2 = new ImageIcon(getClass().getResource("doc1.png"));
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
    p2.add(tNome);
    p2.add(l6);
    p2.add(lCod);
    p2.add(l7);
    p2.add(tCont);
    p2.add(l8);
    p2.add(tFacul);
    p2.add(l9);
    p2.add(tData);
    p2.add(labNac);
    p2.add(cbNac);
    p2.add(labCurso);
    p2.add(cbCurso);
    p2.add(labProv);
     p2.add(cbProv);
     p2.add(labSexo);
     p2.add(rbM);
     p2.add(rbF);
     p2.add(labEstado);
    p2.add(rbS);
    p2.add(rbC);
     p2.add(labNecessidade);
     p2.add(t6);
    p2.add(rbSim);
    p2.add(rbNao);
    p2.add(bCad);
    p2.add(bCan);
    p2.add(bVol);
    add(p3);
    add(p2);
    add(p1);
    setVisible(true);}

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==bCad){  
            
       
       int id = Integer.parseInt(lCod.getText());
       String nome = tNome.getText();
       String data = tData.getText();
       String sexo = bgS.getSelection().getActionCommand();
       String cadeira = (String)cbCurso.getSelectedItem();
       String pais = (String)cbNac.getSelectedItem();
       String facul = tFacul.getText();
       String prov = (String)cbProv.getSelectedItem();
       String contacto= tCont.getText();
       
       
       
       DocenteCadController dc = new DocenteCadController(id,nome,data,sexo,cadeira, facul,pais,prov,contacto);
     
       
        lCod.setText(5001+list.size()+"");            
        tNome.setText("");
        tData.setText("");
        tCont.setText("");
        tFacul.setText("");

        }
        if(e.getSource()==bVol){
        new Funcionario(cod,name);
        dispose();
        }
        if(e.getSource()==bCan){
        System.exit(0);
        }
    }

}

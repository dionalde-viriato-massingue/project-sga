
package View;

import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableTest extends JFrame{
    
    public TableTest(){
        
        
   // setLayout(null);    
     setTitle("Cadastro Docente");
    setBounds(-10,0,1500,1000);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(null);
    
    String[] col={"nome","idade"};
    String[][] lin = {{"kkk","lll"},{"mmm","bb"}};
    
    JTable t = new JTable(lin,col);
    t.setLayout(null);
    t.setBounds(30,600,120,105);
   // t.setBackground(Color.BLACK);
    JScrollPane s= new JScrollPane(t);
    s.setBounds(200,104,600,54);
    s.setBackground(Color.red);
    
    //add(s);
   
    JPanel p1 = new JPanel();
    p1.setLayout(null);
    p1.setBounds(-10,0,1000,1000);
    p1.add(s);
   
    add(p1);
    setVisible(true);}
}

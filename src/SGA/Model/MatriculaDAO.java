
package SGA.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MatriculaDAO {
      Connection conn;
   PreparedStatement pstm;
   ResultSet rs;
   ArrayList<MatriculaVO> list = new ArrayList<>();
   public MatriculaDAO(){
    
       try {
         conn = BDconexao.getConnection();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "DocenteCadDAO Conn"+e.getMessage());
       }
   }
   
    public ArrayList<MatriculaVO> recuperarMatricula(){
       String sql ="select * from Matricula Where idEstudante";
       try {
           pstm=conn.prepareStatement(sql);
           rs= pstm.executeQuery();
           
           while(rs.next()){
               MatriculaVO matricula = new MatriculaVO();
               matricula.setNomeEst(rs.getString("nome"));
               matricula.setCurso(rs.getString("curso"));
               matricula.setAno(rs.getInt("ano"));
               matricula.setValor(rs.getFloat("valor"));
               matricula.setPago(rs.getString("pago"));
              
               list.add(matricula);
           
           }
       } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Recuperar Maticula"+e.getMessage());  
       }
   return list;}
   
}

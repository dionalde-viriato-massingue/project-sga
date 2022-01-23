
package SGA.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AvCadDAO {
   Connection conn;
   PreparedStatement pstm;
   ResultSet rs;
   ArrayList<AvCadVO> list = new ArrayList<>();
   public AvCadDAO(){
    
       try {
         conn = BDconexao.getConnection();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "AvaliacaoCadDAO Conn"+e.getMessage());
       }
   }
   public void CadAvaliacao(AvCadVO aval){
   
       try {
           String sql="Insert Into Aproveitamento(idEstudante,cadeira,teste1,teste2,exame,notaFinal,observacao) values (?,?,?,?,?,?,?)";
           pstm= conn.prepareStatement(sql);
           pstm.setInt(1, aval.getId());
           pstm.setString(2, aval.getCadeira());
           pstm.setFloat(3, aval.getTeste1());
           pstm.setFloat(4, aval.getTeste2());
           pstm.setFloat(5, aval.getExame());
           pstm.setFloat(6, aval.getNotafinal());
           pstm.setString(7, aval.getSituacao());
   
           
           pstm.execute();
           pstm.close();
           JOptionPane.showMessageDialog(null, "Avaliacao inserido com sucessio");
       } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Avaliacao sql"+e.getMessage());   
       }
  
       
       
   }
     public ArrayList<AvCadVO> recuperarAvalicao(String cod){
        String sql ="select * from Aproveitamento Where idEstudante ="+cod;
       try {
           pstm=conn.prepareStatement(sql);
           rs= pstm.executeQuery();
           
           while(rs.next()){
               AvCadVO aval = new AvCadVO();
               aval.setCadeira(rs.getString("Cadeira"));
               aval.setTeste1(rs.getFloat("teste1"));
               aval.setTeste2(rs.getFloat("teste2"));
               aval.setExame(rs.getFloat("exame"));
               aval.setNotafinal(rs.getFloat("notaFinal"));
               aval.setSituacao(rs.getString("observacao"));
            
               
               list.add(aval);
           
           }
       } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Recuperar Avaliacao"+e.getMessage());  
       }
   return list;}
   
}

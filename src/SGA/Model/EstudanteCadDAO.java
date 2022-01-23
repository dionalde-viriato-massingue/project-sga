
package SGA.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EstudanteCadDAO {
   
   Connection conn;
   PreparedStatement pstm;
   ResultSet rs;
 ArrayList<EstudanteCadVO> list = new ArrayList<>();
   public EstudanteCadDAO(){
    
       try {
         conn = BDconexao.getConnection();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "EstudanteCadDAO Conn"+e.getMessage());
       }
   }
   
   public void CadDEstudante(EstudanteCadVO estudant){
   
       try {
           String sql="Insert Into Estudante(idEstudante,nome,dNascimento,sexo,curso,Faculdade, nacionalidade,provincia, Contacto) values (?,?,?,?,?,?,?,?,?)";
           pstm= conn.prepareStatement(sql);
           pstm.setInt(1, estudant.getId());
           pstm.setString(2, estudant.getNome());
           pstm.setString(3, estudant.getData());
           pstm.setString(4, estudant.getSexo());
           pstm.setString(5, estudant.getCadeira());
           pstm.setString(6, estudant.getFacul());
           pstm.setString(7, estudant.getPais());
           pstm.setString(8, estudant.getProvincia());
           pstm.setInt(9, estudant.getContacto());
           
           pstm.execute();
           pstm.close();
           JOptionPane.showMessageDialog(null, "Estudante inserido com sucessio");
       } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Insersao Estudante sql"+e.getMessage());   
       }
     try {
    
           String sql2="Insert Into Usuario(nome,senha,categoria) values (?,?,'Estudante')";
           pstm= conn.prepareStatement(sql2);
           pstm.setString(1, estudant.getNome());
           pstm.setInt(2, estudant.getId());
           
           pstm.execute();
           pstm.close();
           JOptionPane.showMessageDialog(null, "Usuario inserido com sucessio");
       } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Usuario sql"+e.getMessage());   
       }
        
       
   }
       public ArrayList<EstudanteCadVO> recuperarEstudante(String cod){
        String sql ="select  nome,dNascimento,sexo,curso,faculdade,nacionalidade,provincia,contacto from Estudante Where idEstudante ="+cod;
       try {
           pstm=conn.prepareStatement(sql);
           rs= pstm.executeQuery();
           
           while(rs.next()){
               EstudanteCadVO estudante = new EstudanteCadVO();
               estudante.setNome(rs.getString("nome"));
               estudante.setData(rs.getString("dNascimento"));
               estudante.setSexo(rs.getString("sexo"));
               estudante.setCurso(rs.getString("curso"));
               estudante.setFacul(rs.getString("faculdade"));
               estudante.setPais(rs.getString("nacionalidade"));
               estudante.setProvincia(rs.getString("provincia"));
               estudante.setContacto(rs.getInt("contacto"));
               
               
               list.add(estudante);
           
           }
       } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Recuperar Estudante"+e.getMessage());  
       }
   return list;}
       
        public ArrayList<EstudanteCadVO> countEstudantes(){
        String sql2 ="select  nome from Estudante";
       try {
           pstm=conn.prepareStatement(sql2);
           rs= pstm.executeQuery();
           
           while(rs.next()){
               EstudanteCadVO estudante = new EstudanteCadVO();
               estudante.setNome(rs.getString("nome"));
  
               list.add(estudante);
           
           }
       } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "count Estudante"+e.getMessage());  
       }
   return list;}
}

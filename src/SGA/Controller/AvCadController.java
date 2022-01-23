
package SGA.Controller;
import SGA.Model.AvCadDAO;
import SGA.Model.AvCadVO;
import SGA.Model.EstudanteCadDAO;
import SGA.Model.EstudanteCadVO;
import SGA.Model.UsuarioVO;
import java.util.ArrayList;

public class AvCadController {
    AvCadVO avaliacaoVO;
    String cod;
    AvCadDAO avalDAO  = new AvCadDAO();
    public AvCadController(int id,String cadeira,float teste1,float teste2,float exam, float notaFinal,String situacao){
     avaliacaoVO = new AvCadVO();
     
     avaliacaoVO.setId(id);
     avaliacaoVO.setCadeira(cadeira);
     avaliacaoVO.setTeste1(teste1);
     avaliacaoVO.setTeste2(teste2);
     avaliacaoVO.setExame(exam);
     avaliacaoVO.setNotafinal(notaFinal);
     avaliacaoVO.setSituacao(situacao);
     
     
     
     AvCadDAO avDAO = new AvCadDAO();
     avDAO.CadAvaliacao(avaliacaoVO);
    }
    public AvCadController(String cod){this.cod=cod;}
    
    public ArrayList<AvCadVO> getDados(){ 
        ArrayList<AvCadVO> listarAval = avalDAO.recuperarAvalicao(cod);       
        return listarAval;
        
    }
}

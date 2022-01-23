
package SGA.Controller;

import SGA.Model.MatriculaDAO;
import SGA.Model.MatriculaVO;
import java.util.ArrayList;

public class MatriculaController {
     MatriculaVO matriculaVO;
    MatriculaDAO matriculaDAO  = new MatriculaDAO();
    
      public MatriculaController(){}
    
    public ArrayList<MatriculaVO> getDados(){  
        ArrayList<MatriculaVO> listarMatricula = matriculaDAO.recuperarMatricula();       
        return listarMatricula;
        
    }
}

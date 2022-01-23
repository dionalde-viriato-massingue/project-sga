
package SGA.Model;
public class AvCadVO {
    private int id;
    private String cadeira, situacao;
    private float teste1,teste2,exame, notafinal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }

    public float getTeste1() {
        return teste1;
    }

    public void setTeste1(float teste1) {
        this.teste1 = teste1;
    }

    public float getTeste2() {
        return teste2;
    }

    public void setTeste2(float teste2) {
        this.teste2 = teste2;
    }

    public float getExame() {
        return exame;
    }

    public void setExame(float exame) {
        this.exame = exame;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    /**
     * @return the notafinal
     */
    public float getNotafinal() {
        return notafinal;
    }

    /**
     * @param notafinal the notafinal to set
     */
    public void setNotafinal(float notafinal) {
        this.notafinal = notafinal;
    }
    
    
}

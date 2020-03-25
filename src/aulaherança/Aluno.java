/*
 Herança para diferença = aluno tem os objetos de pessoa + suas próprias 
 implementações
 */
package aulaherança;


public class Aluno extends Pessoa{
    
    private int Matricula;
    private String Curso;
    public void pagarMensalidade(boolean dinheiro){
        if(dinheiro == true){
            System.out.println("Mensalidade de " + this.getNome() +" paga");
        } 
        else
        {
            System.out.println("Mensalidade de " + this.getNome() + " não foi paga.Aluno caloteiro!");
        }
    }

    public int getMatricula() {
        return Matricula;
    }

    public java.lang.String getCurso() {
        return Curso;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public void setCurso(java.lang.String Curso) {
        this.Curso = Curso;
    }
    
    
}

/*

 */
package aulaherança;


public abstract class Pessoa {
    private String Nome;
    private int Idade;
    private String Sexo;
     
   
    
    public void String (String fazerAniversario){
        this.Idade++;
    }

   //Metodos especiais
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public String getSexo() {
        return Sexo;
    }
    
}

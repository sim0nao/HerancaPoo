/*
 Bolsista é uma classe final, e por isto não pode ser extendida
 (ter herança)
 */
package aulaherança;

public final class Bolsistas extends Aluno {

    public boolean bolsista;

    public void renovarBolsa() {
        System.out.println("Bolsa de" + this.getNome() + "renovada!");
    }

    @Override
    public void pagarMensalidade(boolean dinheiro) {
        dinheiro = true;
        System.out.println("Bolsa liberada");
    }
}

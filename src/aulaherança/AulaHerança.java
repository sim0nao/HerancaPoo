/*
 Aula exemplificando herança em POO
 */
package aulaherança;

public class AulaHerança {

    public static void main(String[] args) {
        boolean pagamento;
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(56);
        v1.setSexo("Masculino");

        Aluno a1 = new Aluno();
        a1.setNome("Simone");
        a1.setIdade(26);
        a1.setSexo("Feminino");
        a1.pagarMensalidade(pagamento = false);

        Bolsistas b1 = new Bolsistas();
        b1.setNome("Lorena");
        b1.setMatricula(003);
        b1.bolsista = true;
        b1.pagarMensalidade(pagamento);

    }

}

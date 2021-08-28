public class TestePrograma {
    public static void main(String[] args) {
        MedicoClinico medico1 = new MedicoClinico(12, "Douglas", 25, 200.0);
        MedicoCirurgiao medico2 = new MedicoCirurgiao(40,"Renata", 15, 800.0, 100.0);
        Acionista acionista1 = new Acionista("Willian", 100000, 9.98);

        System.out.println(medico1);
        System.out.println(medico2);
        System.out.println(acionista1);

        ControleBonus controle = new ControleBonus();

        controle.adicionaBonificavel(medico1);
        controle.adicionaBonificavel(medico2);
        controle.adicionaBonificavel(acionista1);

        System.out.println("Total Bônus: " + controle.calculaTotalBonus());

        controle.exibeTodosBonificaveis();
    }
}

public class TestaBank {

    public static void main(String[] args) {
        Cliente lidi = new Cliente();
        lidi.nome = "Lidianne Romão";
        lidi.cpf = "225.225.225-22";
        lidi.profissao = "Desenvolvedora";

        Conta contaDaLidi = new Conta();
        contaDaLidi.deposita(100);
        //System.out.println("o saldo da conta lidi é: " + contaDaLidi.saldo);

        //associa o cliente lidi a conta contaDaLidi
        contaDaLidi.titular = lidi;
        System.out.println(contaDaLidi.titular.nome);
    }
}

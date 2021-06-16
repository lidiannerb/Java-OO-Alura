public class TestaContaSemCliente {

    public static void main(String[] args) {
        //instanciando um cliente e uma conta
        Conta contaDaLidi = new Conta();
        contaDaLidi.titular = new Cliente();

        //da forma abaixo dá erro, pois a referência titular não leva a lugar nenhum. POis criamos apenas uma nova
        // conta, não criamos um novo cliente. Precisa criar um cliente e atribuir

        //definindo o nome de um cliente
        contaDaLidi.titular.nome = "Lidianne";
        System.out.println(contaDaLidi.titular.nome);

    }
}

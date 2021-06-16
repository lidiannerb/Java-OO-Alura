public class TesteSacaNegativo {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        System.out.println(conta.saca(101));

        // abaixo estaríamos atribuindo um valor direto no atributo saldo da conta, o que pode ser lido,
        // mas não é o correto, o correto é invovar os métodos deposita e saca para  que o saldo seja alterado

        /**conta.saldo = conta.saldo -101;
        System.out.println(conta.saldo);*/

        conta.saca(101);
        System.out.println(conta.getSaldo());




    }

}

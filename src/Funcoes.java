public class Funcoes {

    private void helloWorld() {

        System.out.println("Olá, Mundo!");

    }

    private int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Funcoes funcoes = new Funcoes();

        funcoes.helloWorld();

        System.out.println(funcoes.sum(10, 10));


    }
}

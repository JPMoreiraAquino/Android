public class exercicio {

    private String helloWorld(String str) {
        return "A palavra possui " + str.length() + " caracteres";
    }

    private int sum(int n1, int n2) {
        return n1 + n2;
    }

    private double calculo(double x, double y, double z) {
        return ((x + y) * x) / z;
    }

    public static void main(String[] args) {

        exercicio func = new exercicio();

        System.out.println(func.helloWorld("Hello World!"));

        System.out.println(func.sum(2, 2));

        System.out.println(func.calculo(2, 2, 2));











    }
}

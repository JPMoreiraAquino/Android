public class errofunc {

    public static void main(String[] args) {

        try {
            String str = "Java course";
            str.charAt(20);

            String s = null;
            System.out.println(s.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("out of bounds!");
        } catch (NullPointerException e) {
            System.out.println("NullPointer!");
        } catch (Exception e) {
            System.out.println("Erro desconhecido!");
        } finally {
            System.out.println("Hello World!");
        }
    }
}



public class variableSize {
    public static void main(String[] args) {

        double d = 10.232323;
        float f = 100.23232424f;

        long l = 12l;
        Integer i = 100;
        short s = 10;
        byte b = 10;

        System.out.println("  ");
        System.out.println("Double: Max: " + Double.MAX_VALUE + " - Double: " +
                Double.MIN_VALUE);
        System.out.println("Float: Max: " + Float.MAX_VALUE + " - Min: " +
                Float.MIN_VALUE);
        System.out.println("Long: Max: " + Long.MAX_VALUE + " - Long: " +
                Long.MIN_VALUE);
        System.out.println("Integer: Max: " + Integer.MAX_VALUE + " - Min: " +
                Integer.MIN_VALUE);
        System.out.println("Short: Max: " + Short.MAX_VALUE + " - Min: " +
                Short.MIN_VALUE);
        System.out.println("Byte: Max: " + Byte.MAX_VALUE + " - Min: " +
                Byte.MIN_VALUE);

        Byte c = 127;
        System.out.println("Short: Max " + Byte.MAX_VALUE + "- Min: " + Byte.MIN_VALUE);
        System.out.println();
    }
}


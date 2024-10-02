//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Boolean booleanWrapperFromText = Boolean.valueOf("true");
        Byte byteWrapperFromText = Byte.valueOf("120");
        Short shortWrapperFromText = Short.valueOf("32000");
        Integer intWrapperFromText = Integer.valueOf("147895632");
        Long longWrapperFromText = Long.valueOf("987654321987654321");
        Double doubleWrapperFromText = Double.valueOf("4444.5d");
        Float floatWrapperFromText = Float.valueOf("2354.56f");

        System.out.println(booleanWrapperFromText.toString());
        System.out.println(byteWrapperFromText.toString());
        System.out.println(shortWrapperFromText.toString());
        System.out.println(intWrapperFromText.toString());
        System.out.println(longWrapperFromText.toString());
        System.out.println(doubleWrapperFromText.toString());
        System.out.println(floatWrapperFromText.toString());
    }
}

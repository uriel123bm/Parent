public class Main {

    public static final float TAX_CREDIT_VALUE = 1.5F;

    public static void main(String[] args) {
        Parent p1 = new Parent("Shay", "ben marko ");
        p1.addChild("Yossi");
        p1.addChild("Uri");
        p1.addChild("Yahav");
        p1.addChild("Uri");
        p1.addChild("Avihay");
        p1.addChild("Uri");
        System.out.println(p1.hasJunior());
        System.out.println(p1);

        System.out.println(p1.calculateTaxCredits());
    }
}

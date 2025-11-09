package exe1;

public class test {
    public static void main(String[] args) {

        Chargeable c =  new Chargeable();
        laptop c1 = new laptop();
        tablet c2 = new tablet();
        phone c3 = new phone();

        System.out.println(c.charge());
        System.out.println(c1.charge());
        System.out.println(c2.charge());
        System.out.println(c3.charge());
    }
}

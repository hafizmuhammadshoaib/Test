import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StandingOrderSystemTester {
    static int testCount = 0;
    static String test;

    public static void main(String[] args) {
        testInit();
        testUC1();
        testUC2();
    }

    private static void testInit() {
        test = "TEST UC0: Create new system";
        StandingOrderSystem sos = new StandingOrderSystem();
        System.out.println("\n" + test + "\n" + sos);
    }

    // test add product
    public static void testUC1() {
        test = "TEST UC1: Add product";
        testCount++;
        StandingOrderSystem sos = new StandingOrderSystem();
        try {
            sos.addProduct("P1", "Coke");
            System.out.println("\n" + test + "\n" + sos);
            System.out.println("\n test count " + testCount + "\n");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            testCount++;
            sos.addProduct("P1", "Sprite");
            System.out.println("\n" + test + "\n" + sos);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    // test add customer
    public static void testUC2() {
        testCount = 0;
        test = "TEST UC2: Add customer";
        StandingOrderSystem sos = new StandingOrderSystem();
//        successful case
        try {
            testCount++;
            System.out.println("\n test count " + testCount + "\n");
            List<Integer> quantities = new ArrayList<>(Arrays.asList(20, 20, 20, 20, 20, 10, 0));
            sos.addCustomer("C1", "Smith",
                    "A1", "1 Street-1", "Suburb-1", "John", "1111",
                    "ORD1", "P1", "Coke", 1.5, quantities, 1, 100);
            System.out.println("\n" + test + "\n" + sos);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // invalid case for price -1.5
        try {
            testCount++;
            System.out.println("\n test count " + testCount + "\n");
            List<Integer> quantities = new ArrayList<>(Arrays.asList(20, 20, 20, 20, 20, 10, 0));
            sos.addCustomer("C2", "Smith",
                    "A2", "1 Street-1", "Suburb-1", "John", "1111",
                    "ORD2", "P2", "Sprite", -1.5, quantities, 1, 100);
            System.out.println("\n" + test + "\n" + sos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        invalid case of duplicate addressId
        try {
            testCount++;
            System.out.println("\n test count " + testCount + "\n");
            List<Integer> quantities = new ArrayList<>(Arrays.asList(20, 20, 20, 20, 20, 10, 0));
            sos.addCustomer("C3", "Smith",
                    "A2", "1 Street-1", "Suburb-1", "John", "1111",
                    "ORD2", "P2", "Sprite", -1.5, quantities, 1, 100);
            System.out.println("\n" + test + "\n" + sos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        invalid case of duplicate productId

        try {
            testCount++;
            System.out.println("\n test count " + testCount + "\n");
            List<Integer> quantities = new ArrayList<>(Arrays.asList(20, 20, 20, 20, 20, 10, 0));
            sos.addCustomer("C3", "Smith",
                    "A3", "1 Street-1", "Suburb-1", "John", "1111",
                    "ORD2", "P2", "Sprite", 1.5, quantities, 1, 100);
            System.out.println("\n" + test + "\n" + sos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //        invalid case of duplicate orderId

        try {
            testCount++;
            System.out.println("\n test count " + testCount + "\n");
            List<Integer> quantities = new ArrayList<>(Arrays.asList(20, 20, 20, 20, 20, 10, 0));
            sos.addCustomer("C3", "Smith",
                    "A4", "1 Street-1", "Suburb-1", "John", "1111",
                    "ORD1", "P3", "Sprite", 1.5, quantities, 1, 100);
            System.out.println("\n" + test + "\n" + sos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        invalid case of duplicate customerId
        try {
            testCount++;
            System.out.println("\n test count " + testCount + "\n");
            List<Integer> quantities = new ArrayList<>(Arrays.asList(20, 20, 20, 20, 20, 10, 0));
            sos.addCustomer("C1", "Smith",
                    "A5", "1 Street-1", "Suburb-1", "John", "1111",
                    "ORD2", "P4", "Sprite", 1.5, quantities, 1, 100);
            System.out.println("\n" + test + "\n" + sos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package CA242;

public class HospitalPackage {
    public static void main(String[] args) {

        Outpatient out = new Outpatient(
                "Aisha", 20.0, 30.0
        );

        Inpatient in = new Inpatient(
                "Ahmed", 50.0, 100.0, 3
        );

        System.out.println("=== OUTPATIENT BILL ===");
        out.DisplayBill();

        System.out.println();

        System.out.println("=== INPATIENT BILL ===");
        in.DisplayBill();
    }
}

package CA242;

public class Patient {
    protected String Name;
    protected double ConsultFee;

    public Patient(String name, double consultFee) {
        Name = name;
        ConsultFee = consultFee;
    }
}

class Outpatient extends Patient {
    private double LabCharge;

    public Outpatient(String name, double consultFee,
                      double labCharge) {
        super(name, consultFee);
        LabCharge = labCharge;
    }

    public double CalculateBill() {
        return LabCharge + ConsultFee;
    }

    public void DisplayBill() {
        System.out.println("Outpatient Name: " + Name);
        System.out.println("Consultation Fee: " + ConsultFee);
        System.out.println("Lab Charge: " + LabCharge);
        System.out.println("Total Bill: " + CalculateBill());
    }
}

class Inpatient extends Patient {
    private double RoomCharge;
    private int NumberOfDays;

    public Inpatient(String name, double consultFee,
                     double roomCharge, int numberOfDays) {
        super(name, consultFee);
        RoomCharge = roomCharge;
        NumberOfDays = numberOfDays;
    }

    public double CalculateBill() {
        return (NumberOfDays * RoomCharge) + ConsultFee;
    }

    public void DisplayBill() {
        System.out.println("Inpatient Name: " + Name);
        System.out.println("Consultation Fee: " + ConsultFee);
        System.out.println("Room Charge Per Day: " + RoomCharge);
        System.out.println("Number Of Days: " + NumberOfDays);
        System.out.println("Total Bill: " + CalculateBill());
    }

}


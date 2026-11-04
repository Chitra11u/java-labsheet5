interface Printer17 {
    void print();
}

interface Scanner17 {
    void scan();
}

class MultiFunctionMachine17 implements Printer17, Scanner17 {
    private String machineName;
    private String machineId;

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class Labsheet5Q17 {
    public static void main(String[] args) {
        MultiFunctionMachine17 mfm = new MultiFunctionMachine17();
        mfm.setMachineName("OfficePro M200");
        mfm.setMachineId("MFM-987");

        System.out.println("Machine Name: " + mfm.getMachineName());
        System.out.println("Machine ID: " + mfm.getMachineId());
        mfm.print();
        mfm.scan();
    }
}

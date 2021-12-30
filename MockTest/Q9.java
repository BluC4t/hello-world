package MockTest;

public class Q9 {
    public static void main(String[] args) {
        
        Customer obj = new Customer();
        obj.useElectricity(100);

        //Answer A, B
    }
}

class Customer{
    ElectricAccount acct = new ElectricAccount();

    public void useElectricity(double kWh) {
        acct.addKWh(kWh);
    }
}

class ElectricAccount{
    private double kWh;
    private double rate = 0.07;
    private double bill;

    //line n1
    public void addKWh(double kWh){
        this.kWh += kWh;
        this.bill = this.kWh * this.rate;

        System.out.println(bill);
    }

    // public void addKWh(double kWh){
        
    //     if (kWh > 0) {
    //         this.kWh += kWh;
    //         this.bill = this.kWh * this.rate;
    //     }
        

    //     System.out.println(bill);
    // }

    // private void addKWh(double kWh){
        
    //     if (kWh > 0) {
    //         this.kWh += kWh;
    //         this.bill = this.kWh * this.rate;
    //     }
        

    //     System.out.println(bill);
    // }


    // public void addKWh(double kWh){
        
    //     if (kWh > 0) {
    //         this.kWh += kWh;
    //         this.bill = this.kWh * this.rate;
    //     }
        
    //     public void setBill(double kWh) {
    //         bill = kWh * rate;
    //     }
    //     System.out.println(bill);
    // }
}


public class exercise_inheritance {
    public static void main(String[] args) {
        
        
        Q1.Employee empArr [] = new Q1.Employee[3];
        empArr [0] = new Q1().new Employee();
        empArr [1] = new Q1().new CommissionEmployee();
        empArr [2] = new Q1().new Clerk();

        printElements(empArr);
    }

    static void printElements(Q1.Employee empArr []){
        for (int i = 0; i < 3; i++)
        {
            System.out.println("\n\n"+empArr[i].getClass().getSimpleName()); 
            System.out.println(empArr[i]); //calling toString

        }
        
    }
}

class Q1{
    class Employee{
        private String name = "empty";
        private int yearJoined = 000000;
        private double basicSalary = 0;

        Employee(){}

        public String getName(){

            return name;
        }

        public int getYear(){

            return yearJoined;
        }

        public void set(){

        }

        @Override
        public String toString(){
            //or use StringBuilder() to make return string shorter and easier to maintain.
            // StringBuilder sb = new StringBuilder("\nIt works!");
            // sb.append("nName : " + name);
            // sb.append("\nBasic : " + basicSalary);
            // sb.append("\nyear join : " + yearJoined);
            // return sb.toString();

            return "\nIt works!\nName : " + name + "\nBasic : " + basicSalary + "\nyear join : " + yearJoined;
        }

        public double calculateSalary(){
            return 0.0d;
        }

    }

    class CommissionEmployee extends Employee{
        private double grossSale = 0;
        private double commissionRate = 0;
        
        CommissionEmployee(){

        }
        
        public double getCom(){
            return 0.0d;
        }

        public void setCom(){

        }

        @Override
        public String toString(){
            return "\nIt works! Commission \n\nName : "+ super.name + "\nBasic : " + super.basicSalary + "\nyear join : " + super.yearJoined + "\nGross Sale : " + grossSale + "\nCommision rate : " + commissionRate;
        }

        public double calculateSalary(){
            //salary = basic salary + gross sale * commission rate

            return super.basicSalary + grossSale * commissionRate;
            //return salary;
        }
    }


    class Clerk extends Employee{
        private double allowance = 0;
        private int overtimeHour = 0;
        private double overtimeRate = 0;

        
        public Clerk(){

        }

        //getter and setter here
        
        @Override
        public String toString(){
            return "\nIt works! Clerk\n\nName :" + super.name + "\nBasic : " + super.basicSalary + "\nyear join : " + super.yearJoined + "\nAllowance : " + allowance + "\nOvertime Hour : " + overtimeHour + "\nOvertime Rate :" + overtimeRate;
        }

        public double calculateSalary(){
            //salary = basic salary + allowance + overtime pay
            return super.basicSalary + allowance + (overtimeHour * overtimeRate);

            //return 0.0d;
        }
    }
}
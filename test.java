class test{
    public static void main(String[] args) {
        BillPayment bill1 = new BillPayment("Electric", 250, 450);
        
        bill1.getBill_currentUnit();
        bill1.setBill_currentUnit();
        bill1.calculateBill();
        bill1.displayBill();

    }   
}


class BillPayment{
    private String bill_type;
    private int bill_lastUnit;
    private int bill_currentUnit;
    private double bill_result;
    

    public BillPayment(String type, int lastUnit,int currentUnit){
        this.bill_type = type;
        this.bill_lastUnit = lastUnit;
        this.bill_currentUnit = currentUnit;
        
    }
    
    public int getBill_currentUnit(){
        return bill_currentUnit;
    }

    public void setBill_currentUnit(){
        if(bill_lastUnit >= bill_currentUnit){
            System.out.println("Please Insert a correct unit");
        }
    }

    public int calculateUnit(){
        return bill_currentUnit - bill_lastUnit;
    }

    public double calculateBill(){
        if(bill_type == "Water"){
            bill_result = calculateUnit() * 5;
        }if(bill_type == "Electric"){
            bill_result = calculateUnit() * 6;
        }
        return bill_result;
    }

    public void displayBill(){
        System.out.println("My payment bill is : "+ bill_type +"\n"+"The result is : "+ bill_result+"");
    }
}
package excercise;

public class hardware {
    private String partNumber;
    private String description;
    private int quantityOfItem;
    private double pricePerItem;

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityOfItem() {
        return quantityOfItem;
    }

    public void setQuantityOfItem(int quantityOfItem) {
     //   if (quantityOfItem> 0)
      //  {
            this.quantityOfItem = quantityOfItem;
     //   }else{
      //      quantityOfItem=0;
     //   }

    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        //if (pricePerItem> 0) {
            this.pricePerItem = pricePerItem;
     //   }else{
     //       pricePerItem=0.0;
     //   }

    }

    hardware(String partNumber,String description,int quantityOfItem,double pricePerItem ) {
        this.partNumber = partNumber;
        this.description = description;
        this.quantityOfItem = quantityOfItem;
        this.pricePerItem = pricePerItem;

    }
    double getInvoice(){

        double amount=quantityOfItem*pricePerItem;
        return amount;

    }

    public static void main(String[] args) {
        hardware hardware=new hardware("A5544","bIG Black Book",500,250.0);
        hardware hardware1=new hardware("A5542","bIG Pink Book",300,550.0);
        System.out.println(hardware.getInvoice());
        System.out.println(hardware.getQuantityOfItem());
        System.out.println(hardware.getDescription());
        System.out.println(hardware.getPartNumber());
        System.out.println(hardware.getPricePerItem());
        System.out.println("============================");
        System.out.println(hardware1.getQuantityOfItem());
        System.out.println(hardware1.getDescription());
        System.out.println(hardware1.getPartNumber());
        System.out.println(hardware1.getPricePerItem());


    }
}

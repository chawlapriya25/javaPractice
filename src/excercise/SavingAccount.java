package excercise;

public class SavingAccount {
    private double savingBalance=0.0;
    double annualInterest = 0.0;

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    double calculateMonthlyInterest(){
        double MonthlyInterest=(savingBalance*annualInterest)/12;
        savingBalance+=MonthlyInterest;
        return savingBalance;
    }
     double modifyInterestRate(double modify){
        double modify1= modify/100;
        double newMonthlyInterest= ((savingBalance*modify1)/12);
         System.out.printf("Monthly Interest %.2f\n",newMonthlyInterest);
         double newsavingBalance=(newMonthlyInterest*12)+savingBalance;
        return newsavingBalance;


    }
 public static class SavingAccountTest{
     public static void main(String[] args) {
        SavingAccount saver1= new SavingAccount();
        SavingAccount saver2=new SavingAccount();
        saver1.setSavingBalance(2000);
        saver2.setSavingBalance(3000);
         System.out.println("New saving balance with 4% interest for saver1:"+saver1.modifyInterestRate(4));
         System.out.println("New saving balance with 4% interest for saver2:"+saver2.modifyInterestRate(4));
         System.out.println("New saving balance with 5% interest for saver1:"+saver1.modifyInterestRate(5));
         System.out.println("New saving balance with 5% interest for saver2:"+saver2.modifyInterestRate(5));

     }
 }
}


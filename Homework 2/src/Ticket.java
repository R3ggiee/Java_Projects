//Write a class called Ticket that has the following:
//• A protected double field cost and a protected string field time (assume times are stored in a
//format like "2:35 pm")
//• A constructor that sets those variables
//• Getters for those variables
//• A method called isEveningTime that returns true or false depending on whether the time falls in
//the range from 6 to 10 pm.
//• A method called bulkDiscount that takes an integer n and returns the discount for buying n
//tickets. There should be a 10% discount for buying 5 to 9 tickets, and a 20% discount for buying
//10 or more. Otherwise, there is no discount. Return these percentages as integers.
public class Ticket {
    private double cost;
    private String time;
    public Ticket (double cost, String time){
        this.cost=cost;
    }

    public double getCost(){
        return cost;
    }

    public void setCost(double cost){
        this.cost=cost;
    }

    public String getTime(){
        return time;
    }

    public void setTime(String time){
        this.time=time;
    }

    public Integer bulkDiscount(Integer n){
        int total = (int) (cost*n);
        int discount = (int)(cost *n);
        if (n>5 && n<9){
            double conversion = (double) 10 /100;
            discount *= conversion;

        }else if (n>=10){
            double conversion = (double) 20 /100;
            discount *=  conversion;

        }
        else{
            return 0;
        }
        return total-discount;
    }

    public boolean isEveningTime(){
        if(Integer.parseInt(getTime().substring(0,0))>6 && Integer.parseInt(getTime().substring(0,0))<10 ){
            return true;
        }
        else{
            return false;
        }
    }
}

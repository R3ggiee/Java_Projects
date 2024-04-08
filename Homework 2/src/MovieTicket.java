//Write a class called MovieTicket that inherits from the Ticket class of the previous problem. It should
//have the following (in addition to all that it gets from the Ticket class):
//• A private string field called movieName
//• A constructor that sets movieName as well as cost and time
//• A method called afternoonDiscount that returns an integer percentage of 10% if the ticket time
//falls in the range from noon until (but not including) 6 pm. It returns 0 otherwise.
//• Override the bulkDiscount method so that there is a 10% discount for 10 tickets or more and no
//other discounts
public class MovieTicket {
    private String movieName;
    public MovieTicket (String movieName){
        this.movieName=movieName;
    }

    public String getMovieName(){
        return movieName;
    }

    public void setMovieName(String movieName){
        this.movieName=movieName;
    }
}

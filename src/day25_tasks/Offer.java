package day25_tasks;

public class Offer {
    public String companyName, jobTitle;
    public String location;
    public double salary;
    public boolean hasBenefits;
    public boolean hasPTO;
    public boolean isWFH;
    public boolean isFullTime;

    public Offer(String companyName, String jobTitle, String location, double salary, boolean hasBenefits, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.location = location;
        this.salary = salary;
        this.hasBenefits = hasBenefits;
        this.hasPTO = hasPTO; //paid time off
        this.isWFH = isWFH; //work from home
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "Offer{" +
                "companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", hasBenefits=" + hasBenefits +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
/*
Create a custom class named Offer
            Attributes:
                    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime
                Add a constructor that can set all the fields
            Actions:
                toString(): returns the full info of the Offer Object
    2. Create a class named MyOffers:
            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle
            2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
 */


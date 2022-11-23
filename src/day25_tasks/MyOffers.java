package day25_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer("Microsoft","SDET","California",100000,true,true,true,true);
        Offer offer2 = new Offer("CVS","SDET","Maryland",75000,true,false,false,true);
        Offer offer3 = new Offer("Apple","Developer","San Francisco",120000,true,true,true,true);
        Offer offer4 = new Offer("Google Inc","SDET","Texas",95000,false,true,true,false);
        Offer offer5 = new Offer("Samsung","Developer","New York",105000,true,true,false,false);
        Offer offer6 = new Offer("Amazon","SDET","Washington DC",115000,true,false,true,true);
        Offer offer7 = new Offer("Motorola","Developer","California",90000,false,true,true,false);

        Offer[] myOffers = {offer1,offer2,offer3,offer4,offer5,offer6,offer7};


        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p -> !p.location.equals("Washington DC"));

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p-> p.hasPTO==false || p.hasBenefits== false);

        ArrayList<Offer> devOffers = new ArrayList<>(Arrays.asList(myOffers));
        devOffers.removeIf(p-> !p.jobTitle.equals("Developer"));

        ArrayList<Offer> With100K = new ArrayList<>(Arrays.asList(myOffers));
        With100K.removeIf(p->p.salary< 100000);







    }
}

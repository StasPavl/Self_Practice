package day10_day11_tasks;

import java.util.SortedMap;

public class WebsiteAddress {
    public static void main(String[] args) {
        String website = "www.dota2.edu";

        if(website.startsWith("www.") && website.endsWith(".com") ||
                website.startsWith("www.")&& website.endsWith(".edu") ||
                website.startsWith("www.") && website.endsWith(".gov")){
            System.out.println("Website is valid");
        }else{
            System.out.println("Website is invalid");
        }
    }
}

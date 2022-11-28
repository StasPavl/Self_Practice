package day26_tasks.restaraunt;

import java.time.LocalDate;

public class LocalRestaraunt {
    public static void main(String[] args) {
        Restaraunt mariVanna = new Restaraunt("Boris", "Washington Dc", 4);
        Server[] servers = { new Server("Stanislav", 10, 16.5,false, LocalDate.of(2020,12,5)),
                new Server("Alexey",11,15,true,LocalDate.of(2021,2,15)),
                new Server("Samanta",12,15.5,true,LocalDate.of(2019,8,12)),
                new Server("Pavel",13,16,false,LocalDate.of(2017,5,17))};

        mariVanna.hireServer(servers);

        Chef[] chefs = { new Chef("Natalia",14,25,true), new Chef("Galina",15,32,true),
        new Chef("Carlos",16,27.5,false)};

        mariVanna.hireChef(chefs);

        System.out.println(mariVanna);

    }
}
/*
Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information

 */
package day26_tasks.restaraunt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Restaraunt {
    public String owner;
    public String location;
    public int numberOfStars;
    ArrayList<Server> servers = new ArrayList<>();
    ArrayList<Chef> chefs = new ArrayList<>();

    public Restaraunt(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(String name, int employeeID, double hourlyRate, boolean fullTime, LocalDate hire_date) {
        Server server = new Server(name, employeeID, hourlyRate, fullTime, hire_date);
        servers.add(server);
    }

    public void hireServer(Server[] serverArr) {
        servers.addAll(Arrays.asList(serverArr));
    }

    public void hireChef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        Chef chef = new Chef(name, employeeID, hourlyRate, fullTime);
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefsArr) {
        chefs.addAll(Arrays.asList(chefsArr));
    }

    public void terminateChef(int employeeID) {
        chefs.removeIf(p -> p.employeeID == employeeID);
    }
    public void terminateServer(int serverId){
        servers.removeIf(p->p.employeeID == serverId);
    }

    @Override
    public String toString() {
        return "Restaraunt{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number of servers=" + servers.size() +
                ", number of chefs=" + chefs.size() +
                '}';
    }
}

/*
Create a class called Restaurant

	            Attributes:
	                Owner (String), Location (String), numberOfStars (int)
	                Servers (ArrayList of Server objects)
	                Chefs (ArrayList of Chef objects)

                Add a constructor that sets the owner, location, and number of stars.

	            Actions: (all void methods)

	                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
	                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

	                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList

	                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

	                terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef

	                terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server

	                toString(): Return (String) of all the information of a Restaurant object.
	                No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs along side the other information

 */
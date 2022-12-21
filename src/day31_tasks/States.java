package day31_tasks;

import javax.swing.plaf.synth.SynthTableHeaderUI;

public class States {
    private String name, abbreviation, politicalParty, Governor,senator;
    private int population,stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, int stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        if (name==null){
            System.err.println("Name wasnt set up yet");
            System.exit(1);
        }

        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid Name: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        if (abbreviation==null){
            System.err.println("Abbreviation wasnt set up yet");
            System.exit(1);
        }
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation.isEmpty() || abbreviation.isBlank()){
            System.err.println("Invalid Abbreviation: " + abbreviation);
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        if (politicalParty==null){
            System.err.println("Political Party wasnt set up yet");
            System.exit(1);
        }
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty.isEmpty() || politicalParty.isBlank()){
            System.err.println("Invalid Political Party: " + politicalParty);
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        if (Governor==null){
            System.err.println("Governor wasnt set up yet");
            System.exit(1);
        }
        return Governor;
    }

    public void setGovernor(String governor) {
        if (governor.isEmpty() || governor.isBlank()){
            System.err.println("Invalid Governor: " + governor);
            System.exit(1);
        }

        Governor = governor;
    }

    public String getSenator() {
        if (senator==null){
            System.err.println("Senator wasnt set up yet");
            System.exit(1);
        }
        return senator;
    }

    public void setSenator(String senator) {
        if (senator.isEmpty() || senator.isBlank()){
            System.err.println("Invalid Senator: " + senator);
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population<=0){
            System.err.println("Population can not be zero or negative");
            System.exit(1);
        }
        this.population = population;
    }

    public int getStateTax() {
        return stateTax;
    }

    public void setStateTax(int stateTax) {
        if (stateTax< 0 ){
            System.err.println("State Tax can not be negative");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}

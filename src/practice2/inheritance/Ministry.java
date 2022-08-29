package practice2.inheritance;

public class Ministry {
    public static void main(String[] args) {

        HumanResource humanResource = new HumanResource();
        humanResource.name = "Administration";
        humanResource.numOfDirectors = 4;
        humanResource.address = "Newport News";
        humanResource.salary = 140000;
        humanResource.numberOfFemale = 15;
        humanResource.numOfEmployees = 140;
        humanResource.nameOfDirector = "Jash";

        humanResource.hiringEmployee();

        System.out.println(humanResource);

        Procurement procurement = new Procurement();
        procurement.name  = "Contracting";
        procurement.numOfDirectors  = 2;
        procurement.address = "Hampton";
        procurement.salary  = 450000;
        procurement.numberOfFemale  = 20;
        procurement.numOfEmployees  = 140;
        procurement.nameOfDirector  = "Samim ";
        procurement.contract();
        System.out.println(procurement);

        Management management = new Management();

        management.name  = "Financial Management";
        management.numOfDirectors  = 1;
        management.address = "Hampton";
        management.salary  = 350000;
        management.numberOfFemale  = 35;
        management.numOfEmployees  = 140;
        management.nameOfDirector  = "Jaweed";
        management.Salary();
        System.out.println(management);


















    }
}

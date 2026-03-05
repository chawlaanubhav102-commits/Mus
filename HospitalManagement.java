import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    int id;
    String name;
    int age;
    String disease;

    Patient(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    void display() {
        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("----------------------");
    }
}

public class HospitalManagement {

    public static void main(String[] args) {

        ArrayList<Patient> patients = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n1. Add Patient");
            System.out.println("2. Show Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();

                    patients.add(new Patient(id, name, age, disease));
                    System.out.println("Patient Added Successfully!");
                    break;

                case 2:
                    for(Patient p : patients) {
                        p.display();
                    }
                    break;

                case 3:
                    System.out.print("Enter Patient ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;
                    for(Patient p : patients) {
                        if(p.id == searchId) {
                            p.display();
                            found = true;
                        }
                    }

                    if(!found) {
                        System.out.println("Patient Not Found");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
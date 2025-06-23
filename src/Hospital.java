import java.util.Scanner;

public class Hospital {
    //these properties
    String nameOfBaby;
    String hospitalAddress;
    double weightOfBaby;
    int timeOfBirth;
    // public hospital is my constructor
    public Hospital(String nameOfBaby, String hospitalAddress, double weightOfBaby, int timeOfBirth) {
        this.nameOfBaby = nameOfBaby;
        this.hospitalAddress = hospitalAddress;
        this.weightOfBaby = weightOfBaby;
        this.timeOfBirth = timeOfBirth;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Baby Name: ");
        String name  = scanner.nextLine();

        System.out.println("Middle name (optional): ");
        String middleName = scanner.nextLine();

        System.out.println("Surname: ");
        String surname = scanner.nextLine();

        String fullName =name;
        if(!middleName.isEmpty()) {
            fullName += " " + middleName;
        }
        fullName += " " + surname;

        System.out.println("Enter baby weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Time of birth: ");
        int timeOfBirth = scanner.nextInt();

        // Fix nextLine skip issue
        scanner.nextLine(); // Consume leftover newline

        System.out.println("Hospital Address");
        String hospitalAddr = scanner.nextLine();

        //create a hospital record object
        Hospital Record = new Hospital(fullName, hospitalAddr, weight, timeOfBirth);

        System.out.println("\nBaby Record:");
        System.out.println(Record);
    }
    @Override
    public String toString() {
        return "Baby Name: " + nameOfBaby + ", Born at: " + timeOfBirth + ", Weight: " + weightOfBaby + " Kg's, Hospital: " + hospitalAddress;
    }
}

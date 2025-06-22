import java.util.Scanner;

public class Hospital {
    String nameOfBaby;
    String hospitalAddress;
    double weightOfBaby;
    int timeOfBirth;

    public Hospital(String nameOfBaby, String hospitalAddress, double weightOfBaby, int timeOfBirth) {
        this.nameOfBaby = nameOfBaby;
        this.hospitalAddress = hospitalAddress;
        this.weightOfBaby = weightOfBaby;
        this.timeOfBirth = timeOfBirth;
    }
    public static void Main(String[] args) {
        Hospital hospital = new Hospital("Jack Dawson", "123 Main St", 6.7, 1200);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the baby:");
        String nameOfBaby = scanner.nextLine();

        System.out.println(hospital);
    }
}

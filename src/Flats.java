import java.util.Scanner;

public class Flats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the apartment number: ");
        int flatNumber = scanner.nextInt();

        System.out.println("Enter the number of floors in the house: ");
        int floorsCount = scanner.nextInt();

        System.out.println("Enter the number of entrances in the house: ");
        int entrancesCount = scanner.nextInt();

        int flatsPerFloorCount = 4;
        int maxFlatNumber = floorsCount * flatsPerFloorCount * entrancesCount;

        if (flatNumber > maxFlatNumber) {
            System.out.println("Apartments with a number " + flatNumber + " not in this house");
        } else {
            int flatsInOneEntranceCount = floorsCount * flatsPerFloorCount;
            System.out.println("Total apartments in one entrance: " + flatsInOneEntranceCount);

            int floorsAllCount = flatsInOneEntranceCount * entrancesCount;
            System.out.println("Total apartments in the house: " + floorsAllCount);

            int yourEntranceNumber = (int) Math.ceil(flatNumber / (double) flatsInOneEntranceCount);
            System.out.println("Your entrance: " + yourEntranceNumber);

            int yourFloorNumber = (int) Math.ceil(flatNumber / (double) flatsPerFloorCount);
            System.out.println("Your floor: " + (yourFloorNumber - floorsCount * (yourEntranceNumber - 1)));

            int location = flatNumber % flatsPerFloorCount;

            if (location == 1) {
                System.out.println("Your apartment on the left is the nearest one");
            } else if (location == 2) {
                System.out.println("Your apartment is on the far left");
            } else if (location == 3) {
                System.out.println("Your apartment is on the far right");
            } else {
                System.out.println("Your apartment on the right is the nearest one");
            }
        }
    }
}

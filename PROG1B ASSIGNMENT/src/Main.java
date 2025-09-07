import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Series seriesApp = new Series();



        System.out.print("Enter (1) to launch menu or any other key to exit: ");

        String start = sc.nextLine();

        if (!start.equals("1")) {

            System.out.println("Application closed.");

            return;

        }



        while (true) {

            System.out.println("\nPlease select one of the following menu items:");

            System.out.println("(1) Capture a new series");

            System.out.println("(2) Search for a series");

            System.out.println("(3) Update series age restriction");

            System.out.println("(4) Delete a series");

            System.out.println("(5) Print series report - 2025");

            System.out.println("(6) Exit application");

            System.out.print("Your choice: ");



            String choice = sc.nextLine();



            switch (choice) {

                case "1":

                    seriesApp.CaptureSeries();

                    break;

                case "2":

                    seriesApp.SearchSeries();

                    break;

                case "3":

                    seriesApp.UpdateSeries();

                    break;

                case "4":

                    seriesApp.DeleteSeries();

                    break;

                case "5":

                    seriesApp.SeriesReport();

                    break;

                case "6":

                    seriesApp.ExitSeriesApplication();

                    break;

                default:

                    System.out.println("Invalid choice. Please try again.");

            }

        }

    }

}




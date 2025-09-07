import java.util.ArrayList;

import java.util.Scanner;



public class Series {

    private ArrayList<SeriesModel> seriesList = new ArrayList<>();

    public ArrayList<SeriesModel> getSeriesList() {
        return seriesList;
    }

    public void setSeriesList(ArrayList<SeriesModel> seriesList) {

        this.seriesList = seriesList;

    }

    private Scanner sc = new Scanner(System.in);



    // 1. Capture a new series

    public void CaptureSeries() {

        System.out.print("Enter Series ID: ");

        String id = sc.nextLine();



        System.out.print("Enter Series Name: ");

        String name = sc.nextLine();



        String age;

        while (true) {

            System.out.print("Enter Age Restriction (2-18): ");

            age = sc.nextLine();

            if (age.matches("\\d+")) {

                int ageNum = Integer.parseInt(age);

                if (ageNum >= 2 && ageNum <= 18) {

                    break;

                }

            }

            System.out.println("Invalid age restriction. Please enter a number between 2 and 18.");

        }



        System.out.print("Enter Number of Episodes: ");

        String episodes = sc.nextLine();



        seriesList.add(new SeriesModel(id, name, age, episodes));

        System.out.println("Series details have been successfully saved.");

    }



    // 2. Search for a series

    public void SearchSeries() {

        System.out.print("Enter Series ID to search: ");

        String id = sc.nextLine();

        for (SeriesModel s : seriesList) {

            if (s.SeriesId.equalsIgnoreCase(id)) {

                System.out.println("Series Found:\n" + s);

                return;

            }

        }

        System.out.println("No series data could be found.");

    }



    // 3. Update series

    public void UpdateSeries() {

        System.out.print("Enter Series ID to update: ");

        String id = sc.nextLine();

        for (SeriesModel s : seriesList) {

            if (s.SeriesId.equalsIgnoreCase(id)) {

                System.out.print("Enter new Series Name: ");

                s.SeriesName = sc.nextLine();



                String age;

                while (true) {

                    System.out.print("Enter new Age Restriction (2-18): ");

                    age = sc.nextLine();

                    if (age.matches("\\d+")) {

                        int ageNum = Integer.parseInt(age);

                        if (ageNum >= 2 && ageNum <= 18) {

                            s.SeriesAge = age;

                            break;

                        }

                    }

                    System.out.println("Invalid age restriction. Please enter a number between 2 and 18.");

                }



                System.out.print("Enter new Number of Episodes: ");

                s.SeriesNumberOfEpisodes = sc.nextLine();



                System.out.println("✅ Series updated successfully.");

                return;

            }

        }

        System.out.println("No series found with that ID.");

    }



    // 4. Delete series

    public void DeleteSeries() {

        System.out.print("Enter Series ID to delete: ");

        String id = sc.nextLine();

        for (SeriesModel s : seriesList) {

            if (s.SeriesId.equalsIgnoreCase(id)) {

                System.out.print("Are you sure you want to delete this series? (Y/N): ");

                String confirm = sc.nextLine();

                if (confirm.equalsIgnoreCase("Y")) {

                    seriesList.remove(s);

                    System.out.println("Series deleted successfully.");

                } else {

                    System.out.println("Deletion cancelled.");

                }

                return;

            }

        }

        System.out.println("No series found with that ID.");

    }



    // 5. Print series report

    public void SeriesReport() {

        System.out.println("\n📺 TV Series Report - 2025 📺");

        if (seriesList.isEmpty()) {

            System.out.println("No series available.");

        } else {

            for (SeriesModel s : seriesList) {

                System.out.println("----------------------------");

                System.out.println(s);

            }

        }

    }



    // 6. Exit application

    public void ExitSeriesApplication() {

        System.out.println("Exiting application. Goodbye!");

        System.exit(0);

    }

}




package main;

import clase.Mobility;
import factory.FactoryMobility;
import factory.TipAbonament;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nrAbonamente;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numar de abonamente: ");
        nrAbonamente = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < nrAbonamente; i++) {
            System.out.println("Nume: ");
            String nume = scanner.nextLine();

            System.out.println("Data nastere: ");
            String dataNastere = scanner.nextLine();

            System.out.println("Varsta: ");
            int varsta = Integer.parseInt(scanner.nextLine());

            System.out.println("Reducere fidelitate: ");
            float reducereFidelitate = Float.parseFloat(scanner.nextLine());

            System.out.println("Tip abonament dorit (MobilityX / MobilityY / MobilityZ): ");
            String tip = scanner.nextLine();

            System.out.println("Tarif total minute: ");
            float tarifTotalMinute = Float.parseFloat(scanner.nextLine());

            System.out.println("Tarif total GB internet: ");
            float tarifTotalGBInternet = Float.parseFloat(scanner.nextLine());

            System.out.println("Tarif total TV: ");
            float tarifTotalTV = Float.parseFloat(scanner.nextLine());

            FactoryMobility factory = new FactoryMobility(nume, dataNastere, varsta, reducereFidelitate);

            FactoryMobility factoryMobility = new FactoryMobility(nume, dataNastere, varsta, reducereFidelitate);
            Mobility mobility = factoryMobility.creazaAbonament(TipAbonament.valueOf(tip), tarifTotalMinute, 0, 0);
            System.out.println("Abonament creat:");
            System.out.println(mobility.toString());

            System.out.println("Cost total pentru 12 luni: " + mobility.totalCost(12));
            System.out.println();
        }
        scanner.close();

    }
}


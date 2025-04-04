package main;

import clase.MovieTicket;
import clase.Ticket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MovieTicket prototip = new MovieTicket();

        System.out.print("Introduceti numarul de bilete: ");
        int numarBilete = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numarBilete; i++) {
            System.out.println("Introduceti data " + (i + 1) + ": ");
            String data = scanner.nextLine();

            System.out.println("Introduceti ora " + (i + 1) + ": ");
            String ora = scanner.nextLine();

            System.out.println("Introduceti locul ocupat " + (i + 1) + ": ");
            int locOcupat;
            locOcupat = Integer.parseInt(scanner.nextLine());

            Ticket biletNou = prototip.clone(data, ora, locOcupat);
            biletNou.afisareDescriere();
            System.out.println();
        }

        scanner.close();
    }
}
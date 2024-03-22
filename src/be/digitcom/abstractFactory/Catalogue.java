package be.digitcom.abstractFactory;

import be.digitcom.abstractFactory.automobile.Automobile;
import be.digitcom.abstractFactory.scooter.Scooter;

import java.util.Scanner;

public class Catalogue {
    public static int nbAutos = 3;
    public static int nbScooters = 2;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        FabriqueVehicule fabrique;

        Automobile[] autos = new Automobile[nbAutos];
        Scooter[] scooters = new Scooter[nbScooters];

        System.out.println("Voulez-vous utiliser des " +
                "Vehicules electriques (1) ou à essence (2): ");

        String choice = reader.next();

        if (choice.equals("1")) {
            fabrique = new FabriqueVehiculeElectrique();
        } else {
            fabrique = new FabriqueVehiculeEssence();
        }

        for (int index = 0; index < nbAutos; index++) {
            autos[index] = fabrique.creerAutomobile("Standard", "jaune", 6+index, 3.2);
        }
        for (int index = 0; index < nbScooters; index++) {
            scooters[index] = fabrique.creerScooter("Classic", "rouge", 2+index);
        }
        for (Automobile auto : autos) {
            auto.afficheCaracteristiques();
        }
        for (Scooter scooter: scooters) {
            scooter.afficheCaracteristiques();
        }
    }
}

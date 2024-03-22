package be.digitcom.abstractFactory;

import be.digitcom.abstractFactory.automobile.Automobile;
import be.digitcom.abstractFactory.scooter.Scooter;

public interface FabriqueVehicule {
    Automobile creerAutomobile(String modele, String couleur, int puissance, double espace);

    Scooter creerScooter(String modele, String couleur, int puissance);
}

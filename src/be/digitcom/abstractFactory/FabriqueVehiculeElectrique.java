package be.digitcom.abstractFactory;

import be.digitcom.abstractFactory.automobile.Automobile;
import be.digitcom.abstractFactory.automobile.AutomobileElectrique;
import be.digitcom.abstractFactory.scooter.Scooter;
import be.digitcom.abstractFactory.scooter.ScooterElectrique;

public class FabriqueVehiculeElectrique implements FabriqueVehicule {
    @Override
    public Automobile creerAutomobile(String modele, String couleur, int puissance, double espace) {
        return new AutomobileElectrique(modele, couleur, puissance, espace);
    }

    @Override
    public Scooter creerScooter(String modele, String couleur, int puissance) {
        return new ScooterElectrique(modele, couleur, puissance);
    }
}

package be.digitcom.abstractFactory;

import be.digitcom.abstractFactory.automobile.Automobile;
import be.digitcom.abstractFactory.automobile.AutomobileAEssence;
import be.digitcom.abstractFactory.scooter.Scooter;
import be.digitcom.abstractFactory.scooter.ScooterAEssence;

public class FabriqueVehiculeEssence implements FabriqueVehicule {
    @Override
    public Automobile creerAutomobile(String modele, String couleur, int puissance, double espace) {
        return new AutomobileAEssence(modele, couleur, puissance, espace);
    }

    @Override
    public Scooter creerScooter(String modele, String couleur, int puissance) {
        return new ScooterAEssence(modele, couleur, puissance);
    }
}

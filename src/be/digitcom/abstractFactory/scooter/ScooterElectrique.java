package be.digitcom.abstractFactory.scooter;

public class ScooterElectrique extends Scooter {
    public ScooterElectrique(String modele, String couleur, int puissance) {
        super(modele, couleur, puissance);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out.println(
                "Scooter électrique de modele: " + modele +
                        " de couleur: " + couleur + " de puissance: " + puissance
        );
    }
}

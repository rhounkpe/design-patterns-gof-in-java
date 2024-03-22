package be.digitcom.abstractFactory.scooter;

public class ScooterAEssence extends Scooter {
    public ScooterAEssence(String modele, String couleur, int puissance) {
        super(modele, couleur, puissance);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out.println(
                "Scooter à essence de modele: " + modele +
                        " de couleur: " + couleur +
                        " de puissance: " + puissance
        );
    }
}

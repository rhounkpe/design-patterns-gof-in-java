package be.digitcom.abstractFactory;

public class AutomobileAEssence extends Automobile {

    public AutomobileAEssence(String modele, String couleur, int puissance, double espace) {
        super(modele, couleur, puissance, espace);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out.println(
                "Automobile à essence de modele: " + modele +
                        " de couleur: " + couleur + " de puissance: " + puissance +
                        " d'espace: " + espace
        );
    }
}

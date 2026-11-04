package fr.pgah;

import java.awt.*;

public class Yeti extends Bestiole {

    public int movement = 0;

    public Action getAction(BestioleInfo info) {
        movement++;
        if (info.getEnFace() == Voisin.AUTRE) {
            return Action.INFECTER;
        } else if (info.getEnFace() == Voisin.RIEN) {
            return Action.SAUTER;
        } else {
            return Action.DROITE;
        }
    }

    public Color getCouleur() {
        return Color.GRAY;
    }

    public String toString() {
        for (int i = 0; i < 6; i++) {
            return "Y";
        }
        for (int i = 0; i < 6; i++) {
            return "E";
        }
        for (int i = 0; i < 6; i++) {
            return "T";
        }
        for (int i = 0; i < 6; i++) {
            return "I";
        }
    }
}

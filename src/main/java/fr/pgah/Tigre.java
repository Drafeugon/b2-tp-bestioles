package fr.pgah;

import java.awt.*;

public class Tigre extends Bestiole {

    public Action getAction(BestioleInfo info) {
        if (info.getEnFace() == Voisin.AUTRE) {
            return Action.INFECTER;
        } else if (info.getEnFace() == Voisin.MUR) {
            return Action.GAUCHE;
        } else if (info.getADroite() == Voisin.MUR) {
            return Action.GAUCHE;
        } else if (info.getEnFace() == Voisin.MEME) {
            return Action.DROITE;
        } else {
            return Action.SAUTER;
        }
    }

    public Color getCouleur() {
        if (Math.random() < 0.5) {
            return Color.RED;
        } else if (Math.random() < 0.5) {
            return Color.GREEN;
        } else {
            return Color.BLUE;
        }
    }

    public String toString() {
        return "G";
    }
}

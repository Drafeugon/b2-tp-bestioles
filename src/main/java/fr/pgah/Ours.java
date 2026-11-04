package fr.pgah;

import java.awt.*;

public class Ours extends Bestiole {

    boolean polaire;
    private boolean skin = true;

    public Ours(boolean polaire) {
        this.polaire = polaire;
    }

    public Action getAction(BestioleInfo info) {
        skin = !skin;
        if (info.getEnFace() == Voisin.AUTRE) {
            return Action.INFECTER;
        } else if (info.getEnFace() == Voisin.RIEN) {
            return Action.SAUTER;
        } else {
            return Action.GAUCHE;
        }
    }

    public Color getCouleur() {
        if (polaire) {
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }

    public String toString() {
        return skin ? "/" : "\\";
    }
}

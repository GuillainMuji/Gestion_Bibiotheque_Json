package org.example.data;

import java.util.List;

public interface Sauvegardable<T> {
    void sauvegarder(String chemin, List<T> objets);
    List<T> charger(String chemin);
}

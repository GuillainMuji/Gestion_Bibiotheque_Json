package org.example.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class FichierJSON<T> {
    private final Gson gson;
    private final Type type;

    public FichierJSON(Type type) {
        this.type = type;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public void sauvegarder(String chemin, List<T> objets) {
        try (FileWriter writer = new FileWriter(chemin)) {
            gson.toJson(objets, type, writer); // Écrit toute la liste au format JSON valide
        } catch (IOException e) {
            System.out.println("Erreur de sauvegarde JSON : " + e.getMessage());
        }
    }

    public List<T> charger(String chemin) {
        try (FileReader reader = new FileReader(chemin)) {
            return gson.fromJson(reader, type); // Lit une liste complète
        } catch (IOException e) {
            System.out.println("Erreur de chargement JSON : " + e.getMessage());
            return new ArrayList<>();
        } catch (Exception e) {
            System.out.println("Erreur lors du parsing JSON : " + e.getMessage());
            return new ArrayList<>();
        }
    }
}

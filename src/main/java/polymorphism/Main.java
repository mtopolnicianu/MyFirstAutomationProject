package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> pokemonList = new ArrayList<>();
        Pikachu pikachu = new Pikachu();
        Eevee eevee = new Eevee();
        Charizard charizard = new Charizard();

        pokemonList.add(pikachu);
        pokemonList.add(eevee);
        pokemonList.add(charizard);

        for (int i = 0; i < pokemonList.size(); i++) {
            System.out.println(pokemonList.get(i).getAttackValue());
        }
    }
}

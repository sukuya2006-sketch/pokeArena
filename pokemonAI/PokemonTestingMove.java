package pokemonAI;

import java.util.ArrayList;
import java.util.List;

import MovesAndTypecharts.Move;
import MovesAndTypecharts.MoveDatabase;
import MovesAndTypecharts.Type;

public class PokemonTestingMove {

    public static void main(String[] args) {
        // WildPokemonAI ai = new WildPokemonAI();

        // //wild pokemon moves
        // List<Move> moves = new ArrayList<>();

        // moves.add(MoveDatabase.FLAMETHROWER);
        // moves.add(MoveDatabase.TACKLE);
        // moves.add(MoveDatabase.EMBER);

        // int attack = 125; //wild pokemon attack

        // int level = 12; //wild pokemon level

        // int playerDefense = 70; //player defence

        // Type playerType = Type.FIRE; //player pokemon type
        

        // Move chosen = ai.pickMove(moves, attack, level, playerDefense, playerType);

        // System.out.println("best move from the pokemon: " + chosen.getName());

        Pokemon trainer = new Pokemon("Charmander", Type.GRASS, 100, 52, 43,10, List.of(MoveDatabase.EMBER, MoveDatabase.FLAMETHROWER));

        Pokemon player = new Pokemon("Squirtle", Type.WATER, 100, 48, 65,10,List.of(MoveDatabase.WATER_GUN));

        List<Pokemon> bench = new ArrayList<>();
        bench.add(new Pokemon("Bulbasaur", Type.GRASS, 100, 49, 49, 10, List.of(MoveDatabase.VINE_WHIP)));
        bench.add(new Pokemon("Pikachu", Type.ELECTRIC, 100, 55, 40, 10, List.of(MoveDatabase.THUNDERBOLT)));


        TrainerAI ai = new TrainerAI();

        TrainerActions action = ai.pickAction(player, trainer, bench);

        System.out.println("Action: " + action.getChoice());

        if(action.getChoice() == TrainerActions.TrainerChoices.SWITCH){
            System.out.println("Switching to: " + action.getSwitchTo().getName());

        } else {
            System.out.println("Using move: " + action.getMove().getName());
        }
    //     System.out.println("Should switch: " + ai.switchPokemon(player, trainer));
    
}
}
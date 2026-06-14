package pokemonAI;

import java.util.ArrayList;
import java.util.List;
import MovesAndTypecharts.Move;
import MovesAndTypecharts.MoveDatabase;
import MovesAndTypecharts.Type;

public class PokemonTestingMove {

    public static void main(String[] args) {

        WildPokemonAI ai = new WildPokemonAI();

        //wild pokemon moves
        List<Move> moves = new ArrayList<>();

        moves.add(MoveDatabase.FLAMETHROWER);
        moves.add(MoveDatabase.TACKLE);
        moves.add(MoveDatabase.EMBER);

        int attack = 125; //wild pokemon attack

        int level = 12; //wild pokemon level

        int playerDefense = 70; //player defence

        Type playerType = Type.FIRE; //player pokemon type
        

        Move chosen = ai.pickMove(moves, attack, level, playerDefense, playerType);

        System.out.println("best move from the pokemon: " + chosen.getName());
    }
    
}

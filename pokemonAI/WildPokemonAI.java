package pokemonAI;

import MovesAndTypecharts.Move;

import java.util.List;

import MovesAndTypecharts.Type;
import MovesAndTypecharts.Typechart;

public class WildPokemonAI {

    public double Damage(int level, int power, int attack, int defence, double effectiveness){

        return ((((((2*level)/5) + 2) * power * (attack/defence))/50) * effectiveness);
        
    }

    public Move pickMove(List<Move> moves, int attack, int level, int playerDefense, Type playerType) {

        //local variables for score and Move
        Move bestMove = null;
        double bestScore = 0;
        
        for(Move move: moves){
            
            double effectiveness = Typechart.getEffectiveness(move.getPokemonType(), playerType); //gets the pokemons type effectivemness from the chart. (How effective the pokemon move is against players pokemon)

            double score = Damage(level, move.getPower(), attack, playerDefense, effectiveness); //scores each move so that we can get the best move from the set

            score += Math.random() * 40; //adds randomness so the pokemon doesnt run the same move 20 times. Epsilon

            if(score > bestScore){

                bestScore = score;
                bestMove = move;

            } //gets the best move
            
        }

        return bestMove;
    }

}

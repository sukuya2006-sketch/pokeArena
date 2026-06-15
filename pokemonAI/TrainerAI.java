package pokemonAI;
import java.util.List;
import MovesAndTypecharts.Type;
import MovesAndTypecharts.Typechart;
import MovesAndTypecharts.Move;
import pokemonAI.TrainerActions.TrainerChoices;


public class TrainerAI {

    public boolean switchPokemon(Pokemon PlayerPokemon, Pokemon TrainerPokemon){

        Type Player_type = PlayerPokemon.getType();
        
        Type Trainer_type = TrainerPokemon.getType();

        double effectiveness = Typechart.getEffectiveness(Trainer_type, Player_type);

        if (effectiveness <= 0.5 || TrainerPokemon.getHpRatio()<0.3){
            return true;

        }
        else{
            return false;
        }

    }

    public Pokemon pickBestSwitch(List<Pokemon> bench, Pokemon playerPokemon){

        double bestScore = 0;
        Pokemon bestPokemon = null;

        for(Pokemon poke: bench){
            double score = 0;

            double effectiveness = Typechart.getEffectiveness(poke.getType(), playerPokemon.getType());

            score += (effectiveness * 50 + poke.getHpRatio()*30 + poke.getLevel());

            if(score> bestScore){
                bestScore = score;
                bestPokemon = poke;
            }

        }

        return bestPokemon;
    }



    public TrainerActions pickAction(Pokemon PlayerPokemon, Pokemon TrainerPokemon, List<Pokemon> bench){
        
        boolean ShouldSwitch = switchPokemon(PlayerPokemon, TrainerPokemon);

        if(ShouldSwitch){
            Pokemon bestPokemon = pickBestSwitch(bench, PlayerPokemon);
            return new TrainerActions(null, bestPokemon, TrainerChoices.SWITCH);
        }
        else{

            WildPokemonAI ai = new WildPokemonAI();

            Move bestMove = ai.pickMove(TrainerPokemon.getMoves(), TrainerPokemon.getAttack(), TrainerPokemon.getLevel(), PlayerPokemon.getDefense(), PlayerPokemon.getType());

            return new TrainerActions(bestMove, null, TrainerActions.TrainerChoices.FIGHT);

        }
    }
    
    
}

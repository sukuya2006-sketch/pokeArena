package pokemonAI;
import MovesAndTypecharts.Move;


public class TrainerActions {
    public enum TrainerChoices{
        FIGHT,
        SWITCH
    }

    private Move move;
    private Pokemon switchTo;
    private TrainerChoices choice;

    public TrainerActions(Move move, Pokemon switchTo, TrainerChoices choice){
        this.move = move;
        this.switchTo = switchTo;
        this.choice = choice;

    }

    public TrainerChoices getChoice(){ 

        return choice; 
    }
    public Move getMove(){ 
        return move; 
    }

    public Pokemon getSwitchTo(){ 
        return switchTo; 
    }

    





}

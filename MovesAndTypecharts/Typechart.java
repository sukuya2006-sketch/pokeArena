package MovesAndTypecharts;

//Type chart for effectiveness of the pokemon against other pokemon

public class Typechart {

    public static double getEffectiveness(Type moveType, Type defenderType){

        return switch (moveType){

            case FIRE -> switch (defenderType){
                case GRASS -> 2.0;
                case WATER -> 0.5;
                default -> 1.0;
            };

            case WATER -> switch (defenderType) {
                case FIRE -> 2.0;
                case GRASS -> 0.5;
                default -> 1.0;

            };

            case GRASS -> switch (defenderType) {
                case FIRE -> 0.5;
                case WATER -> 2.0;
                default -> 1.0;
            };

            default -> 1.0;

        };
        
    }
    
}

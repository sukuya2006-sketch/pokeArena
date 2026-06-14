package MovesAndTypecharts;

//The pokemon moves we can use and set, dynamic and all. Pokemon gotta catch em all

public class Move {
    
    private String name;
    private Type pokemonType;
    private int power;

    public Move(String name, Type pokemonType, int power){
        this.name = name;
        this.pokemonType = pokemonType;
        this.power = power;
    }

    public Type getPokemonType(){
        return pokemonType;

    }

    public String getName(){
        return name;
    }

    public int getPower(){
        return power;
    }

}  //if you gave me a chance id take it


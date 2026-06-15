package pokemonAI;
import java.util.List;

import MovesAndTypecharts.Move;
import MovesAndTypecharts.Type;

public class Pokemon {

    private String name;
    private Type type;
    private int hp;
    private int attack;
    private int defense;
    private int MaxHp;
    private int level;
    private List<Move> moves;

    public Pokemon(String name, Type type, int hp, int attack, int defense, int level, List<Move> moves) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.MaxHp = hp;
        this.attack = attack;
        this.defense = defense;
        this.moves = moves;
        this.level = level;
    }

    public String getName(){ 
        return name; 
    }

    public int getLevel(){
        return level;
    }

    public Type getType(){ 
        return type; 
    }
    public int getHp(){ 
        return hp; 
    }

    public int getAttack(){ 
        return attack; 
    }
    public int getDefense(){ 
        return defense; 
    }
    public List<Move> getMoves(){ 
        return moves; 
    }
    public double getHpRatio(){ 
        return (double) hp / MaxHp; 
    }

    public boolean isFainted(){ 

        return hp <= 0; 

    }

    public void takeDamage(int amount) {

        this.hp = Math.max(0, this.hp - amount);
    }
}
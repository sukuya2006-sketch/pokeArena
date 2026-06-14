import MovesAndTypecharts.Type;

public class Pokemon {
    String name;
    Type type;
    int hp;
    int attack;
    int defense;

    Pokemon(String name, Type type, int hp, int attack, int defense) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }
}
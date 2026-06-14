package MovesAndTypecharts;

public class MoveDatabase {

    //Normal
    public static final Move TACKLE       = new Move("Tackle", Type.NORMAL, 40);
    public static final Move BODY_SLAM    = new Move("Body Slam",     Type.NORMAL,   85);
    public static final Move HYPER_BEAM   = new Move("Hyper Beam",    Type.NORMAL,  150);
    public static final Move SWIFT        = new Move("Swift",         Type.NORMAL,   60);
    public static final Move DOUBLE_EDGE  = new Move("Double Edge",   Type.NORMAL,  120);

    // FIRE
    public static final Move EMBER        = new Move("Ember",         Type.FIRE,     40);
    public static final Move FLAMETHROWER = new Move("Flamethrower",  Type.FIRE,     90);
    public static final Move FIRE_BLAST   = new Move("Fire Blast",    Type.FIRE,    110);
    public static final Move FIRE_PUNCH   = new Move("Fire Punch",    Type.FIRE,     75);
    public static final Move HEAT_WAVE    = new Move("Heat Wave",     Type.FIRE,     95);

    // WATER
    public static final Move WATER_GUN    = new Move("Water Gun",     Type.WATER,    40);
    public static final Move SURF         = new Move("Surf",          Type.WATER,    90);
    public static final Move HYDRO_PUMP   = new Move("Hydro Pump",    Type.WATER,   110);
    public static final Move AQUA_TAIL    = new Move("Aqua Tail",     Type.WATER,    90);
    public static final Move BUBBLE_BEAM  = new Move("Bubble Beam",   Type.WATER,    65);

    // GRASS
    public static final Move VINE_WHIP    = new Move("Vine Whip",     Type.GRASS,    45);
    public static final Move RAZOR_LEAF   = new Move("Razor Leaf",    Type.GRASS,    55);
    public static final Move SOLAR_BEAM   = new Move("Solar Beam",    Type.GRASS,   120);
    public static final Move LEAF_BLADE   = new Move("Leaf Blade",    Type.GRASS,    90);
    public static final Move ENERGY_BALL  = new Move("Energy Ball",   Type.GRASS,    90);

    // ELECTRIC
    public static final Move THUNDER_SHOCK= new Move("Thunder Shock", Type.ELECTRIC, 40);
    public static final Move THUNDERBOLT  = new Move("Thunderbolt",   Type.ELECTRIC, 90);
    public static final Move THUNDER      = new Move("Thunder",       Type.ELECTRIC,110);
    public static final Move SPARK        = new Move("Spark",         Type.ELECTRIC, 65);
    public static final Move WILD_CHARGE  = new Move("Wild Charge",   Type.ELECTRIC, 90);

    // ICE
    public static final Move ICE_PUNCH    = new Move("Ice Punch",     Type.ICE,      75);
    public static final Move ICE_BEAM     = new Move("Ice Beam",      Type.ICE,      90);
    public static final Move BLIZZARD     = new Move("Blizzard",      Type.ICE,     110);
    public static final Move FROST_BREATH = new Move("Frost Breath",  Type.ICE,      60);
    public static final Move AVALANCHE    = new Move("Avalanche",     Type.ICE,      60);

    // PSYCHIC
    public static final Move CONFUSION    = new Move("Confusion",     Type.PSYCHIC,  50);
    public static final Move PSYBEAM      = new Move("Psybeam",       Type.PSYCHIC,  65);
    public static final Move PSYCHIC_MOVE = new Move("Psychic",       Type.PSYCHIC,  90);
    public static final Move PSYSTRIKE    = new Move("Psystrike",     Type.PSYCHIC, 100);
    public static final Move ZEN_HEADBUTT = new Move("Zen Headbutt",  Type.PSYCHIC,  80);

    // GROUND
    public static final Move MUD_SLAP     = new Move("Mud Slap",      Type.GROUND,   20);
    public static final Move DIG          = new Move("Dig",           Type.GROUND,   80);
    public static final Move EARTHQUAKE   = new Move("Earthquake",    Type.GROUND,  100);
    public static final Move EARTH_POWER  = new Move("Earth Power",   Type.GROUND,   90);
    public static final Move BULLDOZE     = new Move("Bulldoze",      Type.GROUND,   60);

    // FLYING
    public static final Move GUST         = new Move("Gust",          Type.FLYING,   40);
    public static final Move WING_ATTACK  = new Move("Wing Attack",   Type.FLYING,   60);
    public static final Move AIR_SLASH    = new Move("Air Slash",     Type.FLYING,   75);
    public static final Move HURRICANE    = new Move("Hurricane",     Type.FLYING,  110);
    public static final Move AERIAL_ACE   = new Move("Aerial Ace",    Type.FLYING,   60);

    // DARK
    public static final Move BITE         = new Move("Bite",          Type.DARK,     60);
    public static final Move CRUNCH       = new Move("Crunch",        Type.DARK,     80);
    public static final Move DARK_PULSE   = new Move("Dark Pulse",    Type.DARK,     80);
    public static final Move NIGHT_SLASH  = new Move("Night Slash",   Type.DARK,     70);
    public static final Move FOUL_PLAY    = new Move("Foul Play",     Type.DARK,     95);
    
}

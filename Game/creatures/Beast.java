package Game.creatures;

import Game.utils.Dice;

public abstract class Beast extends Creature{

    public Beast(String name, int shieldResistance) {
        super(name, shieldResistance);
    }

    @Override
    public boolean isHeroe(){
        return false;
    }

    @Override
    public int throwDices(){
        return Dice.throwDice(90);
    }
    
    public abstract boolean extraPower();

    public abstract int attackOpponent(Creature character);

    public abstract int defend(Creature character);

    public abstract int getCharacterType();
    
}

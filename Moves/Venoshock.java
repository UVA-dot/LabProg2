package Moves;

import ru.ifmo.se.pokemon.*;
import java.lang.*;

public class Venoshock extends SpecialMove
{
    public Venoshock(){
        super(Type.POISON, 65.0, 1.0);
    }
    @Override
    protected String describe(){
        return "Использует venoshock";
    }
    @Override
    protected void applyOppEffects(Pokemon v1)
    {
        if(v1.getCondition().equals(Status.POISON))
        {
            Effect v2 = new Effect().stat(Stat.DEFENSE, (int) v1.getStat(Stat.DEFENSE) /     2).stat(Stat.SPECIAL_DEFENSE, (int) v1.getStat(Stat.SPECIAL_DEFENSE) / 2).turns(0);
            v1.setCondition(v2);
        }
    }

}
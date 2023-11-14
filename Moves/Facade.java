package Moves;

import ru.ifmo.se.pokemon.*;
import java.lang.*;

public class Facade extends PhysicalMove
{
    public Facade()
    {
        super(Type.NORMAL, 70.0, 1.0);
    }
    @Override
    protected String describe()
    {
        return "Использует facade";
    }
    @Override
    protected void applyOppEffects(Pokemon v1)
    {
        if(v1.getCondition().equals(Status.PARALYZE) || v1.getCondition().equals(Status.BURN) || v1.getCondition().equals(Status.POISON))
        {
            this.power *=2;
        }
    }
}
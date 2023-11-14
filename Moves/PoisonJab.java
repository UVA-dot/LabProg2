package Moves;

import ru.ifmo.se.pokemon.*;
import java.lang.*;

public class PoisonJab extends PhysicalMove
{
    public PoisonJab()
    {
        super(Type.POISON, 80.0, 1.0);
    }
    @Override
    protected String describe()
    {
        return "Использует Poison Jab";
    }
    @Override
    protected void applyOppEffects(Pokemon v1)
    {
        Effect v2 = (new Effect().condition(Status.POISON).chance(0.3));
        v1.setCondition(v2);
    }
}
package Moves;

import ru.ifmo.se.pokemon.*;
import java.lang.*;

public class Bulldoze extends PhysicalMove
{
    public Bulldoze()
    {
        super(Type.GROUND, 60.0, 1.0);
    }
    @Override
    protected String describe()
    {
        return "Использует Bull doze";
    }
    @Override
    protected void applyOppEffects(Pokemon v1)
    {
        Effect v2 = (new Effect()).chance(1.0).stat(Stat.SPEED, -1);
        v1.setCondition(v2);
    }
}
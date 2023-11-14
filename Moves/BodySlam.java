package Moves;

import ru.ifmo.se.pokemon.*;
import java.lang.*;
public class BodySlam extends PhysicalMove
{
    public BodySlam()
    {
        super(Type.NORMAL, 85.0, 1.0);
    }
    @Override
    protected String describe()
    {
        return "Использует Body Slam";
    }
    @Override
    protected void applyOppEffects(Pokemon v1)
    {
        Effect v2 = (new Effect().condition(Status.PARALYZE).chance(0.3));
        v1.setCondition(v2);
    }
}
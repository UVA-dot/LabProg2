package Moves;


import ru.ifmo.se.pokemon.*;
import java.lang.*;

public class IceBeam extends SpecialMove
{
    public IceBeam()
    {
        super(Type.ICE, 90.0, 1.0);
    }
    @Override
    protected String describe()
    {
        return "Использует Ice Beam";
    }
    @Override
    protected void applyOppEffects(Pokemon v1)
    {
        Effect v2 = (new Effect().condition(Status.FREEZE).chance(0.1));
        v1.setCondition(v2);
    }
}
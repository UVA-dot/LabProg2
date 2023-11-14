package Moves;

import ru.ifmo.se.pokemon.*;
import java.lang.*;

public class Growth extends StatusMove
{
    public Growth()
    {
        super(Type.NORMAL, 0.0, 0.0);
    }
    @Override
    protected void applySelfEffects(Pokemon v1)
    {
        Effect v2 = (new Effect()).chance(1.0).stat(Stat.ATTACK, +1).stat(Stat.SPECIAL_ATTACK, +1);
        v1.setCondition(v2);
    }
    @Override
    protected String describe()
    {
        return "Использует growth";
    }
}
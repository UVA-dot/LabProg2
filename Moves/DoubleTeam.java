package Moves;

import ru.ifmo.se.pokemon.*;
import java.lang.*;

public class DoubleTeam extends StatusMove
{
    public DoubleTeam()
    {
        super(Type.NORMAL, 0.0, 1.0);
    }
    @Override
    protected String describe()
    {
        return "Использует Double Team";
    }
    @Override
    protected void applySelfEffects(Pokemon v1)
    {
        Effect v2 = (new Effect()).stat(Stat.EVASION, +1);
        v1.setCondition(v2);
    }
    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2) {
        return true;
    }
}
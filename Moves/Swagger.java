package Moves;

import ru.ifmo.se.pokemon.*;
import java.lang.*;

public class Swagger extends StatusMove
{
    public Swagger()
    {
        super(Type.NORMAL, 0.0, 0.85);
    }
    @Override
    protected void applyOppEffects(Pokemon v1)
    {
        Effect v2 = new Effect().stat(Stat.ATTACK, +2).chance(1.0);
        v1.setCondition(v2);
        v1.confuse();
    }
    @Override
    protected String describe()
    {
        return "Использует swagger";
    }
}
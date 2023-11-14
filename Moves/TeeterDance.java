package Moves;

import ru.ifmo.se.pokemon.*;
import java.lang.*;

public class TeeterDance extends StatusMove
{
    public TeeterDance()
    {
        super(Type.NORMAL, 0.0, 1.0);
    }
    @Override
    protected String describe()
    {
        return "Использует Teeter Dance";
    }
    @Override
    protected void applyOppEffects(Pokemon v1)
    {
        v1.confuse();
    }
}
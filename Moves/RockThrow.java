package Moves;

import ru.ifmo.se.pokemon.*;
import java.lang.*;

public class RockThrow extends PhysicalMove
{
    public RockThrow()
    {
        super(Type.ROCK, 50.0, 0.9);
    }
    @Override
    protected String describe()
    {
        return "Использует Rock Throw";
    }
}
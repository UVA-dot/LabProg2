package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;
import java.lang.*;
public class Poliwhirl extends Poliwag
{
    public Poliwhirl(String name, int lvl)
    {
        super(name, lvl);
        setStats(65, 65, 65, 50, 50, 90);
        setType(Type.WATER);
        addMove(new BodySlam());
    }
}
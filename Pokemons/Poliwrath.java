package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;
import java.lang.*;

public class Poliwrath extends Poliwhirl
{
    public Poliwrath(String name, int lvl)
    {
        super(name, lvl);
        setStats(90, 95, 95, 70, 90, 70);
        setType(Type.WATER, Type.FIGHTING);
        addMove(new PoisonJab());
    }
}
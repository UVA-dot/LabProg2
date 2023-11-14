package Pokemons;

import Moves.IceBeam;
import Moves.Swagger;
import ru.ifmo.se.pokemon.*;
import java.lang.*;
public class Poliwag extends Pokemon
{
    public Poliwag(String name, int lvl)
    {
        super(name, lvl);
        setStats(40, 50, 40, 40, 40, 90);
        setType(Type.WATER);
        setMove(new IceBeam(), new Swagger());
    }

}
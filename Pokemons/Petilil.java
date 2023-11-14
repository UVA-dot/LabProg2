package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;
import java.lang.*;
public class Petilil extends Pokemon
{
    public Petilil(String name, int lvl)
    {
        super(name, lvl);
        setStats(45, 35, 50, 70, 50, 30);
        setType(Type.GRASS);
        setMove(new Growth(), new Swagger(), new Facade());
    }
}
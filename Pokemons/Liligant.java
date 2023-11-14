package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;
import java.lang.*;
public class Liligant extends Petilil
{
    public Liligant(String name, int lvl)
    {
        super(name, lvl);
        setStats(70, 60, 75, 110, 75, 90);
        setType(Type.GRASS);
        addMove(new TeeterDance());
    }
}
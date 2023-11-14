package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;
import java.lang.*;
public class Shuckle extends Pokemon
{
    public Shuckle(String name, int lvl) {
        super(name, lvl);
        setStats(20, 10, 230, 10, 230, 5);
        setType(Type.ROCK, Type.BUG);
        setMove(new Bulldoze(), new Venoshock(), new RockThrow(), new DoubleTeam());
    }
}
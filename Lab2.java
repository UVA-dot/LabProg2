import Pokemons.*;
import ru.ifmo.se.pokemon.*;
import java.lang.*;

public class Lab2
{
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Shuckle("камень", 1);
        Pokemon p2 = new Liligant("трава", 1);
        Pokemon p3 = new Poliwrath("вода", 1);
        Pokemon p4 = new Poliwag("вода лоускилл", 1);
        Pokemon p5 = new Poliwhirl("вода полупокер", 1);
        Pokemon p6 = new Petilil("трава полупокер", 1);
        b.addAlly(p3);
        b.addAlly(p4);
        b.addAlly(p5);
        b.addFoe(p1);
        b.addFoe(p2);
        b.addFoe(p6);
        b.go();
    }
}

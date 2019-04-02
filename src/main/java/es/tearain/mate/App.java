package es.tearain.mate;

import es.tearain.mate.model.Character;
import es.tearain.mate.model.Monster;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Monster monster = new Monster(0, null, 0, 0, 0, 0, false, 0, 0, 0, 0, 0, 0, null, null, 0);
        Character character = new Character(0, null, 0, 0, 0, 0, false, 0, 0, 0, 0, 0, 0, null, null);
        
        monster.setCharisma(12);
        System.out.println(monster.getCharisma());
        
        character.setCharisma(15);
        System.out.println(character.getCharisma());
        
    }
}

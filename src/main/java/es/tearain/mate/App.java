package es.tearain.mate;

import es.tearain.mate.model.Monster;
import es.tearain.mate.model.Player;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Monster monster = new Monster(0, null, 0, 0, 0, 0, false, 0, 0, 0, 0, 0, 0);
        Player player = new Player(0, null, 0, 0, 0, 0, false, 0, 0, 0, 0, 0, 0);
        
        monster.setCharisma(12);
        System.out.println(monster.getCharisma());
        
        player.setCharisma(15);
        System.out.println(player.getCharisma());
        
    }
}

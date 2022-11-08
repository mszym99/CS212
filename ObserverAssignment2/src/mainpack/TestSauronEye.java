package mainpack;
/*
 * Matthew Szymanski
 * CSCD212
 * ObserverAssignment2
 * TestSauronEye code that was provided
 * Output:
 * Witch King knows about -
Hobbits: 1
Elves: 1
Dwarves: 2
Humans: 0

Sauruman knows about -
Hobbits: 1
Elves: 1
Dwarves: 2
Humans: 0

Sauruman was defeated. 

Witch King knows about -
Hobbits: 4
Elves: 2
Dwarves: 2
Humans: 100


 */
public class TestSauronEye {

     public static void main(String[] args) {

          // TODO Auto-generated method stub

          EyeOfSauron eye = new EyeOfSauron();

          BadGuy saruman = new BadGuy(eye, "Sauruman");

          BadGuy witchKing = new BadGuy(eye, "Witch King");

          GoodGuys gg = new GoodGuys(1,1,2,0);

          eye.enemiesSpotted(gg);

          saruman.defeated();

          gg = new GoodGuys(4,2,2,100);

          eye.enemiesSpotted(gg);

    }

}
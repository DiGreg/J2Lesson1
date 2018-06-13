//импортируем все пакеты, классы которых используются в MainClass:
import animals.*;
import obstacles.*;

/*

@author Grishin Dmitriy
@version dated 20.12.17
@link null
*/

public class MainClass {

    public static void main(String[] args) {
        Animal[] zoo = {new Cat("Murzik"), new Hen("Izzy"), new Hippo("Hippopo")};//массив типа Суперкласса из экземпляров Подклассов
        Track track = new Track(80);//объект "трек" длиной 80
        Wall wall = new Wall(3);//объект "стена" высотой 3
        Water waterDistance = new Water(10);//объект "водная дистанция" длиной 10

        for (Animal animal: zoo){//FOREACH к массиву zoo - заставим каждое животное пробежать, прыгнуть или проплыть:
            System.out.println(animal + " say " + animal.voice());//здесь к объекту animal каким-то неявным образом применяется метод toString() из суперкласса Animal
            System.out.println(" run: " + track.doIt(animal));
            System.out.println(" jump: " + wall.doIt(animal));
            System.out.println(" swim: " + waterDistance.doIt(animal));
        }
    }
}
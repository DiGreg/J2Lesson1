package obstacles;

import animals.Animal;//импортируем нужный класс Animal из пакета animals.
//import animals.*; //так импортируется весь пакет animals. Со всеми классами, которые есть в пакете

public class Track {
    private int length;

    public Track(int length){//конструктор устанавливает длину беговой дорожки (трека)
        this.length = length;
    }

    //метод проверки, пробежит ли животное трек длиной length
    //здесь идёт взаимодействие объектов разных классов - в методе класса Track используется метод из класса Animal
    public boolean doIt(Animal animal){
        return animal.run(length);//применяем метод run из класса Animal
    }
}

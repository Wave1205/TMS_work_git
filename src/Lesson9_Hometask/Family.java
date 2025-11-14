package Lesson9_Hometask;

public class Family implements Cloneable {

    String name;
    House house;

    public Family(String name, House house) {
        this.name = name;
        this.house = house;
    }

    //Поверхностное клонирование
  /*@Override
  public Family clone() throws CloneNotSupportedException {
    return (Family) super.clone();
  }*/

    //При поверхностном клонировании
/*Original: 	Browns, Flat
Clone:  	Browns, Flat

Original + new name: 	Browns, Flat
Clone + new name: 	Blacks, Flat

Original + new type of house: 	Browns, Dacha
Clone + new type of house: 	Blacks, Dacha*/

    //Глубокое клонирование
    @Override
    public Family clone() throws CloneNotSupportedException {
        Family newFamily = (Family) super.clone();
        House house = this.house.clone();
        newFamily.house = house;
        return newFamily;
    }

/*Original: 	Browns, Flat
Clone:  	Browns, Flat

Original + new name: 	Browns, Flat
Clone + new name: 	Blacks, Flat

Original + new type of house: 	Browns, Flat
Clone + new type of house: 	Blacks, Dacha*/

}

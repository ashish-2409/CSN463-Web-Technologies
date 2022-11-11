// According to question the 'BlueWhale' should inherit both the Mammals and MarineAnimals class which is not possible
// as java does not allow multiple inheritance

// here instead of multiple inheritance, I did multilevel inheritance which is
// Mammals -> MarineAnimals -> BlueWhale


class Mammals{
    void print(){
        System.out.println("I am mammal");
    }

}
class MarineAnimals extends Mammals{
    void print(){
        System.out.println("I am a marine animal");
    }
    void printParent(){// it prints its immediate parent's print method
        super.print();
    }
}
class BlueWhale extends MarineAnimals{

    void print(){
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }
    void printParent(){// it prints its immediate parent's print method
        super.print();
    }

    void printParentsParent(){// it prints its immediate parent's parent's  print method
        super.printParent();
    }
}
public class Question_1 {
    public static void main(String[] args){
        // creating the objects of the respective classes
        Mammals mammal = new Mammals();
        MarineAnimals marineanimals = new MarineAnimals();
        BlueWhale bluewhale = new BlueWhale();
        mammal.print();// calling the function of Mammals by its object

        marineanimals.print();// calling the function of MarineAnimals by its object

        bluewhale.print();// calling the function of BlueWhale by its object

        bluewhale.printParent();// it calls the function of its immediate parent

        bluewhale.printParentsParent();// it calls the function of its parent's parent

    }
}

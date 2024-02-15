public class DriverAnimalFarm {
    public static void main(String[] args){
Lion lion1 = new Lion("Scar") ;
Sheep sheep1 = new Sheep("Dudule") ;
Corral corral1 = new Corral() ;
corral1.addAnimal1(lion1);
corral1.addAnimal2(sheep1);
corral1.feedAnimals();
corral1.animalScreams();

    }
}

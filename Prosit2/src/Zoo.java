public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }

    public Zoo() {
        animals = new Animal[25];
    }

    void displayZoo(){
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    //Redefinition de la methode toString
    public String toString() {
        return "Nom: " + name + ", Ville: " + city + ", Cages: " + nbrCages ;
    }
}



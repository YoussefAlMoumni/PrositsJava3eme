public class Animal {
    //attributes
    String family;
    String name;
    int age;
    boolean isMammal;

    //ctor parametré
    Animal (String family, String name, int age, boolean isMammal) {
        this.family= family;
        this.name= name;
        this.age= age;
        this.isMammal= isMammal;

    }
    //ctor par defaut
    public Animal() {}

    //Redefinition de la methode toString
    public String toString() {
        return "Famille: " + family + ", Nom: " + name + ", Age: " + age + ", Mammifère: " + isMammal;
    }
}

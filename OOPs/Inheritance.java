package OOPs;
class Pokemon{
    int power;
    String name;
    Pokemon(){

    }
    Pokemon(String name,int power){
        this.name=name;
        this.power=power;
    }
    void print(){
        System.out.println(name+" "+power+"%xp");
    }
}
class StrongPokemon extends Pokemon{
    int speed;
}
class LegendaryPokemon extends Pokemon{
    String ability;
}
class OGPokemon extends LegendaryPokemon{
    char tag;
}
public class Inheritance {
    public static void main(String[] args) {
        OGPokemon dialga = new OGPokemon();
        dialga.power=200;
    }
}

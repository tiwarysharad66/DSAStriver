package introduction.packageintro.staticexamples;

import introduction.Main;

public class main {

    public static void main(String[] args) {
        human sharad = new human(18,"sharad",250000,false);
        human anvesh = new human(18,"anvesh",250000,false);
        System.out.println(sharad.population);
    }
//    this is not dependent on objects
    static void fun(){
        Main obj = new Main();
        obj.greetings();

//        you cant use this here as it require an instance
        //but this function you are using static does not depend on any instance
    }
    //we know something which is not static belongs to an object

    public void greetings(){
        System.out.println("hello");
    }
}


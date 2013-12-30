/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalia;

/**
 *
 * @author javis
 */
public class MyAnimalsList {

    Animals[] list = new Animals[6];

    private int nextIndex = 0;

    public void add(Animals a) {
        if (nextIndex < list.length) {
            list[nextIndex] = a;
            System.out.println("Animals were added at " + nextIndex);
            nextIndex++;

        } else {
            System.out.println("Animals list is full");
        }
    }
}

class testMyAnimalsList {

    public static void main(String[] args) {
        Dog a = new Dog();
        Cat c = new Cat();
        Feline t = new Tiger();
        Hippo h = new Hippo();
        Wolf w = new Wolf();
        Feline l = new Lion();

        MyAnimalsList aList = new MyAnimalsList();

        aList.add(a);
        aList.add(t);
        aList.add(h);
        aList.add(w);
        aList.add(l);
        aList.add(c);

        /**
         * This should prompt a list full notificationS
         */
        aList.add(l);

        //Object class methods
        System.out.println(a.hashCode());
        System.out.println(a.equals(c));
        System.out.println(w.toString());
        System.out.println(h.getClass());
        System.out.println(a.hashCode());
                
    


        
    }

}

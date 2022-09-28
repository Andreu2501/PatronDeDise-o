/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymehod;

import factoryMethod.Dog;
import factoryMethod.DogFactory;

/**
 *
 * @author alfloresr
 */
public class FactoryMehod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dog dog = DogFactory.getDog("pequenio");
        dog.speak();

        dog = DogFactory.getDog("mediano");
        dog.speak();

       
        dog = DogFactory.getDog("grande");
        dog.speak();
    }

}

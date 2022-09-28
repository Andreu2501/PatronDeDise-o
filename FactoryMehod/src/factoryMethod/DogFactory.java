/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

/**
 *
 * @author alfloresr
 */
public class DogFactory {

    public static Dog getDog(String criteria) {
        if (criteria.equals("pequenio")) {
            return new chihuahua();
        } else if (criteria.equals("mediano")) {
            return new cocker();
        } else if (criteria.equals("grande")) {
            return new dalmata();
        }

        return null;
    }

}

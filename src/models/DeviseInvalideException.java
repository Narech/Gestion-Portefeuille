/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author H. Narech
 */
public class DeviseInvalideException extends Exception {
    // constructeur de MonException
    public DeviseInvalideException(String message) {
        // appel au constructeur de Exception
        super (message);
    }
}
   

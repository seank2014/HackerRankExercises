/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwarsinterfacepractice;


public class Enemy implements Character {
    
    public String weapon = "lightsaber";
    
    public Enemy(){
    }
    
    public String getWeapon(){
        return weapon;
    }

    public void attack() {
        System.out.println("The enemey attacks YOU!");

    }

    
    public void heal() {
        System.out.println("The enemy heals himself");
    }
    
    public void weaponDraw(){
        System.out.println("Draw out weapon.");
    }
    
}

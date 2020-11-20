/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan53.rabbit;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan binatang rabbit
 */

public class Rabbit extends Animal {
    private final String color;
    private final String name;

    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.name = name;
        this.color = color;
    }
 
    public String getColor(){
        return color;
    }
    
    public String getName(){
        return name;
    }
}

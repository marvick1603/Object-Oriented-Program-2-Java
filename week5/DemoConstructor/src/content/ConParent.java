/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package content;

/**
 *
 * @author patel
 */
public class ConParent {
    private String name;
    
    public ConParent(){
        this("Dino");
    }
    public ConParent (String name){
        this.name=name;
    }
    public String getname(){
        return this.name;
    }
}

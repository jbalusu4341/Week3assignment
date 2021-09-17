/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktestclass;


public class Books {
    private String name = "JAVA";
    private int quantity = 5;

    public void on(){
        System.out.println("Book (Name =  " +name+ " Quantity = " +quantity+ ") AVAILABLE ");
    }

    public void off(){
        System.out.println("Book (Name = " +name+ " Quantity = " +quantity+ ") NOT AVAILABLE ");
    }
}
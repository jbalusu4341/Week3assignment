/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktestclass;

import java.util.ArrayList;
import java.util.List;

public class BookOrder {
    private List<BookPages> list = new ArrayList<BookPages>();

    public void takeOrder(BookPages bookpages){
        list.add(bookpages);
    }

    public void placeOrder(){
        for(BookPages bookpages : list){
            bookpages.execute();
        }
        list.clear();
    }
}
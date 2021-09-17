/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktestclass;

public class bookNotAvailable implements BookPages{
    private Books book;

    public bookNotAvailable(Books book) {
        this.book = book;
    }

    public void execute(){
        book.off();
    }
}
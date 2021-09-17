/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktestclass;


public class bookTestClass {
    public static void main(String[] args) {
        Books book = new Books();

        bookAvailable available = new bookAvailable(book);
        bookNotAvailable notAvailable = new bookNotAvailable(book);

        BookOrder bookOrder = new BookOrder();

        bookOrder.takeOrder(available);
        bookOrder.takeOrder(notAvailable);

        bookOrder.placeOrder();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktestclass;
public class bookAvailable implements BookPages {
        private Books book;

        public bookAvailable(Books book) {
            this.book = book;
        }

        public void execute(){
            book.on();
        }
}
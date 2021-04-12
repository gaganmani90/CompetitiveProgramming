package dataStructure.linkedList;

import lombok.ToString;

/**
 * @author gagamani
 * @date 9/20/18
 */
@ToString
public class Node {
     int data;
     Node next;
     Node prev;

     public Node(int data){
         this.data = data;
     }

     public String toString() {
          String val = " ";
          Node current = this;
          while(current != null) {
               val += current.data+ " ";
               current = current.next;
          }
          return val.trim();
     }

     public int length() {
          int len = 0;
          Node temp = this;
          while(temp != null) {
               temp = temp.next;
               len++;
          }
          return len;
     }

}

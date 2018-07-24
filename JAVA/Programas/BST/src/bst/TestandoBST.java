/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author Silvia
 */
public class TestandoBST {
    public static void main(String[] args) {
        BST arvore = new BST();
        arvore.insert(5);
        arvore.insert(3);
        arvore.insert(2);
        arvore.insert(8);
        arvore.insert(7);
        arvore.insert(4);
        arvore.insert(9);
       
        arvore.preOrder();
        //Implemente os métodos abaixo para completar o teste
        //arvore.inOrder();
        //arvore.posOrder();
        //Escreva a função contem(int valor) que retorna verdadeiro se o valor pertence a árvore
        //ou falso se não pertence
       // System.out.println(" 3 pertence a árvore: " + arvore.contem(3));
        //System.out.println(" 6 pertence a árvore: " + arvore.contem(6));
        // implemente o método profundidade que retorna a quantidade de níveis que existe na árvore
       //System.out.println("A profundidade da árvore é " +arvore.profundidade());
      //implemente o método size() que retorna a quantidade de nós que há na árvore
       // System.out.println("A quantidade de nós na árvore é " + arvore.size());
        
    }
    
}

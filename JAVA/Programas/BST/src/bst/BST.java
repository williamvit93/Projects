/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Silvia
 */
public class BST {

    //Toda árvore tem nós (node) e o principal nó é a raiz (root)
    private Node root;
    /* Necessidade de criar uma classe chamada nó (node) que armazena um valor e 
     subarvores da esquerda e da direita
     Como não tem uso fora da classe esta classe será criada internamente*/

    private class Node {
        /* Vamos trabalhar apenas com valores inteiros para facilitar a fixação dos conceitos */

        private int valor;
        private Node esquerdo;
        private Node direito;

        //construtor será usado na hora de inserir nós
        // para isso será passado um valor para o nó.
        //óbvio (será) que um valor inserido não terá subarvore esquerda nem direita
        // por esta razão será nulo
        public Node(int valor) {
            this.valor = valor;
            esquerdo = null;
            direito = null;
        }
        //Vantagem de usar classe interna é que a classe principal BST acessa os atributos
        //da classe Node diretamente, então, não há a necessidade de criar outros métodos

        public String toString() {
            return String.valueOf(valor);
        }
    }
// construtor da árvore sempre começa com uma raiz vazia

    public BST() {
        root = null;
    }

    // É necessário que existam regras para inserir valores nas árvores, por isto usaremos
    //a regra padrão de que menor fica à esquerda. Consequentemente, maior ou igual vai para a direita.
    // AH!!!! O usuário não quer saber de detalhes bobos, como onde está guardado a raiz... Ele quer usar 
    //e pronto

    public void insert(int value) {
        //mas o programa precisa saber onde está a raiz para começar a inserção
        root = insert(value, root);
    }

    public Node insert(int valor, Node node) {
        //óbvio, que se a árvore está vazia o primeiro nó será a raiz
        if (node == null) {
            node = new Node(valor);
        } //agora usando a regra que menor vai para a esquerda
        else if (valor < node.valor) {
            node.esquerdo = insert(valor, node.esquerdo);
        } else {
            node.direito = insert(valor, node.direito);
        }
        return node;
    }
     // Após montar a árvore é necessário imprimi-la. Mas, como? 
    //Escrevendo os três métodos e deixando o usuário escolher como ele quer ver a árvore.

     // método Pré-order ou pré ordem
    //raiz, subarvore esquerda, subarvore direita
    public void preOrder() {
        preOrder(root);
        System.out.println("");
    }
     //public void preOrder(Node node){
    //Lembrando o usuario não sabe onde está a raiz

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node + " ");
        preOrder(node.esquerdo);
        preOrder(node.direito);
    }
     // método in-order ou in-ordem
    // subarvore esquerda, raiz, subarvore direita

    //public void inOrder() {
    
     // método pos-order ou pos-ordem
    // subarvore esquerda, subarvore direita, raiz

    //public void posOrder() {
       
    //public boolean contem(int x) {
       
    //public int profundidade() {
      //para facilitar a comparação você poderá usar a função
    //Math.max(profundidade(node.esquerdo), profundidade(node.direito))
    //que retorna o maior valor entre esquerdo e direito

    //public int size() {
    
}

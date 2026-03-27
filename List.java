package Learnen.Lists;

public class List {
    public static void main(String[] args) {
        // Создание несвязанных узлов с помощью конструктора
        Node nodeOne = new Node(1);
        Node nodeTwo = new Node(2);
        Node nodeThree = new Node(3);
        Node nodeFour = new Node(4);
        // Присвоение ссылок head и tail
        Node head = nodeOne;
        Node tail = nodeFour;
        // Cвязывание узлов
        nodeOne.next = nodeTwo;
        nodeTwo.next = nodeThree;
        nodeThree.next = nodeFour;
        // Вывод списка с использованием вспомогательной переменной ref
        Node ref = head;
        while (ref!=null){
            System.out.print(ref.data + " ");
            ref = ref.next;
        }
    }

    static Node insertAtStart(Node newNode, Node head){
        newNode.next = head;
        head = newNode;
        return head;
    }

    static Node insertAtEnd(Node newNode, Node head){
        Node ref = head;
        while(ref.next!=null){
            ref = ref.next;
        }
        ref.next = newNode;
        return head;
    }

    static Node insertAfterNode(Node newNode, Node head, int index){
        // index - индекс узла после которого необходимо осуществить вставку
        Node ref = head;
        for (int i = 0; i < index ; i++) {
            ref = ref.next;
        }
        // переназначение ссылок
        Node temp = ref.next;
        newNode.next = temp;
        ref.next = newNode;
        return head;
    }
}

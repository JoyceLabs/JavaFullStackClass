package com.simplilearn.linkedlist;

public class SinglyLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	/**
	 * This method inserts a new node in the list
	 * 
	 * @param linkedList
	 * @param data,      new value to be inserted in the list
	 * @return linkedList
	 */

	public static SinglyLinkedList insert(SinglyLinkedList linkedList, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		// If it is the first element, make this new node as the head element.
		if (linkedList.head == null)
			linkedList.head = newNode;
		else {
			// Traverse till the last node and then insert this new node.
			Node last = linkedList.head;
			while (last.next != null) {
				last = last.next;
			}
			// Insert the new node @ the last
			last.next = newNode;
		}
		return linkedList;
	}

	/**
	 * This method removes the element from the list
	 * 
	 * @param linkedList
	 * @param dataToBeRemoved
	 * @return
	 */
	public static SinglyLinkedList remove(SinglyLinkedList linkedList, int dataToBeRemoved) {
		Node currentNode = linkedList.head, previous = null;
		// 1. If data to be deleted is the head element
		if (currentNode != null && currentNode.data == dataToBeRemoved) {
			linkedList.head = currentNode.next;
			System.out.println(dataToBeRemoved + " removed");
			return linkedList;
		}
		// 2. If it is any other node other than the head
		while (currentNode != null && currentNode.data != dataToBeRemoved) {
			previous = currentNode;
			currentNode = currentNode.next;
		}

		// If data is found, it should be the current node
		if (currentNode != null) {
			previous.next = currentNode.next;
			System.out.println(dataToBeRemoved + " removed");
		} else {
			System.out.println("Not removed as " + dataToBeRemoved + " is not found");
		}
		return linkedList;
	}
	
	public static void printList(SinglyLinkedList linkedList) {
		Node currentNode = linkedList.head;
		System.out.println("Printing data of Linked list.....");
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		SinglyLinkedList  linkedList = new SinglyLinkedList();
		insert(linkedList, 10);
		insert(linkedList, 20);
		insert(linkedList, 30);
		insert(linkedList, 40);
		printList(linkedList);
		remove(linkedList, 10);
		printList(linkedList);
		remove(linkedList, 30);
		printList(linkedList);
		remove(linkedList, 50);
	}

}

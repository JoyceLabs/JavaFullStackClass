package com.simplilearn.linkedlist;

public class CircularLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	void sortedInsert(int data) {
		// Create new node with the given data
		Node newNode = new Node(data);
		Node current = head;
		// If its the first element, make the new node as head
		if (current == null) {
			newNode.next = newNode;
			head = newNode;
		} else if (current.data >= newNode.data) {
			while (current.next != head) {
				current = current.next;
			}
			current.next = newNode;
			newNode.next = head;
			head = newNode;
		} else {
			while (current.next != head && current.next.data < newNode.data) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}

	public void printList() {
		if (head != null) {
			Node temp = head;
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != head);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 50, 10, 20, 2, 6 };
		CircularLinkedList circularLinkedList = new CircularLinkedList();
		for (int element : arr) {
			circularLinkedList.sortedInsert(element);
		}
		circularLinkedList.printList();
	}

}

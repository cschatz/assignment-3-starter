package edu.mills.cs124.assignment3;


public class Scheduler {
	
	// This nested class is ALREADY COMPLETE.
	private static class TaskNode {
		private String name;
		private int remaining;
		private TaskNode next;
		public TaskNode(String name, int timeNeeded, TaskNode next) {
			this.name = name;
			this.remaining = timeNeeded;
			this.next = next;
		}
		// convenience constructor that sets next to null
		public TaskNode(String name, int timeNeeded) { this(name, timeNeeded, null); }
		
	}
	
	// for a circularly linked list, the only reference we store is the tail
	TaskNode tail = null;
	
	private int sliceTime;  // the maximum amount number of ticks a task can run
							// when it is active  
	// TO DO:
	// Declare any other private variables you decide to create
	
	public Scheduler(int sliceTime) {
		this.sliceTime = sliceTime;
		// TO DO:
		// Initialize any other private variables you decide to create
		
	}
	
	// This method is ALREADY COMPLETE.
	public boolean hasMoreTasks() { 
		return tail != null;
	}
	
	private void removeFirst() {
		// TO DO:
		// Remove the first task from the list
	}
	
	private void rotate() {
		// TO DO:
		// Rotate the list, unless the list is empty
		// (Hint: Read the section on singly linked lists in the book.
		//        Rotating only requires changing one reference.)
	}
	
	public void addTask(String name, int timeNeeded) {
		// TO DO:
		// Add a new TaskNode to the end of the list
	}
	
	public void tick() {
		// TO DO:
		// Update the list to reflect on tick of time passing
		
	}
	
	
	// ==== Methods below here are ALREADY COMPLETE ====
	
	// helper method for toString()
	private String stringHelper(TaskNode node) {
		return node.name + "(" + node.remaining + ")";
	}
	
	public String toString() {
		if (tail == null)
			return "[no tasks]";
		if (tail == tail.next)
			return stringHelper(tail);
		StringBuilder sb = new StringBuilder();
		TaskNode current = tail.next;
		while (current != tail) {
			sb.append(stringHelper(current) + " ");
			current = current.next;
		}
		sb.append(stringHelper(current));
		return sb.toString();
	}

}

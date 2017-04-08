public class Deque <J> implements DequeFace <J> {
    
    private DLLNode <J> _front, _end;

    //sets the front and end pointer to null
    public Deque () {
	_front = null;
	_end = null;
    }

    //if the deque is empty, sets the front and end pointer to a new node with cargo enQVal; if not, sets the node directly preceding the front node to a new node with cargo enQVal and shifts the front pointer to the new node
    public void addFirst (J enQVal) {
	if (isEmpty())
	    _front = _end = new DLLNode <J> (enQVal,null, null);
	else  { 
	    _front.setPrev( new DLLNode <J> (enQVal,null, _front));
	    _front = _front.getPrev(); 
	}
    }

    //if the deque is empty, sets the front and end pointer to a new node with cargo enQVal; if not, set the node directly proceeding the end node to a new node with cargo enQVal and shifts the end pointer to the new node
    public void addLast (J enQVal) {
	if (isEmpty())
	    _front = _end = new DLLNode <J> (enQVal, null, null);
	else {
	    _end.setNext(new DLLNode <J> (enQVal, _end, null));
	    _end = _end.getNext(); 
	}
    } 

    //if the deque is empty, then returns null because there is no first node to remove; if not, sets the front pointer to the node directly proceeding it, gets the cargo of the original front node, and sets it to null
    public J removeFirst () {
	if ( isEmpty() ) {
	    System.out.println("nothing to remove");
	    return null;
	}
	else {
	    _front = _front.getNext();
	    return _front.setPrev(null).getCargo();
		}
    }

    //if the deque is empty, then returns null because there is no last node to remove; if not, sets the end pointer to the node directly preceding it, gets the cargo of the original end node, and sets it to null
      public J removeLast () {
	if ( isEmpty() ) {
	    System.out.println("nothing to remove");
	    return null;
	}
	else {
	    _end = _end.getPrev();
	    DLLNode val = _end.setNext(null):
	    return val.getCargo();
		}
    }

    //returns the cargo of the node that first is pointing to 
    public J pollFirst() {
	return _front.getCargo();
    }

    //returns the cargo of the node that end is pointing to 
    public J pollLast() {
	return _end.getCargo();
    }

    //returns true if deque is empty, false if deque is not
    public boolean isEmpty () {
	return _front == null;
    }

    //loops through the deque until it reaches null, which is when the deque ends and adds each node to the return String
    public String toString () {
	String ret = "FRONT -> ";
	DLLNode <J> temp = _front;
	while (temp != null ){
	    ret += temp.getCargo() + " -> ";
	    temp = temp.getNext();
	}
	return ret + "END";
    } 
    public static void main (String [] args) {
	Deque <String> a = new Deque<String> ();
	
	System.out.println ("adding to front...");
	a.addFirst ("Harry");
	a.addFirst ("Ron");
	a.addFirst ("Hermione");
	System.out.println (a);

	System.out.println ("adding to end...");
	a.addLast ("Hogwarts");
	a.addLast ("Magic");
	System.out.println (a);

	System.out.println("removing from front twice");
	a.removeFirst();
	a.removeFirst();
	System.out.println(a);

	System.out.println("removing from end once");
	a.removeLast();
	System.out.println(a);

	System.out.println("peeking the front");
	System.out.println(a.pollFirst() );

       	System.out.println("peeking the end");
	System.out.println(a.pollLast() );
	    
    }
} 

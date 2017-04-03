public class Deque <J> implements DequeFace <J> {
    
    private DLLNode <J> _front, _end;

    public Deque () {
	_front = null;
	_end = null;
    }

    public void addFirst (J enQVal) {
	if (isEmpty())
	    _front = _end = new DLLNode <J> (enQVal,null, null);
	else  { 
	    _front.setPrev( new DLLNode <J> (enQVal,null, _front));
	    _front = _front.getPrev(); 
	}
    }

    public void addLast (J enQVal) {
	if (isEmpty())
	    _front = _end = new DLLNode <J> (enQVal, null, null);
	else {
	    _end.setNext(new DLLNode <J> (enQVal, _end, null));
	    _end = _end.getNext(); 
	}
    } 
    
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

      public J removeLast () {
	if ( isEmpty() ) {
	    System.out.println("nothing to remove");
	    return null;
	}
	else {
	    _end = _end.getPrev();
	    return _end.setNext(null).getCargo();
		}
    }

    public J pollFirst() {
	return _front.getCargo();
    }

    public J pollLast() {
	return _end.getCargo();
    }
    
    public boolean isEmpty () {
	return _front == null;
    }

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

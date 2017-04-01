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

	System.out.println ("adding to last...");
	a.addLast ("Hogwarts");
	a.addLast ("Magic");
	System.out.println (a); 
    }
} 

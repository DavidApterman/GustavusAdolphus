public interface DequeFace <J> {
    public void addFirst (J enQVal);
    public void addLast (J enQVal);
    public J removeFirst ();
    public J removeLast ();
    public J pollFirst ();
    public J pollLast ();
    public boolean isEmpty (); 

}


public class LinkedList<T> {

    /**
     * Appends the specified element to the end of this list (optional
     * operation).
     *
     * <p>Lists that support this operation may place limitations on what
     * elements may be added to this list.  In particular, some
     * lists will refuse to add null elements, and others will impose
     * restrictions on the type of elements that may be added.  List
     * classes should clearly specify in their documentation any restrictions
     * on what elements may be added.
     *
     * @param item element to be appended to this list
     * @return {@code true}
     * @throws ClassCastException            if the class of the specified element
     *                                       prevents it from being added to this list
     * @throws NullPointerException          if the specified element is null and this
     *                                       list does not permit null elements
     * @throws IllegalArgumentException      if some property of this element
     *                                       prevents it from being added to this list
     */
    public boolean add(T item) {
        //TODO implement this method
    }

    /**
     * Inserts the specified element at the specified position in this list
     * (optional operation).  Shifts the element currently at that position
     * (if any) and any subsequent elements to the right (adds one to their
     * indices).
     *
     * @param position   index at which the specified element is to be inserted
     * @param item element to be inserted
     * @throws ClassCastException            if the class of the specified element
     *                                       prevents it from being added to this list
     * @throws NullPointerException          if the specified element is null and
     *                                       this list does not permit null elements
     * @throws IllegalArgumentException      if some property of the specified
     *                                       element prevents it from being added to this list
     * @throws IndexOutOfBoundsException     if the index is out of range
     *                                       ({@code index < 0 || index > size()})
     */
    public void add(int position, T item) {
        //TODO implement this method
    }

    /**
     * Returns {@code true} if this list contains the specified element.
     * More formally, returns {@code true} if and only if this list contains
     * at least one element {@code e} such that
     * {@code Objects.equals(o, e)}.
     *
     * @param item element whose presence in this list is to be tested
     * @return {@code true} if this list contains the specified element
     * @throws ClassCastException   if the type of the specified element
     *                              is incompatible with this list
     * @throws NullPointerException if the specified element is null and this
     *                              list does not permit null elements
     */
    public boolean contains(T item) {
        //TODO implement this method
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param position index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *                                   ({@code index < 0 || index >= size()})
     */
    public T get(int position) {
        //TODO implement this method
    }

    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present (optional operation).  If this list does not contain
     * the element, it is unchanged.  More formally, removes the element with
     * the lowest index {@code i} such that
     * {@code Objects.equals(o, get(i))}
     * (if such an element exists).  Returns {@code true} if this list
     * contained the specified element (or equivalently, if this list changed
     * as a result of the call).
     *
     * @param item element to be removed from this list, if present
     * @return {@code true} if this list contained the specified element
     * @throws ClassCastException            if the type of the specified element
     *                                       is incompatible with this list
     * @throws NullPointerException          if the specified element is null and this
     *                                       list does not permit null elements
     */
    public boolean remove(T item) {
        //TODO implement this method
    }

    /**
     * Removes the element at the specified position in this list (optional
     * operation).  Shifts any subsequent elements to the left (subtracts one
     * from their indices).  Returns the element that was removed from the
     * list.
     *
     * @return the last element of the list
     * @throws IndexOutOfBoundsException     if the index is out of range
     *                                       ({@code index < 0 || index >= size()})
     */
    public T removeLast() {
        //TODO implement this method
    }

    /**
     * Removes the element at the specified position from the end of the list (optional
     * operation).  Shifts any subsequent elements to the left (subtracts one
     * from their indices).  Returns the head of the list.
     *
     * @param position the index of the item the end of the list to be removed
     * @return the head of the list
     * @throws IndexOutOfBoundsException     if the index is out of range
     *                                       ({@code index < 0 || index >= size()})
     */
    public LinkedList removeFromEnd(int position){
        //TODO implement this method
    }

    /**
     * Shows ListNode as a String, with each object in parentheses separated by “arrows” (->).
     * A ListNode of {1, 2, 3} should return the String "(1) -> (2) -> (3)".
     * @return String representation of the ListNode
     */
    @Override
    public String toString() {
        //TODO implement this method
    }


    public void main(){
        System.out.println("Hello gradle!");
    }

}



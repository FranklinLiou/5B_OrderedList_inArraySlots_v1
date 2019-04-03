// Taken from Mr. Brown Mykolyk's work on piazza.
public interface OrderedList {
	// Return number of elements in the list
    int size();
   
    // Add a value to the list
    void add (int value);
 
    // Retrieve the int at index
    int get (int index);

    // Remove the int at index
    // shifting any elements after it to the left
    // Returns removed value
    int remove (int index);
}
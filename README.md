# Java-Collection-Programs
Java Collection Framework is unlikely any group of individual objects which are represented as a single unit be it of any type is known as the collection of objects.


# Java Collection Interfaces
This repository discusses and provides clean Java program implementations for the following 6 interfaces:

1. **Collection interface**: The `Collection` interface is at the root of the Java Collections Framework hierarchy. It represents a group of objects, known as elements. Collections are used to store, retrieve, manipulate, and communicate aggregate data.

2. **List interface**: The `List` interface extends the `Collection` interface and allows for the storage of elements in a specific order, allowing duplicate elements. Common implementations include `ArrayList` and `LinkedList`.

3. **Queue interface**: The `Queue` interface represents a linear collection of elements in which an element is inserted at one end and removed from the other end. It follows the First-In-First-Out (FIFO) principle. Common implementations include `LinkedList` and `PriorityQueue`.

4. **Deque interface (Double-ended queue)**: The `Deque` interface represents a double-ended queue, which allows elements to be inserted and removed from both ends. It provides more flexibility than a regular queue. Common implementations include `ArrayDeque`.

5. **Set interface**: The `Set` interface represents a collection of unique elements with no duplicate values. Common implementations include `HashSet` and `TreeSet`.

6. **Map interface**: The `Map` interface represents a collection of key-value pairs, where each key is associated with a value. It allows you to store and retrieve values based on their keys. Common implementations include `HashMap` and `TreeMap`.

## Implementation

Each interface mentioned above is discussed in detail in its respective directory, along with clean and well-documented Java program implementations. You can explore these implementations to understand how to use these interfaces effectively in your Java applications.

Feel free to navigate to the specific interface directories for more information and code examples.

We hope you find this repository helpful in understanding and working with these fundamental Java Collection interfaces.




# Java Collection Interfaces and Classes

This repository explores Java's collection interfaces and classes, along with essential operations and concepts for each. Below is a summary of the covered topics:

## ArrayList
- Provides dynamic arrays that resize automatically.
- Add, remove, update elements.
- Remove duplicates, reverse, convert to String.
- Get sub-list.

## LinkedList
- Implements a doubly-linked list.
- Access, add, and change elements.
- Check for element existence.
- Remove all elements.
- Iterate using Iterator.

## Vector
- Provides dynamic arrays (legacy class).
- Adding, removing, replacing elements.
- Check for elements.
- Iterate in reverse.
- Copy elements between vectors.
- Find maximum and minimum elements.

## Stack
- Follows last-in-first-out (LIFO) principle (legacy class).
- Check if empty, search for elements.
- Access the top element.
- Add and remove elements.

## Queue Interface
- Maintains a First-In-First-Out (FIFO) order.
- Implemented by PriorityQueue, LinkedList, and ArrayDeque.

## ArrayBlockingQueue
- A bounded blocking queue backed by an array.
- Access, insert, remove elements.
- Convert to an array or String.

## ArrayDeque
- Implements a re-sizable array with elements added or removed from both ends.
- Add, access, remove elements.
- Iterate through the deque.

## Set Interface
- Represents an unordered collection of unique elements.
- Implemented by HashSet, TreeSet, LinkedHashSet, etc.

## HashSet
- Uses hashing for elements (no guaranteed order).
- Traverse, print, get random elements.
- Find max, min elements.
- Convert List or Array to HashSet.

## Map Interface
- Represents key-value pairs.
- Implemented by HashMap, HashTable, etc.

## HashTable
- Implements a hash table.
- Add, remove, get elements.
- Explain how it works.
- Highlight differences from HashMap.

## HashMap
- Uses hashing for key-value pairs.
- Add, remove, replace elements.
- Sort by value.

For detailed code examples and more information on each topic, please explore the respective directories.

We hope this repository helps you understand and utilize Java's collection framework effectively.


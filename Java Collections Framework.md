# Java Collections Framework — Quick Revision

## Hierarchy
```
Iterable
 └─ Collection
     ├─ List: ArrayList, LinkedList, Vector, Stack
     ├─ Set: HashSet, LinkedHashSet, TreeSet
     └─ Queue: PriorityQueue, ArrayDeque, LinkedList
Map (separate root): HashMap, LinkedHashMap, TreeMap, Hashtable
```

## List
- **ArrayList**: dynamic array, fast random access O(1), slow insert/delete middle O(n), not sync.
- **LinkedList**: doubly linked list, fast insert/delete O(1), slow access O(n), implements Deque too.
- **Vector**: like ArrayList but synchronized (legacy).
- **Stack**: LIFO, extends Vector.

## Set
- **HashSet**: no order, O(1) ops, backed by HashMap, allows one null.
- **LinkedHashSet**: maintains insertion order.
- **TreeSet**: sorted (natural/Comparator), O(log n), backed by TreeMap (Red-Black tree).

## Queue/Deque
- **PriorityQueue**: min-heap by default, O(log n) insert/remove.
- **ArrayDeque**: resizable array, use as stack or queue, faster than Stack/LinkedList.

## Map
- **HashMap**: key-value, no order, O(1) avg, one null key allowed, not sync.
- **LinkedHashMap**: insertion/access order maintained.
- **TreeMap**: sorted by key, O(log n), NavigableMap methods (firstKey, ceilingKey etc).
- **Hashtable**: synchronized, legacy, no null key/value.

## Key Interfaces
- **Comparable**: `compareTo()` — natural ordering, in same class.
- **Comparator**: `compare()` — custom ordering, external class/lambda.
- **Iterator**: hasNext(), next(), remove(). Fail-fast (throws ConcurrentModificationException).
- **ListIterator**: bidirectional, add/set support.

## Concurrent Collections (java.util.concurrent)
- ConcurrentHashMap, CopyOnWriteArrayList, BlockingQueue, ConcurrentLinkedQueue.

## Complexity Cheat Sheet
| Structure     | Add   | Remove | Search | Order |
|---------------|-------|--------|--------|-------|
| ArrayList     | O(1)* | O(n)   | O(n)   | insertion |
| LinkedList    | O(1)  | O(1)   | O(n)   | insertion |
| HashSet/Map   | O(1)  | O(1)   | O(1)   | none |
| LinkedHashMap | O(1)  | O(1)   | O(1)   | insertion |
| TreeSet/Map   | O(log n) | O(log n) | O(log n) | sorted |
| PriorityQueue | O(log n) | O(log n) | O(n) | heap order |

## Common Utility: Collections class
- `sort()`, `reverse()`, `shuffle()`, `max()`, `min()`, `synchronizedList()`, `unmodifiableList()`.

## Arrays vs Collections
- Arrays: fixed size, primitives allowed.
- Collections: dynamic size, only objects (autoboxing for primitives).

## Fail-Fast vs Fail-Safe
- Fail-Fast: ArrayList, HashMap iterators — throw CME on modification.
- Fail-Safe: CopyOnWriteArrayList, ConcurrentHashMap — work on clone, no CME.

## HashMap Internal Working
1. `hashCode()` of key → hash → bucket index.
2. Collision → LinkedList (Java 7) / balanced Tree if bucket >8 entries (Java 8+).
3. Resize when load factor (default 0.75) exceeded — capacity doubles.

## equals() & hashCode() Rule
- Equal objects must have equal hashCode.
- Override both together, else HashMap/HashSet break.

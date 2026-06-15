# Java PriorityQueue (Heap) - Quick Notes

## What is PriorityQueue?
- Java ki `PriorityQueue` by default **Min Heap** hoti hai.
- Smallest element hamesha top (root/head) par hota hai.

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
```

---

## Common Methods

### 1. add(element)
- Element insert karta hai.
- Internally Heapify Up (Sift Up) hota hai.

```java
pq.add(10);
```

Time Complexity: O(log n)

---

### 2. offer(element)
- `add()` jaisa hi kaam karta hai.

```java
pq.offer(20);
```

Time Complexity: O(log n)

---

### 3. peek()
- Top element return karta hai.
- Remove nahi karta.

```java
pq.peek();
```

Empty Queue → `null`

Time Complexity: O(1)

---

### 4. poll()
- Top element remove karke return karta hai.

```java
pq.poll();
```

Empty Queue → `null`

Time Complexity: O(log n)

---

### 5. remove()
- Top element remove karke return karta hai.

```java
pq.remove();
```

Empty Queue → `NoSuchElementException`

Time Complexity: O(log n)

---

### 6. remove(Object o)
- Specific element remove karta hai.

```java
pq.remove(25);
```

---

### 7. size()

```java
pq.size();
```

Queue mein total elements batata hai.

---

### 8. isEmpty()

```java
pq.isEmpty();
```

Queue empty hai ya nahi.

---

## Min Heap Example

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.add(10);
pq.add(5);
pq.add(25);
pq.add(35);

System.out.println(pq.peek()); // 5
System.out.println(pq.poll()); // 5
System.out.println(pq.peek()); // 10
```

---

## Max Heap in Java

```java
PriorityQueue<Integer> maxHeap =
    new PriorityQueue<>(Collections.reverseOrder());
```

Example:

```java
maxHeap.add(10);
maxHeap.add(5);
maxHeap.add(25);

System.out.println(maxHeap.poll()); // 25
```

---

## poll() vs remove()

| Method   | Removes Top? | Empty Queue |
|-----------|--------------|--------------|
| peek()    | ❌ No        | null         |
| poll()    | ✅ Yes       | null         |
| remove()  | ✅ Yes       | Exception    |

---

## Internal Working

### Insertion

```
Insert at End
      ↓
Heapify Up (Sift Up)
```

### Deletion

```
Remove Root
      ↓
Move Last Element to Root
      ↓
Heapify Down (Sift Down)
```

---

## Time Complexity

| Operation      | Complexity |
|----------------|------------|
| add()          | O(log n)   |
| offer()        | O(log n)   |
| poll()         | O(log n)   |
| remove()       | O(log n)   |
| peek()         | O(1)       |
| size()         | O(1)       |
| isEmpty()      | O(1)       |

---

## Easy Revision

```text
peek()   → Dekho
poll()   → Nikalo (null if empty)
remove() → Nikalo (Exception if empty)

Default PQ → Min Heap
Max Heap   → Collections.reverseOrder()
```
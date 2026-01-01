
👉 **instructions + counter questions + practice prompts**
👉 tu isko **practice notebook / Obsidian / LeetCode prep** ke liye use kar sakta hai

---

````md
# 📘 Array Split / Chunking – Practice Question Sheet (JavaScript)

> Definition:
> **“Array ko split karne ka matlab hota hai original array ko tod kar multiple sub-arrays banana, bina string me convert kiye.”**

---

## 🟢 Question 1: Fixed Size Chunking (MOST COMMON)

### Problem Statement
Given an array `arr` and an integer `size`,  
split the array into **sub-arrays of length `size`**.

- Last sub-array ka size chhota ho sakta hai
- Original array mutate nahi hona chahiye

### Input
```js
arr = [1,2,3,4,5,6,7,8]
size = 3
````

### Expected Output

```js
[[1,2,3],[4,5,6],[7,8]]
```

### Constraints

* `1 <= size <= arr.length`
* Array non-empty hai

### Follow-up / Interview Counter Questions

1. Why do we increment `i` by `size` and not by `1`?
2. What is the time complexity?
3. Does `slice()` mutate the original array?
4. Can this be solved without using `slice()`?

---

## 🟢 Question 2: Fixed Size Chunking (WITHOUT INBUILT METHODS)

### Problem Statement

Same as Question 1,
but **you are NOT allowed to use `slice()` or `splice()`**.

### Instructions

* Use only loops
* Use temporary array logic

### Follow-up / Interview Counter Questions

1. Why do we push `temp` only when its length equals `size`?
2. Why do we check `temp.length > 0` at the end?
3. Is this approach more memory efficient?

---

## 🟢 Question 3: Split Array into Even and Odd Sub-Arrays

### Problem Statement

Given an integer array, split it into:

* one array containing **even numbers**
* one array containing **odd numbers**

### Input

```js
[1,2,3,4,5,6]
```

### Output

```js
[[2,4,6],[1,3,5]]
```

### Instructions

* Result must be a **2D array**
* Order must be preserved

### Follow-up / Interview Counter Questions

1. Is this a chunking problem or a partitioning problem?
2. Can we solve this using two pointers?
3. What will be TC and SC?

---

## 🟢 Question 4: Condition Based Split

### Problem Statement

Split an array into two sub-arrays based on a condition:

* elements `< 20`
* elements `>= 20`

### Input

```js
[10, 25, 5, 40, 15]
```

### Output

```js
[[10,5,15],[25,40]]
```

### Follow-up / Interview Counter Questions

1. Can this logic be generalized for any condition?
2. How would you write this using `filter()`?
3. Which approach is better in interviews and why?

---

## 🟢 Question 5: Chunk Array Using `reduce()`

### Problem Statement

Solve **fixed size chunking** using a **functional approach**.

### Instructions

* Use `reduce()`
* No external variables allowed

### Follow-up / Interview Counter Questions

1. Why do we check `i % size === 0`?
2. Is `reduce()` internally looping?
3. Which approach is more readable: loop or reduce?

---

## 🟢 Question 6: Chunk Array Using `splice()`

### Problem Statement

Chunk the array using `splice()`.

### ⚠️ Warning

* This method **mutates the original array**

### Follow-up / Interview Counter Questions

1. Why is `splice()` risky in interviews?
2. What happens if the function is called twice?
3. When is mutation acceptable?

---

## 🟢 Question 7: Sliding Window Based Split

### Problem Statement

Create sub-arrays of size `k` using a **sliding window**.

### Input

```js
arr = [1,2,3,4,5]
k = 3
```

### Output

```js
[[1,2,3],[2,3,4],[3,4,5]]
```

### Follow-up / Interview Counter Questions

1. Difference between chunking and sliding window?
2. Why does sliding window overlap?
3. Which DSA problems use this pattern?

---

## 🟢 Question 8: Split Array at Given Index

### Problem Statement

Split array into two parts at index `idx`.

### Input

```js
arr = [1,2,3,4,5]
idx = 2
```

### Output

```js
[[1,2],[3,4,5]]
```

### Follow-up / Interview Counter Questions

1. Is this divide-and-conquer?
2. Where is this used in recursion?
3. TC and SC?

---

## 🟢 Question 9: Time Complexity Analysis (IMPORTANT)

### Given Methods

| Method               | TC              | Reason           |
| -------------------- | --------------- | ---------------- |
| `slice()`            | `O(k)` → `O(n)` | elements copy    |
| `splice()`           | `O(n)`          | shifting         |
| `reduce()`           | `O(n)`          | single traversal |
| `Array.from + slice` | `O(n)`          | total copy       |

### Interview Counter Questions

1. Why chunking can never be better than O(n)?
2. Which method causes array shifting?
3. Why `slice()` is preferred over `splice()`?

---

## 🟢 Question 10: Choose the Best Approach (Decision Making)

| Approach        | When to Use                |
| --------------- | -------------------------- |
| `slice()` based | ✅ LeetCode / Interview     |
| manual loop     | ✅ When methods not allowed |
| `reduce()`      | Functional programming     |
| `splice()`      | ❌ Avoid unless asked       |

### Final Interview Question

> “Which approach would you choose and why?”

---

## 🔥 Final Interview Takeaway

* JS me array ka **direct `split()` method nahi hota**
* Array split = **logic + loops + slicing**
* Chunking = **Fixed window**
* Sliding window ≠ Chunking

---

✍️ Practice Rule:

* Har question ko **2 ways** me solve karo
* TC / SC bolna habit banao

```

---

bhai ye **pure practice-oriented question sheet** hai 💯  
agar bole to next:
- **same sheet Java / C++**
- **answers-only version**
- **LeetCode mapping ke sath**

bol bhai 🚀
```



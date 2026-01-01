
---

# 🧠 HashMap Practice Problems (Arrays)

## 📗 Level 1 — Basic Frequency Counting

### 1. Count Frequency of Elements

**Problem:**
Given an array of integers, count the frequency of each element and print it.

**Example:**
Input:
`arr = {1, 2, 3, 1, 2, 1}`
Output:

```
1 -> 3  
2 -> 2  
3 -> 1
```

---

### 2. Count Distinct Elements

**Problem:**
Given an array, find the number of distinct elements present in it.

**Example:**
Input: `{1, 2, 2, 3, 4, 4, 4}`
Output:
`Number of distinct elements = 4`

---

### 3. Print Elements Appearing More Than Once

**Problem:**
Find and print all elements that appear more than once in the array.

**Example:**
Input: `{1, 2, 2, 3, 4, 4, 4}`
Output:
`2 4`

---

## ⚙️ Level 2 — Medium Logic Using HashMap

### 4. Find Element with Maximum Frequency

**Problem:**
Find the element with the highest frequency in an array.

**Example:**
Input: `{1, 2, 2, 3, 3, 3, 4}`
Output:
`3 (frequency = 3)`

---

### 5. Find First Repeating Element

**Problem:**
Find the first element that repeats in the array (based on appearance order).

**Example:**
Input: `{10, 5, 3, 4, 3, 5, 6}`
Output:
`5` (since 5 repeats first time)

---

### 6. Check if Two Arrays are Equal (as multisets)

**Problem:**
Check if two arrays contain the same elements with the same frequencies, regardless of order.

**Example:**
Input:
`arr1 = {1, 2, 2, 3}`
`arr2 = {3, 2, 1, 2}`
Output:
`true`

---

## 🧩 Level 3 — Real Interview Style Problems

### 7. Find Intersection of Two Arrays (with frequency)

**Problem:**
Return all common elements between two arrays, considering duplicate frequencies.

**Example:**
Input:
`arr1 = {1, 2, 2, 3, 4}`
`arr2 = {2, 2, 4, 4}`
Output:
`{2, 2, 4}`

---

### 8. Subarray with Given Sum (Using Prefix Sum + HashMap)

**Problem:**
Find a subarray whose elements sum up to a given target.

**Example:**
Input:
`arr = {10, 2, -2, -20, 10}`, `target = -10`
Output:
`Subarray found from index 0 to 3`

---

### 9. Longest Subarray with Sum = 0

**Problem:**
Find the length of the longest subarray whose sum is equal to 0.

**Example:**
Input:
`arr = {15, -2, 2, -8, 1, 7, 10, 23}`
Output:
`Length = 5`

---

### 10. Pair with Given Sum

**Problem:**
Find all pairs of elements that add up to a given target sum.

**Example:**
Input:
`arr = {8, 7, 2, 5, 3, 1}`, `target = 10`
Output:
`(8, 2), (7, 3)`

---

## 💪 Recommended Practice Order

1. Count frequency of each element
2. Print elements appearing more than once
3. Find element with maximum frequency
4. Then move to intersection, subarray-sum, and longest-zero-sum problems

---

Would you like me to add **expected approach + hints** (like one-line idea + key HashMap operation) below each problem so it becomes your “HashMap mini-sheet”?

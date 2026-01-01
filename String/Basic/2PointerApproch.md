# 📘 String Word Problems – 2 Pointer Approach (Practice Set)

> ⚠️ Rules:
> - Use two pointers: i (start), j (end)
> - No split()
> - No extra array
> - Use charAt()
> - Handle multiple spaces

---

## 🧠 2 Pointer Mental Model (IMPORTANT)

- `i` → points to start of word
- `j` → moves forward to scan characters
- When `j` hits space OR end → word [i, j) complete
- Process word
- Move `i = j + 1`

---

## ✅ Question 1: Count Words (2 Pointer)

### Problem:
Count total number of words in a string.

### Example:
Input:
"I Love Java Programming"

Output:
4

### Hint:
- Skip spaces using `i`
- When a non-space starts, increment count
- Move `j` till space or end

---

## ✅ Question 2: Length of Longest Word (2 Pointer)

### Problem:
Return length of the longest word.

### Example:
Input:
"I Love Java Programming"

Output:
11

### Hint:
- `len = j - i`
- Update `maxLen`
- Move to next word

---

## ✅ Question 3: Print the Longest Word (2 Pointer)

### Problem:
Print the word with maximum length.

### Example:
Input:
"I Love Java Programming"

Output:
Programming

### Hint:
- Track:
  - maxLen
  - maxStartIndex
- Print using loop from `maxStartIndex`

---

## ✅ Question 4: Print Each Word with Its Length (2 Pointer)

### Problem:
Print each word along with its length.

### Example:
Input:
"I Love Java"

Output:
I -> 1  
Love -> 4  
Java -> 4  

### Hint:
- For each word:
  - print characters from `i` to `j-1`
  - print length = `j - i`

---

## ✅ Question 5: Print Smallest Word (2 Pointer)

### Problem:
Print the smallest length word.

### Example:
Input:
"I Love Java Programming"

Output:
I

### Hint:
- Initialize `minLen = Integer.MAX_VALUE`
- Update min when `j - i < minLen`

---

## 🧪 Edge Cases to Test:
- "   I   Love   Java   "
- "Java"
- ""
- "   "

---

## 🎯 Interview Line (Golden):

> "I traverse the string using two pointers where one marks the start of a word and the other expands to find its end, allowing me to process each word efficiently."

---

## 🚀 Why 2 Pointer is Better?

| Method | Complexity | Cleanliness |
|------|------------|-------------|
| char-by-char | O(n) | Medium |
| 2 pointer | O(n) | 🔥 Very clean |
| split() | O(n) + memory | ❌ Avoid in interviews |

---

Master this pattern →  
Strings ke **80% word problems solved** 💪🔥

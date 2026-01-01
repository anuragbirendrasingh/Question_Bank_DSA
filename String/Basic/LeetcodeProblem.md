# 📘 String Word Problems → LeetCode Mapping (2 Pointer / Traversal)

---

## 🟢 Pattern 1: Word Count / Word Detection

### 🔹 Basic Task:
Count words in a string

### 🔸 LeetCode:
🟦 **434. Number of Segments in a String**

### 🔑 Concept:
- Word starts after space
- Multiple spaces handle
- End-of-string edge case

### 🧠 Interview Skill:
Word boundary detection

---

## 🟢 Pattern 2: Longest Word / Max Length

### 🔹 Basic Task:
Find length of longest word

### 🔸 LeetCode:
🟦 **1455. Check If a Word Occurs As a Prefix**
🟦 **58. Length of Last Word** (subset logic)

### 🔑 Concept:
- Count characters
- Reset on space
- Max comparison at word END

---

## 🟢 Pattern 3: Print Longest Word

### 🔹 Basic Task:
Print the longest word

### 🔸 LeetCode:
🟦 **720. Longest Word in Dictionary**
🟦 **524. Longest Word in Dictionary through Deleting**

### 🔑 Concept:
- Track start index
- Track max length
- Extract word using indices

---

## 🟢 Pattern 4: Each Word Processing

### 🔹 Basic Task:
Print each word with length / transform words

### 🔸 LeetCode:
🟦 **557. Reverse Words in a String III**
🟦 **1859. Sorting the Sentence**

### 🔑 Concept:
- Process each word independently
- Use start/end pointers

---

## 🟢 Pattern 5: Last / Smallest Word

### 🔹 Basic Task:
Last word / smallest word length

### 🔸 LeetCode:
🟦 **58. Length of Last Word**
🟦 **2114. Maximum Number of Words Found in Sentences**

### 🔑 Concept:
- Backward traversal OR
- Forward traversal with reset

---

## 🟢 Pattern 6: Multiple Spaces Handling

### 🔹 Basic Task:
Ignore extra spaces

### 🔸 LeetCode:
🟦 **151. Reverse Words in a String**

### 🔑 Concept:
- Skip spaces
- Controlled pointer movement

---

## 🧠 MASTER PATTERN SUMMARY

| Pattern | Technique |
|------|----------|
| Word start | prev space / skip spaces |
| Word end | next space / end index |
| Count | j - i |
| Compare | at word END |
| Extract | startIndex + length |

---

## 🎯 Interview Golden Line:

> “Most string word problems can be reduced to detecting word boundaries using two pointers and processing each word independently.”

---

## 🚀 Suggested Practice Order (IMPORTANT)

1️⃣ 434  
2️⃣ 58  
3️⃣ 557  
4️⃣ 151  
5️⃣ 720  



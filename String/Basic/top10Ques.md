
---

# 📄 JAVA SENTENCE QUESTIONS SHEET (NO `split()`)

## ⚠️ Instructions (Interview Rules)

* ❌ `split()` use **mat** karna
* ❌ regex **mat** use karna
* ✅ `charAt()` + loop only
* ✅ `i-1` / `i+1` **safe conditions ke saath**

---

## 🔹 Q1. Count number of words in a sentence

**Input**

```
"I   love   Java programming"
```

**Output**

```
4
```

**Hint**
👉 Word **START condition** use karo

---

## 🔹 Q2. Print each word on a new line

**Input**

```
"Java is very powerful"
```

**Output**

```
Java
is
very
powerful
```

**Hint**
👉 Word build karo
👉 Word **END pe print**

---

## 🔹 Q3. Find length of longest word

**Input**

```
"I love Java programming"
```

**Output**

```
11
```

**Hint**
👉 `currLen++` jab char != space
👉 Word END pe `maxLen update`

---

## 🔹 Q4. Count words starting with a vowel

**Input**

```
"I enjoy learning algorithms"
```

**Output**

```
3
```

**Hint**
👉 Word START pe first character check karo
👉 `a e i o u`

---

## 🔹 Q5. Capitalize first letter of every word

**Input**

```
"i love java"
```

**Output**

```
I Love Java
```

**Hint**
👉 Word START pe `Character.toUpperCase()`

---

## 🔹 Q6. Reverse each word (sentence order same)

**Input**

```
"I love Java"
```

**Output**

```
I evol avaJ
```

**Hint**
👉 Word build karo
👉 END pe reverse print

---

## 🔹 Q7. Remove extra spaces (single space only)

**Input**

```
"  Java   is    awesome  "
```

**Output**

```
"Java is awesome"
```

**Hint**
👉 Space tab hi add karo jab
👉 previous char space na ho

---

## 🔹 Q8. Find number of words with length > 3

**Input**

```
"I love Java programming"
```

**Output**

```
2
```

**Hint**
👉 Word length count
👉 END pe condition check

---

## 🔹 Q9. Print first and last character of each word

**Input**

```
"Java is fun"
```

**Output**

```
J a
i s
f n
```

**Hint**
👉 Word START index store
👉 Word END index use

---

## 🔹 Q10. Find shortest word length

**Input**

```
"I love Java"
```

**Output**

```
1
```

**Hint**
👉 First word se `minLen` initialize karo
👉 END pe compare

---

## 🧠 MASTER TEMPLATE (yaad rakh bhai)

```java
for (int i = 0; i < s.length(); i++) {

    if (s.charAt(i) != ' ' &&
        (i == 0 || s.charAt(i - 1) == ' ')) {
        // WORD START
    }

    if (s.charAt(i) != ' ' &&
        (i == s.length() - 1 || s.charAt(i + 1) == ' ')) {
        // WORD END
    }
}
```

---

## 🎯 Interview Confidence Line

> “I handle sentence problems by detecting word boundaries using character index checks instead of splitting the string.”

---


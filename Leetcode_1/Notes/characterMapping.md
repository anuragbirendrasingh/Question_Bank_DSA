# Character Mapping – Short Notes (DSA)

## 📌 What is Character Mapping?

Character mapping means **converting characters into numbers** based on a fixed rule.
Most common rule in DSA problems:

```
'a' → 1
'b' → 2
...
'z' → 26
```

---

## 🧠 Core Formula (MOST IMPORTANT)

```java
int value = ch - 'a' + 1;
```

### Why this works?

* Characters are stored as ASCII values
* `'a'` is the base
* Subtracting `'a'` gives zero-based index
* `+1` converts it to 1-based position

Example:

```
'ch' = 'c'
'c' - 'a' = 2
2 + 1 = 3
```

---

## 🔁 Mapping Characters in a String

```java
for (int i = 0; i < s.length(); i++) {
    int value = s.charAt(i) - 'a' + 1;
}
```

Used when:

* String → Number conversion
* Alphabet based encoding
* LeetCode string-digit problems

---

## ⚠️ Important Case: Two-Digit Values (10–26)

Some problems **do NOT want 26 as a whole number**.
They want digit-wise sum:

```
26 → 2 + 6
24 → 2 + 4
```

### Correct Handling

```java
if (value >= 10) {
    sum += value / 10;
    sum += value % 10;
} else {
    sum += value;
}
```

---

## 🔢 Common Follow-up: Digit Sum

Used after character mapping

```java
public static int sumOfDigit(int n) {
    int sum = 0;
    while (n > 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}
```

---

## 🧩 Pattern Where Character Mapping Appears

✔ String → Number transformation
✔ Repeated digit sum problems
✔ Digital Root / Happy Number
✔ LeetCode 1945, 258, 202

---

## 🏷️ Pattern Name (Interview Ready)

> **Repeated Transformation with Character Mapping**

---

## 🧠 Mental Model (1 Line)

> Convert characters to numbers → break into digits → repeatedly apply digit sum

---

## 🚀 Interview Tip

If interviewer asks:

> *How do you convert characters to numbers?*

Say:

> “I use character arithmetic: `ch - 'a' + 1`, which gives alphabetical position.”

---

## ✅ Revision Checklist

* [ ] `ch - 'a' + 1` formula
* [ ] Two-digit handling (10–26)
* [ ] Digit sum logic
* [ ] Repeated transformation pattern

---

💡 *These notes apply to multiple LeetCode problems. Keep revising!*

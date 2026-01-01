ठीक है भाई Anu ❤️🔥
अब मैं तुम्हें **पूरे Fixed-Size Sliding Window के सभी important interview questions** एकदम सुंदर, clean, well-organized **Markdown (.md)** format में दे रहा हूँ — बिल्कुल notes जैसा।

✔️ हर question →

* Short description
* Expected approach
* Related LeetCode / Codeforces problem
* ⭐ Mark = बहुत बार पूछे जाने वाले
* 🆕 Mark = तुमने अभी तक नहीं किया

---

# 📘 **Fixed Size Sliding Window – Complete Interview Sheet**

## 📌 **1. Summary Table (All Important Questions)**

| #  | Question                                               | Level  | ⭐  | 🆕 | Approach        | Related Problem      |
| -- | ------------------------------------------------------ | ------ | -- | -- | --------------- | -------------------- |
| 1  | Maximum Sum Subarray of Size K                         | Easy   | ⭐  |    | Sliding Window  | LeetCode 643         |
| 2  | Minimum Sum Subarray of Size K                         | Easy   |    | 🆕 | Sliding Window  | (Similar to LC 643)  |
| 3  | Maximum Average Subarray of Size K                     | Easy   | ⭐  | 🆕 | Window + avg    | LeetCode 643         |
| 4  | First Negative Number in Every Window K                | Medium | ⭐  | 🆕 | Deque           | GFG Famous Q         |
| 5  | Count Distinct Elements in Window K                    | Medium | ⭐  | 🆕 | HashMap         | GFG, CF #subsegments |
| 6  | Maximum Element in Every Window K                      | Hard   | ⭐  | 🆕 | Monotonic Deque | LeetCode 239         |
| 7  | Minimum Element in Every Window K                      | Hard   |    | 🆕 | Deque           | LC 239 variation     |
| 8  | Count Anagram Occurrences (window size = pattern size) | Medium | ⭐  | 🆕 | HashMap + win   | LeetCode 438         |
| 9  | All Windows Where Sum = Target                         | Medium | 🆕 |    | Window sliding  | CF problems          |
| 10 | Max Product Subarray of Size K                         | Medium | 🆕 |    | Running product | —                    |
| 11 | Windows Whose Sum % X == 0                             | Medium | 🆕 |    | Modulo + win    | —                    |
| 12 | Top-K Windows with Max Sum                             | Hard   | ⭐  | 🆕 | Max-Heap        | —                    |
| 13 | Maximum Consecutive Ones in Window K                   | Easy   |    | 🆕 | Count zeros     | LeetCode 1004        |
| 14 | Sum of Every Window of Size K (Return list)            | Easy   |    |    | Simple window   | —                    |
| 15 | Window With Largest Sum AND return its index           | Easy   | ⭐  |    | Win + tracking  | —                    |

---

# 📘 **2. Detailed Notes + Example for Each Question**

---

## **1️⃣ Maximum Sum Subarray of Size K** ⭐

**Approach:** Sliding window
**Example:** [2,3,1,5], k=2 → max = 6
**LeetCode:** 643

```java
int sum=0;
for (int i=0;i<k;i++) sum+=arr[i];
int ans=sum;

for(int i=k;i<n;i++){
    sum += arr[i] - arr[i-k];
    ans = Math.max(ans,sum);
}
```

---

## **2️⃣ Minimum Sum Subarray of Size K** 🆕

Same as above, बस `Math.min()`।

---

## **3️⃣ Maximum Average Subarray of Size K** ⭐🆕

LeetCode 643 same
Just return: `ans / (double) k;`

---

## **4️⃣ First Negative Number in Every Window of Size K** ⭐🆕

**Approach:** Queue/Deque
**Logic:** Window में negative numbers का index रखो।
**GFG के top questions में से एक**

---

## **5️⃣ Count Distinct Elements in Every Window K** ⭐🆕

**Approach:** HashMap
**Example:** [1,2,1,3,4], k=3 → → [2,3,3]

---

## **6️⃣ Maximum Element in Every Window K** ⭐⭐⭐ VERY IMPORTANT

**Approach:** Monotonic Deque
**LeetCode:** 239 (super important)

➡️ कंपनी वाले पूछते हैं:
“Can you do max in O(n)? No sorting allowed.”

---

## **7️⃣ Minimum Element in Window K** 🆕

Same as above but reverse monotonic logic.

---

## **8️⃣ Count Anagram Occurrences (Pattern Size Window)** ⭐

**LeetCode:** 438
**Approach:**
Pattern freq == window freq → count++

Interviewers love this one.

---

## **9️⃣ All Windows Where Sum = Target** 🆕

Window slides only when `sum > target`
Positive array में ही काम करता है।

---

## **🔟 Max Product Subarray of Size K** 🆕

Window product, careful with divide (when 0 comes).

---

## **1️⃣1️⃣ Window sum divisible by X** 🆕

`sum % X == 0` then count++

---

## **1️⃣2️⃣ Top K Maximum Windows** ⭐🆕

Heap + windows
Rare but FAANG-style question.

---

## **1️⃣3️⃣ Maximum Consecutive Ones (with K flips)**

**LeetCode:** 1004
Window where zero count ≤ k
Very important if fixed → variable size shift.

---

## **1️⃣4️⃣ Return list of EVERY window sum** (basic)

Simple addition/subtraction.

---

## **1️⃣5️⃣ Max sum window + return index** ⭐

तुमने यह अभी किया है 🔥
Must-do question.

---

# 📘 **3. Extra Notes — Interview में क्या पूछा जाता है?**

### Interviewer अक्सर पूछते हैं:

✔️ Sliding window कब use करते हो?
✔️ Window shrink करने का logic क्या है?
✔️ Window fixed है या variable? फर्क?
✔️ Why is deque O(n)?
✔️ Why not sorting?
✔️ How to handle negative numbers?

मैं चाहूँ तो इनका पूरा interview sheet भी बना सकता हूँ।

---



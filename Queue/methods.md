
---

# 🔥 **1. `offer()` boolean क्यों return करता है?**

क्योंकि **offer() politely try करता है element डालने की**,
और बताता है कि insert हुआ या नहीं।

### 👉 Return Values:

* `true` → element successfully add हो गया
* `false` → add **नहीं** हुआ

### ⭐ Example:

```java
System.out.println(dq.offer(50));
```

अगर जगह है → `true`
अगर जगह नहीं है (bounded queue में) → `false`

👉 इसलिए **Queue safe तरीका है add करने का**, program crash नहीं करता।

---

# 🔥 **2. `add()` क्यों exception फेंकता है?**

* `add()` strict होता है
* अगर जगह नहीं है → **exception throw करेगा**

इसलिए Queue/Deque में ज़्यादातर लोग `offer()` को prefer करते हैं।

---

# 🔥 **3. `pollFirst()` / `pollLast()` null क्यों return करते हैं?**

क्योंकि यह **safe removal** method है।

अगर queue empty है → exception नहीं देगा → `null` return करेगा।

### Example:

```java
Integer x = dq.pollFirst();
System.out.println(x); // empty hoga to null
```

---

# 🔥 **4. `removeFirst()` / `removeLast()` exception क्यों देते हैं?**

क्योंकि यह strict होते हैं।
अगर empty है → **NoSuchElementException** throw होगा।

---

# ⭐ Summary Table — Interview में use करने लायक

| Method                                      | Return Type          | Behaviour                    |
| ------------------------------------------- | -------------------- | ---------------------------- |
| **offer()**                                 | boolean              | add safely, success → true   |
| **add()**                                   | void/exception       | fail → exception             |
| **poll() / pollFirst() / pollLast()**       | element OR null      | empty → null                 |
| **remove() / removeFirst() / removeLast()** | element OR exception | empty → exception            |
| **peek() / peekFirst() / peekLast()**       | element OR null      | just check, remove नहीं करता |
| **element()**                               | element OR exception | strict peek                  |

---

# 🧠 इंटरव्यू लाइन (एकदम strong)

> “Queue/Deque में `offer` और `poll` safe methods हैं—
> fail होने पर exception नहीं देते, बल्कि boolean/null return करते हैं.”

---


Here’s a clean, well-formatted **Markdown (.md)** version of your exam question that you can submit or keep for documentation/revision:

---

# 🧮 Binary Search Tree Operations — Custom Deletion Rule

### **Problem Description**

You are given a sequence of operations to perform on a **Binary Search Tree (BST)**.
Each operation is either an **insert** (`"insert x"`) or a **delete** (`"delete x"`) command.

After performing all operations in sequence, your task is to **output all the leaf nodes** of the final BST **from left to right**.

---

### **BST Properties**

A Binary Search Tree follows the standard rule:

* For any node with value `v`:

  * All nodes in the **left subtree** have values `< v`.
  * All nodes in the **right subtree** have values `> v`.

---

### **Custom Deletion Rule**

When deleting a node, use **the following custom logic** instead of the standard BST deletion rule:

1. **If the node has a right child**,
   replace the node with its **right child**, and attach the node’s **left subtree** to the **left-most node** of that right child’s subtree.
2. **If the node does not have a right child but has a left child**,
   replace the node with its **left child**.
3. **If the node has no children**,
   simply delete it.

---

### **Function Description**

Implement the following method:

```java
public static String getLeafNodes(String[] operations)
```

#### **Parameters**

* `operations[]`: an array of strings, each representing an operation of the form `"insert x"` or `"delete x"`.

#### **Returns**

* A single string containing **space-separated values** of the **leaf nodes** of the final BST, **from left to right**.
* If the tree is empty, return an empty string `""`.

---

### **Constraints**

* `1 <= n <= 10^5`, where `n` is the number of operations.
* All values of `x` are **unique** during insertions and deletions.
* `-10^9 <= x <= 10^9`
* The BST must follow the **custom deletion rule** described above.

---

### **Example 1**

#### **Input**

```java
["insert 2", "insert 3", "insert 1"]
```

#### **Output**

```
1 3
```

#### **Explanation**

1. Insert `2` → becomes root node.
2. Insert `3` → goes to the right of `2`.
3. Insert `1` → goes to the left of `2`.

Final BST:

```
     2
    / \
   1   3
```

Leaf nodes from left to right → **1 3**

---

### **Example 2**

#### **Input**

```java
["insert 2", "insert 3", "insert 1", "delete 2"]
```

#### **Output**

```
1
```

#### **Explanation**

1. Insert `2` → root
2. Insert `3` → right of 2
3. Insert `1` → left of 2
4. Delete `2`

   * Node `2` has a right child (`3`), so replace `2` with `3`,
     and attach `1` (left subtree) to the left-most node of `3`.

Final BST:

```
   3
  /
 1
```

Leaf nodes → **1**

---

### **Notes**

* Consider writing **optimized code** to handle large inputs efficiently.
* Follow **Java 8** and **Gradle 4+** standards.
* Code will be evaluated on:

  * **Code coverage**
  * **Code quality**
  * **Best practices**
  * **Bug-free functionality**

---

### **Sample JUnit File (for reference only)**

```java
package user;

import org.junit.*;

public class UserTest {

    @Test
    public void test1() {
        Assert.assertEquals(1, 1);
    }
}
```

---

### **Expected Submission**

* Implement only the method:

  ```java
  public static String getLeafNodes(String[] operations)
  ```

  inside a class under the package `user`.

* Do **not** modify or include test files.
  System tests will automatically validate your solution.

---

Would you like me to generate this as a downloadable `.md` file (`BSTOperations.md`)?

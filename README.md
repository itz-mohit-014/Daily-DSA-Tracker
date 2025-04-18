# 🚀 Daily DSA Progress Tracker - Mohit Jangid

Welcome to my daily progress tracker where I solve DSA problems consistently from **GeeksForGeeks (160-Day Challenge)** and **LeetCode** using **Java**. The goal is to sharpen problem-solving skills and maintain a regular streak of learning and improvement.

> 📅 Started on: `April 14, 2025`  
> 🧠 Language: `Java`  
> 👨‍💻 Platforms: `GeeksForGeeks`, `LeetCode`

---

## 📊 Progress Table

| #   | Date           | Platform | Problem Title & Link                                                                | Difficulty | Time & Space Complexity         | Remarks / New Learning |
| --- | -------------- | -------- | ----------------------------------------------------------------------------------- | ---------- | ------------------------------- | ----------------------- |
| 14  | April 14, 2025 | GFG      | [Implement Atoi](https://www.geeksforgeeks.org/problems/second-largest3735/1)       | Medium     | `O(n)` time, `O(1)` space       | <details><summary>Click to expand</summary>Learned a more reliable technique to prevent integer overflow: always perform the overflow check before multiplying or adding values. In Java, if you multiply first and the result overflows, it wraps around (like a clock after 12 → 1), which can lead to incorrect results.</details> |
| 15  | April 15, 2025 | GFG | [Add Binary Strings](https://www.geeksforgeeks.org/problems/add-binary-strings3805/1) | Medium | `O(n+m)` time, `O(1)` space | <details><summary>Click to expand</summary>Learn a modular approach to work on bit by bit.</details> |
| 16  | April 16, 2025 | GFG | [Anagrams](https://www.geeksforgeeks.org/problems/anagram-1587115620/1) | Easy | `O(n)` time, `O(1)` space | <details><summary>Click to expand</summary>-</details> |
| 17  | April 17, 2025 | GFG | [Non Repeating Character](https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1) | Easy | `O(n)` time, `O(1)` space | <details><summary>Click to expand</summary>-</details> |
| 18  | April 18, 2025 | GFG | [Search Pattern (KMP-Algorithm)](https://www.geeksforgeeks.org/problems/search-pattern0205/1) | Hard | `O(n1 * n2)` time, `O(n2 + k), where k is the number of matches (up to n1)` space |  KMP (Knuth-Morris-Pratt) Algorithm - It preprocesses the pattern to build an LPS (Longest Prefix Suffix) array. Instead of checking each substring individually, it jumps through the text using the LPS table to avoid unnecessary comparisons. - It preprocesses the pattern to build an LPS (Longest Prefix Suffix) array. |


--- --------------------------

### 🧠 Folder Structure

```bash
Daily-DSA-Tracker/
│
├── README.md                       # Your main progress tracker with table
├── .gitignore                      # To exclude files like .class, .DS_Store, etc.
├── LICENSE                         # (Optional) Add MIT or Apache License if open-source
├── CONTRIBUTING.md                 # (Optional) If planning to make it collaborative
│
├── Day01/                          # Each day's problems go in separate folders
│   └── TwoSum.java
│
├── Day02/
│   └── CountGoodTriplets.java
│
├── Day03/
│   └── LongestSubstring.java
│
│
│
│
│
└── ...
│
├── assets/                         # (Optional) For images if you use visual notes/diagrams
│   └── sliding-window-explained.png
│
└── notes/                          # (Optional) For detailed markdown notes or approaches
    └── sliding-window.md


```

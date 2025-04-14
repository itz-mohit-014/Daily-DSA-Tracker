# 🚀 Daily DSA Progress Tracker - Mohit Jangid

Welcome to my daily progress tracker where I solve DSA problems consistently from **GeeksForGeeks (160-Day Challenge)** and **LeetCode** using **Java**. The goal is to sharpen problem-solving skills and maintain a regular streak of learning and improvement.

> 📅 Started on: `April 14, 2025`  
> 🧠 Language: `Java`  
> 👨‍💻 Platforms: `GeeksForGeeks`, `LeetCode`

---

## 📊 Progress Table

| #   | Date           | Platform | Problem Title & Link                                                                | Folder Path                      | Time & Space Complexity    | Approach / Solution Summary                                                                                                               | Remarks / New Learning                                                                                                                                                                                                           |
| --- | -------------- | -------- | ----------------------------------------------------------------------------------- | -------------------------------- | -------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 14  | April 14, 2025 | GFG      | [Implement Atoi](https://www.geeksforgeeks.org/problems/second-largest3735/1)       | `./Day01/ImplementAtoi.java`     | `O(n)` time, `O(1)` space                     | Traverse the string from left to right, convert each character to an integer, and build the number step by step. During this process, handle invalid characters and perform overflow checks before updating the result. | Learned a more reliable technique to prevent integer overflow: always perform the overflow check before multiplying or adding values. In Java, if you multiply first and the result overflows, it wraps around (like a clock after 12 → 1), which can lead to incorrect results. |

---

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

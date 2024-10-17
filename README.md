# LeetCode Problem 14: Longest Common Prefix

## Problem Description
Given an array of strings, find the longest common prefix string amongst them. If there is no common prefix, return an empty string.

## Example
**Input**: `["flower","flow","flight"]`  
**Output**: `"fl"`

# Leetcde_solution
## Solution
Here's a Java solution using sorting and character comparison:

```java
class Solution {
    public String longestCommonPrefix(String[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int i = 0;
        String start = arr[0];
        String end = arr[n - 1];
        while (i < start.length()) {
            if (start.charAt(i) == end.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        return start.substring(0, i);
    }
}

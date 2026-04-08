# Amazon Interview Prep

## Progress Tracker

| Date | Topic | Problem | Time Taken | Level | Note |
|---|---|---|---|---|---|
| 24/03/2026 | Sliding Window | 3. Longest Substring Without Repeating Characters | 21m | M | use HashSet, while(contains)remove and lastly calc maxLength |
| 24/03/2026 | Sliding Window | 76. Minimum Window Substring | 75m | H | use [128], inc t. while(end) if(char match)c--, while(c==0) calc min and inc char. |
| 25/03/2026 | Sliding Window | 239. Sliding Window Maximum | 80m | H | use monotonic queue. keep the large ele at top and slide the window. |
| 25/03/2026 | Two Pointer | 15. 3Sum | 25m | M | sort and use two pointer. |
| 25/03/2026 | Two Pointer | 11. Container With Most Water | 13m | M | if left<right left++, so on |
| 25/03/2026 | Mono Stack | 84. Largest Rectangle in Histogram | 42m | H | use monotonic Stack. calc left and right extend. Then calc area |
| 25/03/2026 | Mono Stack | 42. Trapping Rain Water | 30m | H | use monotonic Stack. left->right check for high val and right->left. |
| 25/03/2026 | Prefix | 560. Subarray Sum Equals K | 28m | M | use map to store sum. |
| 25/03/2026 | Prefix | 238. Product of Array Except Self | 28m | M | mul nums left->right. rev mul n-2. |
| 26/03/2026 | Intervals | 56. Merge Intervals | 70m | M | sort a->a[0]. Compare ns&ce. |
| 26/03/2026 | Intervals | 57. Insert Interval | 38m | M | while->add ele which are small then NI, add NI in place. add ele which are big then NI. |
| 26/03/2026 | Hashing | 49. Group Anagrams | 28m | M | use map. sort the str and check if map.containsKey(). |
| 26/03/2026 | Hashing | 767. Reorganize String | 40m | M | get the max rep ele and place them in alternate blanks. the for i=0->n place ele alternate. |
| 27/03/2026 | Heap | 973. K Closest Points to Origin | 36m | M | use pq. if pq.size > k pop. |
| 30/03/2026 | Heap | 134. Gas Station | 58m | M | add net to totalsur and currsur if cs<0 the reset cs=0 start = i+1 rt ts<0?-1:start. |
| 30/03/2026 | Heap | 347. Top K Frequent Elements | 31m | M | use bucket sort. create list<>[] and insert ele in freq index. |

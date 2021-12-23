# EMP_BlueSteaks

## <p align="center"> TNPG: Blue Steaks: Max Schneider, Faiyaz Rafee, David Deng

---
  
### Tests Performed
  
* Tested binary search and linear search on array lengths of increasing powers of 10 from 1 to 8. 
* Calculate elapsed time by using the equation `Linear - Binary`. Positive differences mean that binary ran faster while negative differences mean that linear ran faster.
* Ran multiple trials to eliminate possibilities of outliers.
---

### Results

| Trial Number | Array Size | Binary Search | Linear Search | Difference |
|---|---|---|---|---|
| 1 | 1 | 0 | 0 | 0 |
| | 10 | 0 | 0 | 0 |
| | 100 | 0 | 0 | 0 |
| | 1000 | 0 | 16 | 16 |
| | 10000 | 0 | 78 | 78 |
| | 100000 | 0 | 703 | 703 |
| | 1000000 | 15 | 7332 | 7317 |
| | 10000000 | 16 | 85080 | 85064 |
| | 100000000 | 2 | 719302 | 719300 |
| | | | | |
| 2 | 1 | 3 | 2 | -1 |
| | 10 | 1 | 1 | 0 |
| | 100 | 1 | 1 | 0 |
| | 1000 | 2 | 16 | 14 |
| | 10000 | 0 | 67 | 67 |
| | 100000 | 1 | 740 | 739 |
| | 1000000 | 1 | 6633 | 6632 |
| | 10000000 | 2 | 87311 | 87309 |
| | 100000000 | 1 | 865639 | 865638 |
| | | | | |
| 3 | 1 | 4 | 3 | -1 |
| | 10 | 2 | 1 | -1 |
| | 100 | 1 | 2 | 1 |
| | 1000 | 2 | 20 | 18 |
| | 10000 | 1 | 114 | 113 |
| | 100000 | 2 | 8254 | 8252 |
| | 1000000 | 3 | 90636 | 90633 |
| | 10000000 | 1 | 862679 | 862678 |
| | | | | |
| 4 | 1 | 3 | 1 | -2 |
| | 10 | 1 | 0 | -1 |
| | 100 | 1 | 1 | 0 |
| | 1000 | 1 | 11 | 10 |
| | 10000 | 0 | 71 | 71 |
| | 100000 | 1 | 631 | 630 |
| | 1000000 | 1 | 3482 | 3481 | 
| | 10000000 | 0 | 44368 | 44368 |
| | 100000000 | 0 | 573288 | 573288 |
| | | | | |
| 5 | 1 | 3 | 2 | -1 |
| | 10 | 0 | 1 | 1 |
| | 100 | 1 | 1 | 0 | 
| | 1000 | 1 | 7 | 6 |
| | 10000 | 1 | 65 | 64 |
| | 100000 | 1 | 631 | 630 |
| | 1000000 | 1 | 3414 | 3413 |
| | 10000000 | 0 | 57175 | 57175 |
| | 100000000 | 1 | 572218 | 572217 |
  
* Unit of time is in **ms** (milliseconds)
* Difference is calculated by `Linear - Binary`
---

### Conclusions

* While linear search and binary search initially require similar amounts of time to find a target within an array, as the array length increases, binary search becomes quicker at finding the target than linear search does.
* This is due to the significantly slower increase of the maximum number of guesses binary search has to use compared to the maximum number of guesses linear search has to use. 
---

### GALLERY TOUR
  
**Team Compile-Time-Errors**

* Compares linear search and binary search as a ratio rather than a difference.
* Runs binary search repeatedly until 1 ms is reached to avoid vagueness in the times for arrays of smaller lengths

**Team Pserbco**
* Uses ints as it uses less memory which results in array sizes in the billions being searched thousands of times feasable without running into memory issues
* Kept random number consistent between LinSearch and BinSearch, minimizing any unwanted skewing of data
  
**Team LYJ**
* Didn't keep random number consistent between LinSearch and BinSearch. Might cause skewing of data, even if not major.

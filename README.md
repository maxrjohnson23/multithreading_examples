# multithreading_examples
##Examples of Multithreading using Java

###Writing Correct Concurrent Code:
**1. Check for race conditions**
  - Occur on fields (not variables/parameters)
  - 2 threads are reading/writing a given field
    
**2. Check for happens-before link**
  - Are the read/write volatile?
  - Are they synchronized?
  - If not, there is probably a subtle bug
 
**3. Synchronized or volatile?**
  - Synchronized = atomicity
  - Volatile = visibility

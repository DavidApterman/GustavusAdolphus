# GustavusAdolphus

## Method Selection
We chose the half of the methods that returned null instead of throwing an exception when they do not find the value. When looking at a real life queue, such as the line at Terry's, looking past the end of the line whos only nothing, not NoSuchElementException. 

## Methods Used:
```java
addFirst (returns null if value not found)
addLast  (returns null if value not found)
removeFirst (returns null if value not found)
removeLast (returns null if value not found)
pollFirst (returns null if value not found)
pollLast (returns null if value not found)
isEmpty (returns boolean)
```

## Architecture Selection
We chose to use a doubly-linked node based architecture because it has no size restriction and allows for constant run time on all methods except for toString(). It's very easy to modify the first and last positions of the data structure because you have easy access to each node's right and left neighbors. Adding at both ends means establishing a new link instead of shifting anything over and the same goes for removing. Polling is also constant time because we have markers, _front and _end, to point to the first and last node, respectively. 

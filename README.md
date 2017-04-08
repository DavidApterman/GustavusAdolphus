# GustavusAdolphus

## Method Selection
We chose the half of the methods that returned null instead of throwing an exception when they do not find the value. When looking at a real life queue, such as the line at Terry's, looking past the end of the line whos only nothing, not NoSuchElementException. 

##Methods Used:</br>
''' java
addFirst (returns null/value)</br>
addLast  (returns null/value)</br>
removeFirst (returns null/value)</br>
removeLast (returns null/value)</br>
pollFirst (returns front cargo)</br>
pollLast (returns end cargo)</br>
isEmpty</br>
'''

## Architecture Selection
We chose to use a doubly-linked node based architecture because it has no size restriction and allows for constant run time on all methods except for toString(). It's very easy to modify the _front and _end of such a structure because there are simple ways to navigate to the directly preceding and proceeding nodes. 

# Using ArrayLists to simulate a Dictionary

**Overview**

This repository contains Java code and documentation for simulating possible actions in a dictionary such as looking up a definition of a word, adding an entry for a word, and testing the user word knowledge.

Within this project, there exists three classes--_SortedDictionary_, _Dictionary_ and _Pair_. The _Pair_ class initializes two instance variables, _key_ and _value_, that represent the "word" and "definition," respectively. The _Dictionary_ class then uses the _Pair_ class as the appropriate data type to fill the ArrayList (that represents the dictionary).

To recieve a definition from searching a word, the computer loops through the ArrayList for a match in the _key_ variable.

To add an entry into the dictionary, the computer creates a new _Pair_ that will be added to the ArrayList.

To use the flash card function, the computer imports Java's Random function to select a random index within the ArrayList and asks for the user to type the definition of said word. 

When searching for a definition of a word, indivudally looping for each element in an ArrayList will be extremely inefficient once there are enough entries. In order to increase efficiency in sorting and searching, the _SortedDictionary_ class extends the _Dictionary_ class and sorts/searches entries using the Binary Search Algorithm.

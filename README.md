# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
	An array of dogs, a dog named Fido with 4 legs, a dog named Fido with 3 legs, a dog named Alfie with 4 legs,
	and a Comparator for animals.

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?
	The comparator constructor call is made in this line "Collections.sort(dogs, new Comparator<Animal>(){".
	The class definition follows the comparator, <Animal>.
Assignment Instructions

Queues are a data structure where elements are enqueued and dequeued in First In First Out order. The data that a Queues keeps track of are: 1) its size, 2) a reference to the first node, and 3) a reference to the last node.

Each node in a queue keeps track of 1) its data and 2) a reference to the node after it.

The MAIN queue operations are:

enqueue - add a new node to the bottom of the queue

dequeue - remove the top node of the queue and return it

peek - look at and return the top node without removing it from the queue

Things you will need to do for this lab:

1) Create a new QueueNode object with the data listed above. (Like with StackNode, this should be a NEW type of Node.)

2) Create a new Queue object with the data listed above.

3) Create a Test Driver to test out the methods contained in QueueNode and Queue. Keep edge cases in mind.

The methods I will require you to create for your Queue are as follows:

void enqueue(E element)    //add an element
E dequeue()                //remove and return the least recent element
boolean isEmpty()   
int size()
E peek()                //look at the least recent element without removing

Based on your understanding of how Nodes work, you will need to determine the necessary QueueNode methods on your own.

 

Please work ALONE to complete this assignment, using git version control, good commit messages, and feature branches. Feel free to use Google (or any of your classmates) for collaborative help, but do write the code yourself. I will be here to answer any questions you might have, but please FULLY READ THIS ASSIGNMENT FIRST before asking any clarifying questions about the lab.

 

Grading Rubric

1 pt - Correct instance data for both QueueNode and Queue.

1 pt - Empty constructors for both QueueNode and Queue.

3 pts - Correctly functioning code for all listed Queue methods (see above).

3 pts - Correctly functioning code for all necessary QueueNode methods (see above).

3 pts - Complete tests for both QueueNode and Stack with proper comments/style and helpful output formatting.

2 pts - Correct use of feature branches, commits with good descriptive style, and pull requests to merge code features into master/main.
 
2 pts - Proper style and good class/method headers. Refer to the AT Style Guide with any questions on style that you might have.

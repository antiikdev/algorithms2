# Disjoint Sets tree (Finn. alkiovieraidan osajoukkojen puu)

**Example:** DisjointSets.java, josta lopulliset:

**Start**
Set items (nodes), where default now each is root node:
{ 1, 2, 3, 4, 5, 6, 7, 8 }
 -1 -1 -1 -1 -1 -1 -1 -1
 
 **Final disjoint set (DisjointSets.java)**
 
Individual: [0, -1, -1, -1, -1, -1, -1, -1, -1]
Union(2,6): [0, -1, -2, -1, -1, -1, 2, -1, -1]
Union(3,5): [0, -1, -2, -2, -1, 3, 2, -1, -1]
Union(7,8): [0, -1, -2, -2, -1, 3, 2, -2, 7]
Find 5's root node: 3
Union(1,4): [0, -2, -2, -2, 1, 3, 2, -2, 7]
Union(1,3): [0, -4, -2, 1, 1, 3, 2, -2, 7]
Union(2,7): [0, -4, -4, 1, 1, 3, 2, 2, 7]
Union(1,2): [0, -8, 1, 1, 1, 3, 2, 2, 7]
Find 8's root node: 1


### set.union(2,6);

```
	1 2 3 4 5 7 8
	  6
```

Node 2 is now root (with 2 nodes), and node 6 is part of tree 2
{ 1, 2, 3, 4, 5, 6, 7, 8 }
 -1 -2 -1 -1 -1  2 -1 -1


### set.union(3,5);

```
	1 2 3 4 6 7 8
	  6 5
```

### set.union(7,8);

```
	1 2 3 4 6 7
	  6 5	  8
```


### set.union(1,4);

```
	1 2 3 6 7
	4 6 5   8
```


### set.union(1,3);

```
	1 		2 6 7
  3   4 	6   8
   5  	
```


### set.union(2,7);

```
	1 		2 	   6 
  3   4   6   7		 
   5  			8
```

### set.union(1,2);

```
			1 
	2		3  		 4  	 
  6	  7		  5
		8
```


### find(8)

```
			1 
	  /  /  |  \  \
	2   3   4   7  8 	 
   /   /
  6	  5
		
```
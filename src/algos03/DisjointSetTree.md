# Disjoint Sets tree (Finn. alkiovieraidan osajoukkojen puu)

- DisjointSets.java
- Set items (nodes) are { 1, 2, 3, 4, 5, 6, 7, 8 }

### set.union(2,6);

```
	1 2 3 4 5 7 8
	  6
```


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

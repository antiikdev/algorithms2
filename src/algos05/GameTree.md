# Game Tree (pelipuu)

x is MAX player, large values are better
y is MIN player, small values are better



**Original tree:**
```
				 0					MIN (y)
	   ----------|----------
	  /          |          \
	 0			 0			 0		MAX (x)
   /   \       /   \       /   \       
  0     0     0		0	  0	    0	MIN (y)
 / \   / \   / \   / \   / \   / \
10  8 6   3 7  11 4   1 12  9 2   5
```

**Root node's winning value:**
```
				 7					MIN (y)
	   ----------|----------
	  /          |          \
	 8			 7			 9		MAX (x)
   /   \       /   \       /   \       
  8     3     7		1	  9	    2	MIN (y)
 / \   / \   / \   / \   / \   / \
10  8 6   3 7  11 4   1 12  9 2   5
```

**alpha-beta pruning (a-b-karsinta)**
- Save computation and only go through possible outcome values

```
				 7					MIN (y)
	   ----------|----------
	  /          |          \
	 8			 7			 9		MAX (x)
   /   \       /   \       /   \       
  8     3     7		1	  9	    2	MIN (y)
 / \   / \   / \   / \   / \   / \
10  8 6   3 7  11 4   1 12  9 2   5
```
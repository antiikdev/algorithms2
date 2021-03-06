# Game Tree (pelipuu)

X and y take turns and in each turn:
- x is MAX player, where large values are chosen
- y is MIN player, where small values are chosen


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

**Root node's winning value: 7**
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
- Save computation in the nodes (to alpha and beta) bottom-up by min and max and only go through possible outcome values

```

				<=7					MIN (y)
	   ----------|----------
	  /          |          \
	>=8			>=7			>=9		MAX (x)
   /   \       /   \       /   x       
<=8 <=(6)     7	 <=(4)	  9	    ?	MIN (y)
 / \   / x   / \   / x   / \   / \
10  8 6   ? 7  11 4   ? 12  9 ?   ?

```
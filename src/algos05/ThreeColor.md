# Three-Coloring Problem (3-varitysongelma)
Three-Coloring Problem with backtracking method (peruutusmenetelmällä)

### Graph (verkko):
```
    B ----- C
  / |       | \
 A  |       |  D
  \ |       | /
    F ----- E
```

Coloring order:  A, B, C, D, E, F


### Colored tree solved:

- 1, 2, 3 are different colors

```
    B2 ----- C1
  / |        | \
 A1 |        |  D3
  \ |        | /
    F3 ----- E2
```

### Solution tree (ratkaisupuu:

- e = ei (no) or empty
- 1, 2, 3 are different colors

**1st round - backtracking**
```

	    0
	   /|\
A:	  1
	 /|\
B:	e 2
	 /|\
C:	1 
   /|\
D:e 2
   /|\
E:e e 3
	 /|\
F:  e e e

```

-->> Color not found, backtracking (peruutetaan)

**2nd round - solved** 
```

 	    0
	   /|\
A:	  1
	 /|\
B:	e 2
	 /|\
C:	1 
   /|\
D:e e 3
	 /|\
E:	e 2 
	 /|\
F: 	e e 3

```

-->> Solution found: A:1, B:2, C:1, D:3, E:2, F:3
# Kruskal

Kruskal(N, E) // N solmujen joukko, E teiden joukko
{
  S = E; // kaikki tiet
  T = tyhjä joukko;
  while (T ei muodosta virittävää puuta) {
    valitse lyhin tie (u,v)joukosta S;
    poista tie (u,v) joukosta S;
    if (tie (u,v) ei aiheuta silmukkaa T:ssä)
      lisää tie (u,v) joukkoon T;
  }
  return T;
}

### Kaikki tiet (S=E)
```
A		3	B
  6	  8  5	8
	C	7	D
  4		  9
E

```

### 1. valitse lyhin tie (u,v) joukosta S
- I(A,B) = 3
	- Ei aiheuta silmukkaa
	- Poistetaan joukosta S
	- Lisätään joukkoon T

```
A		3	B

	C		D
  		  
E
```

### 2. valitse lyhin tie (u,v) joukosta S
- I(C,E) = 4
	- Ei aiheuta silmukkaa
	- Poistetaan joukosta S
	- Lisätään joukkoon T

```
A		3	B

	C		D
  4		  
E
```

### 3. valitse lyhin tie (u,v) joukosta S
- I(C,B) = 5
	- Ei aiheuta silmukkaa
	- Poistetaan joukosta S
	- Lisätään joukkoon T

```
A		3	B
		 5
	C		D
  4		  
E
```

### 4. valitse lyhin tie (u,v) joukosta S
- I(A,C) ja I(A,E) ovat molemmat 6, mutta aiheuttavat silmukan

```
A		3	B
		 5
	C		D
  4		  
E
```


### 5. valitse lyhin tie (u,v) joukosta S
- I(C,D) = 7
	- Ei aiheuta silmukkaa
	- Poistetaan joukosta S
	- Lisätään joukkoon T

```
A		3	B
		 5
	C	7	D
  4		  
E
```

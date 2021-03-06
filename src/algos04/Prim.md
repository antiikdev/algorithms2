# Prim
Lyhin virittävä puu G:n aliverkko = kaikki solmut G:n solmuista, yhdistää, eikä silmukkaa
T = verkko
(u,v) tie väli

Prim(N, E)
{
  U = {aloitussolmu};
  T = tyhjä joukko;
  while (U ei sisällä kaikkia solmuja) {
    valitse lyhin tie (u,v), jolla u on U:ssa ja v ei ole U:ssa;
    lisää tie (u,v) joukkoon T;
    lisää solmu v joukkoon U;
  }
  return T;
}

### Kaikki tiet (all roads) (S=E)
```
A		3	B
  6	  8  5	8
	C	7	D
  4		  9
E
```

### Aloitussolmu (start node)
- U = A

### 1. Valitaan lyhin tie (u,v)
- I(A,B) = 3, lyhin, jolla u on U:ssa ja v ei ole U:ssa
	- lisätään tie (A,B) joukkoon T
	- lisätään solmu B joukkoon U
- U = A, B

```
A		3	B

	C		D
  		  
E
```

### 2. Valitaan lyhin tie (u,v)
- I(A,E) = 6, lyhin, jolla u on U:ssa ja v ei ole U:ssa
	- lisätään tie (A,B) joukkoon T
	- lisätään solmu A joukkoon U
- U = A, B, E

```
A		3	B

6	C		D
  		  
E
```

### 3. Valitaan lyhin tie (u,v)
- I(E,C) = 4, lyhin, jolla u on U:ssa ja v ei ole U:ssa
	- lisätään tie (E,C) joukkoon T
	- lisätään solmu C joukkoon U
- U = A, B, E, C

```
A	  3		B

6	C		D
  4	  
E
```

### 4. Valitaan lyhin tie (u,v)
- I(C,B) = 5, lyhin, jolla C on U:ssa, mutta V on jo U:ssa
- I(C,D) = 7, jolla u on U:ssa ja v ei ole U:ssa
	- lisätään tie (C,D) joukkoon T
	- lisätään solmu D joukkoon U
- U = A, B, E, C, D

```
A	  3		B

6	C	7	D
  4	  
E
```

** Lyhimmän virittävän puun joukko: A, B, E, C, D, eli (A,B), (B,C), (C,E), (C,D)**
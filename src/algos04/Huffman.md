# Huffman
- Kukin lehtisolmu vastaa yhta merkkia
- Haarautuminen
	- Vasempaan alipuuhun haarautuminen: 0-bittia
	- Oikea alipuuhun haarautuminen: 1-bittia
- Polku juurisolmusta lehtisolmuun vastaa merkin koodia. Lyhimmät koodit merkkeihin
joiden esiintymistiheys on suurin

### 1. Merkit esiintymistiheydella (yhden solmun kokoiset puut):

Alkuperainen esiintymistiheys
```
a	b	c	d	e	f	g
8	15	29	4	16	6	22
```

Jarjestetty (sorted) esiintymistiheys
```
d	f	a	b	e	g	c
4	6	8	15	16	22	29
```

### 2. Valitaan kaksi painoarvoltaan pieninta puuta yhdeksi
- Uusi juurisolmu, jonka painoarvo yhdistettavien puiden painoarvojen summa

```
	 10
4(d)	6(f)
```

```
	 24
8(a)	16(e)
```
	
```
	 37
15(b)	22(g)
```

```
29(c)
```

### 3. Valitaan kaksi painoarvoltaan pieninta puuta yhdeksi
- Uusi juurisolmu, jonka painoarvo yhdistettavien puiden painoarvojen summa

```
			   
	 10					 24
4(d)	6(f)		8(a)	16(e)
```

```
								134
				63									71
											
	29(c)					34								37
														
					10				 24					15(b)	22(g)
				 
				4(d)	6(f)	8(a)	16(e)

```


Koodit:
```
a		b		c		d		e		f		g
0110	110		00		0100	0111	0101	111
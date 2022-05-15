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

Painoarvoltaan pienimmat: 4 ja 6
```

8	 10		15	16	22	29
   /    \
4(d)	6(f)

```

Painoarvoltaan pienimmat: 8 ja 10
```

15(b)	16(e)	 18		22(g)	29(c)
			   /	\
			8(a)	 10
				   /	\
				4(d)	6(f)
			
```
	
Painoarvoltaan pienimmat: 15 ja 16
```

	18		22(g) 29(c)   31
  /		\				/	\
8(a)	 10		 	15(b)  16(e)
	   /	\
	4(d)	6(f)
	
```

Painoarvoltaan pienimmat: 18 ja 22
```

29(c)	  31			40				
		/	\		  /    \			
	15(b)  16(e)	18		22(g) 	 
				  /		\			
				8(a)	 10		 	
					   /	\
					4(d)	6(f)
	
```


Painoarvoltaan pienimmat: 29 ja 31
```

		40				60
	  /    \	  	/		 \
	18		22(g) 29(c)		 31
  /		\					/	\
8(a)	 10		 		15(b)  16(e)
	   /	\
	4(d)	6(f)
	
```

Painoarvoltaan pienimmat: 40 ja 60
```
			   100
		  /			  \
		40			   60
	  /    \	    /		\
	18		22(g) 29(c)		 31
  /		\					/	\
8(a)	 10		 		15(b)  16(e)
	   /	\
	4(d)	6(f)
	
```


### 3. Huffmanin koodit

- Haarautuminen
	- Vasempaan alipuuhun haarautuminen: 0-bittia
	- Oikea alipuuhun haarautuminen: 1-bittia

```
a		b		c		d		e		f		g
000	   110		10		0010	111		0011	01
```

### 4. Tilansäästö

Alkuperainen:
```
a	b	c	d	e	f	g
8	15	29	4	16	6	22
```
3 bit/merkki
3 x 100 = 300 bit

Huffmanin koodi:
```
a		b		c		d		e		f		g
000	   110		10		0010	111		0011	01
```
3x8 +	3x15 +	3x29 +	3x4 +	3x16 +	3x6 +	3x22 = 259 bit

Tilansäästö 41 bittiä, eli 1 - (259 / 300) * 100 = 13,7 %

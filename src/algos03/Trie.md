# Trie

Tallennettavat merkkijonot (engl. saved strings):
laki, luu, romu, ropo, tavu, tomu, tora, toru

### Standarditrie (standard trie)

```

					0
	l				r			  t
a		u			o			a			o
   k	  u		m		p	    v	   m		r
  i			   u		  o		u      u	   a u

```

### Pakattu trie (packed trie)
 
```

				0

	l				ro			t
	
aki   uu	   	 mu   po	avu		o

							     mu   r
								     a u
								 
	
```


### Pakattu trie merkkijonot eril. taulukossa (packed trie with strings in array)

- Merkkijono S[0], S[1], ..., S[s-1]
- Alimerkkijonot: S[i][j..k], eli i:n merkkijonon merkit paikasta j paikkaan k
- Esim. 0,1,2 = S[0], merkkijonot 1 paikkaan 2 

```

						0
	
	0,0,0			2,0,1			4,0,0

0,1,3	1,1,2	2,2,3	3,2,3	4,1,3		  5,1,1
										5,2,3		6,2,2
												6,3,3  7,3,3
										
```
    | 0 1 2 3 
-------------
S[0]| l a k i
S[1]| l u u
S[2]| r o m u
S[3]| r o p o
S[4]| t a v u
S[5]| t o m u
S[6]| t o r a
S[7]| t o r u
```

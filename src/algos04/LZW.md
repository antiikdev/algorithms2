#LZW

### Koodaus (encode)

String: aabbbabbbaaa
Kooditulos: 023042
Tilansäästö: 1 - (6 / 12) * 100 = 50 %, eli puolet 

```
**Start:**
|aabbbabbbaaa
0 1 
a b

**Longest char in directory now a (code 0) + next char code (a) = aa (2)**
a|abbbabbbaaa
0 1 2					Code: 0
a b	aa

**Longest char in directory now a (code 0) + next char code (b) = ab (3)**
aa|bbbabbbaaa
0 1 2	3				Code: 00
a b	aa	ab

**Longest char in directory now b (code 1) + next char code (b) = bb (4)**
aab|bbabbbaaa
0 1 2	3	4			Code: 001
a b	aa	ab	bb

**Longest char in directory now bb (code 4) + next char code (a) = bba (5)**
aabbb|abbbaaa
0 1 2	3	4	5		Code: 0014
a b	aa	ab	bb	bba

**Longest char in directory now ab (code 3) + next char code (b) = abb (6)**
aabbbab|bbaaa
0 1 2	3	4	5	6	Code: 00143
a b	aa	ab	bb	bba	abb

**Longest char in directory now bba (code 5) + next char code (a) = bbaa (7)**
aabbbabbba|aa
0 1 2	3	4	5	6	7	Code: 001435
a b	aa	ab	bb	bba	abb	bbaa

**Longest char in directory now aa (code 2) + next char code (null)**
aabbbabbba|aa
0 1 2	3	4	5	6	7	Code: 0014352
a b	aa	ab	bb	bba	abb	bbaa
```

**Tilansäästö:**
pituus 12 ja koodin pituus 7, joten voisi säästyä noin 5/12=42% (arvio)


### Purkaminen (decode)

Code: 10143621
chars: a = 0, b = 1
String tulos:: babbabbbabab
Tilansäästö: 1- (8 / 12) * 100 = 33 %, eli kolmasosa

```
**Start:**
|10143621					String: -
0 1
a b

**1: b**
1|0143621					String: b
0 1
a b	

**0: a, new 2 of aa**
10|143621					String: ba
0 1	2
a b	ba

**1 is b, b + current first letter is a new 3 of ab**
101|43621					String: bab
0 1	2	3
a b	ba	ab

**Previous is 1 (b) + current first letter b is a new 4 bb**
1014|3621					String: babbb
0 1	2	3	4
a b	ba	ab	bb

**Add 3 of ab. Previous is 4 bb + current first letter = 5 of bba**
10143|621					String: babbbab
0 1	2	3	4	5
a b	ba	ab	bb	bba	

**Previous is 3 (ab) and current first letter (a), therefore 6: aba **
101436|21					String: babbbababa
0 1	2	3	4	5	6
a b	ba	ab	bb	abb	aba

* 2: ba **
1014362|1					String: babbbabababa
0 1	2	3	4	5	6	7
a b	ba	ab	bb	abb	bba abab

* 1: b **
10143621|					String: babbbabababab
0 1	2	3	4	5	6	7	 8
a b	ba	ab	bb	abb	bba abab bab

```

**Tilansäästö:**
pituus 13 ja koodin pituus 8, joten voisi säästyä noin 5/13=39% (arvio)

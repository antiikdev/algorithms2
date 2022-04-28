#LZW

### Code

String: aabbbabbbaaa

```
**Start:**
|aabbbabbbaaa
0 1 
a b

**Longest char in directory now (a, code: 0) + next char.
Next free number (2 >> aa):**
a|abbbabbbaaa
0 1 2					Code: 0
a b	aa

**Longest char in directory now (aa, code: 2) + next char (b).
Next free number (3 >> aab):**
aa|bbbabbbaaa
0 1 2	3				Code: 02
a b	aa	aab

**Longest char in directory now (b, code: 1) + next char (b).
Next free number (4 >> bb):**
aab|bbabbbaaa
0 1 2	3	4			Code: 021
a b	aa	aab	bb

**Longest char in directory now (a, code: 0) + next char (b).
Next free number (5 >> ab):**
aabbb|abbbaaa
0 1 2	3	4	5		Code: 0230
a b	aa	aab	bb	ab

**Longest char in directory now (bb, code: 4) + next char (a).
Next free number (5 >> ab):**
aabbbab|bbaaa
0 1 2	3	4	5	6	Code: 02304
a b	aa	aab	bb	ab	bba

**Longest char in directory now (aa, code: 2) + next char (null).
Next free number (null):**
aabbbabbba|aa
0 1 2	3	4	5	6	Code: 023042
a b	aa	aab	bb	ab	bba
```

### Extract code (purkaminen)

Code: 10143621
chars: a = 0, b = 1 

```
**Start:**
|10143621				String:
0 1
a b

**1: b**
1|0143621				String: b
0 1
a b	

**0: a, new 2 of ba**
10|143621				String: ba
0 1	2
a b	ba

**1: b, new 3 of ab**
101|43621				String: bab
0 1	2	3
a b	ba	ab

**4: bb, new 4 bb**
1014|3621				String: babb
0 1	2	3	4
a b	ba	ab	bb

**3: ab, new 5 of abb**
10143|621				String: babbab
0 1	2	3	4	5	6
a b	ba	ab	bb	abb	

**Previous is 3 (ab) and 5 abb, therefore 6: bba **
101436|21				String: babbabbba
0 1	2	3	4	5	6
a b	ba	ab	bb	abb	bba

* 2: ba **
1014362|1				String: babbabbbaba
0 1	2	3	4	5	6
a b	ba	ab	bb	abb	bba

* 1: b **
10143621|				String: babbabbbabab
0 1	2	3	4	5	6
a b	ba	ab	bb	abb	bba

```
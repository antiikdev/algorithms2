# Kapsakkiongelma rajoitehakumenetelmällä

Kokonaispainoraja (W): 8
Tavarat järjestetty vähenevään järjestykseen hyötyarvo-painosuhteen
mukaan:
                1  2  3   4
-------------------------------
Hyötyarvo (p): 13  9  10  5
Painot (w):    4   3  5   4
-------------------------------
Hyöty/paino:  3.25 3  2   1.24

Maksimihyöty: u = p + (W-w)(pi+1 / wi+1)

Max. kokonaishyötyarvo ratkaisussa:
```
1: [0,0,0,0]; p=0; w=0; u=0+(8-0)(13/4)=26
```

Kaksi uutta ositusratkaisua, jossa tavara 1 valittu:
```
2: [1,0,0,0]; p=13; w=4; u=13+(8-4)(9/3)=25*
3: [0,0,0,0]; p=0; w=0; u=0+(8-0)(9/3)=24
```

Jatketaan osittaisratkaisusta 2, sillä u:n arvo on parempi.
Tutkitaan tavaran 2 osalta ratkaisut:
```
4: [1,1,0,0]; p=22; w=7; u=22+(8-7)(10/5)=24*
5: [1,0,0,0]; p=13; w=4; u=13+(8-4)(10/5)=21
```

Jatketaan osittaisratkaisusta 4, sillä u:n arvo on parempi.
Tutkitaan tavaran 3 osalta ratkaisut:
```
6: [1,1,1,0]; p=31; w=12; ei sallittu, 12 > W (kokonaispainoraja)
7: [1,1,0,0]; p=22; w=7; u=22+(8-7)(5/4)=23.25
```

Jatketaan osittaisratkaisusta 7, sillä ratkaisu 6 ei ole sallittu
siinä ylittyän kokonaispainorajan vuoksi.
```
8: [1,1,0,1]; p=27; w=11; ei sallittu, 11 > W (kokonaispainoraja)
9: [1,1,0,0] P=22; w=7; u=22 sallittu ratkaisu
```
Osittaisratkaisujen 3. ja 5. u on pienempi.


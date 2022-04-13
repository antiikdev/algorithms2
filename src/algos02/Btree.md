# Bpuu (Btree)

m = 2

## Alkuperainen


								  50
			   20|30|35                         65|75

  16    23|37    31|32    40|44          59    68|69|73    88


## Lisaa: 70*

1. Siirrytaan juurisolmusta oikealle (50 < 70) alipuuhun, josta
edelleen keskimmaiseen alipuuhun (65 < 70 < 75)
2. m = 2, joten alkioita solmuissa 1, 2 tai 3
(2-3-4-puu; m-solmut-osoittimet), täten alisolmu on täynnä (alkioita >=2m-1).
3. Nostetaan alisolmusta keskimmainen alkio (69) ylempaan
solmuun, halkaistaan alisolmu kahteen osaan ja lisataan solmu
uuteen halkaistuun alisolmuun (70*). Talloin osoittimia tulee nelja
kappaletta alisolmuun.

								  50
			   20|30|35                         65|69|75

  16    23|37    31|32    40|44          59    68    70*|73    88
  

## Lisaa: 33*

1. Siirrytään juurisolmusta vasemmalle (33 < 50) alipuuhun, josta
edelleen keskimmaiseen alipuuhun (30 < 33 < 35).
2. Alipuu on taynna (20|30|35). Jokainen hakupolulla vastaan
tuleva täysi solmu täytyy halkaista ennen kuin siirrytään eteenpäin
hakupolulla >> Halkaistaan keskimmaisen kohdalta 
2. m = 2, joten alkioita solmuissa 1, 2 tai 3
(2-3-4-puu; m-solmut-osoittimet), täten alisolmussa on tilaa.
3. Lisataan solmu alisolmuun 31|32 (33*).

                              50
           
	        30                                65|75
 
         20              35              59      68|69|73   88  

 16    23|37   31|32|33*    40|44



# PRVA GRUPA ZADATAKA

<div style="text-align:justify">

Prva grupa zadataka sastoji se od tri zadatka:

1. Rad s GUI-em &rarr; koji se nadovezuje temu **Event Driven Programming**
2. Razmatranje problema s parametrizacijom u JAVI &rarr; nadoezuje se na problem koji smo obradili na predavanjima i vježbama **CompareTwo**
3. Primjene **Strategy** predloška dizajna &rarr; zadatak koji će imati malo detaljnije upute 

## ZADATAK 1-1 ![simple](https://img.shields.io/badge/complexity-**-green):

Potrebno je nparaviti GUI kprema slici 1 na način da budu zadovoljeni sljedeći uvjeti:

 - Izgled GUI-a (tzv. `Look and Feel`) doradite po vlasitom izboru (primjer imate na slici 1)

>  <b>Look</b> refers to the appearance of GUI widgets (more formally, JComponents) and <b>feel</b> refers to the way the widgets behave. 
>  (Oracle Java Documentation - The Java<sup>TM</sup> Tutorials)

 - Funkcionalnost doradite na način da:
    - Lista sadrži porodicu logičkog fonta (npr. SAN_SERIF) &rarr; pogledati [JAVA API - FONT](https://docs.oracle.com/en/java/javase/15/docs/api/java.desktop/java/awt/Font.html)
    - ComboBox sadrži stil fonta (npr. BOLD &rarr; pogledati isti api)
    - Dugme `Confirm` s desnog panela šalje podatke u prezetacijski panel aplikacije, a ujedno se mijenja font (porodica, stil i veličina) prema odabranim vrijednostima (slika2)
    - Dugme `Reset ALL` s desnog panela briše sadržaj s prezentacijskog panela, te cijelu aplikaciju resetira u polazno stanje
 
 ![important](https://img.shields.io/badge/important-IMPORTANT-red?style=for-the-badge&logo=ASKfm)
 
 > Svaki zadatak treba slijediti pravilo od minimalno četiri commit-a
 
 ![GUI_1](https://dub01pap002files.storage.live.com/y4me0AmqGgWsSwr_9wAOQnjycjkYg26oprIyYrMyCbv6IbifaUERiYemeEMvmicUI9eXdaQOTfBROAiDaks5LkSsLgrRxaAdx5-XDqXfOUbXvMIY9Zz85jFaPqEq71jNVEhv8_A_QnEdbd3K2WQ0jfZNjzbTzGjkApC-KGQGT3Qgd4sXEPaynQRwRzNpig6iAK1?width=1037&height=544&cropmode=none)
 
 **Slika 1** Izgled uređeng sučelja
 
 ![GUI_2](https://dub01pap002files.storage.live.com/y4mVEsAfvaJsda97AW7PuemKxileRR84oCA0qnC0ACZ8t4nc7FeYkNPBz1jRc4BeAJDgFAtSgNK1eKHsrezw0I_BUAcUR-BEVnitJ65Nrk1OFa3WsKlGh47jjlYbJbHc6ErZHv_BXYxsgQvrOt8LRQKm0cA-ZQfrBqK8i59155mh6C1j02Coj0DLZbXUwsAdx2F?width=1035&height=541&cropmode=none)
 **Slika 2** Stanje na prezentacijskom panelu nakon aktiviranja dugmeta `Confirm Font`
 
 > Dodatno uređivanje GUI-a možete obogatiti korištenjem javnih repozitorija [DJ-Raven](https://github.com/DJ-Raven)
 
 ## ZADATAK 1-2  ![simple](https://img.shields.io/badge/complexity-**-green):
 Zadana vam je klasa `User` na sljedeći način:
 
 ```JAVA 
 import java.util.UUID;

public class User {

    private static int cntrID = 300;
    private int id;
    private String name;

    public User(){
        this.name = UUID.randomUUID().toString().substring(28) + "_" + cntrID;
        this.id = cntrID;
        cntrID++;
    }

    public int getID(){
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    
}
 ```
 
 Koristimo i klasu `CompareTwo` iz teme o parametrizaciji u JAVI:
 
 ```JAVA
	
 public class CompareTwo <T extends Comparable<T>> {

    private T fst;
    private T snd;

    public CompareTwo(T fst, T snd){
        this.fst = fst;
        this.snd = snd;
    }

    public void compareAndPerform(){
        if (fst.compareTo(snd) > 0){
            System.out.println("Fst is selected to perform something....");
            System.out.println(fst);
        } else if (fst.compareTo(snd) < 0){
            System.out.println("Snd is selected to perform something....");
            System.out.println(snd);
        } else {
            System.out.println("Both are equals!!!");
            System.out.println("Nothing to perform...");
        }
    }
}
 
 ```
                                           
U klasi `TestGens_1`, koja sadrži `main` metodu trebate napraviti metodu `popListOfUsers` koja će kreirati i popuniti listu (ArrayList) s objektima klase `User` do zadane veličine `n` (npr. n=7 kreira listu sa sedam objekata klase `User`). Nakon toga trebate kreirati parametriziranu metodu `shuffleListElement` koja može "promiješati" bilo koju ArrayListu na način da se dobije nasumičan raspored elemenata polazne liste (pogledajte primjer). 
                                         
                                           
```
SHUFFLE - primjer:

polazna lista -> [-11, -3, 0, 34, 67, 89, 231, 457]
	
shuffle metoda može dati -> [0, 457, -3, 231, 67, 34, -11, 89]
```

> Za razliku od ovog primjera koji ima cjelobrojne elemene vi ćete imati objekte klase `User` &#8594; lako ćete moći kontrolirati rezultat prema ID vrijednostima.

Slijedi interesantniji dio &Rarr; kreirajte rekurzivnu parametriziranu metodu `getCombinations` koja će dati sve moguće parove za usporedbu iz polazne liste u vidu njihovih indeksa. To znači da trebate dobiti novu listu koja je paramterizirana s nizom int[] gdje svaki član predstavlja jedan par indeksa. Primjerice:
	
	
```
	Lista -> [-11, -3, 0, 34, 67, 89, 231, 457] nakon primjene metode getCombinations daje 
	Lista kombinacija -> [ [0,1], [0,2], [0,3], [0,4], [0,5], [0,6], [0,7], [1,2], [1,3], [1,4], [1,5], [1,6], [1,7],
				[2,3], [2,4], [2,5], [2,6], [2,7], [3,4], [3,5], [3,6], [3,7], [4,5], [4,6], [4,7], [5,6],
				[5,7], [6,7]]
```
					   

Nadogradite klasu `User` na način da je moguće koristiti s klasom `CompareTwo` &rarr; osnova za komparaciju neka vam bude vrijednost ID-a korisnika. Nakraju trebate realizirati parametriziranu metodu `compareAllPairsAndPrint` koja prima bilo koju listu elemenata koji su komparabilni i potom korištenjem `CompareTwo` vrši usporedbu svih mogućih parova iz ulazne liste (ulazna lista prethodno treba biti "promiješana" &rarr; `shuffle`). U testirnju ćete koristiti samo listu objekata klase User. 
	
```
Logika testiranja:
	1. Kreirajte listu od 7 elemenata (User) -> popListofUsers
	2. Promijšajte tu listu -> shuffleElements
	3. Ispišite polaznu listu i promiješanu da se uvjerite u točnost implementacije metoda
	4. Komparirajte sve parove promiješane liste -> compareAllPairsAndPrint
	
```
	
Mogući konzolni izlaz:
	
```
-----------------------------------------------------------------------------------------
Populated list:
[User{id=300, name='21a09d5e_300'}, User{id=301, name='0c5c0630_301'}, User{id=302, name='523c1467_302'}, User{id=303, name='2c64e609_303'}, User{id=304, name='8f5d0164_304'}]
Shuffled: 
[4, 1, 2, 0, 3]
[User{id=304, name='8f5d0164_304'}, User{id=301, name='0c5c0630_301'}, User{id=302, name='523c1467_302'}, User{id=300, name='21a09d5e_300'}, User{id=303, name='2c64e609_303'}]
-----------------------------------------------------------------------------------------

User{id=304, name='8f5d0164_304'}
User{id=301, name='0c5c0630_301'}
Fst is selected to perform something....
User{id=304, name='8f5d0164_304'}
---------------------------------------------------------------------------
User{id=304, name='8f5d0164_304'}
User{id=302, name='523c1467_302'}
Fst is selected to perform something....
User{id=304, name='8f5d0164_304'}
---------------------------------------------------------------------------
User{id=304, name='8f5d0164_304'}
User{id=300, name='21a09d5e_300'}
Fst is selected to perform something....
User{id=304, name='8f5d0164_304'}
---------------------------------------------------------------------------
User{id=304, name='8f5d0164_304'}
User{id=303, name='2c64e609_303'}
Fst is selected to perform something....
User{id=304, name='8f5d0164_304'}
---------------------------------------------------------------------------
User{id=301, name='0c5c0630_301'}
User{id=302, name='523c1467_302'}
Snd is selected to perform something....
User{id=302, name='523c1467_302'}
---------------------------------------------------------------------------
User{id=301, name='0c5c0630_301'}
User{id=300, name='21a09d5e_300'}
Fst is selected to perform something....
User{id=301, name='0c5c0630_301'}
---------------------------------------------------------------------------
User{id=301, name='0c5c0630_301'}
User{id=303, name='2c64e609_303'}
Snd is selected to perform something....
User{id=303, name='2c64e609_303'}
---------------------------------------------------------------------------
User{id=302, name='523c1467_302'}
User{id=300, name='21a09d5e_300'}
Fst is selected to perform something....
User{id=302, name='523c1467_302'}
---------------------------------------------------------------------------
User{id=302, name='523c1467_302'}
User{id=303, name='2c64e609_303'}
Snd is selected to perform something....
User{id=303, name='2c64e609_303'}
---------------------------------------------------------------------------
User{id=300, name='21a09d5e_300'}
User{id=303, name='2c64e609_303'}
Snd is selected to perform something....
User{id=303, name='2c64e609_303'}
---------------------------------------------------------------------------

```
	
## ZADATAK 1-3 ![simple](https://img.shields.io/badge/complexity-**-green):
	
Ovaj zadatak vezan je uz znanja iz predložaka, preciznije predloška strategija. Potrebno je napraviti aplikaciju koja će dinamički moći birati način plaćanja bez da klijent unaprijed zna koji način plaćanje će biti korišten. Plaćanja su:

1. PayPal
2. E - wallet
3. BitCoin
4. Credit Card

Vodite računa kako kategorija (TV, Shoes, Jackets, PCs) u pripadnoj listi trebaju mijenjati raspoložive artikle (vi ih slobodno odredite na način da ih ne može biti manje od 8 u svakoj kategoriji). Smatrat ćemo da je korisnik već registriran i da su sigurnosni aspekti za plaćanje zadovoljeni. Trebate kreirati klase:

 - User
 - Purchase
 - Item

Kategorije proizvoda su pobrojani tip s traženim nazivima. Svaka kupnja vezuje se uz korisnika i podatke o proizvodima s pripadnim kategorijama, te način plaćanja. Takošer, trebate naparviti strategije za spremanje i učitavanje podataka u `bin` i `txt` formatu. Dugme za čišćenje briše sve podatke koji su na panelu prikaza podataka, ali ne i one koji su eventualno učitani iz neke datoteke. Svi podaci se pohranjuju u mapu `DATA`. GUI aplikacije je prikazan na slici 3:


	
![GUI_strategy](../Imgs/gui_strategy.jpg)

**Slika 3** Izgled sučelja uz zadatak 3
 
 </div>
 

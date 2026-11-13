# Progetto Java – Gestione Ordini di un Ristorante

## Obiettivo

Realizzare un'applicazione Java per la gestione degli ordini di un ristorante utilizzando i principali concetti della programmazione ad oggetti:

- Classi
- Ereditarietà
- Classi astratte
- Interfacce
- Polimorfismo
- Eccezioni personalizzate (Custom Exception)
- Collezioni (`ArrayList`)

---

# Regole Generali

L'applicazione deve permettere di:

- Creare diversi tipi di piatti.
- Inserire i piatti in un ordine.
- Calcolare il totale dell'ordine.
- Stampare uno scontrino.
- Gestire eventuali errori tramite eccezioni personalizzate.

---

# STEP 1 – Classe Astratta Piatto

## Obiettivo

Comprendere il concetto di **classe astratta** e di **ereditarietà**.

---

## Classe Astratta `Piatto`

Tutti i piatti del ristorante possiedono:

### Attributi

- nome
- prezzo

### Metodi

- getNome()
- getPrezzo()

### Metodo astratto

- getDescrizione()

---

## Classi Derivate

Creare le seguenti classi:

### Pizza

Attributi aggiuntivi:

- diametro

---

### Primo

Attributi aggiuntivi:

- grammi

---

### Dolce

Attributi aggiuntivi:

- calorie

---

### Secondo

Attributi aggiuntivi:

- tipoCottura

---

## Diagramma

```text
              Piatto (astratta)
                     |
      ----------------------------------
      |           |           |        |
    Pizza       Primo      Dolce   Secondo
```

---

## Test obbligatorio nel Main

Creare almeno:

- 1 Pizza
- 1 Primo
- 1 Dolce
- 1 Secondo

Stampare:

- nome
- prezzo
- descrizione

### Esempio di output

```text
Margherita - 8.5€
Pizza da 32 cm

Carbonara - 10€
Primo da 250 g

Tiramisù - 5€
Dolce da 450 calorie

Tagliata - 18€
Secondo alla griglia
```

---

# STEP 2 – Classe Ordine

## Obiettivo

Gestire una collezione di oggetti sfruttando il polimorfismo.

---

## Classe `Ordine`

Attributo:

```java
private ArrayList<Piatto> piatti;
```

---

## Metodi richiesti

### aggiungiPiatto()

Permette di aggiungere un piatto all'ordine.

---

### mostraOrdine()

Visualizza tutti i piatti presenti.

---

### calcolaTotale()

Restituisce il totale dell'ordine.

---

## Diagramma

```text
Ordine
|
|---- ArrayList<Piatto>
                |
      -------------------------
      |           |           |
    Pizza       Primo      Dolce
```

---

## Test obbligatorio nel Main

1. Creare un ordine.
2. Inserire almeno 5 piatti.
3. Stampare il contenuto dell'ordine.
4. Stampare il totale.

### Esempio

```text
=== ORDINE ===

Margherita -> 8.50€
Carbonara -> 10€
Tiramisù -> 5€
Diavola -> 9€
Lasagne -> 11€

Totale: 43.50€
```

---

# STEP 3 – Interfacce

## Obiettivo

Comprendere la differenza tra:

- Classe astratta
- Interfaccia

---

# Differenza Teorica

## Classe Astratta

Rappresenta una categoria di oggetti.

Nel nostro caso:

```java
Piatto
```

è una categoria generale da cui derivano gli altri piatti.

Può contenere:

- attributi
- costruttori
- metodi concreti
- metodi astratti

---

## Interfaccia

Rappresenta una capacità o un comportamento.

Non descrive COSA è un oggetto.

Descrive COSA SA FARE.

---

## Interfaccia `Preparabile`

Tutti i piatti devono poter indicare il proprio tempo di preparazione.

Metodo:

```java
int tempoPreparazione();
```

---

## Modifica delle classi

Le classi:

- Pizza
- Primo
- Dolce

devono implementare l'interfaccia.

Esempio:

```java
public class Pizza extends Piatto implements Preparabile
```

---

## Test obbligatorio nel Main

Stampare:

```text
Margherita
Tempo preparazione: 12 minuti

Carbonara
Tempo preparazione: 15 minuti

Tiramisù
Tempo preparazione: 3 minuti
```

---

# STEP 4 – Seconda Interfaccia

## Obiettivo

Mostrare che una classe può implementare più interfacce.

---

## Interfaccia `Asporto`

Metodo:

```java
double costoConfezione();
```

---

## Requisiti

Possono essere da asporto:

- Pizza
- Dolce
- Secondo

Non può essere da asporto:

- Primo

---

## Esempio

```text
Pizza Margherita
Costo confezione: 0.50€

Tiramisù
Costo confezione: 0.30€

Tagliata
Costo confezione: 0.80€
```

---

## Diagramma aggiornato

```text
                   Preparabile
                        ^
                        |
                        |
                Piatto (astratta)
                 ^      ^      ^      ^
                 |      |      |      |
              Pizza  Primo  Dolce  Secondo
                 ^             ^      ^
                 |             |      |
                          Asporto

Pizza, Dolce e Secondo implementano Asporto.
```

---

## Test obbligatorio nel Main

Creare una lista di oggetti che implementano l'interfaccia `Asporto` e stampare il costo delle confezioni.

---

# STEP 5 – Prima Eccezione Personalizzata

## Obiettivo

Comprendere le eccezioni custom.

---

## Eccezione

### PrezzoNonValidoException

Deve essere lanciata quando si prova a creare un piatto con:

```text
prezzo <= 0
```

---

## Esempio

```java
Pizza p = new Pizza("Margherita", -5, 32);
```

deve generare:

```text
PrezzoNonValidoException:
Il prezzo deve essere maggiore di zero.
```

---

## Test obbligatorio nel Main

Usare:

```java
try-catch
```

per intercettare l'errore.

---

# STEP 6 – Seconda Eccezione Personalizzata

## Obiettivo

Gestire un ordine non valido.

---

## Eccezione

### OrdineVuotoException

Da lanciare quando si prova a:

```java
ordine.mostraOrdine()
```

oppure

```java
ordine.calcolaTotale()
```

senza piatti presenti.

---

## Esempio

```text
OrdineVuotoException:
L'ordine non contiene piatti.
```

---

## Test obbligatorio nel Main

Creare un ordine vuoto e verificare il corretto funzionamento del `try-catch`.

---

# STEP 7 – Versione Finale

## Requisiti Finali

L'applicazione deve permettere di:

✅ Gestire più tipologie di piatti (Pizza, Primo, Dolce, Secondo)

✅ Utilizzare una classe astratta

✅ Utilizzare almeno due interfacce

✅ Utilizzare il polimorfismo

✅ Utilizzare una collezione `ArrayList`

✅ Utilizzare almeno due eccezioni personalizzate

✅ Calcolare il totale di un ordine

✅ Stampare uno scontrino finale

---

# Esempio di Output Finale

```text
=== SCONTRINO ===

Pizza Margherita      8.50€
Lasagne              11.00€
Tiramisù              5.00€
Tagliata             18.00€

Totale ordine:       43.00€

Tempo totale preparazione: 45 minuti

Piatti da asporto:
- Margherita
- Tiramisù
- Tagliata
```

---

# Consegna

Consegnare:

1. Diagramma UML del progetto.
2. Codice sorgente completo.
3. Main di test per ogni step.
4. Main finale con tutte le funzionalità integrate.

---

# Bonus (Facoltativo)

Implementare una nuova categoria:

```text
Bevanda
```

che estende `Piatto` e implementa `Preparabile`.

Aggiungere inoltre:

```text
ScontoApplicabile
```

come nuova interfaccia per alcune bevande in promozione.

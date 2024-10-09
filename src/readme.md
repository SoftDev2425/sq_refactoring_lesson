# Refactoring

- Singleton Pattern** (Creational) til oprettelse af én Library instans over hele projektet.
- **Factory Pattern** (Creational) til oprettelse af Book objekter.. Der er en overordnet abstrakt Book klasse, som selvfølgelig ikke kan instantieres, og derefter kan man lave custom Book typer, så som AudioBook, som PhysicalBook og EBook. De her extender Book og har deres egne ekstra metoder.. De kan nu også returnere deres egne typer, i stedet for at det skal ske ved oprettelse hver gang. Det vi får ud af det er, at vi ikke behøver direkte at instantiere Book objekter i main, og går det lettere at tilføje nye typer senere hen..
- **Decorator Pattern** (Structural) SpecialEditionBook klasse som wrapper Book klassen, og kan lave om tilføje adfærd.
- **Command Pattern**: særlige command klasse til at tilføje og eller fjerne bøger
- **Iterator Pattern**: kan også tilføjes, hvis man ønsker mere kontrol over iterationen af bøger, f.eks. filtrering på genre osv..

Main metoden er mere clean, uden type casting. Tilgik objekters variabler direkte --> Lavet private variabler/attributer og anvendt getters i stedet (good practice)

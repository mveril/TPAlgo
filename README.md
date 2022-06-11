# TP algoritmique Java
⚠️ Ce dépôt est une archive, [cliquez ici pour être redirigé vers le dépôt complet des TP Java](https://github.com/mveril/TP-Java).

Ce TP à été effectué dans le cadre
de la formation M2I Java Sopra Steria
## Ex 1
>Ecrire un algorithme qui demande l'âge d'un enfant. Ensuite, il l'informe de sa catégorie :
>
>« Poussin » de 7 à 9 ans
>
>« Pupille » de 10 à 11 ans
> 
>« Benjamin » de 12 à 13 ans
>
>« Minime » de 14 à 15 ans
>
>« Cadet » 16 à 17 ans
### Pseudo code
```
Si age < 7
  Afficher "Trop jeune"
Sinon si age <= 9
  Afficher "Poussin"
Sinon si age <= 11
  Afficher "Pupille"
Sinon si age <= 13
  Afficher "Benjamin"
Sinon si age <= 15
  Afficher "Minime"
Sinon si age <= 17
  Afficher "Cadet"
Sinon
  Afficher "Trop grand" 
```

## Ex 2
>Ecrire un programme Java qui demande à l'utilisateur de saisir la valeur du diamètre, et qui ensuite va effectuer le calcul de la surface.
>
>Surface = Rayon x Rayon x PI;
Rayon = Diamètre / 2
### Pseudo code
```
 Rayon=Diamètre/2
 Surface = rayon*rayon*PI
```

## Ex 3
>Ecrire un programme Java qui demande à l'utilisateur de saisir son nom, prenom et age, et qui ensuite va afficher le message : "Vous vous appelez &lt;prenom&gt; &lt;nom&gt;, et vous avez &lt;age&gt; ans"
### Pseudo code
```
Afficher Format("Vous vous appelez %s %s, et vous avez %s ans", prenom, nom, age")
```

## Ex 4
> Ecrire un programme Java qui déclare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
> Exemple :
> Entrez la première valeur(a) : 51
> Entrez la deuxième valeur(b) : 876
> Entrez la troisième valeur(c) : 235
> Les valeurs entrées sont : a = 51, b = 876 et c = 235
> Permutation: b <== a, c <== b, a <== c
> Les valeurs permutées sont : a = 235, b = 51 et c = 876

### Pseudo code
```
d=c
c=b
b=a
a=d
Afficher "a=",a
Afficher "b=",b
Afficher "c=",c
```

## Ex 5

> Ecrivez un programme Age.java qui :
> declare l'âge de l'utilisateur ;
> lit la réponse de l'utilisateur et l'enregistre dans une variable age de type entier ;
> Effectue le calcul de l'année de naissance de l'utilisateur et l'enregistre dans la variable annee de type entier ;
> affiche l'année de naissance ainsi calculée.
>
> Exemple d'exécution du programme:
> age = 30
> Votre année de naissance est : 1992
### Pseudo code
```
anneeDeNaissance=annee-age
Afficher "Votre année de naissance est : ", anneeDeNaissance 
```

# Source des infos :

https://devstory.net/10175/java-regular-expression

# Projet java

| Expression régulière | Description                                                                                                                                                  |
|:--------------------:|:-------------------------------------------------------------------------------------------------------------------------------------------------------------|
|          .           | Correspond (match) à n'importe quel caractère                                                                                                                |
|        ^regex        | Expression régulière doit correspondre au début de la ligne.                                                                                                 |
|        regex$        | Expression régulière doit correspondre à la fin de la ligne.                                                                                                 |
|        [abc]         | Définit la définition, peut correspondre à a ou b ou c.                                                                                                      |
|      [abc][vz]       | Définit la définition, peut correspondre à a ou b ou c suivi de v ou z                                                                                       |
|        [^abc]        | Lorsque le signe ^ apparaît comme le premier caractère dans les parenthèses, il nie le motif. Cela peut correspondre à tout caractère à part de a ou b ou c. |
|       [a-d1-7]       | Portée : corresponde à une chaîne de caractères entre a et d et les chiffres de 1 à 7.                                                                       |
|      X&#124; Z       | Cherche X ou Z.                                                                                                                                              |
|          XZ          | Cherche X et suivi d'être Z.                                                                                                                                 |
|          $           | Vérifie la fin de la ligne.                                                                                                                                  |
|          \d          | Tout chiffre, est l’abréviation de [0-9]                                                                                                                     |
|          \D          | Le caractère n'est pas un nombre, est l’abréviation de [^0-9]                                                                                                |
|          \s          | Le caractère est un espace blanc, est l’abréviation de [ \t\n\x0b\r\f]                                                                                       |
|          \S          | Le caractère n'est pas un espace blanc, est l’abréviation de [^\s]                                                                                           |
|          \w          | Un caractère de mot, est l’abréviation de [a-zA-Z_0-9]                                                                                                       |
|          \W          | Un caractère n'est pas de mot, est l’abréviation de [^\w]                                                                                                    |
|         \S+          | Certains caractères qui ne sont pas des espaces blancs (un ou plusieurs)                                                                                     |
|          \b          | Caractères dans l'a-z ou A-Z ou 0-9 ou _, est l’abréviation de [a-zA-Z0-9_].                                                                                 |
|          *           | Affiche 0 ou plusieurs fois, est l’abréviation de {0,}                                                                                                       |
|          +           | Affiche 1 ou plusieurs fois, est l’abréviation de {1,}                                                                                                       |
|          ?           | Affiche o ou 1 fois, est l’abréviation de {0,1}.                                                                                                             |
|         {X}          | Affiche X fois, {}                                                                                                                                           |
|        {X,Y}         | Affiche dans environ X à Y fois.                                                                                                                             |
|         *?           | * signifie apparaitre 0 ou plusieurs fois, ajouter ? cela signifie qu'il essaie de rechercher la correspondance la plus petite.                              |

1. Créez une interface **`Animal`** qui définit les méthodes suivantes :
    - **`String getNom()`**
    - **`String parler()`**
    - **`void manger()`**
2. Créez plusieurs classes qui implémentent l'interface **`Animal`**, comme **`Lion`**, **`Elephant`**, **`Ours`**, etc. Chaque classe devrait implémenter les méthodes de l'interface de manière appropriée. Par exemple, la méthode **`parler()`** pourrait retourner "Roar" pour un **`Lion`** et "Trumpet" pour un **`Elephant`**.
3. Créez une classe **`Enclos`** qui contient deux attributs **`Animal`** : **`animal1`** et **`animal2`**. Cette classe devrait avoir les méthodes suivantes :
    - **`void ajouterAnimal1(Animal animal)`**
    - **`void ajouterAnimal2(Animal animal)`**
    - **`void nourrirAnimaux()`**
    - **`void faireParlerAnimaux()`**
    
    > En temps normal, nous utiliserions les `**Collections**` pour ce type de tâche. Cependant, comme nous n'avons pas encore abordé ce sujet, nous allons procéder différemment.
    > 
4. Enfin, dans votre méthode **`main()`**, créez plusieurs animaux et enclos, ajoutez les animaux aux enclos et utilisez les méthodes **`nourrirAnimaux()`** et **`faireParlerAnimaux()`**.

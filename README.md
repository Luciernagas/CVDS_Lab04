### Desarrollo Dirigido por Pruebas + DIP + DI + Contenedores Livianos
### ♡ Luisa Valentina De la hoz Rocha ♡


Para este taller se va a trabajar sobre el juego del ahorcado.

El sistema actual de puntuación del juego comienza en 100 puntos y va
descontando 10 puntos cada vez que se propone una letra incorrecta.

Algunos usuarios han propuesto diferentes esquemas para realizar la
puntuación, los cuales se describen a continuación:

* OriginalScore: 
    * Es el esquema actual, se inicia con 100 puntos.
    * No se bonifican las letras correctas.
    * Se penaliza con 10 puntos con cada letra incorrecta.
    * El puntaje minimo es 0.

* BonusScore: 
    * El juego inicia en 0 puntos.
    * Se bonifica con 10 puntos cada letra correcta.
    * Se penaliza con 5 puntos cada letra incorrecta.
    * El puntaje mínimo es 0
    
* PowerBonusScore:
    * El juego inicia en 0 puntos.
    * La $i-ésima$ letra correcta se bonifica con $5^i$.
    * Se penaliza con 8 puntos cada letra incorrecta.
    * El puntaje mínimo es 0
    * Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es
      500.

Lo anterior, se traduce en el siguiente modelo, donde se aplica el
principio de inversión de dependencias:


![](img/model.png)


### Parte I

1. Clone el proyecto (no lo descargue!).

<p align="center">
 <img src="https://user-images.githubusercontent.com/104604359/190930290-8d2d1b7e-77ea-4fe6-ad51-4f3b215ff377.png" height="160px"/></p>
  
2. A partir del código existente, implemente sólo los cascarones del
   modelo antes indicado.

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930329-1954ad14-7a4c-40bc-98d1-010049db3194.png" height="120px"/></p>

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930356-574dbc42-98e5-4011-8d29-06bcc4c39827.png" height="157px"/></p>

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930366-90e042cb-ea31-4b28-9cac-ae14c22da252.png" height="160px"/></p>

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930376-844e2bf4-4099-41aa-aa30-99ead659a6c8.png" height="160px"/></p>

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930392-99032e46-93de-41a8-b043-70badff87543.png" height="160px"/></p>

3. Haga la especificación de los métodos calculateScore (de las tres
   variantes de GameScore), a partir de las especificaciones
   generales dadas anteriormente. Recuerde tener en cuenta: @pre,
   @pos, @param, @throws.

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930420-1a4196c1-ea64-403c-a11a-27453d129e06.png" height="160px"/></p>

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930428-11c0a1de-0bff-4a5c-bbbc-c3bc0e7aac29.png" height="172px"/></p>

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930444-f9795e78-af43-45c6-a7ca-8fb0d7a11df7.png" height="285px"/></p>

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930455-6e72a298-3aea-41a9-8d72-f37a5d4b6390.png" height="307px"/></p>

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930465-0f11edb1-25d1-4978-a19d-ea628db00fc7.png" height="308px"/></p>

4. Haga commit de lo realizado hasta ahora. Desde la terminal:

	```bash		
	git add .			
	git commit -m "especificación métodos"
	```

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930476-81e4d31b-3fd3-4392-a46c-e069cc5b37ec.png" height="250px"/></p>

5. Actualice el archivo `pom.xml` e incluya las dependencias para la ultima versión de JUnit y la versión del compilador de Java a la versión 8 .

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930491-592298e5-6f35-48f5-9059-43a05fca9435.png" height="340px"/></p>

6. Teniendo en cuenta dichas especificaciones, en la clase donde se
   implementarán las pruebas (GameScoreTest), en los
   comentarios iniciales, especifique las clases de equivalencia para
   las tres variantes de GameScore, e identifique
   condiciones de frontera.
   
### GameScore
c = correctCount

i = incorrectCount

Input = c, i

Invalid = c < 0 || i < 0

Invalid = Throws PARAMETROS_NEGATIVOS Exception

valid = c > 0 & i > 0

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930567-e6b29229-c5ee-4a3f-ad51-7f988bcc2376.png" height="60px"/></p>


### OriginalScore

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930602-58b32224-976b-4ed4-a487-fabe883958ff.png" height="100px"/></p>

### BonusScore

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930617-cf212b63-5ccb-4aa3-b291-56fd77e76fe8.png" height="107px"/></p>

### PowerBonusScore

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930647-a42ef168-2a79-4724-bc4a-787ab547fc1e.png" height="123px"/></p>


7. Para cada clase de equivalencia y condición de frontera, implemente
   una prueba utilizando JUnit.

En el código

8. Haga commit de lo realizado hasta ahora. Desde la terminal:

	```bash		
	git add .			
	git commit -m "implementación pruebas"
	```

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930673-2d8c2847-1e42-4fc2-8919-aa522b07605f.png" height="250px"/></p>

9. Realice la implementación de los 'cascarones' realizados anteriormente.
   Asegúrese que todas las pruebas unitarias creadas en los puntos anteriores
   se ejecutan satisfactoriamente.

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930706-be9e7ada-dbfb-4d33-8315-b9cb687e177d.png" height="380px"/></p>

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930717-dbfe386a-4c44-4de1-b07f-787e3c0753e9.png" height="380px"/></p>

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930729-f24aaa39-992a-451f-9b38-9ca5c8695624.png" height="364px"/></p>

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190931059-b9798027-697f-43b2-a3e4-61406c80d40b.png" height="250px"/></p>

10. Al finalizar haga un nuevo commit:

	```bash		
	git add .			
	git commit -m "implementación del modelo"
	```

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930754-2c1badef-ecfc-439a-9db6-3e1e6cce2fb5.png" height="260px"/></p>

11. Para sincronizar el avance en el respositorio y NO PERDER el trabajo, use
    el comando de GIT para enviar los cambios:

```bash	
	git push <URL Repositorio>	
```

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190930762-056a8629-4f1d-4ca0-907c-6abf9ba231c3.png" height="180px"/></p>


### Parte II

Actualmente se utiliza el patrón FactoryMethod
que desacopla la creación de los objetos para diseñar un juego
de ahorcado (revisar createGUIUsingFactoryMethod en SwingProject, el
constructor de la clase GUI y HangmanFactoryMethod).

En este taller se va a utilizar un contenedor liviano ([GoogleGuice](https://github.com/google/guice)) el cual soporta la inyección de las dependencias.

1. Utilizando el HangmanFactoryMethod (MétodoFabrica) incluya el
   OriginalScore a la configuración.
   
<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190932136-ed4682e0-81e8-4745-bd35-f8e49eee4624.png" height="400px"/></p>

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190932151-e10b4325-7682-4942-8ad8-0fcacaf43147.png"/></p>

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190932164-9cce0e6b-5d3b-4e26-96a9-704e31dd58dc.png"/></p>


Incorpore el Contenedor Liviano Guice dentro del proyecto:

* Revise las dependencias necesarias en el pom.xml.

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190932636-e3400d0c-dde9-4768-9a2f-2cc7e40000aa.png"/></p>

* Modifique la inyección de dependencias utilizando guice en lugar del
  método fábrica..

<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190932698-99641c67-7112-4871-83a2-8f592fd31497.png"/></p>

* Configure la aplicación de manera que desde el programa SwingProject
  NO SE CONSTRUYA el Score directamente, sino a través de Guice, asi
  mismo como las otras dependencias que se están inyectando mediante
  la fabrica.
* Mediante la configuración de la Inyección de
  Dependencias se pueda cambiar el comportamiento del mismo, por
  ejemplo:
	* Utilizar el esquema OriginalScore.
	* Utilizar el esquema BonusScore.
	* Utilizar el idioma francés.
    * Utilizar el diccionario francés.
	* etc...
* Para lo anterior, [puede basarse en el ejemplo dado como
  referencia](https://github.com/PDSW-ECI/LightweighContainers_DepenendecyInjectionIntro-WordProcessor).
  
<p align="center">
<img src="https://user-images.githubusercontent.com/104604359/190932977-194b98bc-d979-4c33-9a66-9fb82654b2e1.png"/></p>



### Funcionamiento en Local

![im.png](src/main/resources/im.png)

![im1.png](src/main/resources/im1.png)


### Lanzamiento en nube

Creamos la instancia

![img.png](src/main/resources/img.png)

instalamos Java, git y maven en nuestras instancias EC2

	 sudo yum install java-17-amazon-corretto.x86_64




  ```
  sudo yum install git -y
  ```
  ```
  sudo yum install maven -y
  ```

Clonamos el repositorio


```
  git clone https://github.com/CamiloCanta/Parcial2_AREP.git
  ```

Limpiamos el target

```
  mvn clean package install
  ```

![img_1.png](src/main/resources/img_1.png)


Importante abrir los puertos en la configuracion de la instancia

![img_2.png](src/main/resources/img_2.png)


corremos el comando siguiente en nuestra instancia para correr la aplicacion y luego probar

```
java -cp "target/classes:target/dependency/*" eci.escuelaing.edu.co.SparkLucas
```

![img_3.png](src/main/resources/img_3.png)

![img_4.png](src/main/resources/img_4.png)


### Video demo

[videodemo.mp4](src%2Fmain%2Fresources%2Fvideodemo.mp4)

### Autor
#### Camilo Andres Cantillo Tatis
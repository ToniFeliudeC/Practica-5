# Práctica 5: Calculadora Casos Test

## Toni Feliu y Daniel Valcarce

Para realizar esta práctica hemos utilizado Eclipse IDE ya que ya incluía los JUnit test cases.

Hemos utiliado el bash de git para realizar todas las interacciones necesarios con github.

### **1. Crear nuevo proyecto de github**

Creamos el repositorio público, sin README incluido ya que este será añadido posteriormente en nuestro primer commit:

<img src="https://i.gyazo.com/b540f2f7778906c3c489d03224dfe13f.png">

### **2. Crear la interfaz ICalculadora con las operaciones sumar, restar, multiplicar y dividir**

Hemos creado un proyecto llamada "Practica5" en el que existirán la interfaz ICalculadora, la clase Calculadora y la clase CalculadoraTest.

<img src="https://i.gyazo.com/b07a83e733221b1b0b3f7d84069b81d7.png">

### **3. Crear la clase Calculadora que implemente la interfaz ICalculadora e implementar los métodos**

<img src="https://i.gyazo.com/1122df6bfdbf4dd0f6d9910cf64ff9bf.png">

### **4. Realizar el primer commit a github**

El primer paso es abrir el bash de git desde el origen del proyecto.

<img src="https://i.gyazo.com/5521f83e786904230c6f93675674e10f.png">

Después realizamos la siguiente secuencia de comandos para, crear el repositotio en local, añadir todos los archivos del proyecto a la staging area, para posteriormente commitearlos y pushear el repositorio local al de github:

1.Crear el repositorio local

```git init```

2.Añadir todos los archivos al staging area

```git add .```

3.Commitear todos los archivos al repositorio local

```git commit -m "initial commit"```

4.Definir el repositorio que creamos anteriormente en github, como repositorio remoto destino al que pushear el local

```git remote add origin https://github.com/ToniFeliudeC/Practica-5.git```

5.Crear la rama main

```git branch -M main```

6.Finalmente pushear el repositorio local al remoto

```git push -u origin main```

<img src="https://i.gyazo.com/1f8c2b0fbd8c72437360c729e11a4818.png">

### **5. Crear tests unitarios en JUnit**

JUnit viene incorporado en Eclipse, por ello, solu necesitamos crear un nueva JUnit test case en nuestro proyecto:

<img src="https://i.gyazo.com/af6b2afd5e59f4e4642a5ef39a646b60.png">

Posteriormente hemos creado la clase CalculadoraTest en la que definiremos los tests, hemos creado 3 casos para cada operación, uno en el que se espera que el resultado sea menor que 0, otro en el que sea igual a 0 y finalmente mayor que 0.

<img src="https://i.gyazo.com/0ce3c924147691690ff7606b524cd8ee.png">

### **6. Realizar segundo commit**

<img src="https://i.gyazo.com/11d9a8a0cb51d7fc46cd1e6d6eb961db.png">

### **7. Realizar pruebas para validar la funcionalidad de los tests y exponer resultados**

Seleccionamos la clase CalculadoraTest y la ejecutamos como JUnit

<img src="https://i.gyazo.com/f6b15c86650f835e9c7b9fff15ae7198.png">

Para que un método salga como validado, debe de superar los 3 casos que hemos planteado, por lo tanto en este caso nuestros métodos han superado el 100% de los casos.

<img src="https://i.gyazo.com/1050fedc52d6d21966f7a18d13d360d4.png">

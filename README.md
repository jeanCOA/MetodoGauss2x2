# README - Método de Gauss 2x2 en Java

##  Descripción

Este programa en Java resuelve sistemas de ecuaciones lineales de **2x2** utilizando el **método de eliminación de Gauss**.

Permite:

* Ingresar valores desde consola
* Trabajar con números decimales y negativos
* Mostrar la matriz paso a paso
* Detectar:

  * Solución única
  * Sin solución
  * Infinitas soluciones
* Manejar el caso donde el pivote inicial es 0 (intercambio de filas)

---

##  Forma del sistema 2x2

```
a*x + b*y = e
c*x + d*y = f
```

---

##  Cómo ejecutar

1. Compilar:

```
javac Gauss2x2.java
```

2. Ejecutar:

```
java Gauss2x2
```

---

##  Ejemplos de prueba

###  Ejemplo 1: Solución única (normal)

Sistema:

```
2x + 3y = 8
4x + y = 10
```

Entrada:

```
a=2
b=3
e=8
c=4
d=1
f=10
```

Resultado esperado:

```
x = 2.2
y = 1.2
```

---

### Ejemplo 2: Con números negativos

Sistema:

```
-2x + y = 1
3x - 4y = -2
```

Resultado esperado:

```
x = 0.2
y = 1.4
```

---

### Ejemplo 3: Infinitas soluciones

Sistema:

```
2x + 2y = 4
4x + 4y = 8
```

Resultado esperado:

```
Infinitas soluciones
```

---

### Ejemplo 4: Sin solución

Sistema:

```
2x + 2y = 4
4x + 4y = 10
```

Resultado esperado:

```
No tiene solución
```

---

## Consideraciones

* Usar punto (.) para decimales → `2.5`
* No usar coma `2,5` 
* Evitar ingresar texto (solo números)
* El programa trabaja con `double`, por lo que puede haber pequeñas aproximaciones decimales

---

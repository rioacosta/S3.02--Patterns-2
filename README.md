
S3.02: Patterns 2.

✅Objetivo:

En esta práctica aprenderemos a identificar y construir programas empleando patrones de diseño. La utilización de patrones es fundamental en la construcción de un software extensible y reutilizable. El lenguaje Java, así como todos los frameworks de software, están hechos de acuerdo con los patrones más importantes del software. En todos los ejercicios, crearemos un proyecto con una clase Main que demuestre el uso del patrón (con las invocaciones necesarias).



📄 Descripción:

Nivel 1: Builder
Desarrolla un sistema de gestión de pedidos de pizzas utilizando el patrón de diseño Builder en Java. El sistema debe permitir la creación de diferentes tipos de pizzas con configuraciones de tamaño, masa e ingredientes diferentes.

Define una clase Pizza con los siguientes atributos:
size (tamaño)
dough (tipo de masa)
toppings (ingredientes)
Crea una interfaz PizzaBuilder con los métodos necesarios para configurar el tamaño, la masa y los ingredientes de una pizza.
Implementa una o más clases que actúen como constructores concretos (PizzaBuilder) para diferentes tipos de pizzas. Por ejemplo, podrías tener un constructor para la pizza hawaiana, otro para la pizza vegetariana, etc.
Desarrolla una clase MestrePizzer que reciba un PizzaBuilder y que permita construir pizzas de manera específica.
En el programa principal (Main), crea instancias de PizzaBuilder y de MestrePizzer, y utilizalos para construir pizzas con diferentes configuraciones.


Nivel 2: Observer
Diseña un sistema en el que un Agente de Bolsa (Observable) notifica a varias agencias de Bolsa (Observers) cambios cuando la Bolsa sube o baja.

Es necesario que el objeto Observable mantenga referencias a los Observers.


Nivel 3: Callback
Simula una pasarela de pago que reciba un objeto encapsulador del método de pago a efectuar: tarjeta de crédito, PayPal o deuda en cuenta bancaria.

La pasarela invocará el pago sin conocer la forma y devolviendo el control a la clase de origen.
La clase que invoca la pasarela de pago será una tienda de zapatos.



💻 Tecnologías Utilizadas

Java 21

Git



📋 Requisitos

Java 8 o superior

Un IDE de tu preferencia, IntelliJ Idea recomendado.



🛠️ Instalación

Clona este repositorio: -> git clone https://github.com/rioacosta/S3.01--Patterns-2

cd S3.01--Patterns-2



🌐 Despliegue

Importa los archivos del proyecto al IDE.



▶️ Ejecución

Ejecuta el programa en tu IDE preferido.



🤝 Contribuciones

Las contribuciones son bienvenidas! Por favor, sigue los siguientes pasos para contribuir:

Has un fork del repositorio Crea una nueva rama git checkout -b feature/*NovaFuncionalitat has tus cambios y commiteja'*ls: git commit -m 'Añade Nueva Funcionalidad' Sube los cambios a tu rama: git push origin feature/*NovaFuncionalitat has un pull request About S3.01--Patterns-2
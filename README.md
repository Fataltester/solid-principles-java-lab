# solid-principles-java-lab
### Juan David Martínez
### Objetivo
Por cada principio SOLID realizar una implementación que cumpla el principio para cada caso
### Principio de responsabilidad única
Se implementaron 3 clases diferentes las cuales se dividen las responsabilidades imprimir, guardar en la base de datos y definir las facturas.

Cumpliendo con el principio de responsabilidad única, donde cada clase tiene definida una tarea única.
### Principio de apertura y cierre
Se implemento una interfaz de descuento `DiscountStrategy.java` que define el comportamiento para aplicar los descuentos de acuerdo al tipo de cliente (Regular,VIP,No aplica el descuento) y una clase que calcula los descuentos de acuerdo a la estrategia de descuento requerida.

Cumpliendo con el principio abierto-cerrado, donde podemos agregar más nuevas funcionalidades en caso de tener otros futuros tipos de clientes SIN tocar el código previamente implementado.
### Principio de sustitución de Liskov
Se realizó la seperación en varias interfaces dependienco el carro, si es recargable a combustible o a energía además del tipo de carro de gasolina y carro eléctrico.

Cumpliendo con el principio de Sustición de liskov, donde cada clase implementa únicamente lo que necesita, a pesar de que el principio habla de clases abstractas, en este caso lo implementamos por medio de interfaces como ordenaba el ejercicio.

### Principio de segregación de interfaces
Se realizaron 2 interfaces simulando el comportamiento de trabaja, la clase developer únicamente implementa la interfaz de trabajo como describe el ejercicio.

Cumpliendo con el principio de segregación de interfaces, donde es mejor tener una interfaces específicas que tener una global, permitiendo a las clases implementar únicamente los comportamientos que necesitan.

### Principio de inversión de dependencia
Se realizo una única interfaz que implementa la clase `MySQLDatabase.java` simulando el comportamiento de guardado y luego ya una clase general `OrderProcesor.java` la cual dependiendo la base de datos realiza diferentes procesos para guardar la orden.

Cumple con el principio de inversion de depencencias, ya que la clase `OrderProcesor.java` depende de interfaces para proceder más no de clases concretas de bases de datos.

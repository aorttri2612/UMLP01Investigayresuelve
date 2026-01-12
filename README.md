# UMLP01 – Investiga y resuelve  
## Símbolos de UML (basado en el diagrama Pedido – Producto)

---

## Cuadrados (clases y enum)

En el diagrama UML aparecen **cajas rectangulares** que representan **clases** o **tipos enumerados**.

### Caja de una clase (Pedido y Producto)

Cada clase está representada por **un rectángulo dividido en tres partes**:

1. **Parte superior**  
   Contiene el **nombre de la clase**  
   Ejemplo: `Pedido`, `Producto`

2. **Parte central**  
   Contiene las **variables o atributos**  
   Cada línea empieza con un símbolo:
   - `-` → atributo **privado**

     En este caso es:
  numero: int
  precio: double

3. **Parte inferior**  
Contiene los **métodos**  
Cada línea empieza con:
- `+` → método **público**

     Ejemplo:
   calculaeTotal(): double

Esto indica qué datos tiene la clase y qué acciones puede realizar.

---

### Caja del enum (EstadoPedido)

El `enum EstadoPedido` también se representa con una caja, pero:

- No está dividida en tres partes
- Solo contiene:
- El nombre del enum
- Los valores posibles

  En este caso es:
PENDIENTE, EN_PROCESO, ENVIADO

Esto indica que el estado del pedido **solo puede tomar uno de esos valores**.

---

## Flechas y líneas (relaciones)

En el diagrama aparecen **líneas que conectan las clases**, indicando que están relacionadas.

---

### Flecha con rombo negro (composición)

Entre `Pedido` y `Producto` aparece una línea con **rombo negro** en el lado de `Pedido`.

Esto significa **composición**:

- Un **Pedido está formado por Productos**
- Los **Productos dependen del Pedido**
- Si el pedido desaparece, los productos también

En Java se representa normalmente con:
```java
List<Producto> productos;

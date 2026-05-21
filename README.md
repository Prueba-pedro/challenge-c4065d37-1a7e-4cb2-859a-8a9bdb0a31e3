# Implementación de Patrones GRASP en Gestión de Inventario

En un sistema de gestión de inventario para una tienda en línea, es crucial organizar el código de manera que sea fácil de mantener y escalar. Los patrones GRASP (Especialista en Información, Creador y Bajo Acoplamiento) pueden ayudar a lograr este objetivo. El sistema necesita registrar productos, manejar el inventario y procesar pedidos. Cada producto tiene un nombre, precio, stock y categoría. El inventario debe actualizarse automáticamente cuando se procese un pedido.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Patrones GRASP |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 3-4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Registro de Productos

**Objetivo:** Implementar la funcionalidad para registrar productos en el sistema.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica los atributos necesarios para un producto.
- Decide cómo estructurar los datos para un producto.
- Implementa la funcionalidad para registrar un nuevo producto.

**Entregable:** Un mecanismo para registrar productos con validación de atributos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo representar y validar los atributos de un producto.
- Piensa en cómo manejar la duplicación de nombres y precios negativos.

</details>

### Fase 2: Manejo del Inventario

**Objetivo:** Implementar la funcionalidad para manejar el inventario y procesar pedidos.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Decide cómo representar el inventario y los pedidos.
- Implementa la funcionalidad para procesar un pedido y actualizar el inventario.
- Maneja los casos donde el stock es insuficiente.

**Entregable:** Un mecanismo para procesar pedidos y actualizar el inventario.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo representar y actualizar el inventario.
- Piensa en cómo manejar la insuficiencia de stock al procesar un pedido.

</details>

### Fase 3: Aplicación de Patrones GRASP

**Objetivo:** Aplicar los patrones GRASP (Especialista en Información, Creador y Bajo Acoplamiento) en el código implementado.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica dónde aplicarías el patrón Especialista en Información.
- Decide dónde implementarías el patrón Creador.
- Aplica el patrón Bajo Acoplamiento para mejorar la estructura del código.
- Documenta las decisiones tomadas y justifica las elecciones de patrones.

**Entregable:** Código refactorizado aplicando patrones GRASP y documentación de decisiones.

<details>
<summary>Pistas de conocimiento</summary>

- Considera dónde se maneja la información y cómo podrías aplicar el patrón Especialista en Información.
- Piensa en cómo crear objetos de manera efectiva utilizando el patrón Creador.
- Evalúa cómo reducir la dependencia entre componentes aplicando el patrón Bajo Acoplamiento.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es el patrón Especialista en Información y cómo lo aplicaste en este reto?
- **paraQueSirve**: ¿Para qué sirve el patrón Creador en este contexto?
- **comoSeUsa**: ¿Cómo usaste el patrón Bajo Acoplamiento para mejorar la estructura del código?
- **erroresComunes**: ¿Qué errores comunes evitaste al aplicar los patrones GRASP?
- **queDecisionesImplica**: ¿Qué decisiones implica la aplicación de los patrones GRASP en este sistema?

## Criterios de Evaluacion

- Implementación de la funcionalidad para registrar productos.
- Implementación de la funcionalidad para manejar el inventario y procesar pedidos.
- Aplicación de los patrones GRASP en el código.
- Documentación de las decisiones tomadas y justificación de las elecciones de patrones.

---

*Reto generado automaticamente por Challenge Generator - Pragma*

# Auditoría de Duplicación de Código - Ejercicio 8.3

## 1. Clases que comparten atributos o comportamiento
Las clases `Cliente`, `Empleado`, `Estudiante` y `Docente` compartían los atributos `nombre` y `dui`, además del método de presentación `presentarse()`.

## 2. Validación de la relación "es un" (IS-A)
Sí, la relación cumple la prueba de forma natural:
- Un Estudiante ES UNA Persona.
- Un Docente ES UNA Persona.
- Un Empleado ES UNA Persona.
- Un Cliente ES UNA Persona.

Todas representan una relación de identidad válida y duradera.

## 3. Atributos declarados como protected
Los atributos `nombre` y `dui` de la superclase `Persona` se declararon como `protected`. Esto permite que las subclases accedan directamente a ellos dentro del paquete sin romper la encapsulación frente a clases externas.

## 4. Orden de refactorización y justificación
Se creó y refactorizó primero la superclase `Persona`. De esta forma se definió la base común de atributos y constructores, permitiendo luego aplicar `extends Persona` en las subclases para eliminar el código duplicado de forma limpia.
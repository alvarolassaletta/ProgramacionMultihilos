# 💻 Ejercicios de Hilos en Java
## Programación de Servicios y Procesos

Este repositorio contiene una colección de **ejercicios de hilos en Java** para practicar la **programación concurrente**.
Los ejercicios están organizados por niveles de dificultad, desde conceptos básicos hasta simulaciones avanzadas.

Además el repositorio incluye un ejercicio adicional que implementa un carrera de hilos  personalizada.

---

# 🚀 Ejercicios de Hilos — Nivel 1: Conceptos Básicos

## 1. Ejercicio: Diferencia entre `run()` y `start()`
### Instrucciones:
- Crear un hilo que imprime números del 1 al 5.
- Llamar primero a `run()`.
- Luego llamar a `start()`.
- Observar el orden de ejecución.
- Explicar por qué ocurre.

---

## 2. Ejercicio: Pausa de un hilo con `sleep()`
### Instrucciones:
- Hilo que imprime "tic" cada 500 ms, 5 veces.
- El hilo main imprime "MAIN sigue..." cada 300 ms.

---

## 3. Ejercicio: `isAlive()`
### Instrucciones:
- Crear un hilo que tarde 2 s en terminar.
- Desde el main, comprobar isAlive():
  - Antes de start()
  - Justo después de start()
  - Después de join()

---

## 4. Ejercicio: `join()` básico
### Instrucciones:
- Hilo A tarda 3 s en terminar.
- Hilo B no puede comenzar hasta que A haya terminado (usar join()).

---

## 5. Ejercicio: Prioridades
### Instrucciones:
- Crear 3 hilos con prioridad mínima, normal y máxima.
- Cada hilo imprime su nombre 10 veces.
- Observar el orden y si cambia entre ejecuciones.

---

# 🧩 Ejercicios de Hilos — Nivel 2: Coordinación y Sincronización Simple

## 6. Ejercicio: Carrera de Hilos
### Instrucciones:
- Simular una carrera entre 3 hilos.
- Avanzan de 0 a 100.
- Cada paso es un número aleatorio entre 1 y 5.
- Cada hilo tiene una prioridad distinta.
- Mostrar quién llega primero.

---

## 7. Ejercicio: Tres tareas que deben ejecutarse en orden
### Instrucciones:
- Hilo 1 ejecuta primero.
- Hilo 2 debe esperar al 1.
- Hilo 3 debe esperar al 2.
- Usar join().

---

## 8. Ejercicio: Imprimir números pares e impares
### Instrucciones:
- Hilo A imprime pares del 0 al 20.
- Hilo B imprime impares del 1 al 19.
- Cada hilo hace sleep(200) entre números.
- El main espera a ambos hilos con join().

---

## 9. Ejercicio: Simular un semáforo simple
### Instrucciones:
- Un hilo imprime:
  - VERDE → 2 s
  - AMARILLO → 1 s
  - ROJO → 3 s
- Repite 3 ciclos.
- El main imprime "Semáforo funcionando..." cada 500 ms.

---

## 10. Ejercicio: Contador compartido sin sincronización
### Instrucciones:
- Dos hilos incrementan el mismo contador 1000 veces.
- Usar sleep(1) en algunas iteraciones.
- Observar resultados diferentes en cada ejecución (condición de carrera).
- Explicar por qué sucede.

---

# ⚙️ Ejercicios de Hilos — Nivel 3: Interrupción y Control Avanzado

## 11. Ejercicio: Timer casero con hilos
### Instrucciones:
- Crear un hilo que incrementa un contador cada segundo.
- Imprimir el contador como cronómetro.
- El main espera 5 segundos y luego interrumpe el hilo.

---

## 12. Ejercicio: Descargar archivos simulados
### Instrucciones:
- Simular 3 descargas, cada una en un hilo.
- Cada una tarda entre 1 y 5 segundos.
- El main espera a que terminen todos usando join().

---

## 13. Ejercicio: Prioridades dinámicas
### Instrucciones:
- Crear 2 hilos que imprimen su nombre.
- Mientras se ejecutan, el main cambia sus prioridades cada segundo.
- Observar el efecto.

---

## 14. Ejercicio: Control de proceso con `isAlive()`
### Instrucciones:
- Un hilo realiza 10 pasos con sleep(400).
- El main:
  - Cada 300 ms imprime si el hilo sigue vivo.
  - Cuando termina, imprimir "Proceso acabado".

---

## 15. Ejercicio: Dos hilos que deben alternarse
### Instrucciones:
- Hilo A imprime "PING".
- Hilo B imprime "PONG".
- Deben alternarse con sleep(500).
- No pueden aparecer dos PING seguidos ni dos PONG seguidos (usar bandera compartida sin synchronized).

---

# 🥇 Ejercicios de Hilos — Nivel 4: Simulación de Sistemas

## 16. Ejercicio: Simulador de cocinero y repartidor
### Instrucciones:
- COCINERO: tarda de 1 a 3 s.
- REPARTIDOR: tarda de 2 a 4 s.
- Para 5 pedidos:
  - El cocinero empieza.
  - Al terminar, iniciar el repartidor y esperar con join().
- Usar isAlive() para mostrar estados.

---

## 17. Ejercicio: Fabricación de piezas
### Instrucciones:
- Hilo A fabrica pieza base (2 s).
- Hilo B pule la pieza (1 s).
- Hilo C pinta la pieza (3 s).
- Deben ejecutarse en ese orden usando join().

---

## 18. Ejercicio: Sistema de registro
### Instrucciones:
Orden obligatorio:
1. Registrar usuario (2 s)
2. Validar correo (1.5 s)
3. Crear carpeta personal (1 s)
4. Enviar email de bienvenida (1 s)

---

## 19. Ejercicio: Productor lento y consumidor rápido
### Instrucciones:
- Productor genera números cada 700 ms.
- Consumidor imprime números cada 300 ms.
- Ambos imprimen estados continuamente.
- Usar isAlive() para mostrar si alguno termina antes.

---

## 20. Ejercicio: Backup simulado
### Instrucciones:
- Hilo que simula un backup de 10 pasos.
- Cada paso tarda entre 300 y 700 ms.
- El main:
  - Comprueba isAlive() cada 200 ms.
  - Si pasan más de 3 s sin completar → mostrar aviso.
  - Esperar a que termine con join().


## Ejercicio EXTRA ThreadRaceMyVersion 
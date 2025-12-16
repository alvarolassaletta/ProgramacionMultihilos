
Ejercicio18: Registro de Usuario con Tareas Concurrentes

## Enunciado 
      
      Crea 4 hilos:

         • Registrar usuario (2s)

         • Validar correo (1.5s)

         • Crear carpeta personal (1s)

         • Enviar email de bienvenida (1s)

         El orden obligatorio:

         Registrar → Validar → Carpeta → Email

         Usa join() encadenado + sleep().

## Descripción         

Este proyecto simula un flujo de registro de usuarios usando hilos en Java.  
Cada acción importante (registro, validación de email, creación de carpeta y envío de correo) se ejecuta
en un **hilo separado** mediante una clase `Task` que implementa `Runnable`.  

Cada tarea implementa `Runnable` y se ejecuta en un hilo separado, utilizando `Thread.join()` para mantener el **orden obligatorio**:



## Estructura del proyecto

```text
Ejercicio18/
│
├─ Main.java                 # Clase principal que ejecuta el flujo completo
├─ User.java                 # Clase que representa al usuario
├─ UserRegister.java         # Clase que gestiona la lista de usuarios
├─ UserRegisterTask.java     # Tarea para registrar un usuario (Runnable)
├─ Email.java                # Clase para representar y validar emails
├─ EmailTask.java            # Tarea para validar el email del usuario (Runnable)
├─ DirectoryTask.java        # Tarea para crear carpeta personal del usuario (Runnable)
└─ SendEmailTask.java        # Tarea para enviar un correo al usuario (Runnable)

 ## Flujo de ejecución

1. **Registrar usuario**
   - Se crea un objeto `User` y se añade a la lista de usuarios.
   - Se ejecuta en un hilo mediante `UserRegisterTask`.

2. **Validar email**
   - Se valida el formato del correo usando la clase `Email`.
   - Se ejecuta en un hilo mediante `EmailTask`.

3. **Crear carpeta personal**
   - Se crea un directorio para almacenar los datos del usuario.
   - Se ejecuta en un hilo mediante `DirectoryTask`.

4. **Enviar correo**
   - Se envía un email de prueba al usuario.
   - Se ejecuta en un hilo mediante `SendEmailTask` usando JavaMail.
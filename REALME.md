

En este proyecto se utiliza el fichero `tasks.json` de Visual Studio Code para automatizar la generación del parser con ANTLR, la compilación del código Java y la ejecución del programa.

No se emplea `launch.json` debido a que el depurador de Java de VS Code está orientado a proyectos gestionados con Maven o Gradle, y no permite un control fiable del classpath ni de la ubicación de los archivos compilados cuando se utiliza compilación manual con `javac`.

El uso de `tasks.json` garantiza que los comandos se ejecuten exactamente igual que en la terminal, proporcionando un entorno de ejecución estable, reproducible y fácil de entender.

Además se utiliza el fichero `settings`par añadir los jar al fichero y configuracion del autogurado.

# Compilar y ejecutar automaticamente

- Para compilar todos los ficheros automaticamente `ctr+shift+b`esto ejecuta primero antlr4 y despues compila los ficheros java en orden.

- Para ejecutar el main `ctr+shift+p`-> task, seleccionamos `PLATA: ejecutar`, una vez hecho esto nos pide el fichero input que queramos, por defecto task.arg.

- Para ejecutar cualquier otro task en particular, es igual`ctr+shift+p`-> task, seleccionamos el que queramos.



# Fichero Task.json

En este proyecto se utiliza **`tasks.json`** para automatizar **todo el flujo de trabajo** necesario para ejecutar el lenguaje **PLATA**, sin depender de herramientas externas como Maven o Gradle.

Concretamente, en `tasks.json` se definen **tareas de sistema** que sustituyen a los comandos que antes se ejecutaban manualmente en la terminal.

🔧 **Las tareas definidas son**:

### 1º Generación del parser (ANTLR)

```bash
antlr4 -no-listener -visitor PLATA.g4
```

Esta tarea:

- Procesa la gramática `PLATA.g4`

- Genera automáticamente el lexer, el parser y los visitors en Java

- Evita tener que ejecutar ANTLR manualmente cada vez que cambia la gramática

```json
        {
            "label": "ANTLR: generar parser",
            "type": "shell",
            "command": "cmd",
            "args": [
                "/c",
                "antlr4 -no-listener -visitor PLATA.g4"
            ],
            "group": "build",
            "problemMatcher": []
        }
```

### 2º Compilación del código Java

```bash
javac -d bin -cp .;C:/Users/Antonio/lib/antlr-4.13.2-complete.jar *.java
```

Esta tarea:

- Compila **todo el código Java**, incluyendo:
  
  - el código escrito a mano (`Main`, `MiVisitor`, etc.)
  
  - el código generado por ANTLR

- Guarda los archivos `.class` en la carpeta `bin/`

- Mantiene el proyecto limpio separando código fuente y código compilado

```json
        {
            "label": "Java: compilar",
            "type": "shell",
            "command": "cmd",
            "args": [
                "/c",
                "javac -d bin -cp .;C:/Users/Antonio/lib/antlr-4.13.2-complete.jar *.java"
            ],
            "group": "build",
            "problemMatcher": []
        }
```

### 3º Construcción completa (build)

Esta tarea no ejecuta comandos directamente, sino que:

- Encadena las dos tareas anteriores

- Garantiza que **ANTLR se ejecute antes de compilar Java**

- Permite construir todo el proyecto con una sola acción (`Ctrl + Shift + B`)

```json
        {
            "label": "PLATA: build completo",
            "dependsOn": [
                "ANTLR: generar parser",
                "Java: compilar"
            ],
            "group": {
                "kind": "build",
                "isDefault": true
            }
```

---

Una vez tenemos los ficheros configurados generamos tambien otra tarea para ejecutar el programa principal.

### 4º Ejecución del programa

Esta tarea:

- Ejecuta el programa Java

- Carga correctamente el `classpath` (bin + ANTLR)

- Permite pasar como argumento el fichero `.arg`

- Reproduce exactamente el comportamiento de la ejecución manual en terminal

```json
        {
            "label": "PLATA: ejecutar",
            "type": "shell",
            "command": "cmd",
            "args": [
                "/c",
                "java -cp bin;C:/Users/Antonio/lib/antlr-4.13.2-complete.jar Main ${input:archivoArg}"
            ],
            "dependsOn": "PLATA: build completo",
            "group": "test",
            "problemMatcher": []
        }
    ],
    "inputs": [
        {
            "id": "archivoArg",
            "type": "promptString",
            "description": "Ruta del fichero .arg",
            "default": "input/datos.arg"
        }
    ]
```



### Fichero task.json completo

```json
{
    "version": "2.0.0",
    "tasks": [
        {
            "label": "ANTLR: generar parser",
            "type": "shell",
            "command": "cmd",
            "args": [
                "/c",
                "antlr4 -no-listener -visitor PLATA.g4"
            ],
            "group": "build",
            "problemMatcher": []
        },
        {
            "label": "Java: compilar",
            "type": "shell",
            "command": "cmd",
            "args": [
                "/c",
                "javac -d bin -cp .;C:/Users/Antonio/lib/antlr-4.13.2-complete.jar *.java"
            ],
            "group": "build",
            "problemMatcher": []
        },
        {
            "label": "PLATA: build completo",
            "dependsOn": [
                "ANTLR: generar parser",
                "Java: compilar"
            ],
            "group": {
                "kind": "build",
                "isDefault": true
            }
        },
        {
            "label": "PLATA: ejecutar",
            "type": "shell",
            "command": "cmd",
            "args": [
                "/c",
                "java -cp bin;C:/Users/Antonio/lib/antlr-4.13.2-complete.jar Main ${input:archivoArg}"
            ],
            "dependsOn": "PLATA: build completo",
            "group": "test",
            "problemMatcher": []
        }
    ],
    "inputs": [
        {
            "id": "archivoArg",
            "type": "promptString",
            "description": "Ruta del fichero .arg",
            "default": "input/datos.arg"
        }
    ]
}
```

# Archivo launch.json

Aunque VS Code dispone del fichero **`launch.json`** para ejecutar y depurar programas, **no es adecuado para este proyecto** debido a cómo funciona internamente la extensión de Java.

### ❌ Problema principal

El `launch.json` con `"type": "java"`:

- Está diseñado para proyectos con **Maven o Gradle**

- Utiliza un **workspace interno oculto**

- Gestiona el classpath automáticamente

- **Ignora configuraciones manuales de compilación**

En este proyecto:

- La compilación se realiza manualmente con `javac`

- El classpath se define explícitamente (`bin/` + `antlr.jar`)

- Los `.class` no se encuentran en el workspace interno de VS Code

Como consecuencia:

- El depurador de Java no encuentra la clase `Main`

- Se producen errores como `ClassNotFoundException: Main`

- El comportamiento es inconsistente y difícil de depurar



# Fichero settings.json

Modificamos `settings.json` para que VS Code pueda reconocer las librerías externas, mantener el código limpio y guardado automáticamente, y para integrar correctamente ANTLR y las tareas de compilación, asegurando un flujo de trabajo fluido y confiable.

- **Referencia a librerías externas (`java.project.referencedLibraries`)**
  
  - Para que VS Code reconozca el JAR de ANTLR y cualquier otra librería que usemos, sin tener que copiarlas dentro del proyecto.
  
  - Esto permite que el editor pueda autocompletar, compilar y ejecutar el código correctamente.

- **Guardar archivos automáticamente (`files.autoSave` y `files.autoSaveDelay`)**
  
  - Para evitar que olvidemos guardar cambios antes de compilar o ejecutar.
  
  - Mantiene el flujo de trabajo más fluido, especialmente al modificar la gramática `.g4` o los archivos Java.

- **Acciones al guardar (`editor.codeActionsOnSave`)**
  
  - Para mantener el código limpio automáticamente, por ejemplo, organizando imports.
  
  - Esto reduce errores y mejora la legibilidad sin intervención manual.

- **Configuración de la extensión ANTLR (`antlr4.generation`)**
  
  - Para que VS Code no genere archivos de parser automáticamente.
  
  - Evita conflictos con la compilación controlada mediante `tasks.json`, dejando claro quién es responsable de generar los archivos de ANTLR.

- **Detección automática de tareas (`task.autoDetect`)**
  
  - Para que VS Code reconozca los tasks definidos en `tasks.json` automáticamente.
  
  - Permite ejecutar compilación y generación de parser con un solo atajo (`Ctrl+Shift+B`), sin tener que configurar tareas manualmente cada vez.

### Fichero settings.json completo

```json

```

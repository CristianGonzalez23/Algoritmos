# Proyecto Python: Crear Matrices y Guardarlas en .txt

Este proyecto consta de un script de Python que genera matrices y las guarda en un archivo .txt.

## Estructura del Proyecto

El proyecto tiene la siguiente estructura de directorios:

```
my-python-project
├── src
│   ├── main.py
│   └── matrix_generator.py
├── data
│   └── .gitkeep
├── .gitignore
└── README.md
```

## Descripción de los Archivos

- `src/main.py`: Este es el punto de entrada de la aplicación. Importa y utiliza la función `generate_and_save_matrix` del módulo `matrix_generator`.

- `src/matrix_generator.py`: Este archivo contiene una función `generate_and_save_matrix`. Esta función genera una matriz utilizando la biblioteca numpy, y luego guarda esta matriz en un archivo .txt en el directorio `data`.

- `data/.gitkeep`: Este es un archivo vacío que se utiliza para permitir que el directorio `data` se mantenga en el control de versiones, ya que git ignora los directorios vacíos.

- `.gitignore`: Este archivo le dice a git qué archivos o directorios ignorar en el control de versiones.

## Cómo Ejecutar el Proyecto

Para ejecutar este proyecto, sigue estos pasos:

1. Asegúrate de tener Python y numpy instalados en tu sistema.
2. Navega hasta el directorio `src` en tu terminal.
3. Ejecuta el comando `python main.py`.

Esto generará una matriz y la guardará en un archivo .txt en el directorio `data`.
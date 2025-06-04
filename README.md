# RetoBDDyTDD
Reto Técnico: Creación de tareas con pruebas TDD y BDD

# Comportamientos Probados
~~~
Scenario Crear una nueva tarea
Given se envía un objeto Json con los campos título y descripción no vacíos
When se hace por petición HTTP POST al endpoint /tasks
Then el sistema devuelve un objeto JSON con el ID, título y descripción de la tarea
And el campo completed en false
And estado de petición 201

Scenario Crear una nueva tarea
Given se envía un objeto Json con los campos título y descripción vacíos
When se hace por petición HTTP POST al endpoint /tasks
Then el sistema devuelve un objeto JSON con mensaje de error
And estado de petición 400
~~~

# Resultados de Test
## TaskTest.java
![image](https://github.com/user-attachments/assets/5e1f844a-3d91-43a1-8fc5-a254c31fb9c4)

## TaskServiceTest.java
![image](https://github.com/user-attachments/assets/c660a916-aa0d-41ce-8435-37b433201a84)

## TaskControllerTest.java
![image](https://github.com/user-attachments/assets/db7244f8-5f27-4692-8b52-3a4ed2a48317)

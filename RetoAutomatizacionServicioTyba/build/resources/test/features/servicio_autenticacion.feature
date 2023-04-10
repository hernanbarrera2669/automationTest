# language: es

Característica: Consumo de servicios rest de la página restful-booker.

  Esquema del escenario: Consumir servicio rest y así realizar una correcta autenticación.
    Dado Que se crea la estructura del servicio con la <cabecera> y <valor>
    Cuando Se realiza un llamado al servicio <url> con los datos <usuario> y <clave>
    Entonces Se verifica que el <estado> sea exitoso
    Cuando Se realiza el llamado al servicio <url> con usuario <usuario> y clave incorrectos <claveIncorrecta>
    Entonces Se verifica que el <estado> sea exitoso y el mensaje sea <reason>
    Ejemplos:
      | cabecera     | valor            | url                                       | usuario | clave       | claveIncorrecta | estado | reason          |
      | Content-Type | application/json | https://restful-booker.herokuapp.com/auth | admin   | password123 | prueba123       | 200    | Bad credentials |
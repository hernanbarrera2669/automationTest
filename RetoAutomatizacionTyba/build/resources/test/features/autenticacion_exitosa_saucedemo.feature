#language:es

Característica: Realizar el proceso de autenticación exitosa del sitio "Sauce demo"
  Como usuario de “Sauce demo”
  Deseo realizar el proceso login
  Para verificar su autenticación exitosa

  @AutenticacionExitosa
  Escenario: Verificar que se realice el proceso de autenticación de manera exitosa
    Dado Que el cliente ingresa al portal web de Sauce demo
    Cuando Ingrese con el usuario locked_out_user y contraseña secret_sauce
    Entonces Se mostrará un error de autenticación
    Cuando Ingrese con el usuario standard_user y contraseña secret_sauce
    Entonces Se ingresa de manera exitosa al portal web
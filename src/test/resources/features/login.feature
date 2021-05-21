Feature: Login
  Como usuario de Tigo
  Yo quiero ingresar a OneApp móvil
  Para gestionar mis líneas


  Background:
    Given El usuario registrado se encuentra en la OneApp

  Scenario: Inicio de sesion exitoso en One App
    When El inicia sesion en la app por medio del correo electronico
#      | username                         | password |
#      | automatizacionmicuenta@gmail.com | Tigo2019 |
    Then El deberia poder ver los detalles de la linea
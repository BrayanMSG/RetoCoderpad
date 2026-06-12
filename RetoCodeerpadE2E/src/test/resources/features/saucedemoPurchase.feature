Feature: Flujo de compra en SauceDemo

  Scenario: Compra exitosa de dos productos

    Given que el usuario ingresa a Saucedemo
    When inicia sesion con credenciales validas
    And agrega dos productos al carrito
    And visualiza el carrito
    And completa el checkout
      | firstName | lastName | postalCode |
      | Juan      | Perez    | 110111     |
    Then deberia visualizar el mensaje "Thank you for your order!"
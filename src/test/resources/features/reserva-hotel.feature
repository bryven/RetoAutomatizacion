Feature: Reserva Hotel
  yo como

  Scenario Template: Reserva hotel
    Given que el usuario se encuentra en el portal
    When realice la reserva del hotel con <destino>
    And con numeroHabitaciones, numeroAdultos y numeroNiños
    And con rangoDePrecios
    And con numeroDeEstrellas
    Then el usuario guarda la informacion del hotel
    Examples:
      | destino     |
      | "Cartagena" |
Feature: Flujo CRUD Mascota PetStore

  Scenario: Crear consultar actualizar y validar mascota

    # Crear mascota
    Given url baseUrl
    And path 'pet'
    And def createPetRequest = read('classpath:data/createPet.json')
    And request createPetRequest
    When method POST
    Then status 200
    And match response.name == 'Firulais'
    And match response.status == 'available'

    * def petId = response.id
    * print 'Pet ID:', petId
    * print 'Mascota creada:', response


    # Consultar mascota por ID
    Given url baseUrl
    And path 'pet', petId
    When method GET
    Then status 200
    And match response.id == petId
    And match response.name == 'Firulais'
    And match response.status == 'available'

    * print 'Consulta por ID exitosa'


# Actualizar mascota
    Given url baseUrl
    And path 'pet'

    * def updateRequest =
"""
{
  id: petId,
  category: {
    id: 1,
    name: 'Dogs'
  },
  name: 'Firulais Actualizado',
  photoUrls: [
    'https://test.com/photo.jpg'
  ],
  tags: [
    {
      id: 1,
      name: 'dog'
    }
  ],
  status: 'sold'
}
"""

    And request updateRequest
    When method PUT
    Then status 200
    And match response.id == petId
    And match response.name == 'Firulais Actualizado'
    And match response.status == 'sold'

    * print 'Mascota actualizada:', response


    # Consultar mascota modificada por status
    Given url baseUrl
    And path 'pet', 'findByStatus'
    And param status = 'sold'
    When method GET
    Then status 200

    * def petFound =
    """
    karate.filter(response, function(x){
      return x.id == petId
    })
    """

    * match petFound[0].id == petId
    * match petFound[0].name == 'Firulais Actualizado'
    * match petFound[0].status == 'sold'

    * print 'Mascota encontrada por status:', petFound[0]
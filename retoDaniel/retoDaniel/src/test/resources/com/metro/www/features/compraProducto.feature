Feature: Title of your feature
  I want to use this template for my feature file

  Background: ejecucion de la aplicacion
    Given el usuario ingresa a la pagina web
  @tag1
  Scenario Outline: Title of your scenario outline
    When busca el producto a comprar <producto>   
    Then verifica que se agrego al carro 

    Examples: 
      | producto | 
      | samsung  |
      
      

      

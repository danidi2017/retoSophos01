@comprasMetro
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario outline
    Given ingrese a la pagina de metro y busque el producto <name>
    When agrego el <producto> al carro
    Then verifica que se agrego al carro

    Examples: 
      | name  | producto | status  |
      | name1 |     5 | success |


      

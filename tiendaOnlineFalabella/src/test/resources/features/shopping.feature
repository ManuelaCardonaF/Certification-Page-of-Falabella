#author: manuela.cardonaf@udea.edu.co

Feature: quick app test
  As a user I need to validate the availability of a website

  @smokeTest
  Scenario: Successfully enter the page
    Given the user is on the main page
    Then the user should confirm that he is on the page through the user info button

  @SuccessfullySelectedProduct
  Scenario Outline: The user validates that a certain product is added to the shopping bag and confirms that the price is the corresponding one
    Given the user is on the main page
    When the user proceeds to search for a certain product
      | product   |
      | <product> |
    And the user chooses the product he wishes to acquire
    And the user fills out dispatch information
      | region   | city   | commune   | address   | complement    |
      | <region> | <city> | <commune> | <address> | <complements> |
    Then the user should see the price of the product plus the value of the shipment
    Examples:
      | product   | region    | city      | commune   | address        | complements                        |
      | batidora   | Antioquia | Rionegro  | Rionegro  | cra 38 N 22 50 | Porton del tranvia Apto 916 |
      | celular   | Antioquia | Marinilla  | Marinilla  | cra 36 N 22 46 | San Juan de Dios apto 301 |


    @BuyZeroProducts

    Scenario Outline:The user validates that a certain product is added to the shopping bag and then decreases the quantity to buy to zero
      Given the user is on the main page
      When the user proceeds to search for a certain product
        | product   |
        | <product> |
      And the user chooses the product he wishes to acquire and add zero products
      Then the user should see the message of Bolsa de Compras

      Examples:
        | product   |
        | televisor |

      @ExceedStock
      Scenario Outline: The user validates that a certain product is added to the shopping bag and then increases the quantity until it exceeds the stock
        Given the user is on the main page
        When the user proceeds to search for a certain product
          | product   |
          | <product> |
        And the user chooses the product he wishes to acquire and add maxium products
        Then the user should see the message warning La cantidad ingresada excede el stock del producto.

        Examples:
          | product   |
          | televisor |




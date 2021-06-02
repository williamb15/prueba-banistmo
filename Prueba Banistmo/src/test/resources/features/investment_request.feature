Feature: Investment Request
  as a user of the bancolombia channel
  I need to enter the investment section
  To know this product

  Scenario: Investment Request
    Given the user is in the channel and enters the product request
    When he selects the Inversiones option and chooses 500.000
    Then he will be able to see the name of the PDF Contrato+Inversion+Virtual.pdf


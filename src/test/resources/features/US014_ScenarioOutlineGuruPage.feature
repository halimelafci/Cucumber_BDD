@guru2
Feature: US013 Class Work

  Scenario Outline: TC14 Kullanici sutun basligi ile liste alabilmeli

    Given kullanici "guruUrl" sayfasina gider
    And "<basliklar>" sutunundaki tum degerleri yazdirir


    Examples:
      | basliklar |
       |Group    |
       |Prev Close (Rs)    |
       |Current Price (Rs)    |
       |% Change  |

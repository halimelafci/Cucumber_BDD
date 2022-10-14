


@paralel1
Feature: Amazon Search



    @grup1
  Scenario: TC01 Kullanciamazonda nutella aratir

    Given kullanici amazon sayfasina gider
    Then kullanici Nutella icin arama yapar
    And  sonuclarin Nutella icerdigini test eder


  @grup1
  Scenario: TC02 Kullanciamazonda selenium aratir

    Given kullanici amazon sayfasina gider
    Then kullanici Selenium icin arama yapar

    And  sonuclarin Selenium icerdigini test eder

   @grup2
  Scenario: TC03 Kullanciamazonda iphone aratir

    Given kullanici amazon sayfasina gider
    Then kullanici iphone icin arama yapar
    And  sonuclarin iphone icerdigini test eder
    And  sayfayi kapatir
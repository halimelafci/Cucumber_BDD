



Feature: Amazon Search



    @grup1
  Scenario: TC01 Kullanci amazonda nutella aratir

    Given kullanici amazon sayfasina gider
    Then kullanici Nutella icin arama yapar
    And  sonuclarin Nutella icerdigini test eder



  Scenario: TC02 Kullanci amazonda selenium aratir

    Given kullanici amazon sayfasina gider
    Then kullanici Selenium icin arama yapar

    And  sonuclarin Selenium icerdigini test eder


  Scenario: TC03 Kullanci amazonda iphone aratir

    Given kullanici amazon sayfasina gider
    Then kullanici iphone icin arama yapar
    And  sonuclarin iphone icerdigini test eder
    And  sayfayi kapatir
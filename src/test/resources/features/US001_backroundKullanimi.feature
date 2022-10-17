

Feature: US001 Backround Kullanimi


  Background:Ortak adimlar
    Given kullanici amazon sayfasina gider


  Scenario: TC01 Kullanciamazonda nutella aratir
   Then kullanici Nutella icin arama yapar
    And  sonuclarin Nutella icerdigini test eder



    Scenario: TC02 Kullanci amazonda selenium aratir
    Then kullanici Selenium icin arama yapar
    And  sonuclarin Selenium icerdigini test eder



    Scenario: TC03 Kullanciamazonda iphone aratir
    Then kullanici iphone icin arama yapar
    And  sonuclarin iphone icerdigini test eder
    And  sayfayi kapatir
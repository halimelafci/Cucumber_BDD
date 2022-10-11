
@paralel2
Feature: US001 Backround Kullanimi


  Background:Ortak adimlar
    Given kullanici amazon sayfasina gider


  Scenario: TC01 Kullanciamazonda nutella aratir
   Then kullanici Nutella icin arama yapar
    And  sonuclarin Nutella icerdigini test eder



    Scenario: TC02 Kullanci amazonda selenium aratir
    Then kullanici selenium aratir
    And  sonuclarin selenium icerdigini test eder


    Scenario: TC03 Kullanciamazonda iphone aratir
    Then Kullanici iphone aratir
    And  sonuclarin iphone icerdigini test eder
    And  sayfayi kapatin
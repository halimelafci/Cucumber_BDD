
@paralel2
Feature: US001 Backround Kullanimi


  Background:Ortak adimlar
    Given Kullanici amazon sayfasina gider


  Scenario: TC01 Kullanciamazonda nutella aratir
   Then Kullanici nutella aratir
    And  sonuclarin nutella icerdigini test eder



    Scenario: TC02 Kullanci amazonda selenium aratir
    Then Kullanici selenium aratir
    And  sonuclarin selenium icerdigini test eder


    Scenario: TC03 Kullanciamazonda iphone aratir
    Then Kullanici iphone aratir
    And  sonuclarin iphone icerdigini test eder
    And  sayfayi kapatin
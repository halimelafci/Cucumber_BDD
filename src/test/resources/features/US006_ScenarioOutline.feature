
  Feature: US006 kullanici amazonda istedigi kelimeleri aratir

    Scenario Outline: TC01 kullanici istedigi kelimeleri aratir

      Given kullanici "amazonUrl" sayfasina gider
      Then kullanici "<istenenKelime>" icin arama yapar
      And sonuclarin "<istenenKelimeKontrol>" icerdigini test eder


      Examples:
        | istenenKelime | istenenKelimeKontrol |
      |   nutella |   nutella                 |


  @paralel1
  Feature: US002 Parametre Kullanimi
  Background: Ortak adim
    Given Kullanici amazon sayfasina gider


  Scenario: TC01 Kullanici amazonda parametreli arama yapar

    Then kullanici "nutella" icin arama yapar
    And sonuclarin "nutella" icerdigini test eder



  Scenario: TC02 Kullanici amazonda parametreli arama yapar
    Then kullanici "selenium" icin arama yapar
    And sonuclarin "selenium" icerdigini test eder



  Scenario: TC03 Kullanici amazonda parametreli arama yapar
    Then kullanici "java" icin arama yapar
    And sonuclarin "java" icerdigini test eder



  Scenario: TC04 Kullanici amazonda parametreli arama yapar
    Then kullanici "SQL" icin arama yapar
    And sonuclarin "SQL" icerdigini test eder
    And sayfayi kapatir



    # Feature dosyasinda parametreli arama yaptigimizda ""(tirnak) icine aldigimiz degeri
    # StepDefinition'da 1 kere parametreli bir method olusturur ve yeni bir arama yapmak istedigimizde
   # yeni bir method olusturmadan feature dosyasindan ""(tirnak) icindeki ifadeyi degistirmemiz
   # yeterli olacaktir boylece kodlarimiz dinamik olacaktir
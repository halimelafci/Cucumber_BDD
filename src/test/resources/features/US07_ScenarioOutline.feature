
   @outline
  Feature: US007 Scenario Outline Kullanimi

    Scenario Outline: TC01 ConfigReader ile Scenario kullanimi

      Given kullanici "<arananUrl>" sayfasina gider
      And kullanici 3 saniye bekler
      When url'nin "<arananKelime>" icerdigini test edelim
      And sayfayi kapatir


      Examples:
        | arananUrl | arananKelime |
        | amazonUrl   | amazon|
        |facebookUrl    | facebook|
        | hepsiburadaUrl  | hepsi|
        |blueRentaCarUrl  | blue|
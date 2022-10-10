

    Feature: Parametre Kullanimi
    Scenario: TC01 parametre kullaniminda ConfigReader kullanimi

    Given kullanici "https://www.hepsiburada.com" sayfasina
    When url'nin "hepsi" icerdigini test edelim
    And kullanici 3 saniye bekler
    And sayfayi kapatir


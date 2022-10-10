

@Facebook
  Feature: Parametre Kullanimi
    Scenario: TC01 parametre kullaniminda ConfigReader kullanimi

      Given kullanici "facebookUrl" sayfasina gider
      And kullanici 3 saniye bekler
      When url'nin "facebook" icerdigini test edelim
      


    Scenario: TC02 Parametre kullaniminda ConfigReader Kullanimi
      Given kullanici "google" sayfasina gider
      When url'nin "google" icerdigini test edelim
   


    Scenario: TC03 Parametre kullaniminda ConfigReader Kullanimi
      Given kullanici "blueRentaCarUrl" sayfasina gider
      And kullanici 3 saniye bekler
      When url'nin "blue" icerdigini test edelim
     


    Scenario: TC04 Parametre kullaniminda ConfigReader Kullanimi
      Given kullanici "amazonUrl" sayfasina gider
      When url'nin "amazon" icerdigini test edelim
      And sayfayi kapatir
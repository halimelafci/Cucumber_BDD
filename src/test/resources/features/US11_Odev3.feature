@herokuapp
Feature: US11ClassWork
  Scenario: Herocap sitesi buton tarama

    Given kullanici "herokuappUrl" sayfasina gider
    And "Add Element" butona basin
    And "Delete" butonu gorunur oluncaya kadar bekleyin
   And "Delete" butonunun gorunur oldugunu test edin
   Then Delete butonuna basarak butonu silin
    And Delete butonunun gorunmedigini test edin
    And sayfayi kapatir
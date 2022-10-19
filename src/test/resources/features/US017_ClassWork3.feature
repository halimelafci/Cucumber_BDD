Feature: US017 Class work
  
 Scenario: TC15 alert and explicitly wait
    
    Given kullanici "demoUrl" sayfasina gider
    When kullanici Alerts buttonuna tiklar
    And kullanici On button click, alert will appear after bes seconds karsisindaki click me  butonuna basar
    And kullanici Allertin gorunur olmasini bekler
    And kullanici Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder
    And kullanici ok diyerek alerti kapatir
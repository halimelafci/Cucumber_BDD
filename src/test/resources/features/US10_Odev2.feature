@datatable
Feature:Class Calismasi
  Scenario Outline: TC12 kullanici yeni kayit ekleyebilmeli
    When kullanici "datatableUrl" ana sayfasinda
    Then  new butonuna basar
    And isim bolumune "<firstname>" girer
    And soyisim bolumune "<lastname>" girer
    And position bolumune "<position>" girer
    And ofis bolumune "<ofis bilgisi>" girer
    And extension bolumune "<extension>" girer
    And Start date bolumune "<Startdate>"  girer
    And Salary bolumune "<Salary>" girer
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    And kullanici 3 saniye bekler
    Then isim bolumunde "<firstname>" oldugunu dogrular


    Examples:
      |firstname |lastname |position  |ofis bilgisi |extension |Startdate |Salary |
       |halime      |lafci      |QA       |ofis          |QA         |2022-10-12 |50.000  |


    #5 farkli kullanici bilgisi girer











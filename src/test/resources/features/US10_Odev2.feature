@datatable
Feature:Class Calismasi
  Scenario Outline: TC12 kullanici yeni kayit ekleyebilmeli
    When kullanici "datatableUrl" ana sayfasinda
    Then  new butonuna basar
    And isim bolumune "<first name>" girer
    And soyisim bolumune "<last name>" girer
    And position bolumune "<position>" girer
    And ofis bolumune "<ofis bilgisi>" girer
    And extension bolumune "<extension>" girer
    And Start date bolumune "<Start date>"  girer
    And Salary bolumune "<Salary>" girer
    And Create tusuna basar
    When kullanici "<first name>" ile arama yapar
    Then isim bolumunde "<first name>" oldugunu dogrular
    Examples:
      |first name |last name |position  |ofis bilgisi |extension |Start date |Salary |
       |halime      |lafci      |QA       |ofis          |QA         |2022-10-12 |50.000  |
    #5 farkli kullanici bilgisi girer











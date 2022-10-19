@medunna
Feature: US018 medunna login negative test

  Scenario Outline: TC16 negative test

  Given kullanici "medunnaUrl" sayfasina gider
  And login olmak icin signin e tiklar
  And username icin "<username>" kullanici adini gonderir
  And password icin "<password>" parolasini gonderir
  Then signine tiklar
  And Authentication information not correct uyarisini dogrular

    Examples:
      | username | password |
      |username  | password |
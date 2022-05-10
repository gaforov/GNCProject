Feature: As a guest user, I want to be able to add an item to cart and checkout without logging into account

  @smoke @regression
  Scenario: As a guest user, I want to be able to add an item to cart and checkout without logging into account

    Given Navigate to "https://www.gnc.ca/"

    And Hover over in "MainPage"
      | DepartmentsButton |
    And User clicks in "SubCategoryPage"
      | Bestsellers|
    And User selects random element from dropdown in "SubCategoryPage"
      |SortBySelector|
      |ItemsPerPageSelector|

#    And User scrolls down in "SubCategoryPage"
#    | ElementToScrollDown |
    And User randomly click on products in to test "SubCategoryPage"
#    And User randomly click on products in "SubCategoryPage"
#    |ProductNameContainer|


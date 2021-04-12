Feature: Invert tree node

  Scenario Outline: Invert tree node
    Given root tree is <rootArr>
    When do inverting binary tree
    Then result should be <invertedTree>

    Examples:
      | rootArr         | invertedTree    |
      | [4,2,7,1,3,6,9] | [4,7,2,9,6,3,1] |
      | [2,1,3]         | [2,3,1]         |
      | []              | []              |

# TeachMeSkills_C27_Lesson_10_HW
Homework for lesson #10

1. **Task #1**

Class **"Card"** contains fields cvv, number and balance. Provides overridden equals() method which set 2 cards equal  
if cvv and number fields has the same value.  

Class **"Client"** contains fields id and cards array.  

Class **"CardsFactory"** has method which generate 10 static cards.  

Class **"CardComparisonService"** has getClientEqualCardsAmount(Client client) provide info about client's cards.  

Class **"Runner"** contains next logic:
- generate **"Card"** array and **"Client"**.
- and call getClientEqualCardsAmount(Client client) for created client method.


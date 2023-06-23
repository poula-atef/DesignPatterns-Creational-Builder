# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Builder Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- لما يكون عندي class انشاء object منه بيتطلب عمليات كتير و بيتكون ال pattern ده من:
  - ايه هي العمليات المطلوبه للبناء (المسؤول عنها هو ال Builder Abstract Class)
  - ازاي بيتم تنفيذ العمليات دي (المسؤول عنها هو ال Builder Concrete Class)
  - ترتيب و تنفيذ العمليات دي ايه (المسؤول عنها ال Director)
# بيتكون من ايه البرنامج ده ؟
- ال package بتاعت ال Builder:
  - ال CarBuilder Interface (و زي ماقلنا ده المسؤول عن ايه هي العمليات المطلوبه للبناء)
  - ال KiaBuilder class و ده بيعمل implement لل CarBuilder Interface (و وزي ماقلنا ده المسؤول عن تحديد ازاي بيتم تنفيذ العمليات اللي واخدها من ال CarBuilder Interface عشان يبني عربيه من نوع Kia)
  - ال MercedesBuilder class و ده بيعمل implement لل CarBuilder Interface (و وزي ماقلنا ده المسؤول عن تحديد ازاي بيتم تنفيذ العمليات اللي واخدها من ال CarBuilder Interfaceعشان يبني عربيه من نوع Mercedes)
  - ال CarDirector و ده بياخد object من نوع CarBuilder او اي class بيعمله implement (و زي ماقلنا ده المسؤول عن ترتيب و تنفيذ العمليات لبناء Car)
- ال package بتاعت ال entities:
  - ال Car class

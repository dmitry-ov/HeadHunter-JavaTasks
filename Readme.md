
** Тестовое задание для собеседования в HeadHunter.ru **


*1. Почему данный код в результате напечатает -6, не меняя значений a и b измените код так, чтобы он выводил арифмитечски верное значение суммы a и b*
 
        public static void main(String[] args) {
         int a = 0x7ffffffc;
         int b = 0x7ffffffe;
         
         int c = a + b;
         System.out.println(c);
        }
 
*2. Программа в составе своём содержит модуль для рассчёта стоимости путешествия, на основе используемого автомобиля и множества других различных данных. Что в этом коде вам кажется неправильным, модифицируте его таким образом, чтобы в дальнейшем разработчик мог добавлять новую марку автомобиля с минимальными трудозатратами*
 
        class Travel {
            public Ford ford;
         
            public Opel opel;
         
            public Travel(Ford aFord) {
              ford = aFord;
            }
         
            public Travel(Opel aOpel) {
              opel = aOpel;
            }
         
            public void doTravel() {
              if (ford != null) {
                System.out.println((ford.amortization() * 5 + ford.repair()) * someInnerLogic());
              }
         
              if (opel != null) {
                System.out.println((opel.amortization() * 3 + opel.repair()) * someInnerLogic());
              }
            }
         
         
            private float someInnerLogic() {
              return new Random().nextFloat() + 1;
            }
         
          }
         
        class Ford {
            public int amortization() {
              return 5;
            }
         
            public int repair() {
              return 100;
            }
          }
         
          class Opel {
            public int amortization() {
              return 10;
            }
         
            public int repair() {
              return 200;
            }
          }
         
 
*3. Представим, что в некоем абстрактном складском приложении смартфоны представлены классом SmartPhone. Содержит ли класс  SmartPhone какие либо ошибки?*
 
      class SmartPhone {
          String model;
          Date date;
          String revision;
       
          public SmartPhone(String model, Date date, String revision) {
            model = model;
            date = date;
            revision = revision;
          }
       
          public int hashCode() {
            return new Random().nextInt();
          }
       
          @Override
          public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
       
            SmartPhone that = (SmartPhone) o;
       
            if (!date.equals(that.date)) return false;
            if (!model.equals(that.model)) return false;
            if (!revision.equals(that.revision)) return false;
       
            return true;
          }
          /**
           * setters, getters and
           * some important methods
           *
           *
           */
        }

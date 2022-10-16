 class Calculator{

        static Supplier<Calculator> instance = Calculator::new;

        int x,y;

        BinaryOperator<Integer> plus = (x, y) -> x + y;
        BinaryOperator<Integer> minus = (x, y) -> x - y;
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        BinaryOperator<Integer> devide = (x, y) ->{ if(x <= 0 || y <= 0 ){
            System.out.println("На ноль делить нельзя");
            return 0;
        }else{
            return  x / y;
        }
        };

        UnaryOperator<Integer> pow = x -> x * x;
        UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

        Predicate<Integer> isPositive = x -> x > 0;

        Consumer<Integer> println = System.out::println;

    }

    @FunctionalInterface
    interface Supplier<Calculator>{

        Calculator get();

    }
    @FunctionalInterface
    interface  BinaryOperator<Integer>{

        Integer apply (int t1, int t2 );
    }

    @FunctionalInterface
    interface UnaryOperator<Integer>{
        Integer apply (Integer t);
    }

    @FunctionalInterface
    interface Predicate<Integer>{
        boolean test (Integer t);
    }

    @FunctionalInterface
    interface Consumer<Integer>{
        void accept (Integer t);
    }


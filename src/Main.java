import Either.Left;
import Either.Right;
import groovy.lang.Tuple;
import groovy.lang.Tuple2;

import java.util.List;
import java.util.function.Function;


public class Main {
    static A_ h(A a) {
        return new A_();
    }

    static B_ f(B b) {
        return new B_();
    }

    static C_ g(C c) {
        return new C_();
    }

    public static void main(String... args) {
        var a = new A();
        var b = new B();
        var c = new C();

        final Tuple2<A, B> a_b = Tuple.tuple(a, b);
        final Tuple2<A, C> a_c = Tuple.tuple(a, c);

        var sum = new Left<Tuple2<A, B>, Tuple2<A, C>>(a_b);

        var aaa = sum.map(
                x -> Tuple.tuple(x.getV1(), f(x.getV2())),
                x -> Tuple.tuple(x.getV1(), g(x.getV2()))
        );


        var res = sum.isRight() ?
                Tuple.tuple(sum.getRight().getV1(), new Right<B, C>(sum.getRight().getV2())) :
                Tuple.tuple(sum.getLeft().getV1(), new Left<B, C>(sum.getLeft().getV2()));

        var transformed = sum.map(
                x -> Tuple.tuple(h(x.getV1()), x.getV2()),
                x -> Tuple.tuple(h(x.getV1()), x.getV2())
        );

        var transformed2 = Tuple.tuple(h(res.getV1()), res.getV2());

    }

    public static B f(A x) {
        var data = DB.commit();
        System.out.println(data);

        if (data == 1) {
            return new B();
        } else {
            throw new ArithmeticException();
        }
    }


}

class A {
}

class B {
}

class C {
}

class A_ {
}

class B_ {
}

class C_ {
}


class DB {
    public static int commit() {
        return 1;
    }






    Function<int, Function<int, int>> sum = x -> (y -> x + x + y);









    public static int method(List<int> items) {


        Function<int, int> myFunction = x -> x + 1;




        return items.stream()
                .map(x -> x + 8)
                .map(x -> x * x)
                .filter(x -> x % 2 == 0)
                .reduce(0, Integer::sum);
    }

    int factorial(int x){

        //var value = sum(1)(4);

        if (x < 2){
            return x;
        }
        return x * factorial(x - 1);
    }

    int fib(int x){
        if (x < 2){
            return x;
        }
        return fib(x - 1) + fib(x - 2);
    }
}

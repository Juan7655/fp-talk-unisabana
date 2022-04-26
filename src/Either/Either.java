package Either;

import java.util.function.Function;

public interface Either<L, R> {
    <A, B> Either<A, B> map(Function<L, A> f, Function<R, B> g);
    boolean isRight();
    L getLeft();
    R getRight();
}

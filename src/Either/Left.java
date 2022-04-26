package Either;

import java.util.function.Function;

public class Left<L, R> implements Either<L, R>{
    private final L value;

    public Left(final L value) {
        this.value = value;
    }

    @Override
    public <A, B> Either<A, B> map(Function<L, A> f, Function<R, B> g) {
        return new Left<A, B>(f.apply(value));
    }

    @Override
    public boolean isRight() {
        return false;
    }

    @Override
    public L getLeft() {
        return value;
    }

    @Override
    public R getRight() {
        throw new AssertionError("The construct does not have a right value!");
    }
}

package Either;

import java.util.function.Function;

public class Right<L, R> implements Either<L, R>{
    private final R value;

    public Right(final R value) {
        this.value = value;
    }

    @Override
    public <A, B> Either<A, B> map(Function<L, A> f, Function<R, B> g) {
        return new Right<A, B>(g.apply(value));
    }

    @Override
    public boolean isRight() {
        return true;
    }

    @Override
    public L getLeft() {
        throw new AssertionError("The construct does not have a left value!");
    }

    @Override
    public R getRight() {
        return value;
    }
}

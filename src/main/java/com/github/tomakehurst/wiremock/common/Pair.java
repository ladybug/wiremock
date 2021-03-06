package com.github.tomakehurst.wiremock.common;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

public final class Pair<A, B> {

    public final A a;
    public final B b;

    public Pair(A a, B b) {
        this.a = requireNonNull(a);
        this.b = requireNonNull(b);
    }

    public static <A, B> Pair<A, B> pair(A a, B b) {
        return new Pair<>(a, b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return a.equals(pair.a) && b.equals(pair.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return a + "=" + b;
    }
}

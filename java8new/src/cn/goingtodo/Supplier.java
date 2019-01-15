package cn.goingtodo;

@FunctionalInterface
public interface Supplier<T> {
    T get();
}

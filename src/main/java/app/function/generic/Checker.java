package app.function.generic;

import java.util.function.Function;

public class Checker<T> {

    private T value;
    private Function<T, T> callback;

    private Checker(T value){
        this.value = value;
    }

    public static Checker<String> when(String o) {
        return new Checker<>(o);
    }

    public static Checker<Integer> when(Integer i){
        return new Checker<>(i);
    }

    public Checker<T> then(Function<T, T> callback){
        this.callback = callback;
        return this;
    }

    public T execute(){
        if(callback == null) {
            throw new IllegalStateException("callback is null, make sure that then method is called before execute");
        }
        return this.callback.apply(value);
    }


}

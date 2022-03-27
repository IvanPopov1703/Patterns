package creation_patterns.factory_method;

public interface Pizza {
    void preparing(); //приготовление
    void backing();   //выпечка
    void cutting();   //нарезка
    void packaging(); //упаковка
}

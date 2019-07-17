package gengric;

/**
 *泛型接口
 * 引入一个类型变量T（其他大写字母都可以，不过常用的就是T，E，K，V等等）
 */
public interface Generator<T> {
    T next();
}

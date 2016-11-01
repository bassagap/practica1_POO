/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

/**
 *
 * @author ivo
 */
public class UnorderedHashMap<T1,T2> extends HashMap<T1,T2> {
    public UnorderedHashMap() {
        super();
    }
    public Boolean containsPair(T1 a, T2 b) {
        return processPair((x,y) -> {
            return (((x==a) && (y==b)) || ((x==a) && (y==b)));
        });
    }
    public void ifNotContainsAddPair(T1 a, T2 b) {
        if(!containsPair(a,b)) this.put(a, b);
    }
    public Boolean removePair(T1 a, T2 b) {
        return (this.remove(b, a) || this.remove(a, b));
    }
    private Boolean processPair(BiFunction<T1,T2,Boolean> f) {
        Boolean flag = false;
        Set<Map.Entry<T1, T2>> set = this.entrySet();
        for(Map.Entry<T1, T2> entry : set) {
            if(!flag) f.apply(entry.getKey(), entry.getValue());
            else break;
        }
        return flag;
    }
}

package designPattern.FlyWeight;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by zhuanli.cheng on 2017/11/22.
 */
public class FlyWeightFactory {
    private static Map<String, ConcreteFlyWeight> map = Maps.newHashMap();
    public static ConcreteFlyWeight getChess(String color){
        if (null != map.get(color)){
            return map.get(color);
        } else {
            ConcreteFlyWeight flyWeight = new ConcreteFlyWeight(color);
            map.put(color, flyWeight);
            return flyWeight;
        }
    }
}

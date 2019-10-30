package tanbo.wu.data.task1;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现SteelMadeable接口,表示物品用钢制作
 * @Date: 2019/10/27
 * @Modified By:2017110342_吴谭波
 */
public interface SteelMadeable {
    double meltPrice = 10; //计算熔钢的成本￥10
    double moldPrice = 10; //计算塑性的成本￥10
    double coldDownPrice = 5; //计算冷却成型成本￥5
    double polishPrice = 15; //计算打磨成本￥15
    double melt();
    double mold();
    double coldDown();
    double polish();
}

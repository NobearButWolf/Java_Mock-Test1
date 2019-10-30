package tanbo.wu.data.task1;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现IronMadeable接口,表示物品用铁制作
 * @Date: 2019/10/18
 * @Modified By:2017110342_吴谭波
 */
public interface IronMadeable {
    double burnPrice = 10;
    double hanMoldPrice = 15;
    double polishPrice = 10;
    double burn(); //计算烧铁的成本￥10
    double handMold(); //计算手工打制的成本￥15
    double polish(); //计算打磨的成本￥10
}

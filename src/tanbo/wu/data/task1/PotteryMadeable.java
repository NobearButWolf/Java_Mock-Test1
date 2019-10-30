package tanbo.wu.data.task1;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现PotteryMadeable接口,表示物品用陶制作
 * @Date: 2019/10/27
 * @Modified By:2017110342_吴谭波
 */
public interface PotteryMadeable { //物品用陶制作
    double moldPrice = 5; //计算塑性的成本￥5
    double firingPrice = 10; //计算烧制的成本￥10
    double mold();
    double firing();
}

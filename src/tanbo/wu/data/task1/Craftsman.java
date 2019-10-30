package tanbo.wu.data.task1;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现Craftsman类
 * @Date: 2019/10/27
 * @Modified By:2017110342_吴谭波
 */
public class Craftsman {
    public double  calculateManufactureCost(Artifact artifact){
        double cost = 0.0;
        if (artifact instanceof Pot) {
            cost = ((Pot) artifact).mold() + ((Pot) artifact).firing();
        }
        else if (artifact instanceof Wok) {
            cost = ((Wok)artifact).burn() + ((Wok)artifact).handMold() + ((Wok)artifact).polish();
        }
        else if (artifact instanceof Box) {
            cost = ((Box)artifact).melt() + ((Box)artifact).mold() + ((Box)artifact).polish() + ((Box)artifact).coldDown();
        }
        return cost;
    }
}

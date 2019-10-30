package tanbo.wu.data.task1;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现Pot类
 * @Date: 2019/10/27
 * @Modified By:2017110342_吴谭波
 */
public class Pot extends Artifact implements PotteryMadeable{
    private double radius;

    public Pot(double radius) {
        this.radius = radius;
    }

    @Override
    public double mold() {
        return moldPrice*4/3*Math.PI*radius*radius; //计算塑性的成本￥5
    }

    @Override
    public double firing() {
        return firingPrice*4/3*Math.PI*radius*radius; //计算烧制的成本￥10
    }
}

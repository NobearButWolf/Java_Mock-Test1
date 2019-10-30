package tanbo.wu.data.task1;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现Wok类
 * @Date: 2019/10/27
 * @Modified By:2017110342_吴谭波
 */
public class Wok extends Artifact implements IronMadeable {
    private double radius;
    private double depth;

    public Wok(double radius,double depth) {
        this.radius = radius;
        this.depth = depth;
    }

    @Override
    public double burn() {
        return burnPrice*(4/3*Math.PI*radius*radius - 1/3*Math.pow(depth,3)*Math.pow(radius,2)/Math.pow(radius-depth,2));
    }

    @Override
    public double handMold() {
        return hanMoldPrice*(4/3*Math.PI*radius*radius - 1/3*Math.pow(depth,3)*Math.pow(radius,2)/Math.pow(radius-depth,2));
    }

    @Override
    public double polish() {
        return polishPrice*(4/3*Math.PI*radius*radius - 1/3*Math.pow(depth,3)*Math.pow(radius,2)/Math.pow(radius-depth,2));
    }
}

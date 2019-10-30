package tanbo.wu.data.task1;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现Box类
 * @Date: 2019/10/27
 * @Modified By:2017110342_吴谭波
 */
public class Box extends Artifact implements SteelMadeable {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double melt() {
        return meltPrice*length*width*height;
    }

    @Override
    public double mold() {
        return moldPrice*length*width*height;
    }

    @Override
    public double coldDown() {
        return coldDownPrice*length*width*height;
    }

    @Override
    public double polish() {
        return polishPrice*length*width*height;
    }
}

package tanbo.wu.data.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现使用设备功能
 * @Date: 2019/10/28
 * @Modified By:2017110342_吴谭波
 */


public class ArtifactMake {
    private static int artifactCount = 0;
    static List<Artifact> artifactTypeList = new ArrayList<>();
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArtifactMenu();
        do {
            ConfirmMenu();
        }while (artifactCount < 3);
        System.out.println("用户最多只能创建3个物品！");
        TotalCost();
    }

    private static void ArtifactMenu(){ //选择制作物品菜单
        Scanner input = new Scanner(System.in);
        System.out.println("请问你需要制作:1.壶 2.锅 3.盒子");
        System.out.println("请选择:");
        int artifactOption = input.nextInt();
        switch (artifactOption){
            case 1:
                PotMenu();
                break;
            case 2:
                WokMenu();
                break;
            case 3:
                BoxMenu();
                break;
            default:
                System.out.println("输入错误！");
                TotalCost();
        }
    }

    private static void ConfirmMenu(){ //询问是否继续制作菜单
        Scanner input = new Scanner(System.in);
            System.out.println("是否继续制作另外一个物品：1.是 2.否");
            int confirmOption = input.nextInt();
            switch (confirmOption){
                case 1:
                    ArtifactMenu();
                    break;
                case 2:
                    TotalCost();
                    break;
                default:
                    System.out.println("输入错误！");
                    TotalCost();
            }
    }

    /**
     * 提示输入有关壶的相关参数
     */
    private static void PotMenu(){
        Scanner input = new Scanner(System.in);
        artifactCount++;
        System.out.println("你需要创建的物品是壶，需输入1个参数:");
        System.out.println("1.请输入壶的半径:");
        double radius = input.nextDouble();
        Pot pot = new Pot(radius);
        artifactTypeList.add(pot);
    }

    /**
     * 提示输入有关锅的相关参数
     */
    private static void WokMenu(){
        Scanner input = new Scanner(System.in);
        artifactCount++;
        System.out.println("你需要创建的物品是锅，需输入2个参数:");
        System.out.println("1.请输入锅的半径:");
        double radius = input.nextDouble();
        System.out.println("2.请输入锅的深度:");
        double depth = input.nextDouble();
        Wok wok = new Wok(radius,depth);
        artifactTypeList.add(wok);
    }

    /**
     * 提示输入有关盒子的相关参数
     */
    private static void BoxMenu(){
        Scanner input = new Scanner(System.in);
        artifactCount++;
        System.out.println("你需要创建的物品是盒子，需输入3个参数:");
        System.out.println("1.请输入盒子的长度:");
        double length = input.nextDouble();
        System.out.println("2.请输入盒子的宽度:");
        double width = input.nextDouble();
        System.out.println("3.请输入盒子的高度:");
        double height = input.nextDouble();
        Box box = new Box(length,width,height);
        artifactTypeList.add(box);
    }

    private static void TotalCost(){ //输出总成本
        System.out.println("你总共制作了" + artifactCount + "个物品:");
        Craftsman craftsman = new Craftsman();
        double totalCost = 0;
        int count = 1;
        for (Artifact item:artifactTypeList){
            if (item instanceof Pot){
                System.out.printf("%d.壶：成本%.1f元\n",count,craftsman.calculateManufactureCost(item));
            }
            else if (item instanceof Wok){
                System.out.printf("%d.锅：成本%.1f元\n",count,craftsman.calculateManufactureCost(item));
            }
            else if (item instanceof Box){
                System.out.printf("%d.盒子：成本%.1f元\n",count,craftsman.calculateManufactureCost(item));
            }
            totalCost = totalCost + craftsman.calculateManufactureCost(item);
            count++;
        }
        System.out.println("====================================================");
        System.out.printf("总计:%.1f元\n",totalCost);
        System.exit(0);
    }
}

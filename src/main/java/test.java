import java.text.DecimalFormat;
import java.util.Random;

/**
 * Project name(项目名称)：数字格式化
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/16
 * Time(创建时间)： 20:37
 * Version(版本): 1.0
 * Description(描述)： 数字的格式在解决实际问题时使用非常普遍，这时可以使用 DedmalFormat 类对结果进行格式化处理。
 * 例如，将小数位统一成 2 位，不足 2 位的以 0 补齐。
 * DecimalFormat 是 NumberFormat 的一个子类，用于格式化十进制数字。DecimalFormat 类包含一个模式和一组符号，常用符号的说明如表 1 所示。
 * 表 1 DecimalFormat 支持的特殊字符
 * 符号	说明
 * 0	显示数字，如果位数不够则补 0
 * #	显示数字，如果位数不够不发生变化
 * .	小数分隔符
 * -	减号
 * ,	组分隔符
 * E	分隔科学记数法中的尾数和小数
 * %	前缀或后缀，乘以 100 后作为百分比显示
 * ?	乘以 1000 后作为千进制货币符显示。用货币符号代替。如果双写，用国际货币符号代替；
 * 如果出现在一个模式中，用货币十进制分隔符代替十进制分隔符
 */

public class test
{
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        DecimalFormat f1 = new DecimalFormat("##.##");
        DecimalFormat f2 = new DecimalFormat("000.0000");
        DecimalFormat f3 = new DecimalFormat("0");
        double s = 8.9566584;
        double s1 = 5.2;
        System.out.println(f1.format(s));
        System.out.println(f2.format(s));
        System.out.println(f1.format(s1));
        System.out.println(f2.format(s1));
        System.out.println(f3.format(s));
        Random ra = new Random();
        double s2 = ra.nextDouble() * 10;
        System.out.println(s2);
        System.out.println(f1.format(s2));
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}

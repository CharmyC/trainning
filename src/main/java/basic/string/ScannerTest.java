package basic.string;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by zhuanli.cheng on 2017/12/11.
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("请输入字符串：");
        while (stdin.hasNext()){
            String line = stdin.nextLine();
            if (line.equalsIgnoreCase("q")){
                break;
            }
            StringTokenizer sz = new StringTokenizer(line);
            List<Integer> list = Lists.newArrayList();
            while (sz.hasMoreTokens()){
                list.add(Integer.parseInt(sz.nextToken()));
            }
            System.out.println(sz.countTokens());
            System.out.println(">>>" + line);
            System.out.println(">>>" + list);
            System.out.print("请输入字符串：");
        }

    }
}

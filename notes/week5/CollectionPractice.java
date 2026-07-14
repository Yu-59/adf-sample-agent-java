package notes.week5;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        System.out.println("--- 1. List<String> 城市列表 ---");
        // 创建一个 List<String>，添加 5 个城市名
        List<String> cityList = new ArrayList<>();
        cityList.add("北京");
        cityList.add("上海");
        cityList.add("广州");
        cityList.add("深圳");
        cityList.add("合肥");
        // 使用 for-each 遍历
        for (String city : cityList) {
            System.out.print(city + " ");
        }
        System.out.println("\n");

        System.out.println("--- 2. Set<Integer> 重复元素观察 ---");
        // 创建一个 Set<Integer>，添加 10 个数字，观察重复元素是否被加入
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(10);
        numberSet.add(20);
        numberSet.add(30);
        numberSet.add(40);
        numberSet.add(50);
        numberSet.add(20);
        numberSet.add(60);
        numberSet.add(70);
        numberSet.add(80);

        System.out.println("Set 里的元素：");
        for (Integer num : numberSet) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        System.out.println("--- 3. Map<String, Integer> 姓名年龄映射 ---");
        // 创建一个 Map<String, Integer>，存储"姓名, 年龄"
        Map<String, Integer> personMap = new HashMap<>();
        personMap.put("张三", 18);
        personMap.put("李四", 20);
        personMap.put("王五", 22);
        personMap.put("赵六", 19);

        // 遍历输出
        System.out.println("遍历 Map 输出：");
        for (Map.Entry<String, Integer> entry : personMap.entrySet()) {
            System.out.println("姓名：" + entry.getKey() + "，年龄：" + entry.getValue());
        }
    }
}
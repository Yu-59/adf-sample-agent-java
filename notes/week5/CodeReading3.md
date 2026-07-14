1，因为 `Collection` 是 `List` 和 `Set` 的父接口，用 `Collection` 作为变量类型限制会更宽松、更灵活。
`unexploredBuildings` 这个变量实际上传进来的值是由 `new HashSet<>(buildingIDs)` 初始化的 `Set` 集合。如果这里写死了是 `List`，那就只能强制传入有序可重复的列表；写成 `Collection` 的话，像 `List`、`Set` 这种子类都可以传进来，我觉得这其实就是多态的思想，用父接口去接子类对象。
EnumSet.of(...)` 是 Java 专门用来快速创建“存放枚举类型”集合的一个工具方法。
2.它比普通的 `HashSet` 好用主要体现在两点： 
因为是专门给枚举用的，枚举元素的数量是固定已知的，所以 `EnumSet` 底层是用位运算来做的，处理速度比普通 `Set` 快。
占用的内存非常少，比 `new` 一个新的 `HashSet` 对象更省内存。
在 RoboCup 的项目里，`Agent.java` 里面就用了 `EnumSet<StandardEntityURN>` 来标记当前的这个智能体具体能处理哪些类型的实体（比如它支持消防员、警察，或者是救护人员）。因为那些实体类型全都写死在了枚举里，用 `EnumSet` 做查找不仅快，还不会频繁创建对象导致内存浪费。
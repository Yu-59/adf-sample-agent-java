# 第三周作业二：代码阅读

## 1. `SampleFireBrigade.java` 的 `sense()` 方法做了什么？
答：`sense()` 是 Agent 智能体每一个仿真时间步（Time Step）都会执行的“感知”方法。
它的作用是：向仿真服务器获取当前世界的环境状态，并将其更新到智能体的本地模型中。例如，更新智能体当前的坐标位置、周围建筑是否坍塌、火势的蔓延范围以及需要救援的平民位置等信息，为下一步的“决策（act）”提供基础数据。

## 2. `for (Iterator it = targets.iterator(); it.hasNext();)` 这种语法叫什么？为什么这里不用增强 for 循环？
答：这种语法叫 **迭代器遍历（Iterator）**。
不能用增强 for 循环（foreach）的原因是：增强 for 循环内部隐藏了迭代器。如果在遍历集合的过程中，需要**删除**当前遍历到的元素（即需要调用 `it.remove()`），就必须显式地使用 `Iterator`。如果用增强 for 循环去遍历并删除元素，会直接抛出 `ConcurrentModificationException`（并发修改异常）导致程序崩溃。
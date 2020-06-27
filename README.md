# PageReplacementAlgorithmus

操作系统-请求分页存储管理页面置换算法-Java

#### OPT 算法

##### 内存:3

|  次数   |   1   |   2   |  3   |   4   |   5   |  6   |   7   |  8   |  9   |  10   |  11  |  12  |
| :-----: | :---: | :---: | :--: | :---: | :---: | :--: | :---: | :--: | :--: | :---: | :--: | :--: |
|  页面   |   2   |   3   |  2   |   1   |   5   |  2   |   4   |  5   |  3   |   2   |  5   |  2   |
| 内存块A | ==2== |   2   |      |   2   |   2   |      | ==4== |      |      | ==2== |      |      |
| 内存块B |       | ==3== |      |   3   |   3   |      |   3   |      |      |   3   |      |      |
| 内存块C |       |       |      | ==1== | ==5== |      |   5   |      |      |   5   |      |      |
|  缺页   |   T   |   T   |      |   T   |   T   |      |   T   |      |      |   T   |      |      |
|  置换   |       |       |      |       | ==T== |      | ==T== |      |      | ==T== |      |      |

##### 内存:4

|  次数   |   1   |   2   |  3   |   4   |   5   |  6   |   7   |  8   |  9   |  10  |  11  |  12  |
| :-----: | :---: | :---: | :--: | :---: | :---: | :--: | :---: | :--: | :--: | :--: | :--: | :--: |
|  页面   |   2   |   3   |  2   |   1   |   5   |  2   |   4   |  5   |  3   |  2   |  5   |  2   |
| 内存块A | ==2== |   2   |      |   2   |   2   |      |   2   |      |      |      |      |      |
| 内存块B |       | ==3== |      |   3   |   3   |      |   3   |      |      |      |      |      |
| 内存块C |       |       |      | ==1== |   1   |      | ==4== |      |      |      |      |      |
| 内存块D |       |       |      |       | ==5== |      |   5   |      |      |      |      |      |
|  缺页   |   T   |   T   |      |   T   |   T   |      |   T   |      |      |      |      |      |
|  置换   |       |       |      |       |       |      | ==T== |      |      |      |      |      |



#### FIFO算法

##### 内存:3

|  次数   |   1   |   2   |  3   |   4   |   5   |   6   |   7   |  8   |   9   |  10  |  11   |  12   |
| :-----: | :---: | :---: | :--: | :---: | :---: | :---: | :---: | :--: | :---: | :--: | :---: | :---: |
|  页面   |   2   |   3   |  2   |   1   |   5   |   2   |   4   |  5   |   3   |  2   |   5   |   2   |
| 内存块A | ==2== |   2   |      |   2   | ==5== |   5   |   5   |      | ==3== |      |   3   |   3   |
| 内存块B |       | ==3== |      |   3   |   3   | ==2== |   2   |      |   2   |      | ==5== |   5   |
| 内存块C |       |       |      | ==1== |   1   |   1   | ==4== |      |   4   |      |   4   | ==2== |
|  缺页   |   T   |   T   |      |   T   |   T   |   T   |   T   |      |   T   |      |   T   |   T   |
|  置换   |       |       |      |       |   T   |   T   |   T   |      |   T   |      |   T   |   T   |



##### 内存:4

|  次数   |   1   |   2   |  3   |   4   |   5   |  6   |   7   |  8   |  9   |  10   |  11  |  12  |
| :-----: | :---: | :---: | :--: | :---: | :---: | :--: | :---: | :--: | :--: | :---: | :--: | :--: |
|  页面   |   2   |   3   |  2   |   1   |   5   |  2   |   4   |  5   |  3   |   2   |  5   |  2   |
| 内存块A | ==2== |   2   |      |   2   |   2   |      | ==4== |      |      |   4   |      |      |
| 内存块B |       | ==3== |      |   3   |   3   |      |   3   |      |      | ==2== |      |      |
| 内存块C |       |       |      | ==1== |   1   |      |   1   |      |      |   1   |      |      |
| 内存块D |       |       |      |       | ==5== |      |   5   |      |      |   5   |      |      |
|  缺页   |   T   |   T   |      |   T   |   T   |      |   T   |      |      |   T   |      |      |
|  置换   |       |       |      |       |       |      |   T   |      |      |   T   |      |      |



#### LRU算法

##### 内存:3

|  次数   |   1   |   2   |  3   |   4   |   5   |  6   |   7   |  8   |   9   |  10   |  11  |  12  |
| :-----: | :---: | :---: | :--: | :---: | :---: | :--: | :---: | :--: | :---: | :---: | :--: | :--: |
|  页面   |   2   |   3   |  2   |   1   |   5   |  2   |   4   |  5   |   3   |   2   |  5   |  2   |
| 内存块A | ==2== |   2   |      |   2   |   2   |      |   2   |      | ==3== |   3   |      |      |
| 内存块B |       | ==3== |      |   3   | ==5== |      |   5   |      |   5   |   5   |      |      |
| 内存块C |       |       |      | ==1== |   1   |      | ==4== |      |   4   | ==2== |      |      |
|  缺页   |   T   |   T   |      |   T   |   T   |      |   T   |      |   T   |   T   |      |      |
|  置换   |       |       |      |       |   T   |      |   T   |      |   T   |   T   |      |      |

2							2，3					3，2					  3，2，1				2，1，5				1，5，2		

5，2，4				2，4，5			  4，5，3				5，3，2				3，2，5				3，5，2

##### 内存:4

|  次数   |   1   |   2   |  3   |   4   |   5   |  6   |   7   |  8   |   9   |  10  |  11  |  12  |
| :-----: | :---: | :---: | :--: | :---: | :---: | :--: | :---: | :--: | :---: | :--: | :--: | :--: |
|  页面   |   2   |   3   |  2   |   1   |   5   |  2   |   4   |  5   |   3   |  2   |  5   |  2   |
| 内存块A | ==2== |   2   |      |   2   |   2   |      |   2   |      |   2   |      |      |      |
| 内存块B |       | ==3== |      |   3   |   3   |      | ==4== |      |   4   |      |      |      |
| 内存块C |       |       |      | ==1== |   1   |      |   1   |      | ==3== |      |      |      |
| 内存块D |       |       |      |       | ==5== |      |   5   |      |   5   |      |      |      |
|  缺页   |   T   |   T   |      |   T   |   T   |      |   T   |      |   T   |      |      |      |
|  置换   |       |       |      |       |       |      |   T   |      |   T   |      |      |      |


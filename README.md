# MalewareDetection
一个基于apk逆向分析并运用随机森林分类的重打包（恶意）apk检测的项目

运用的技术：

1，使用apktool对apk进行逆向分析；

2，对解包后的apk文件进行异构分析；

3，使用随机森林算法对带标签的apk样本进行训练，得到模型；

4，利用ssm搭建一个web平台开源测试；

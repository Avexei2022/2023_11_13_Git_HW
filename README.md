# Контроль версий углублённо (GIT) (семинары)  
## Урок 1. Работа с удалёнными репозиториями  
1. Выберите какой-нибудь проект на изучаемом вами языке программирования, с которым вы будете тренироваться работать в Git, и инициализируйте в папке этого проекта локальный репозиторий.  
2. Создайте непустой удалённый репозиторий (например, с файлом README.md) с именем, соответствующим имени этого проекта.  
3. Подключите свой проект к этому удалённому репозиторию и отправьте в него код этого проекта. Самостоятельно разрешите конфликты и проблемы, если они возникнут при выполнении данного задания.   
   
# Java: знакомство и как пользоваться базовым API (семинары)  
## Урок 3. Коллекции JAVA: Введение  
### Задание  

Пусть дан произвольный список целых чисел.  

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение

# Урок 2. Работа с изменениями  
Данное домашнее задание является продолжением домашнего задания, которое вы выполняли на предыдущем семинаре в репозитории с собственным проектом.  

1. Просмотрите историю коммитов в своём проекте и выберите три случайных коммита. Просмотрите изменения, которые были в них сделаны.  

2. Верните эти изменения командой git revert последовательно, чтобы в итоге получилось тоже три коммита.  

3. Попробуйте отменить эти три коммита:  
* последний — командами git reset --soft и git restore;  
* предпоследний — командой git reset --mixed и git restore;  
* первый — командой git reset --hard.  
* 
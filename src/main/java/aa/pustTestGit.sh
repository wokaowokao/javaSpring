echo "开始执行切换分支。。执行完之后等待2s"
git checkout -
sleep 5
echo "开始分支pull,之后push,执行完之后等待1s"
#git pull origin b1
git pull --progress --no-stat -v --progress origin b1

sleep 4
git git push
echo '开始切换分支。。'
git checkout -
sleep 1
echo '执行完毕'

aaa

bbb
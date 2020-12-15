set /P commit="/n  Insert comment : "

git add .
git commit -m "%commit%"
git push -u origin main
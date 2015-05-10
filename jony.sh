#!/bin/bash
git init
echo "PULLING AMADER_BARI PROJECT FROM GIT"
git pull https://github.com/tamimcsedu19/amaderbari.git

echo "POSSIBLE COMMAND : exit, push, pull"
com="command"

while [ "$com" != "exit" ]
do
	read -p "Command : " com
	if [ $com == "push" ]
	then
		echo "PUSHING ALL FILES TO REMOTE(MASTER)"
		git add -A
		read -p "Enter Commit Message: " msg
		git commit -m "$msg"
		git push

	elif [ $com == "pull" ] 
	then
		echo "PULLING DATA FROM REMOTE"
		git pull https://github.com/tamimcsedu19/amaderbari.git

	else
		echo "wrong command... try again"
	fi
	read com
	clear
done


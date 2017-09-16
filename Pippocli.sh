#!/bin/bash

#
# List current options avaibles
#
__OPTIONS()
{
    echo ">> some options is avaible:"

    __breakline

    echo "new [app_name] : initialize a new app"
}

#
# A util function to "press enter"
#
__breakline()
{
    echo ""
    echo ""    
}

#
# Function says Hello
#
__greetings()
{
    echo ">> Hi ;)"
    echo ">> I'm glad you came!"

    __breakline
}

#
# Initialize a new app
#
__NEW()
{
    echo ">> Installing Skeleton App in $1"

    __breakline

    git clone git@github.com:MateusGabi/Example-Pippo-WebApp-.git $1

    cd $1

    __breakline

    echo ">> Skeleton Schema"

    __breakline

    ls -l
}

__RUN()
{
	cd App/target/
	mvn compile exec:java
}


# say hello
__greetings


# 
# $1 = options
# $2 = variable
#
case $1 in

new) __NEW $2 ;;
run) __RUN ;;


*) __OPTIONS ;;
esac
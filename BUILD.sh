#!/bin/bash -v
rm -rf "aaa"
mkdir -p aaa/classes 
find . -name "*.java" | xargs javac -cp "lib/*" -d aaa/classes -sourcepath src -verbose

#cp -r src/* aaa/classes/
cp -r resources/* aaa/classes/
#cp -r resources/ aaa/

mkdir -p "aaa/lib"
cp lib/* aaa/lib/

jar -cfe aaa/aaa.jar com.andr.Main -C aaa/classes/ .


#!/bin/bash
javac quine_v2.java
java quine
simEndGen=3
simGen=1
while [ $simGen -le $simEndGen ]
do
   echo "Generation $simGen"
   for file in *v2_G$simGen*
   do
      echo "    Running $file"
      javac "$file"
      java quine
   done
   simGen=`expr $simGen + 1`
done

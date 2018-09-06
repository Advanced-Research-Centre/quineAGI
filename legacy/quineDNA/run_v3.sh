#!/bin/bash
echo "    Running Zygote"
javac quine_v3.java
java quine
simEndGen=2
simGen=0
while [ $simGen -le $simEndGen ]
do
   echo "Generation $simGen"
   for file in *v3_G$simGen\_T0*
   do
      echo "    Running T0 $file"
      javac "$file"
      java quine
   done
   for file in *v3_G$simGen\_T1*
   do
      echo "    Running T1 $file"
      javac "$file"
      java quine
   done
   for file in *v3_G$simGen\_T2*
   do
      echo "    Running T2 $file"
      javac "$file"
      java quine
   done
   simGen=`expr $simGen + 1`
done

#!/bin/bash

ver=6
simEndGen=1

for file in *v$ver\_G*
do
   rm "$file"
done

echo "    Running Zygote"
javac quine_v$ver.java
java quine
simGen=0
while [ $simGen -le $simEndGen ]
do
   echo "Generation $simGen"
   for file in *v$ver\_G$simGen\_O*T0*
   do
      echo "    Compiling T0 $file"
      javac "$file"
      echo "    Running T0 $file"
      java quine
   done
   for file in *v$ver\_G$simGen\_O*T1*
   do
      echo "    Compiling T1 $file"
      javac "$file"
      echo "    Running T1 $file"
      java quine
   done
   for file in *v$ver\_G$simGen\_O*T2*
   do
      echo "    Compiling T2 $file"
      javac "$file"
      echo "    Running T2 $file"
      java quine
   done
   num=0
   for file in *v$ver\_G$simGen\_O*T3*
   do
      echo "    Compiling T3 $file"
      javac "$file"
      if (( $num % 2 == 0 ))
      then
          echo "    Running T3 $file"
          java quineF `java quineM`
      fi
   done
   simGen=`expr $simGen + 1`
done

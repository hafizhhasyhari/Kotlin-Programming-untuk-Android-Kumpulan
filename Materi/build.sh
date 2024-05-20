#!/bin/bash

basnam=`basename $1 .kt`

if [ $basnam == "$1" ]; then
  echo "Error: file name does not have *.kt extension"
  exit 1
fi

kotlinc $1 -include-runtime -d ${basnam}.jar

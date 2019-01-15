#!/bin/sh
for i in *.1.txt ; do sed "s/replaceme/`echo $i | sed "s/\.1.txt$//"`/g" accplot.plt | gnuplot; done
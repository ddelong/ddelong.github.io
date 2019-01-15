set terminal postscript eps color enhanced
set output "replaceme.acctime.eps"
set xlabel "Simulated Time"
set ylabel "Accounting Time (ms)"
set title "Accounting Time for Experiment (replaceme)"
set autoscale
set size ratio 0.5
set key below
plot    "replaceme.1.txt" using 1:5 title 'Rosenberg' with lines, \
	"replaceme.2.txt" using 1:5 title  'Simple' with lines
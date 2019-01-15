set terminal postscript eps color enhanced
set output "replaceme.falseposnum.eps"
set xlabel "Simulated Time"
set ylabel "Number of False Positives"
set title "Number of False Positives for Experiment (replaceme)"
set autoscale
set size ratio 0.5
set key below
plot    "replaceme.1.txt" using 1:7 title 'Rosenberg' with lines, \
	"replaceme.2.txt" using 1:7 title  'Simple' with lines
set terminal postscript eps color enhanced
set output "replaceme.falserate.eps"
set xlabel "Simulated Time"
set ylabel "Percentage"
set title "Percentage of False Positives for Experiment (replaceme)"
set xrange [0.0:1000.0]
set yrange [0.0:1.0]
set size ratio 0.5
set key below
plot    "replaceme.1.txt" using 1:12 title 'Rosenberg' with lines, \
	"replaceme.2.txt" using 1:12 title  'Simple' with lines
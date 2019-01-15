set terminal postscript eps color enhanced
set output "replaceme.checked.eps"
set xlabel "Simulated Time"
set ylabel "Number of Work Units"
set title "Checked Units for Experiment (replaceme)"
set autoscale
set size ratio 0.5
set key below
plot    "replaceme.1.txt" using 1:4 title 'Rosenberg' with lines, \
	"replaceme.2.txt" using 1:4 title  'Simple' with lines
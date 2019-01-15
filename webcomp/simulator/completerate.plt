set terminal postscript eps color enhanced
set output "replaceme.completeratetime.eps"
set xlabel "Simulated Time"
set ylabel "Units/Simulated Hour"
set title "Complete Rate (replaceme)"
set autoscale
set size ratio 0.5
set key below
plot    "replaceme.1.txt" using 1:14 title 'Rosenberg' with lines, \
	"replaceme.2.txt" using 1:14 title  'Simple' with lines
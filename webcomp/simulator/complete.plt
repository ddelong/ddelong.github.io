set terminal postscript eps color enhanced
set output "replaceme.completions.eps"
set xlabel "Simulated Time"
set ylabel "Units"
set title "Completions (replaceme)"
set autoscale
set size ratio 0.5
set key below
plot    "replaceme.1.txt" using 1:13 title 'Rosenberg' with lines, \
	"replaceme.2.txt" using 1:13 title  'Simple' with lines
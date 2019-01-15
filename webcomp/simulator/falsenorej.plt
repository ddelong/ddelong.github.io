set terminal postscript eps color enhanced
set output "replaceme.falseratenorej.eps"
set xlabel "Simulated Time"
set ylabel "False Postive %"
set title "False Positive Rate (No Rejections) (replaceme)"
set autoscale
set size ratio 0.5
set key below
plot    "replaceme.1.txt" using 1:15 title 'Rosenberg' with lines, \
	"replaceme.2.txt" using 1:15 title  'Simple' with lines
---
id: 399
title: Xbench Disk Comparison
date: 2005-04-16T17:52:59+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/04/16/xbench-disk-comparison/
permalink: /weblog/2005/04/16/xbench-disk-comparison/
shorturl:
  - http://l.derik.us/89
dsq_thread_id:
  - "64768556"
categories:
  - Macs
---
Using [Xbench](http://www.xbench.com), I compared the three disks attached to my Powermac.

First, I have the stock drive, a Deskstar 120GXP (80 GB).

    Disk Test   100.77  
        Sequential  103.00  
            Uncached Write  90.65   37.79 MB/sec [4K blocks]
            Uncached Write  90.87   37.21 MB/sec [256K blocks]
            Uncached Read   170.74  27.03 MB/sec [4K blocks]
            Uncached Read   91.39   36.93 MB/sec [256K blocks]
        Random  98.64   
            Uncached Write  101.96  1.53 MB/sec [4K blocks]
            Uncached Write  100.45  22.66 MB/sec [256K blocks]
            Uncached Read   95.93   0.63 MB/sec [4K blocks]
            Uncached Read   96.47   19.85 MB/sec [256K blocks]
    

The next drive is a Maxtor DiamondMax Plus 9 (200GB) in an OWC Firewire enclosure.

    Disk Test   86.58   
        Sequential  71.33   
            Uncached Write  76.91   32.06 MB/sec [4K blocks]
            Uncached Write  75.22   30.80 MB/sec [256K blocks]
            Uncached Read   55.75   8.82 MB/sec [4K blocks]
            Uncached Read   84.44   34.12 MB/sec [256K blocks]
        Random  110.12  
            Uncached Write  128.62  1.93 MB/sec [4K blocks]
            Uncached Write  135.84  30.64 MB/sec [256K blocks]
            Uncached Read   97.47   0.64 MB/sec [4K blocks]
            Uncached Read   91.51   18.83 MB/sec [256K blocks]
    

Finally, the drive I just installed is a Maxtor DiamondMax 10 SATA drive.

    Disk Test   149.91  
        Sequential  159.95  
            Uncached Write  176.23  73.46 MB/sec [4K blocks]
            Uncached Write  172.24  70.53 MB/sec [256K blocks]
            Uncached Read   143.74  22.76 MB/sec [4K blocks]
            Uncached Read   152.20  61.49 MB/sec [256K blocks]
        Random  141.05  
            Uncached Write  744.83  11.17 MB/sec [4K blocks]
            Uncached Write  141.13  31.83 MB/sec [256K blocks]
            Uncached Read   108.76  0.72 MB/sec [4K blocks]
            Uncached Read   93.14   19.17 MB/sec [256K blocks]
    

The new drive is by far the best. In particular, the first random uncached write speed is amazing. However, it was a little slower than the stock drive by just a little bit. This is a little perplexing, but considering that Xbench generally isn't used as a disk benchmarking utility, maybe the results aren't perfect. Unfortunately for all of you, I'm not willing to spend the $25 for [QuickBench](http://www.speedtools.com/TestSuite.shtml), so you'll have to refer to [Barefeats](http://www.barefeats.com).
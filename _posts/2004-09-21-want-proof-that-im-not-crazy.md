---
id: 139
title: 'Want Proof That I'm Not Crazy?'
date: 2004-09-21T18:01:17+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2004/09/21/want-proof-that-im-not-crazy/
permalink: /weblog/2004/09/21/want-proof-that-im-not-crazy/
shorturl:
  - http://l.derik.us/5C
categories:
  - Site News
---
After another series of exchanges with my webhost, I've reduced one of the problems I've been having to a single PHP command.

[This](/troubleshooting/fsockopentest.php) should connect to [NOAA](http://weather.noaa.gov), disconnect, print a success statement, and finish gracefully. The source can be seen [here](/troubleshooting/fsockopentest.txt) although you may need to use your browser's &#8220;view source&#8221; command.

PHP or Apache hangs on this simple code. If anyone has seen this before, please comment.
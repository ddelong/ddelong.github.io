---
id: 403
title: SIMBL Plugin Followup
date: 2005-04-21T06:56:21+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/04/21/simbl-plugin-followup/
permalink: /weblog/2005/04/21/simbl-plugin-followup/
shorturl:
  - http://l.derik.us/6y
dsq_thread_id:
  - "64768584"
categories:
  - Macs
---
When Safari 1.3 came out, [several plugins broke](http://godlikenerd.com/weblog/2005/04/16/safari-13-and-simbl-plugins/) and were quickly fixed again. That's cool, but both the PithHelmet and AcidSearch plugin updates were a bit rushed (and with good reason because they were high in demand).

For [AcidSearch](http://www.pozytron.com/?acidsearch) the bug was mostly harmless. When a channel was dragged around in the configuration window, it got turned into a folder. Oops. The author quickly [issued an update](http://www.pozytron.com/archives/2005/04/acidsearch_04_b.html).

However, PithHelmet had a [more serious problem](http://culater.net/thc/index.php?entry=/Development/PithHelmet/safari_display_none_bug.txt). Attempting to set the display of a page element to none after probing the dimensions of that object caused Safari to crash. Mike Solomon has a much better writeup for those technically inclined. Basically what this meant for an end user was that Safari crashed&#8230; a lot. It bit me with one site in particular. He [issued an update](http://culater.net/thc/index.php?entry=/Development/PithHelmet/release_v2_4.txt) which no longer crashes Safari, but unfortunately doesn't collapse a lot of blocked elements either (which was one of my main beefs with how OmniWeb handles ad-blocking). It doesn't happen all the time though, so it's not going to force me into using Camino or Firefox (for now), but it's a silly bug that hopefully will get fixed.
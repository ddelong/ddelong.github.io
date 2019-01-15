---
id: 400
title: Overdue Tag Central Update
date: 2005-04-17T12:32:36+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/04/17/overdue-tag-central-update/
permalink: /weblog/2005/04/17/overdue-tag-central-update/
shorturl:
  - http://l.derik.us/2z
dsq_thread_id:
  - "64768561"
categories:
  - Tag Central
---
Over the past few days, I&#8217;ve the site has been in transition to a new webhost. There were lots of reasons I did this, but hopefully the process has been mostly transparent. Probably the most notable change is that [Tag Central](http://tagcentral.net) now has its own domain name, tagcentral.net. I used a bit of URL rewriting trickery to transparently forward all old style Tag Central URLs (http://godlikenerd.com/tagcentral/xxxxxxx) to the new domain.

Moving it also gave me enough motivation to make a few changes that I&#8217;ve been meaning to make. First, I&#8217;ve upgraded to the latest version of [MagpieRSS](http://magpierss.sourceforge.net/) which seems to be a bit more tolerant of characters in feeds that don&#8217;t match the stated character encoding scheme. Right now, that&#8217;s the biggest pain in the ass for me because it means that I can&#8217;t easily test that the site still validates because those characters make the validator choke. This isn&#8217;t a problem in my site, nor is it a problem in MagpieRSS. No, it&#8217;s a problem within specific sources of the site. I&#8217;m not going to name names, but if one is putting out an RSS feed and calling it UTF-8, it should be UTF-8, damnit.

Finally, I used the related tag parsing code that Matt over at [Oddiophile](http://www.oddiophile.com) sent to me, so that prefaces the results. I hope people find that useful.

I still have to add some new sources (thanks to everyone that has sent me an overwhelming number of folksonomy using services), but I&#8217;m holding off on that until I figure out how to tighten up the code so I use a loop instead of rewriting the same code over and over. I&#8217;ll also be adding some administrative links at the bottom of the page.
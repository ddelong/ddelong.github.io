---
id: 229
title: Using NetNewsWire to monitor for Opener
date: 2004-11-05T15:05:46+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2004/11/05/using-netnewswire-to-monitor-for-opener/
permalink: /weblog/2004/11/05/using-netnewswire-to-monitor-for-opener/
dsq_thread_id:
  - "64766920"
shorturl:
  - http://l.derik.us/7M
categories:
  - Macs
---
The most significant Mac news lately was the discovery of the [Opener malware](/weblog/2004/10/26/opener-malware-the-straight-deal/). Antivirus makers scrambled to protect against this &#8220;virus&#8221; which as I said, [isn&#8217;t really a virus](http://www.macminute.com/2004/11/01/opener/). It&#8217;s malware showing what one can do once they&#8217;ve compromised a machine.

I was reading [the Cult of Mac Blog](http://blog.wired.com/cultofmac/) and they had [an entry](http://wiredblogs.tripod.com/cultofmac/index.blog?entry_id=506894) about a novel idea. Use [NetNewsWire](http://ranchero.com/netnewswire/)&#8216;s new ability to [read scripts as feeds](http://ranchero.com/netnewswire/features/scriptSubscriptions.php) to make a feed that will notify you upon new items being added to the /System/Library/Startup Items folder.

This is slick. Really slick. In fact, it gives one ideas. I think I might make a script that will give the last ten or twenty lines of a log (I&#8217;m sure it&#8217;s already implemented by someone using tail and some parsing). With that, I could dump [Geektool](http://projects.tynsoe.org/en/geektool/).
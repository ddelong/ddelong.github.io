---
id: 288
title: Fix Slow Stuffit Startups
date: 2005-01-10T08:48:42+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/01/10/fix-slow-stuffit-startups/
permalink: /weblog/2005/01/10/fix-slow-stuffit-startups/
dsq_thread_id:
  - "64767518"
shorturl:
  - http://l.derik.us/1x
categories:
  - Macs
---
This weekend, I was downloading some software that was compressed. I have those files automatically open with Stuffit Expander (as is the default on most setups). I noticed though that Stuffit Expander was bouncing over and over&#8230; and over&#8230; and over _again_. I assumed it had hung, force quit, and tried opening it again. Same thing occurred. I tried reinstalling Stuffit. It kept doing it. I left it going for a while and eventually it started. I thought that was mighty strange. I was starting to get worried that it was particular to my Powerbook and that I'd have to think about reinstalling the OS.

Then I read today that this was [caused by version checking](http://www.macfixit.com/article.php?story=20050110003819530). This was at MacFixit, so due to their draconian members only archive, this won't be available for long. If a Stuffit product has version checking on and none of [Allume](http://www.allume.com)&#8216;s servers are up or available, it will bounce until all connection attempts time out. That takes a while. Remember how many bounces it took to launch the first OS X version of Internet Explorer on Mac OS X 10.0? That's how long.

I find that unacceptable. You can avoid this by turning off version checking in the preferences for your Stuffit programs, or type:

    defaults write com.stuffit.Expander allowVersionChecking -bool NO 
    

in the terminal. In fact, I personally recommend turning it off for this reason. It's incredibly poor application design to have the program block during startup for a task like version checking. Save yourself some frustration and time now: turn it off.
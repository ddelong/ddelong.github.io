---
id: 555
title: Puking on Prefs
date: 2005-12-04T18:06:05+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/12/04/puking-on-prefs/
permalink: /weblog/2005/12/04/puking-on-prefs/
dsq_thread_id:
  - "64770022"
shorturl:
  - http://l.derik.us/j
categories:
  - Macs
---
I&#8217;ve been trying to get keychain syncing to work between my two Macs. You&#8217;d think that the login keychains would sync (especially since .Mac syncing is supposedly enabled), but they don&#8217;t. I decided to make a new keychain and try to get it to work.

I start using the Reset function to try to force synchronization. And for those interested, no, I still haven&#8217;t had any success getting keychain syncing to work. It&#8217;s way too hard to get working.

I digress. Suddenly, clocking the Reset Sync Data&#8230; button did nothing. Well, not exactly nothing. It did output something to the console log every time I clicked it.

> 2005-12-04 16:44:54.451 System Preferences[501] \*** Assertion failure in -[NSMenuItem initWithTitle:action:keyEquivalent:], Menus.subproj/NSMenuItem.m:140
> 
> 2005-12-04 16:44:54.455 System Preferences[501] Invalid parameter not satisfying: aString != nil

Awesome. System Preferences swallows up this error, leaving the user sitting there endlessly, futilely clicking the button, wondering why they aren&#8217;t being asked what to reset. Obviously, some preference or cache was all screwed up. Which one though?

Well, caches are easy. Just nuke them all. Naturally, that didn&#8217;t help. Next on the chopping block were Sync Services and System Preference preferences. No dice. I had to delete &#8220;com.apple.DotMacSync.plist&#8221; in Home/Library/Preferences **and** Home/Library/Safe Preferences. I&#8217;m fairly certain I&#8217;d already deleted the former, making me conclude that &#8220;Safe Preferences&#8221; is worthless. It&#8217;s just another place to delete preferences from. In this case, the problem seemed to be the fact that Transmit Bookmarks were in that p-list, but they weren&#8217;t in the syncing list anymore. I have no idea why, but there it is.
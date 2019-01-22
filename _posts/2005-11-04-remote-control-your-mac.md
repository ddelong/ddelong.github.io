---
id: 544
title: Remote Control Your Mac
date: 2005-11-04T21:58:19+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/?p=544
permalink: /weblog/2005/11/04/remote-control-your-mac/
dsq_thread_id:
  - "64769923"
shorturl:
  - http://l.derik.us/3V
categories:
  - Macs
---
There have been times that I wanted to remote control someone's Mac. In particular, a friend of my brother that went to my school used to need the occasional help. VNC was a huge help in those situations. Unfortunately, getting the VNC server configured was a hassle, required third party software, and ended up taking more time than the actual troubleshooting.

That's why I was thrilled to find out that there is now a VNC built into Mac OS X. I know it's in Tiger (Mac OS X 10.4), but I'm not sure about earlier versions. You'll need to poke holes in your firewall if you're using a router or a software firewall that isn't the one built into Mac OS X.

First, mosey on over to System Preferences. Go to the Sharing pane. You'll see something like below.

[![Sharing Preference Pane](http://photos32.flickr.com/59879117_45889de1ae_m.jpg)](http://flickr.com/photos/19959606@N00/59879117 "Sharing Preference Pane")

Enable Apple Remote Desktop. You'll see the below.

[![VNC Configuration](http://photos30.flickr.com/59879544_8a5484435a_m.jpg)](http://flickr.com/photos/19959606@N00/59879544 "VNC Configuration")

Enable the VNC Viewers option and choose a password. Choose and extremely strong one if your Mac is accessible directly to the net (not behind a firewall or router).

You're all set. Now just fire up your favorite VNC client (I like [Chicken of the VNC](http://sourceforge.net/projects/cotvnc/)). Plug the IP address (or Bon Jour address) of your Mac into it along with the password and fire it up. As a bonus, it even works with multiple displays.

<!-- Technorati Tags Start -->

Technorati Tags: <a href="http://technorati.com/tag/vnc" rel="tag">vnc</a>, <a href="http://technorati.com/tag/remotecontrol" rel="tag">remotecontrol</a> 

<!-- Technorati Tags End -->
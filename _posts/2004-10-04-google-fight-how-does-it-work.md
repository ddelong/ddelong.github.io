---
id: 168
title: 'Google Fight: How does it work?'
date: 2004-10-04T12:17:47+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2004/10/04/google-fight-how-does-it-work/
permalink: /weblog/2004/10/04/google-fight-how-does-it-work/
dsq_thread_id:
  - "64766241"
shorturl:
  - http://l.derik.us/y
categories:
  - Technology
---
Another good way to waste one&#8217;s time is to play with [Googlefight](http://www.googlefight.com). Type two things, and using [Google](http://www.google.com), it will proclaim the winner.

Neat, now how does it do that?

Google spits out approximate matches for any query (you know, 1-10 of about _some number_). One method would be to parse this from Google&#8217;s pages. That&#8217;s a kludge though which may break.

A better idea? Use [Google&#8217;s SOAP interface](http://www.google.com/apis/) once again (just as I did for my Google cache utility, and as I will use for my custom search interface). One of the results fields is this value. This can be captured quickly and compared. Part of Google&#8217;s appeal for now and some time to come is the fact that it not only has a great and accurate engine, but it supplies all imaginable information to third-parties. That may be it&#8217;s saving grace as monsters such as [Yahoo!](http://www.yahoo.com) come charging like a bull.
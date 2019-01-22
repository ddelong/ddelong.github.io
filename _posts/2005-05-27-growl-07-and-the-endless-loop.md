---
id: 436
title: Growl 0.7 and the Endless Loop
date: 2005-05-27T21:28:57+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/?p=436
permalink: /weblog/2005/05/27/growl-07-and-the-endless-loop/
shorturl:
  - http://l.derik.us/3m
dsq_thread_id:
  - "64768924"
categories:
  - Macs
  - Technology
---
[Growl](http://growl.info) is an awesome piece of freeware that supplies a universal event notification system. Sounds complicated, but basically, it gives applications alternate ways to tell you things.

One of the new features in the 0.7 version is the ability to send these events to networked computers via Bon Jour. For example, let's say you have a downloading application that issues events upon completion. However, you kicked that download off at your desktop and you want to use your laptop. You don't want to babysit your desktop to know when it reached completion.

With Growl now, you can designate that messages on your desktop are sent to your laptop. That's wicked cool. However, what happens if you designate your laptop to get your desktop's events and vice versa? You get an endless loop. Imagine two kids playing catch. The desktop passes the event to the laptop. Then the laptop passes it back. Lather, rinse, repeat.

Well, unlike real kids, Growl doesn't get bored playing catch. It keeps going forever and ever. This gets old really fast. At any rate, until this is fixed, try to avoid loops with Growl network notifications.
---
id: 73
title: 'Perl and Shell Scripting: More than just for geeks'
date: 2004-08-20T22:10:37+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2004/08/20/perl-and-shell-scripting-more-than-just-for-geeks/
permalink: /weblog/2004/08/20/perl-and-shell-scripting-more-than-just-for-geeks/
dsq_thread_id:
  - "64765583"
shorturl:
  - http://l.derik.us/2d
categories:
  - Macs
  - Technology
---
My work requires me to work on a Unix box for a good part of my time. For some of you, that may sound daunting, hard, or archaic, but really it isn't. It sure beats trying to develop things on Windows every hour of every day.

It actually makes working with others exceedingly easy. We all look at essentially the same filesystem thanks to the wonders of NFS. One can log into another machine if their machine is loaded, or even into much larger computers that have no physical terminal. Very handy.

You can log into any machine and immediately have access to your home directory and all your files. I'm beginning to ramble, but what I'm getting at is that Unix is ideal for a large scale system and also for its development.

Because I've been using OS X so long (over three years now), I had a lot more experience with Unix than many of the other new hires and even some more senior engineers. It gave me a good start, but it made me realize something. I hadn't even broken the surface.

I knew how to get around the file system. I had an decent idea of where things were located. I even knew about pipes. What I didn't know was about shell scripting and perl (which is at its core, a scripting language).

This is by far one of Unix's (and OS X's) most powerful attributes. Repetitive tasks can be broken down into single commands and allow one to perform them faster and more accurately. But Derik, you may say, the Mac has had scripting for a long time in the form of AppleScript.

One word: ugh. Other than its capability to work in harmony with essentially GUI only applications, AppleScript is boring and hard to work with. Oh sure, it seems nice because it uses nearly natural language, but to me, that makes it much harder to work with because it becomes ambiguous and full of modifiers that are essentially filler. The syntax is large and complicated in order to accommodate the easier language. Those are the main reasons I didn't invest any time into really learning it.

The worst part is, people try to use for things like file manipulation. An example question include &#8220;How do I write an AppleScript to manipulate files of a certain age?&#8221; The answer is to not use AppleScript at all! Perl and shell scripting can do this much faster and with half the code (as well as half the bugs). Shell scripts can even manipulate remote systems to run commands. They can be placed straight into cron jobs. Simple commands can even be used to do things like join MP3 tracks into a single one.

While learning some Unix commands and how to use them in scripts may be a little much for many Mac users, any user interested in doing things faster should be already learning it. There are more resources on the net than any person can count and most of them are very explicit and easy to follow. If you've needed an excuse, this is it. I might just start posting little tutorials to show certain commands, but like all things, I may just forget about it.
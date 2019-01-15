---
id: 406
title: Redesigned Back End
date: 2005-04-23T20:23:10+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/04/23/redesigned-back-end/
permalink: /weblog/2005/04/23/redesigned-back-end/
dsq_thread_id:
  - "64768610"
shorturl:
  - http://l.derik.us/58
categories:
  - Tag Central
---
I took a couple hours, learned PHP&#8217;s objects and redesigned [Tag Central](http://tagcentral.net) so that all the information for the sources could be stored in a big array object. Now it&#8217;s trivial for me to add a new source, so I can start adding all those sources that everyone submitted. I may started restricting the number of results per source to a smaller number (such as I have done with BlogMarks) to avoid unsightly white space and making the page utterly huge.

I made the formatting for describing new sources very easy, so I&#8217;ll be adding a new submission form for people to submit source information (so I don&#8217;t have to look it up myself).

I&#8217;m only a few steps short of using database to track all this data which will make managing the site even easier for me.
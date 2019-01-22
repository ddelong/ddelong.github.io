---
id: 431
title: Safari RSS Autodiscovery Sucks
date: 2005-05-19T22:25:29+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/?p=431
permalink: /weblog/2005/05/19/safari-rss-autodiscovery-sucks/
dsq_thread_id:
  - "64768868"
shorturl:
  - http://l.derik.us/2i
categories:
  - Macs
---
I added my [Feedburner](http://www.feedburner.com) feed to the site's header to make it more easily accessible to users. Firefox users get to see the entire list of feeds. Safari users are less blessed. They can only click the singular RSS button in the location bar.

According to [Apple](http://developer.apple.com/releasenotes/InternetWeb/SafariRSS.html), Safari uses the [Atom Feed Autodiscovery standard](http://diveintomark.org/rfc/draft-pilgrim-atom-autodiscovery-02.html).

> When Safari displays a web page, Safari RSS looks in the HEAD element for a LINK tag that points to an Atom or RSS feed. The schema for these links is fairly standard and is supported by most news readers. It is described on page 40 of O'Reilly's Content Syndication With RSS, and in Mark Pilgrim's draft document on Atom Feed Autodiscovery.

Because Safari doesn't list all the sources, it must adhere to the rule dealing with the single feed exception.

> Clients who wish to choose exactly one feed without user input SHOULD choose the one pointed to by the first autodiscovery element.

Now take a look at the source code for this site. In particular, the link tags in the head.

    <link rel="alternate" type="application/rss+xml" 
           title="Feedburner Feed" href="http://feeds.feedburner.com/godlikenerd" />
    <link rel="alternate" type="application/rss+xml
           title="RSS 2.0" href="http://godlikenerd.com/feed/" />
    <link rel="alternate" type="text/xml" title="RSS .92"
           href="http://godlikenerd.com/feed/rss/" />
    <link rel="alternate" type="application/atom+xml"
           title="Atom 0.3" href="http://godlikenerd.com/feed/atom/" />
    

Note, first comes the Feedburner feed. The very last feed is the Atom version. Guess which version Safari will look at. It chooses the last one! That's not right.

All right, well, what happens when you take out the Atom version? One would think that maybe Safari would do something consistent like use the RSS 0.92 version because it's last. No dice. Then it decides to try the Feedburner feed.

What is this magical order based on? As best as I can tell, Safari sorts based upon the type and then by appearance order in the file. In other words, Atom feeds get precedence over RSS. If I change the type of the Feedburner feed to Atom (which is wrong), then Safari chooses that feed.

Bad! This takes away the publisher's control over the primary feed. Apple isn't adhering to the standard that they point to. Short of using semantically incorrect markup to force Safari to pick the Feedburner feed (which I will not do), I can't make an RSS feed the primary feed if an Atom feed is available.

Now, as I interpret the Autodiscovery document, I would call this behavior in conflict and incorrect. However, as it is called &#8220;Atom Feed Autodiscovery&#8221;, did Apple choose to interpret that only Atom feeds can be part of the standard and that any checking for RSS feeds must only happen if no Atom feeds are available? It's conceivable, but without getting a look at O'Reilly's _Content Syndication with RSS_ (page 40), I can't be sure what their rationale is. Perhaps that book outlines some behavior for multiple feed types that's not covered in Mark Pilgrim's document.

If someone out there knows what the O'Reilly book says, please let me know. Otherwise, this behavior is going to drive me insane. It's taking away my control.
---
id: 381
title: Podcasting is Neat
date: 2005-03-29T10:25:52+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/03/29/podcasting-is-neat/
permalink: /weblog/2005/03/29/podcasting-is-neat/
dsq_thread_id:
  - "64768393"
shorturl:
  - http://l.derik.us/28
categories:
  - Technology
---
All right, so I'm way behind the curve on this, but one of the neat side-effects of widespread RSS adoption is a phenomenon known as **Podcasting**. RSS feeds (at least as of version 2.0) allow for a field called [enclosures](http://blogs.law.harvard.edu/tech/rss#ltenclosuregtSubelementOfLtitemgt). It's a bit of a misnomer, but a useful part of the spec.

It basically specifies the location of a file that's associated with a post. At the current time, it's generally an audio file (MP3, WMA, AAC, etc.). In some cases it's a video file (but that's much less frequent due to increased cost associated with production and bandwidth). The natural extension of this capability is transfer to iTunes and then one's iPod (hence, podcasting). New RSS readers aim at handling these feeds (and in particular, the enclosures). There are the open-source [iPodder](http://ipodder.sourceforge.net/index.php) and [iPodderX](http://ipodderx.com) (which are free and $20 respectively).

### NetNewsWire Rocks

That's well and good, but I didn't want to use yet another RSS reader. In my age, I'm starting to get a little bit stubborn about my software (especially when I've paid for it). [NetNewsWire](http://ranchero.com/netnewswire/) 2.0 has podcasting support built-in (full version only). With this addition, I've been able to get interested. My listening list is currently limited to [MacCast](http://www.maccast.com), [WineCast](http://www.winecast.net), [YourMacLife](http://www.yourmaclife.com/), and [Leo Laporte](http://www.leoville.com/blog/). I can see myself subscribing to more, but I simply haven't found the time to explore. Maybe one of you has a favorite podcast for me to check out?

### Management is Stupid

Now that I've subscribed to these podcasts, the issue becomes how to manage them. I don't want to become my father, listening to something over and over, not realizing that I'd heard it before. This is one of those times that leveraging iTunes' Smart Lists becomes a brilliant thing to do. When NetNewsWire inserts these files into my library, it can label those files with a genre. In this case, I like &#8220;Podcast&#8221;. It also allows me the option to insert into a playlist. For some, this is a sufficient mechanism for managing these files. One just deletes the files out of the playlist once they've listened to them. The problem is that it's not automatic. If I forget what I've listened to, how can I be expected to remember managing that playlist?

Instead, it's smarter to use a capability built-into iTunes and the iPod, the play count. This attribute of song files get incrememented when you finish the file and it's done by both iTunes and the iPod. This is easily leveraged into an automatic management system. One simply makes a new Smart Playlist. I call mine, oddly enough, &#8220;New Podcasts&#8221;. Next, I set it to contain files whose genre is &#8220;Podcast&#8221; and play count is 0 (zero). Now, when I want to listen to my new podcasts, I simply go to that playlist. Not only are the contents of that list synchronized from iTunes into the iPod, but iPods will reevaluate Smart List rules every time you enter that playlist. For example, this morning, I went through my entire &#8220;New Podcast&#8221; list. When I navigated out and back into the list, it was empty. Keep in mind that you don't need to listen to the entire list either. Listening to a single file once will remove it from the list the next time you enter it. _Sweet._

### Another Reason Satellite Radio Sucks

Satellite should take notice of this new technology. It's not going to cut into subscriptions by people interested in live broadcasts such as sports. Those people find value in nationwide access to live information. However, part of satellite radio's value is meant to be derived from the broadcasts that they facilitate that can't or won't be done via traditional radio. That includes shows like Howard Stern. However, his content's value isn't in being live. It's topical to be sure, but one could listen at any point within a couple days and still enjoy it.

Imagine, if you will, having that content as a podcast. You could download it to your computer. You could either listen to it there, or download it to your MP3 player of choice, then listen to it in the car or at work. You listen at your convenience. If necessary, they could charge a subscription fee for the feeds themselves, restricting others from access. Users could timeshift all their content. That's going to be huge (as evidenced by the phenomenon that TiVo is). Clear Channel is [already aware of this](http://billboardradiomonitor.com/radiomonitor/news/business/digital/article_display.jsp?vnu_content_id=1000855572). It's only a matter of time before this goes really mainstream.

### Software Updates

A point that I may not have made more apparent earlier is that enclosures in RSS 2.0 feeds don't need to be media files. They can be any file. To this end, [Fraser Speirs](http://speirs.org) had the brilliant idea of delivering sofware updates via a feed. To keep the nomenclature consistent, he calls this [appcasting](http://speirs.org/appcasting/). It's a new spin on how to use this.

### Who's Misnomer? Why isn't there a Misternomer?

As I said before, calling this attribute in RSS feed items &#8220;enclosure&#8221; isn't quite correct. It implies that the data being referenced is contained within the feed itself. It's not. I shudder to think about the amount of bandwidth that would be consumed (one change in the feed and every enclosure would be redowloaded with the feed). Rather, feeds just point. Sure, functionally they are enclosures, but I'm a nitpicker.
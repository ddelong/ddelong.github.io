---
id: 627
title: Behold the wonder of IMAP caching
date: 2010-02-19T10:01:00+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/?p=627
permalink: /weblog/2010/02/19/imap-caching/
dsq_thread_id:
  - "68318441"
shorturl:
  - http://l.derik.us/c
categories:
  - Technology
tags:
  - Claris Emailer
  - email
  - IMAP
  - Mail.app
  - POP
---
I&#8217;m a fan of [Low End Mac](http://www.lowendmac.com)&#8216;s Mac catalog. It&#8217;s a quick and easy way to go look up vital stats about old computers, such as when they were released, the original specifications, and the original price. I&#8217;ve settled many quibble&#8217;s using its information.

However, their other columns present sometimes out of date, and sometimes even wrong information. For example, Charles Moore often writes about [the failure of IMAP](http://lowendmac.com/misc/10mr/mb0217.html#8). This goes back years, but let&#8217;s check out the latest installment.

> Why am I not an IMAP fan? Guess I&#8217;ve spent too many years with slow Internet access and prefer to have my email archives on my hard drive and accessible without being online. Not many wireless hot spots in this neck of the (literal) woods, and with IMAP your messages remain on the central mail server, whereas POP downloads all messages in your inbox onto your computer where you can access them for reference whether you&#8217;re online or not.
> 
> I appreciate that IMAP can be a good choice for people who need to access email from multiple computers, but for my own accounts where that is more convenient, I use Gmail with POP access configured to leave the messages on the Gmail server, which seems to me the best of both worlds.

The entire argument centers on the idea that IMAP doesn&#8217;t allow for email reading and searching when you&#8217;re not online. That would be a great argument against its use in some cases (as it is for webmail) if it were true. It&#8217;s not.

The fact is that IMAP email clients for as long as I can remember have cached the contents of your IMAP account. Mail.app does it. Entourage does it. Thunderbird does it. There may have been cases in the long past when this was turned off by default, but I can&#8217;t remember the last time I had to check the &#8220;Cache my mail&#8221; option.

If you&#8217;ve ever watched Mail.app&#8217;s Activity Viewer when working with an IMAP account, you&#8217;ll notice it making a series of connections as it traverses your folder structure, downloading headers, and the message bodies of all your email. It writes them to your disk and from that point on, if you try to look at that email and you&#8217;re offline, it simply reads it from the disk.

It seems totally obvious if you take a moment to think about it. When you do a Spotlight search, it goes through all your email trying to find that phrase. Does it really seem practical or even possible (when accounting for speed) that it would be prodding a server for all that information every time you did a search? Of course not.

The fact is that there is no good reason to use POP over IMAP anymore. None. Well, that is unless you have a hankering to use [Claris Emailer](http://en.wikipedia.org/wiki/Claris_Emailer) again.
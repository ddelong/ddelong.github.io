---
id: 240
title: Phishing Can Happen to You
date: 2004-11-14T20:19:41+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2004/11/14/phishing-can-happen-to-you/
permalink: /weblog/2004/11/14/phishing-can-happen-to-you/
dsq_thread_id:
  - "64767007"
shorturl:
  - http://l.derik.us/2m
categories:
  - Technology
---
Phishing (which is [explained at Wikipedia](http://en.wikipedia.org/wiki/Phishing)) has become very commonplace, particularly on the Internet. It even happens over the phone.

Up until this morning, I thought only morons became the victims of these scams because they were so obvious. However, this has changed somewhat. Not only has it become much more common (hell, more than half of my spam is phishing attempts), but they've hidden themselves very well.

My father received an email this morning from Amazon.com supposedly asking to verify his credit card information. Yesterday, he had placed an order for him. The email even had an &#8220;@amazon.com&#8221; return address. It contained a link that was of the structure: {http://www.amazon.com@service02.com//exec/obidos/subst/home/home.html/102-9382243-7140932}. Looks like Amazon, right? Wrong. Everything preceding the &#8220;@&#8221; is considered a username for the domain that follows, which is our scammer.

Well, after entering his credit card at a site that looks like a _perfect_ replica of Amazon's site, my father noticed that the number it spit back was wrong (these scumbags of the earth aren't quite perfect yet). I took a look and immediately surmised that it was bogus. Canceling of the credit card followed.

Now, dad is older, but he's not technologically inept or stupid. This message was timed really well and cleverly disguised. Luckily, [Firefox](http://wpsecurity.org/16/firefox-add-ons-for-web-developers-designers) will warn if a username precedes a domain name. [Safari](http://www.igroupmac.org/tag/safari) does not (hopefully they'll take a page out of Firefox's book). At any rate, be careful and read policy statements for your online retailers. If in doubt, ask someone.
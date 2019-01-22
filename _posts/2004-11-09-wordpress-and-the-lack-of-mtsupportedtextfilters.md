---
id: 234
title: WordPress and the Lack of mt.supportedTextFilters
date: 2004-11-09T21:08:49+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2004/11/09/wordpress-and-the-lack-of-mtsupportedtextfilters/
permalink: /weblog/2004/11/09/wordpress-and-the-lack-of-mtsupportedtextfilters/
dsq_thread_id:
  - "64766970"
shorturl:
  - http://l.derik.us/G
categories:
  - Blogging
---
I've adopted the excellent [Markdown](http://daringfireball.net/projects/markdown/) to format my blog entries. It's makes it much easier to write and maintain entries. However, because [WordPress](http://wordpress.org) has to filter each post every time, it slows down my homepage considerably.

That is something I've come to live with and accept.

What is not acceptable is that WordPress **still** doesn't support mt.supportedTextFilters. This is what tells external editing apps like [MarsEdit](http://ranchero.com/marsedit/) know what formatting is being used so it can properly preview entries for you. As a result, Brent had to put in a custom preference (that one must manually add in) to force preview of Markdown formatting for all posts. This is rather unacceptable, but not Brent's fault.

I'm feeling a pull to [MovableType](http://www.movabletype.org/) which I've been resisting because I didn't want to shell out the cash. I fear I may have no choice soon unless this is fixed in WordPress (like in 1.3) or someone can suggest an alternative package.
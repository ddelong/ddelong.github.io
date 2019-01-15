---
id: 475
title: Roll Your Own Safari
date: 2005-07-09T15:12:13+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/?p=475
permalink: /weblog/2005/07/09/roll-your-own-safari/
dsq_thread_id:
  - "64769273"
shorturl:
  - http://l.derik.us/3L
categories:
  - Macs
---
Apple opened up a public CVS repository for WebKit, it made it possible to get the latest source, compile, and run it yourself. They even broke the steps to do so into easily digested step-by-step instructions. All one need do is [get source](http://webkit.opendarwin.org/building/checkout.html) and [compile it](http://webkit.opendarwin.org/building/build.html).

You need to make sure that you have XCode installed and be comfortable with running Terminal commands. You don&#8217;t need to really understand them, just be able to type them in. If you&#8217;d like to avoid all that, there is a shortcut. [Boyd Waters](http://www.aoc.nrao.edu/~bwaters/) has put together and updated version of WebKit in an easy to use container called [SafariOnAcid](http://www.aoc.nrao.edu/~bwaters/projects/mac/SafariOnAcid.dmg). The name is an homage to the fact that using the updated code, the [Acid2 test](http://www.webstandards.org/act/acid2/test.html) passes. It&#8217;s worth checking out not only for standards compliance, but speed.

**Update:** Apparently I&#8217;ve been linked by [MacSlash](http://macslash.org) (something I figured out by being pingbacked by [macpro.se](http://www.macpro.se/?p=2435)). Several of the comments over at MacSlash are worth commenting on.

First, [this is rolling your own WebKit, not Safari](http://macslash.org/comments.pl?sid=5492&cid=96468). Quite right. You continue using the existing Safari application just with the new version of WebKit. However, the real meat of Safari is WebKit.

[This is old news indeed.](http://macslash.org/comments.pl?sid=5492&cid=96472) I played with my own builds of WebKit but I stopped playing with it until someone mentioned SafariOnAcid (which is a very slick package). The speed increase is pretty terrific. Even with lots of tabs and windows, Safari stays extremely responsive.

[This comment is terrific.](http://macslash.org/comments.pl?sid=5492&cid=96482) It mentions [NightShift](http://homepage.mac.com/WebObjects/FileSharing.woa/wa/default?user=reinholdpenner&templatefn=FileSharing4.html&xmlfn=TKDocument.4.xml&sitefn=RootSite.xml&aff=consumer&cty=US&lang=en), an automated way to get a nightly compilation of WebKit. I missed this on [Daring Fireball&#8217;s Linked List](http://daringfireball.net/linked/2005/july#wed-06-nightshift). This is probably the best way to run with an updated WebKit.
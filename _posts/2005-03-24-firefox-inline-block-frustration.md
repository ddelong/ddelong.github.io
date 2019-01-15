---
id: 376
title: Firefox Inline-Block Frustration
date: 2005-03-24T06:53:32+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/03/24/firefox-inline-block-frustration/
permalink: /weblog/2005/03/24/firefox-inline-block-frustration/
dsq_thread_id:
  - "64768315"
shorturl:
  - http://l.derik.us/1u
categories:
  - Tag Central
  - Technology
---
I&#8217;m making [Tag Central](/tagcentral/) prettier. I can do all the colors and styling I want just fine. I think it&#8217;ll look super when it&#8217;s done (but then again, I&#8217;m not an artist and that will probably be painfully apparent). Anyway, I want the Flickr pictures to line the right side of the page. Then I want all the other sections to be contained within their own boxes, two per row.

Old school webmonkeys would immediately think of using a table based layout. It seems natural and it would be very easy. The problem is, this is an abuse of HTML tables (and heresy when making an XHTML page). Only actual tabular data is supposed to go into tables. All presentation must be managed using CSS. There are many, many good reasons for this, not the least of which is that it makes the site more accessible. Besides, I&#8217;m new school.

I can almost hear Dana&#8217;s voice in my head. _Then what&#8217;s the problem, Smartypants?_ The problem is that while CSS provides everything I need to achieve this layout, the CSS involved isn&#8217;t supported by Firefox. To be fair, it&#8217;s not supported by Internet Explorer, Camino (not surprising), Netscape, or iCab (which goes without saying). The real question is, what **does** support it? Opera and Safari both do. Unfortunately, much of my target audience isn&#8217;t using these browsers and when it&#8217;s not supported, the site looks like ass with a big white ass crack going down the middle.

The CSS I want to use is &#8220;display: inline-block;&#8221;. Basically, it forces all the sections of Tag Central to for a box like they would normally, with block elements that don&#8217;t break out. For those uninitiated, block elements are parts of the page that force a line break. Paragraphs and headers are good examples. Normally, the container I&#8217;m using for these various areas, DIV, is a block element. However, in this case, I want these elements to display in rows without forcing a line break unless they overstep the margin of the area that they are in. In this case, I make the width of each of these areas 49%. That means only two results areas per line. If there are any more, it&#8217;ll wrap onto the next line. This is exactly the behavior I want. It works perfectly in Safari and Opera. Firefox hasn&#8217;t implemented this even though it&#8217;s part of the CSS 2.1 spec. That makes me want to scream. What&#8217;s worse is that I read that earlier versions of Mozilla actually supported it. _Bastards._

There isn&#8217;t much I can do about this other than hope that they get off their asses and correct this. I can live with incorrect display in Internet Explorer because I&#8217;m a snob like that. The other way that this whole issue could be avoided would be that I can find a way to integrate Smugmug content. In that case, I could go to a three column format (Flickr pictures on the left, Smugmug on the right, and everything else down the middle). At any rate, it sucks.

**Update:** For anyone interested, there is a [Bugzilla bug](https://bugzilla.mozilla.org/show_bug.cgi?id=9458) registered for this. The bad news is that from the comments, it looks like this won&#8217;t be fixed for Firefox 1.1. The target milestone is 1.9b, but what version of Firefox that version of the core relates to is beyond me. It&#8217;s fairly disappointing to see so much work going into revamping how the preferences look when this is a bug that limits functionality at the browser&#8217;s very core.
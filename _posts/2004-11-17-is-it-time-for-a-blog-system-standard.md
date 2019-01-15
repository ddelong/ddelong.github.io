---
id: 241
title: Is It Time for a Blog System Standard?
date: 2004-11-17T18:06:20+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2004/11/17/is-it-time-for-a-blog-system-standard/
permalink: /weblog/2004/11/17/is-it-time-for-a-blog-system-standard/
shorturl:
  - http://l.derik.us/8h
dsq_thread_id:
  - "64767025"
categories:
  - Blogging
---
Brent Simmon&#8217;s, developer the excellent MarsEdit, has [asked a very important question](http://inessential.com/?comments=1&postid=2984). Isn&#8217;t it time that a common weblog system feature set was agreed upon?

This is related to [my earlier entry](http://godlikenerd.com/weblog/2004/11/09/wordpress-and-the-lack-of-mtsupportedtextfilters/) about the fact that WordPress doesn&#8217;t entire support Movable Type&#8217;s API. For the record, it is _very_ close. This isn&#8217;t horseshoes and computers are far less forgiving than any person I know. By leaving something as &#8220;minor&#8221; as post specific text formatting, it becomes impossible for external editing software to determine how to format posts, particularly for preview purposes.

Efforts have been made to standardize weblog editing APIs (see the [MetaWeblogAPI](http://www.xmlrpc.com/metaWeblogApi)). Unfortunately, it&#8217;s not complete enough to satisfy most major weblog systems, whom to this end, have most adopted [Movable Type&#8217;s API](http://www.movabletype.org/docs/mtmanual_programmatic.html). It&#8217;s superset of the MetaWeblogAPI is certainly more complete, but it&#8217;s not quite as extensible as some would like, forcing abuse of certain attributes in order to achieve the desired effect.

Brent spoke not so much about the API, but the feature set supported by weblog systems. However, it is these feature sets that generally dictate the nature of the APIs. In fact, incomplete API implementation is usually the result of different feature sets. WordPress doesn&#8217;t implement mt.supportedTextFilters because it has no notion of post specific formatting. Movable Type lacks custom fields.

This was not previously a problem as most blog users were either uber geeks or were normal people that were content with rather limited options ([LiveJournal](http://www.livejournal.com) is the prime example of this with its virtually otherwise inexplicable popularity). Now that every body and their brother has a blog and uses previously advanced features such as trackbacks and pings, it&#8217;s become center stage. When the web came to center stage, the same thing happened, with different browsers supporting different technologies. We eventually ended up with standards (which is wonderfully described by [Jeffrey Zeldman](http://www.zeldman.com) in his book, [Designing with Web Standards](http://www.zeldman.com/dwws/)).

I think it&#8217;s time that the same was done for weblog systems. The question is though, who will step up and will the big players ([Six Apart](http://www.sixapart.com) in particular) sign on for such an effort?
---
id: 356
title: Tag Central
date: 2005-03-03T09:18:48+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/03/03/tag-central/
permalink: /weblog/2005/03/03/tag-central-2/
dsq_thread_id:
  - "64768116"
shorturl:
  - http://l.derik.us/3Y
categories:
  - Site News
  - Tag Central
  - Technology
---
I&#8217;ve already run this idea by a couple people, but I thought I&#8217;d write about it so there&#8217;s some record that it was my damn idea. If you&#8217;ve read someone write about this or actually do it already, let me know in the comments.

### Tag, You&#8217;re It

Many of you are already familiar with tagging, or [folksonomies](http://en.wikipedia.org/wiki/Folksonomy). Popular services use this categorization/organization paradigm to help users manage their content. For example, there&#8217;s [del.icio.us](http://del.icio.us) for bookmarks, [Flickr](http://www.flickr.com) for pictures, [43 Things](http://43things.com) for goals, and even [Technorati](http://technorati.com) for blog posts such as this one. Some of these services are even beginning to list content from these other services when browsing tagged content.

### Reselling

My bright idea is that instead of relying on any of these services showing the relevant data from other sites, you use an independent tag aggregator. That&#8217;s where I step in. Exact implementation details aside, I want to provide an interface to browsing tagged data from every site possible. I don&#8217;t want to restrict the data to the several already popular sites, but also include results from lesser known services, such as [Tagsurf](http://www.tagsurf.com), the tagged message board.

It could provide a common interface, allow for different stylesheets, maybe even have user profiles to retain certain browsing/searching preferences. All these ideas are very free form right now, but I&#8217;d like some feedback on what you&#8217;d like to see.

### What&#8217;s the Problem, Bub?

My real hangup about this idea is several fold. They all basically relate to popularity if this does catch on like I expect it would.

First, bandwidth could be a real concern. My site barely uses any now, but at the same time, I don&#8217;t have the largest readership (I still haven&#8217;t found a good way to measure it, so maybe I&#8217;m wrong). Many sites that provide even small sized content (like just text) have issues with this due to popularity. Take a look at [DrunkenBlog](http://www.drunkenblog.com/drunkenblog-archives/000351.html).

The second issue is that of implementation. Should I use PHP? Maybe Python? What about caching? I don&#8217;t know. It also depends on how hard it is to interact with the various APIs that these services provide. There is no universal API for these types of services (which is in itself a shame). XML-RPC, REST, SOAP&#8230;. I&#8217;ll be knee deep in alphabet soup. I could (and will) take on help should anyone want to help. The problem then becomes how to manage the software. I&#8217;ll be honest that I&#8217;ve never set up a version control repository. Do I want to make it open source or do I want to try to be greedy and keep the code to myself?

The third issue really troubling me is that of caching. Most of these services are concerned about bandwidth (and processor time) as well, requesting that anyone using their services don&#8217;t abuse them. They kindly, and rightly, request that some kind of caching be used. The question becomes how should this be done? I could store a cache file for each tag (up to a certain predetermined number of items), but will that horribly slow the site? Could a MySQL database help with that? I don&#8217;t know. Another issue is how much space will it take up. Could I run out of space at my host?

A fourth issue is that of funding. Ideally, I&#8217;d add something like Google&#8217;s AdWords in a sidebar. However, will all the services I will be tapping with this be cool with that? Will they want some kind of service charge or kickback?

I have lots of questions and no real answers, so please leave any thoughts you have.

### Tangentally Related

A recent [Robot Co-Op](http://www.robotcoop.com) broached the issue of API access to their service. Should they provide facilities for members to manipulate their data externally, I&#8217;d like to make a Mac OS X client for it, a la [Cocoalicious](http://www.scifihifi.com/cocoalicious/) or [Flickr Export for iPhoto](http://speirs.org/flickrexport/). It&#8217;ll be good practice.
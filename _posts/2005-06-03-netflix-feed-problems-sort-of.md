---
id: 439
title: Netflix Feed Problems, Sort Of
date: 2005-06-03T18:56:40+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/?p=439
permalink: /weblog/2005/06/03/netflix-feed-problems-sort-of/
shorturl:
  - http://l.derik.us/6s
dsq_thread_id:
  - "64768963"
categories:
  - Site News
---
So I alluded to some problems I was having when combining [Planet d00dism](http://planet.godlikenerd.com) and [Netflix](http://www.netflix.com)&#8216;s activity RSS feeds. However, based upon how the planet site currently looks, I overestimated the the effect that the deficiency in their feeds would pose.

You may notice that the first entries of Netflix are in a big clump. Obivously, all those movies didn&#8217;t go out and leave at the same time. This appears to have happened because Netflix doesn&#8217;t use the optional pubDate field of the RSS 2.0 format.

Now, based upon that observation I guessed that anytime that feed changed, that Planet would bump them all to the top in a clump (which wouldn&#8217;t be what I wanted naturally). However, I was wrong. Planet seems to internally add and track dates of incoming items regardless of whether the feed itself supplies that data. So although Netflix is semantically wrong for not including the pubDate field, it doesn&#8217;t matter.
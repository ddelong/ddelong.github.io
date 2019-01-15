---
id: 410
title: Damnit Technorati
date: 2005-04-28T09:18:42+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/04/28/damnit-technorati/
permalink: /weblog/2005/04/28/damnit-technorati/
shorturl:
  - http://l.derik.us/8y
dsq_thread_id:
  - "64768665"
categories:
  - Tag Central
---
During a round of service adding last night, I figured out a way to differentiate between no results and an error. That&#8217;s good because now users will know when they&#8217;ll have to visit the source itself to see the results. The worst error offender by far is [Technorati](http://technorati.com). Probably the majority of the tags will come up with an error message. You can then run their feed through the [feed validator]() and witness for yourself the problem.

You&#8217;ll probably see some red question marks in a see of asian characters. Many, many people submit blog entries in a foreign language. Really, they are a large part of the problem. Probably what bugs me most is that these entries are in that foreign language, but tag them in English. **How does that make any sense??** I&#8217;ll let that go, but that means the responsibility then lands squarely on the feed publisher&#8217;s head to ensure that when they publish a feed encoded with UTF-8, it **is** UTF-8. If they don&#8217;t, it will break many RSS parsers (including MagpieRSS, which I use). It makes me look incompetent even though it&#8217;s their mistake.

I may have to amend the error message to reflect this. Something along the lines of _Sorry, a request or processing error occurred. Most likely the source has invalid characters in their feed. Please contact them if this bothers you._
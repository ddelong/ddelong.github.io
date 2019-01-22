---
id: 612
title: Gmail Filters Changed?
date: 2006-11-29T12:10:32+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2006/11/29/gmail-filters-changed/
permalink: /weblog/2006/11/29/gmail-filters-changed/
dsq_thread_id:
  - "64770395"
shorturl:
  - http://l.derik.us/3M
categories:
  - Technology
---
I've been using Gmail for most of my mailing lists. There's a very good reason for this. It groups things into discussions beautifully. I also subscribe to several mailing lists that reside on the same server. For example, I subscribe to BBEdit Talk and Yojimbo Talk, both of which are run by Bare Bones (shocking, considering they develop them).

They don't have a domain that's dedicated to mailing lists, so the addresses are productname-talk@barebones.com. I'm also a compulsive filer, so I apply labels to these messages for quick manipulation. One label is &#8220;mailing lists&#8221;. Rather than map email &#8220;To:&#8221; each of these email addresses, I've been using the fact that filters work on a contains instead of match basis to simplify. For the longest time a filter that looked for &#8220;To: talk@barebones.com&#8221; worked perfectly. It's suddenly stopped working. It's now an exact match.

> Dear Google,
> 
> Don't change filter behavior without notifying your users and giving them an alternative method to attain the same functionality.
> 
> Thanks,
    
> Derik

Here's the wacky part. If you filter based upon an email string with nothing preceding the at sign, such as &#8220;@barebones.com&#8221;, the filter becomes a contain based filter. Ugh. Say it with me: **inconsistent**.

I was willing to cut Google some slack with their filters and the fact that it can't filter based on arbitrary headers (like the list headers that most mailing lists slap on for easy filtering). It's annoying, but something I could live with. Now the filters are essentially useless. Why? It's not hard to implement powerful, flexible filters. As accurate and fast as their search is, I still want to organize my email to help prune. It makes the results more manageable. It's almost as if Google is intentionally trying make its filters impotent to the point that users have to stop using it, at which point, Google can axe it completely.
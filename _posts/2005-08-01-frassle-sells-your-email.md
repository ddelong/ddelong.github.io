---
id: 494
title: The Dangers of Email Addresses in RSS Feeds
date: 2005-08-01T17:00:33+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/?p=494
permalink: /weblog/2005/08/01/frassle-sells-your-email/
dsq_thread_id:
  - "64769416"
shorturl:
  - http://l.derik.us/16
categories:
  - Technology
---
_There has been an update, so please read to the bottom of the post. I leave the original entry above for posterity._

[Frassle](http://frassle.net) is a neat service. What is not neat is that they seem to resell email addresses. My domain allows me to use any address at it (they all get redirected to a central address). This allows me to tailor a name to each service. The old tact was to use a Yahoo or Hotmail account (which didn&#8217;t have any accountability). My convention right now is either _service1_ or _service.login1_.

Some addresses that were slightly exposed at one point, _contact_ and _photoadmin_, regularly get email about updating their bank, ebay, and paypal records, with a handy, dandy link to do it right from the email. Real nice. _eyeroll_

For the first time, I received some spam from a service email, _frassle1_. **Not cool.** I will be emailing the operator of the site to get an explanation. I&#8217;ll keep y&#8217;all updated. In the meantime, if you want to use their service, use a throwaway address like a Yahoo account.

**Update:** As Shimon explains in the comments, the email was not sold. I apologize for accusing him of such. In fact, he was doing the right thing to an ill effect.

The problem lies in [RSS 2.0](http://blogs.law.harvard.edu/tech/rss), which mandates an email address in the author element as well as in the managingEditor and webMaster elements. Luckily, they are optional, but the fact that they can&#8217;t simply be a name as written in the specification, sucks. Surely, the creators of RSS 2.0 forsaw that a machine parseable format would lend itself to spambots harvesting feeds for email addresses.

Shimon was filling in this element with the registration email, which according to the specification, was proper and good. He was supplying all the information that was available. A good thing to do in most cases. He has altered the feeds to remove this optional element. Other sites take an alternative tact and instead fill in a bogus email address just to make the feed validate. There&#8217;s something quite clearly wrong with RSS 2.0 when feed authors are forced to use bogus data.

**Update Part Deux:** Shimon wrote [a blog entry](http://frassle.net/anEmailLeak) about the link (discovered via [Technorati](http://www.technorati.com) prompting me again to perhaps drop trackbacks and use [Kramer](http://dev.wp-plugins.org/wiki/Kramer)). He&#8217;s a good guy for taking my original accustion with such grace and being up front with his users. He even lives in the Boston area like yours truly.

Well, if you consider the Boston area the eastern half of Massachusetts. No &#8220;boondocks&#8221; quips from the peanut gallery.
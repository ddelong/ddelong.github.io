---
id: 585
title: Pretty Dynamic DNS Names
date: 2006-01-05T09:54:59+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2006/01/05/pretty-dynamic-dns-names/
permalink: /weblog/2006/01/05/pretty-dynamic-dns-names/
dsq_thread_id:
  - "64770186"
shorturl:
  - Generating...
categories:
  - Technology
---
I regularly SSH into my desktop at home to both run things from the command line and also set up tunnels to connect via VNC. The problem with this has always been knowing your IP address. Consumer broadband connections have no guarantee of retaining an IP for any amount of time. As a result, so called Dynamic DNS services were created. These services allow one to regularly change a domain name to match your current IP.

I don't have the numbers, but I imagine most users of these services use update programs on their computer to keep the number up to date. The fact is though, that this is unnecessary. It requires a computer to be on and uses resources on that computer. Nearly all modern routers today have built in update clients. The services supported will vary between manufacturers and models, but it's worth checking out because you can set it and forget it.

That works great, but example.selfip.org isn't particularly pretty. There are a wide range of domains available, but to be honest, I'm not a big fan of any of them. Besides, I own several domains. Isn't mynet.godlikenerd.com much better? I think so. Many of these services will administrate your domain records, but that's a pain (and potentially costly), particularly when my webhost already does this well.

[Dreamhost](http://www.dreamhost.com/rewards.cgi?ddelong) recently added custom DNS to their bottom end plan (which I use and is far more than I'll ever need). This allows me to define any kind of entry I want. Check with your host to see if they'll let you do the same. What is needed is a [CNAME](http://www.rscott.org/dns/cname.html) entry. Basically, it allows one to point one domain at another domain rather than an IP, essentially an alias. All that's left now is for you to mentally connect the dots.

First, sign up for a dynamic DNS account and pick a domain name. This domain isn't particularly important because we're only going to use it to set up. Second, visit your router's configuration page to enter the necessary login information into its dynamic DNS client. You should probably test to see that it updates correctly by trying to access a service at this domain. Third, set up a CNAME entry. For example, mynet.godlikenerd.com should point at example.selfip.org. This way, when someone looks up mynet.godlikenerd.com, it says &#8220;look at example.selfip.org&#8221;, which in turn returns your IP address. As a bonus, because mynet.godlikenerd.com is pointing at a name instead of an IP, it doesn't require any updating. You've just leveraged a free service into automatically updating a custom domain name with your IP address.
---
id: 385
title: 'Why isn&#8217;t My Internet Working?'
date: 2005-04-05T20:43:51+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/04/05/why-isnt-my-internet-working/
permalink: /weblog/2005/04/05/why-isnt-my-internet-working/
dsq_thread_id:
  - "64768454"
shorturl:
  - http://l.derik.us/2N
categories:
  - Macs
---
I recently got asked a question via email. I thought I&#8217;d share my answer.

> My problem is in the WiFi category. I have AirPort turned on, and around the corner from where I live is a Starbucks, as well as other apartments that have WiFi, so I get a few connections here and there. Among these are the connections, &#8220;default&#8221; and &#8220;linksys&#8221;. I don&#8217;t know which one is Starbucks, but I assume &#8220;linksys&#8221; as I get the strongest connection. &#8220;Default&#8221; only gives me 3 bars, but it spastically goes to 1 or none every few minutes, which results in me being disconnected from iChat very often.
> 
> When I first moved in, &#8220;linksys&#8221; appeared on my AirPort and I was able to go online (5 bars, yay). I still see &#8220;linksys&#8221; on the menu, but now (since recently) when I select it, I am no longer able to go online. I get the error on iChat and Safari etc. that I&#8217;m not connected to the internet. When I go to Sys Prefs; Network, it says:
> 
> &#8220;AirPort is connected to the network linsys. AirPort has a self-assigned IP address and may not be able to connect to the Internet.&#8221;
> 
> So something with this whole &#8220;self-assigned IP address&#8221; is causing the problems. I used to be able to use &#8220;linksys&#8221;, but now I have to use &#8220;default&#8221; because for some reason I can&#8217;t use the internet with &#8220;linksys&#8221;. Strange.
> 
> Well, I&#8217;ll have to deal with this problem until my Verizon DSL problems are resolved, and I suspect that that will take a few weeks, so if you have any idea as to what might be causing these problems, I&#8217;d be grateful.

_And my answer:_

Well, my first intuition is that maybe the linksys was actually a private person&#8217;s base station. They may have noticed your usage and are using either a MAC address filter to keep you from using the network, or they&#8217;ve set their DNS server to not respond to you. It could also be that Starbucks (if it is them) has either implemented some kind of registration policy or noticed continual usage by you and shut you off.

I think you might be out of luck until Verizon hooks you up.
---
id: 577
title: WRT54G(S), I Think I Love You
date: 2005-12-23T13:30:15+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/12/23/wrt54gs-i-think-i-love-you/
permalink: /weblog/2005/12/23/wrt54gs-i-think-i-love-you/
dsq_thread_id:
  - "64770091"
shorturl:
  - http://l.derik.us/5B
categories:
  - Technology
---
Next to my TV, I have an [EyeHome](http://www.amazon.com/exec/obidos/ASIN/B0007AB4X0/d00dism-20?creative=327641&camp=14573&link_code=as1) and a Playstation 2 (with ethernet adapter). I originally bought a [D-Link DWL-G810](http://www.amazon.com/exec/obidos/ASIN/B0000CEPCH/d00dism-20?creative=327641&camp=14573&link_code=as1) wireless to ethernet bridge. That way, devices with only an ethernet port could join the wireless network I had running out of my loft. It worked, but only for one device because it only had one port. To remedy this, I bought a [D-Link DSS-5+](http://www.amazon.com/exec/obidos/ASIN/B000023VUE/d00dism-20?creative=327641&camp=14573&link_code=as1) <span class="float-right"><img src="http://static.flickr.com/38/76633918_9bf5286640_t.jpg" alt="WRT54G" /></span> switch. Unfortunately, for whatever reason, that don&#8217;t work. It seems the bridge will recognize only one MAC address at a time.

### Pricey

<span class="float-right"><img src="http://static.flickr.com/37/76633894_9e57bc8093_t.jpg" alt="WRT54G" /></span> It seems that most wireless to ethernet bridges are handicapped in this way. At $80, I didn&#8217;t feel like getting one of these devices every time I add a non-wireless capable device. Linksys makes a wireless to ethernet bridge, the [WET54GS5](http://www.amazon.com/exec/obidos/ASIN/B0001ZRLRE/d00dism-20?creative=327641&camp=14573&link_code=as1), which includes its own switch. However, it&#8217;s a pricey $180. That&#8217;s no good either.

### The Answer to My Hopes and Dreams

<span class="float-right"><img src="http://static.flickr.com/37/76633859_e7cc149ceb_t.jpg" alt="WRT54G" /></span> The solution is the do-it-all wireless router, the WRT54G (or WRT54GS or WRT54GL). Thanks to its open source firmware, third-parties have been able to take the ball and run with it. The most prominently known is [Sveasoft](http://www.sveasoft.com) with their Alchemy and Talisman firmwares. The former is freely available, the latter is not. There are [cracked versions of the firmware available for free](http://slashdot.org/~TheIndividual/journal/). There&#8217;s been a long running debate as to whether Sveasoft can control their firmware distribution as they do. I didn&#8217;t want to get into it or pay (because I&#8217;m cheap), so I went with [DD-WRT](http://www.dd-wrt.com). It&#8217;s free and full featured, but slightly more intimidating.

The v23 beta 2 version includes a &#8220;client-bridged&#8221; mode. The firmware makes a ~$50 device into a ~$180 device, and I&#8217;m not even mentioning the firmware&#8217;s dozens of other features. As an added bonus, it even lets you connect with WPA, a feature I&#8217;m not sure I&#8217;ve seen elsewhere. My Eyehome and PS2 can now connect at the same time in happy harmony.

### Caveats

Unfortunately, not all WRT54G models were created equal. The v1 versions only have a 125 MHz CPU and the v5 uses VxWorks instead of Linux. Any other version is good, as is any version of the WRT54GS or the WRT54GL.

### Treasure Hunting

I found a WRT54GSv4 for $50 after rebates at Staples and a WRT54Gv4 at Walmart for $50 straight up. It&#8217;s worth noting that other than Linksys officially supporting &#8220;Afterburner&#8221; (their proprietary speed boosting technology), the devices are identical. In fact, the hardware itself is the same, as is the [WRT54GL](http://www.amazon.com/exec/obidos/ASIN/B000BTL0OA/d00dism-20?creative=327641&camp=14573&link_code=as1), which is currently selling for $70.99 at Amazon. Linksys seems to have finally realized that they were sitting on a gold mine.

Most online retailers are shipping the latest versions of the router by now, so your best options include _gasp_ shopping offline. First, check places like Walmart that likely have low technology product turnover. They probably have some older versions on their shelves. Also, the WRT54GS (with Speedbooster version) is still safe. If you can find a good deal for that model online, that&#8217;s a good option.

### Conclusion

You might note I got two compatible routers. One has just become the new main router for my network. I love to tinker and this is certainly the router to do just that. <!-- technorati tags start -->

<p class="tag-description">
  Tags: <a href="http://tagcentral.net/tag/ethernet" rel="tag">ethernet</a>, <a href="http://tagcentral.net/tag/linksys" rel="tag">linksys</a>, <a href="http://tagcentral.net/tag/networking" rel="tag">networking</a>, <a href="http://tagcentral.net/tag/bridge" rel="tag">bridge</a>
</p>

<!-- technorati tags end -->
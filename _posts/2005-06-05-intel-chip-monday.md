---
id: 440
title: Intel Chip Monday
date: 2005-06-05T22:25:01+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/?p=440
permalink: /weblog/2005/06/05/intel-chip-monday/
dsq_thread_id:
  - "5220118359"
shorturl:
  - http://l.derik.us/1Y
categories:
  - Apple
  - Macs
---
Well, I&#8217;m sure most everyone has read the [CNet story on Apple switching Macs to Intel](http://news.com.com/Apple+to+ditch+IBM,+switch+to+Intel+chips/2100-1006_3-5731398.html?tag=nefd.lede), the Wall Street Journal story, the [Inquirer version](http://www.theinquirer.net/?article=23714), the [Yahoo/AP version](http://news.yahoo.com/news?tmpl=story&u=/ap/20050605/ap_on_hi_te/apple_chips_3), or even the [New York Times version](http://www.nytimes.com/2005/06/06/technology/06apple.html?ex=1275710400&en=3fe62e771be44e02&ei=5090&partner=rssuserland&emc=rss).

The number of sources coming forward to confidently say that they are has turned even ardent disbelievers in the rumor, such as [John Gruber](http://daringfireball.net/2005/05/intelmania), the [other way](http://daringfireball.net/2005/06/see_you_intel) (or [maybe not](http://daringfireball.net/2005/06/intel_apple_odds_and_ends)). I&#8217;m personally in the &#8220;I think this is a load of crap&#8221; camp.

So, this will be repetitious, but let&#8217;s review what such a move would entail.

Let&#8217;s first suppose that this is an architecture switch to x86. This is the wet dream of platform detractors that own a machine (self-hating Mac user) and the fair weather fan (fans of the platform but don&#8217;t own a single Mac).

  * Mac OS X would need to be made to run on x86. _So what?_ yell the throngs in love with this idea, _Darwin already runs on x86_ (as if the Unix core of OS X really defines most of its being) _and Project Marklar means that the whole thing already runs on it._ That&#8217;s of course dependent upon Marklar being real and **reliable**.

  * No Mac software is compiled for x86 processors. The argument here is that developers can simply recompile, or Intel will come up with some kind of emulation. 
    
      * It&#8217;s completely unrealistic to expect the former. Many Mac users are still heavily rely upon older software. If a program hasn&#8217;t been updated for Mac OS X, do you really think the developer is going to shell out for a compiler that would recompile that application for x86? Even worse, there is no such thing. Kiss all that old software goodbye.
    
      * What about large existing software packages? Adobe is going to have to start distributing x86 versions of their software. Oh, and remember all that Altivec optimization they&#8217;ve done? It&#8217;s going to be totally useless and those sections will require major rewrites (read as months and months of no Adobe apps for x86 Macs).
    
      * We now have two different compilations. That&#8217;s a logistical nightmare. Imagine people asking for support asking why the Mac software they just downloaded won&#8217;t start. Well, that tech support person is going to have to explain that they probably downloaded the PowerPC version instead of the x86 version they should have downloaded. Do you really think that is going to woo the 98% that Apple would supposedly be going after? I don&#8217;t think so either. The answer then becomes some kind of &#8220;Fat&#8221; binary which contains both versions, bloating the size (doubling effectively) of Macs until some point at which the PowerPC machines will be deemed &#8220;unfit&#8221; to run software.
    
      * Pseudo Apple fans (as outlined above) are rubbing themselves raw because they think that this may lead to the ability to run Windows or Windows applications on Mac OS X. That would be a disaster, a total disaster. What motivation would be left for companies to develop Mac versions of their software anymore? None. _Zero._ **Zilch.** Rather than deal with the rather painful transition from PowerPC to x86 on Macs, they could just stop development and tell customers to use the Windows versions on their Mac. I don&#8217;t see any reason that Adobe, Quark, Microsoft, etc. wouldn&#8217;t go this route. Macs then lose huge portions of their selling point because all those fancy services that the Mac OS afforded applications would no longer be used. It would only be a matter of time before Apple became a digital media company (think iPod and iTunes Music Store) and nothing else.
    
      * Well, what about putting an emulator into the chip or OS? Well, I think we all have seen the efficiency of emulating different processors (VirtualPC and PearPC anyone?). The question then becomes why couldn&#8217;t they do with the transition from 68k processors to PowerPC. One reason is the design of the chip. Going from a chip with few registers to many is significantly easier than vice versa. Further, PowerPC chips were monsters compared to 68k processors. They simply powered through the emulation. It won&#8217;t be that easy with this kind of transition and the performance hits are going horrendous.

  * The other possibility is that Intel is going to start making PowerPC chips (which is far more likely logistically). The problem here is that Intel hasn&#8217;t had the licensing to make a PowerPC chip (can Apple extend that license to them?), nor has it ever done the research and development for this kind of chip.
    
      * One theory is that they are jumping into PowerPC development because they want to woo game station makers with their wares (as pretty much all of the next generation consoles use PowerPC). That sounds more plausible than most theories.
    
      * That would be really expensive for Intel, and by natural extension, Apple. Industry experts already say that Intel&#8217;s chips are more expensive than what Freescale and IBM make, so how could this be a cost saving step on Apple&#8217;s part? Well, apparently tech news editors are sleeping at their desks because the price difference between PCs and Macs does not lie totally in the CPU. That kind of thinking is naive.

What&#8217;s going to happen tomorrow? I really don&#8217;t know, but like the Daring Fireball, my money would be on Intel making PowerPC chips (but I won&#8217;t be betting much).
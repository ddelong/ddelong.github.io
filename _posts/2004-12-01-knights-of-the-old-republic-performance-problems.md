---
id: 255
title: Knights of the Old Republic Performance Problems
date: 2004-12-01T10:04:58+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2004/12/01/knights-of-the-old-republic-performance-problems/
permalink: /weblog/2004/12/01/knights-of-the-old-republic-performance-problems/
dsq_thread_id:
  - "64767185"
shorturl:
  - http://l.derik.us/12
categories:
  - Technology
---
It&#8217;s no secret that my birthday was last weekend. My parents were nice enough to get me several gifts. I got a [Waterfield Powerbook sleeve](http://www.sfbags.com/PRODUCTS/SC_INFO/sc.htm), [Medal of Honor: Breakthrough](http://www.aspyr.com/games.php/mac/mohaab/), and [Star Wars: Knights of the Old Republic](http://www.aspyr.com/games.php/mac/kotor/). You can look forward to a full length review of the bag and a short review of Breakthrough. In the mean time, you can get a review of Breakthrough from [Inside Mac Games](http://www.insidemacgames.com/reviews/view.php?ID=493).

However, I soon discovered to my own displeasure that Knights of the Old Republic (KOTOR) ran rather poorly on my Dual 1 GHz Powermac G4 with 1.25 GB RAM and Radeon 9000 Pro video card. The very first scene (which is a simple tutorial) stuttered. If the game weren&#8217;t turn based, I wouldn&#8217;t have been able to play it effectively. The problem only worse when I got to the game&#8217;s first cantina. This isn&#8217;t a very intense scene (unless you count the moderate amount of people as intense). This Powermac has handled all the other games I&#8217;ve played on it (Halo, Medal of Honor series, Call of Duty) expertly. I was so disappointed that I decided to put the game away for a little while and go back to Grand Theft Auto: San Andreas.

After a couple days, I decided it was time that I investigate the problem and see if there was some kind of fix. [Inside Mac Games&#8217; review of KOTOR](http://www.insidemacgames.com/reviews/view.php?ID=515) made no mention of any problems. However, the [reader reviews](http://www.insidemacgames.com/reviews/user_reviews.php?ID=515) did. The commonality seemed to be that G4&#8217;s didn&#8217;t handle the game well. I decided it was time that I got more information.

I sent a message to Mac game guru Peter Cohen, asking how he rated the game and if he ran it on a G4. He gave it a high rating and it performed well on his Powerbook. The G4 obviously wasn&#8217;t the problem. I did a little digging on my own and it seems that the Radeon 9000 Pro (and cards with related chipsets) have problems with vertex shaders, which KOTOR uses heavily. I ask Peter about this and he agreed that could be the issue (as his Powerbook uses an Radeon 9600 chipset). Aspyr is aware of the problem (which is also related to some weak OpenGL code in OS X 10.3.6). Mac OS X 10.3.7 should remedy some of these issues and Aspyr may come out with a fix.

That&#8217;s well and good, but what was I to do? I copied the game to my firewire drive and fired it up on my Powerbook (12&#8243;, 1.33 GHz G4, 1.25 GB RAM, and NVIDIA Geforce FX Go5200 video card). The game ran much smoother. This is especially odd as Call of Duty never played very well on it at all. However, with this realization, I was able to start playing the game again in a comfortable way. It&#8217;s rather disappointing that the Radeon 9000 Pro seems to handle the game so poorly, but hopefully this will be resolved. In the mean time, [Aspyr](http://www.aspyr.com) should consider warnings for users that might be using that video card or a card with a similar chipset. It was a nasty surprise for me and I imagine a less investigative user might just give up and return the game. That&#8217;s something I doubt they want.
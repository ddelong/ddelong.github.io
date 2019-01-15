---
id: 448
title: Fast Enough
date: 2005-06-13T11:08:46+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/06/13/fast-enough/
permalink: /weblog/2005/06/13/fast-enough/
dsq_thread_id:
  - "64769040"
shorturl:
  - Generating...
categories:
  - Apple
  - Macs
---
This is a strange predicament that I&#8217;ve been placed in. Normally, I agree with what most Mac pundits say. However, many of them are being over-confident and taking Steve&#8217;s word for gospel. They&#8217;re not doing any analysis or technical reviews of the transition. Rather, they believe the marketing hype otherwise known as [a keynote](http://www.apple.com/quicktime/qtv/wwdc05/).

One of the primary concerns was the ability to run PowerPC software. This was addressed with a slick piece of software called [Rosetta](http://godlikenerd.com/weblog/2005/06/07/rosetta-is-not-a-magic-cure-all-or-the-death-of-classic/). Slick though it may be, it&#8217;s still emulation. In other words, it&#8217;s slow. To put that concern to rest, Steve told us it was _fast enough_. **Fast enough?** What kind of vague bullshit is that? I can let that go because, as I said before, keynotes are marketing hype. What&#8217;s sickening is the way in which evangelists are parroting this as if it was the result of some kind of scientific study.

My suspicions were fulfilled by [a Think Secret article](http://www.thinksecret.com/news/0506intelxbench.html). Before you get snotty and scream that Think Secret is a rumor site, this report has actual proof associated with it (far more than the keynote&#8217;s pony show). The proof in question is on [the Xbench website](http://ladd.dyndns.org/xbench/merge.xhtml?doc2=115944). The benchmarking software was run under Rosetta, to get a real feel for PowerPC application emulation.

From Think Secret&#8217;s article: 

> Overall, the Intel Mac are scoring between 65 and 70 with Xbench, a far cry from the 200+ scores higher-end G5 systems reach. The CPU test is landing in the high teens compared with scores of 100 to 200 for G5 systems, but that appears to be primarily due to lackluster FPU scores. According to a recent Macworld story, Rosetta does not support AltiVec instructions, which substanties _[sic]_ the results. The GCD Loop score for the Intel Mac, part of the CPU test, is a respectable 110, compared to dual-2.5GHz G5 Macs that score about 140.
> 
> The Intel Mac performed substantially less well than the dual-2.5GHz G5 at Thread test, scoring an 82 compared to 225. In the Computation Thread test the Intel Mac scored a respectable 110 compared to 155 in the G5, but the G5 blew the doors of the Intel Mac in the Lock Contention test, scoring a 420 to the Intel Mac&#8217;s 66.
> 
> The Memory Test tells a similar story: overall the Intel Mac scored a 214 to the G5&#8217;s 378, but the Intel Mac actually exceeded the G5&#8217;s Stream Memory Test: 351 to 319. The G5 trounces the Intel Mac at the system memory test, however, scoring a 464 while the Intel Mac musters a 154.
> 
> The Intel Mac scored a 125 on the Interface Test, compared to a 380 for the G5.

Ouch. That sounds awful. Think Secret alludes to the fact that Altivec instructions aren&#8217;t executed by Rosetta, resulting in the running of the vastly inferior G3 fallback code. This brings up the other misconception that a universal binary version of applications will fix everything. Developers that previously wrote Altivec code will be able to use the Accelerate framework to get the same kind of performance using Intel&#8217;s SSE. Or will they?

From [SIMD tech forum](http://www.simdtech.org/altivec/archive/msg?list_name=altivec&monthdir=200506&msg=msg00037.html): 

> On Jun 6, 2005, at 5:22 PM, Bob Currier wrote:
    
> _Maybe it is a good tool, but it&#8217;s the 22x vs. 9x that is making me feel ill. I&#8217;ve already got both Altivec and SSEn versions of my core code, and the Intel stuff sucks, badly. My best case shows about the same ratio you&#8217;re seeing._
> 
> I&#8217;m feeling the pain myself, in-fact I think I&#8217;ll be sick all week (and likely a lot longer than that). My Wintel colleague and I have just completed some large SIMD optimizations for a very well known image processing application. I also see the same performance ratio &#8211; **the AltiVec version is easily more than twice as fast as the SSE2 version (take the fastest G5 you can find and the fastest x86 you can find and the AltiVec-G5 version is easily twice as fast)**. I&#8217;ve taken pride in being able to handily beat the SSE2 version and in many cases doing so with far less instructions. I don&#8217;t drink the Kool-aid.
> 
> I had a conversation with an engineer from a certain fruit company today and he said that even Intel engineers were having problems getting SSE2/3 versions of some of the Apple Altivec sample code running at anything better than half the speed of the Altivec code, and this on a CPU with twice the clock speed of a G5. Steve can sit in his distortion field all he wants but that doesn&#8217;t change the fact that **Altivec is far superior to SSE2/3**. In fact, in many other ways the G5 and PPC architecture is superior to Intel and x86 (but not in all ways of course). Many of us here know this through experience. The way I see it this is for mobile chips and that&#8217;s it. That&#8217;s the only weak point of the current PPC architecture and currently the strong point for Intel. AMD is beating them on the Desktop and Intel is even having to adopt AMD&#8217;s 64-bit architecture.

Digest that. G5s will continue to beat the snot out of Macintels for some time to come. We&#8217;re not talking about a minor difference in performance. We&#8217;re talking about two times the performance using existing hardware. It&#8217;s no secret that x86 chips are reaching the ceiling in cycles and that G5s still have some wiggle room. According to Steve himself we can look forward to some advancements before the switch.

We can all look forward to benchmarks and reviews of the Macintels in comparison to the PowerPC Macs that will underline the processor differences that we&#8217;ve been talking about for years. That&#8217;s when this will get really interesting.
---
id: 442
title: Rosetta is not a Magic Cure-All, or the Death of Classic
date: 2005-06-07T09:29:17+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/06/07/rosetta-is-not-a-magic-cure-all-or-the-death-of-classic-2/
permalink: /weblog/2005/06/07/rosetta-is-not-a-magic-cure-all-or-the-death-of-classic/
dsq_thread_id:
  - "64768984"
shorturl:
  - http://l.derik.us/R
categories:
  - Apple
  - Macs
---
One of the more overlooked aspects of the transition from PowerPC to Intel x86 CPUs is the effect it will have on the software you can run. I&#8217;ll be discussing this move and my take on it in a later article, but I think a subset of the transition strategy needs highlighting first.

### You Won&#8217;t Feel a Thing

Steve made the transition sound utterly painless. According to him, developers will have to do little more than recompile their cocoa software. But what about existing software? Rosetta is the answer proclaimed Steve. Processor emulation will make it all better. Now, for the time being, I&#8217;m willing to ignore the <s>inevitable</s> [confirmed](http://www.thinksecret.com/news/0506intelxbench.html) speed cost, but what about compatibility and functionality? The keynote seems to make it seem like all your old software will just work. Well, I wasn&#8217;t buying that, My suspicion was rewarded when I read Apple&#8217;s [document on Universal Binaries](http://developer.apple.com/documentation/MacOSX/Conceptual/universal_binary/universal_binary.pdf).

### Side-effects Include

Rather than make you sift through the document, I&#8217;ll cut to the chase and the all important section.

> Rosetta is designed to translate currently shipping applications that run on a PowerPC with a G3 processor and that are built for Mac OS X.
> 
> Rosetta does not _run_ the following:
    
> * Applications built for Mac OS 8 or 9
    
> * Code written specifically for AltiVec
    
> * Code that inserts preferences in the System Preferences pane
    
> * Applications that require a G4 or G5 processor
    
> * Applications that depend on one or more kernel extensions
    
> * Kernel extensions
    
> * Bundled Java applications or Java applications with JNI libraries that can?t be translated

### Classic, We Hardly Knew Ye

Back up a second there. Did I copy and paste that right? Mac OS 8 and 9 applications will **not** be supported?

That&#8217;s right Mac fans, your copy of Office 98 is going to need replacement. That little gem that you could never find an OS X equivalent for? Yeah, that&#8217;s not making it to the new machines. If you can&#8217;t run those applications, what&#8217;s the point of Classic? There is none. It&#8217;s not so unrealistic to expect that Leopard, the next version of OS X won&#8217;t even include it. On the other hand, it may still include it for the PowerPC machines still left, but there&#8217;s a very real future with a version of OS X without Classic.

Those that must use older applications: migrate or stockpile PowerPC machines. And you thought the loss of booting into OS 9 smarted.

### No Panacea in Here

Despite the ease and comfort with which Steve reassured everyone that running existing PowerPC software would not be an issue, as we can tell from the above list, that&#8217;s not the case. Let&#8217;s look at them point by point.

  * **Code written specifically for AltiVec** Kiss all that optimization that Adobe put into Photoshop and their other applications goodbye. You&#8217;d better hope that the author made alternate unoptimized code.
  * **Code that inserts preferences in the System Preferences pane** I&#8217;ve got at least half a dozen System Preferences panes from third-parties. That includes things like APE.
  * **Applications that require a G4 or G5 processor** Check your software&#8217;s system requirements. If it says G4 or G5, you&#8217;ve likely got a problem. Some software does inflate its requirements to ensure a good experience, but much of it doesn&#8217;t. Any software that utilizes a feature specific to G4s and G5s (like Atlivec) is not going to work.
  * **Applications that depend on one or more kernel extensions** Sidetrack, USB Overdrive, Intellipoint, Logitech Control Center, M-Audio Revolution drivers: they aren&#8217;t going to work without a recompile. Most hardware driver software includes some kind of kernel extension (SCSI cards, sound cards, some USB devices, etc.). Let&#8217;s not forget VPN software. Considering that some of those packages still don&#8217;t work in Tiger, we can probably expect months of no x86 Mac compatible VPN software.
  * **Bundled Java applications or Java applications with JNI libraries that can?t be translated** Admittedly, I can&#8217;t come up with a good list of software that utilizes such packages, but I&#8217;m sure this will bite a few.

I find it a little more than disturbing that many are already citing Rosetta as the solution to the problem of software not compiled for x86. It&#8217;s a nice (assuming the speed hit isn&#8217;t horrendous) band-aid, but that&#8217;s all. It can&#8217;t be relied on, nor can it be used in all situations. Users are still going to need some aspirin to dull transition pains.

**Update:** Added link to [Think Secret article](http://www.thinksecret.com/news/0506intelxbench.html) on speed cost.
---
id: 496
title: DRM, Yes, No, Maybe?
date: 2005-08-05T23:46:30+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/?p=496
permalink: /weblog/2005/08/05/drm-yes-no-maybe/
shorturl:
  - http://l.derik.us/3k
dsq_thread_id:
  - "64769427"
categories:
  - Macs
---
Well, after some fairly convincing evidence earlier in the week that the [Macintel developer kits use DRM](http://godlikenerd.com/weblog/2005/08/01/os-x-intel-uses-drm/), followed by some [vehement opposition](http://www.boingboing.net/2005/07/31/apple_to_add_trusted.html) and [angst](http://www.tuaw.com/2005/08/01/drm-on-mactel-machines/) to the idea, sites are now feeling confident enough to proclaim [no DRM](http://www.ofb.biz/modules.php?name=News&file=article&sid=380&mode=&order=0&thold=0) (and [again](http://apple.slashdot.org/apple/05/08/04/1338205.shtml?tid=118&tid=158&tid=3) and [again](http://www.tuaw.com/2005/08/04/no-drm-in-mactels-afterall/)).

### Controlled Bloom

My head is spinning. Let's slow it down. First, what is using DRM in the new Apple Intels?

> We've discovered that Rosetta uses TCPA/TPM DRM. Some parts of the GUI like ATSServer are still not native to x86 &#8211; meaning that Rosetta is required by the GUI, which in turn requires TPM.

Those of you addicted to emulation technology news will remember that Transitive's technology. Supposedly, it delivers 80% performance during emulation. I'm still less than convinced (and I still have the backup of Xbench testing, which shows a very large disparity).

Let's assume for the moment that it is that good. They'd have a very large motivation to keep it from getting out in the wild. Also, Apple would be bending over backwards to get it because the success of the transition pivots on the strength of the emulator. In this scenario, using advanced DRM to satisfy Transitive is a necessary evil.

### Angst

At the same time, using DRM to keep generic Intel hardware from is a worthy motivation and it doesn't mean that DRM will pervade all parts of the system and applications. However, that doesn't prevent reactions like:

> Kill DRM Dead, a poem by C.K. Sample, III: 
> 
> Have I ever told you that I hate you, DRM?
> 
> I do. I hate you, DRM. You ruin everything. You make everything more difficult. You break apart the sharing goodness that makes society flow. I hate you. Die, DRM. Die.

What's worse is that even those that take a more even keeled approach to the whole thing feel obliged to dispel the fears of the irrational. Rather, they repeat that the current development machines don't necessarily represent the final hardware. While that's true, it doesn't imply that the DRM will be removed either.

Does it really make any sense for Apple to put development cost into DRM for the development machines only to remove it for the production machines? Not really, but we still don't know the extent to which it will be used.

### A Nonny Mouse, My Best Friend

After pictures of the Infeon chip used for DRM being released as well as detailed descriptions of APIs for use with the technology, what is the compelling evidence that is laying the fears to rest?

> Commenting on earlier reports, a reliable source who requested anonymity told OfB, &ldquo;While many rumors are being circulated on the web about Apple's future direction on Intel processors with DRM, the majority of them are just that &#8211; rumors.&rdquo; The source, a third-party Apple developer, continued, &ldquo;Reality is that these boxes are production PC's in an Apple case, not DRM or TCPA protected, and none of these boxes will remain in circulation after their purpose has been served &#8211; they must be returned to Apple. 
> 
> As to why those with access to the kits have been quiet concerning the claims, our source said, &ldquo;you can rest assured that Apple is keeping very close tabs on those of us who have them.&rdquo; The kits are only available to those who accept a non-disclosure agreement. [[OfB](http://www.ofb.biz/modules.php?name=News&file=article&sid=380&mode=&order=0&thold=0)]

A &#8220;reliable source who requested anonymity&#8221; is who we are to believe? Oh please. The guy is locked into a NDA but wants to set the record straight. Sounds a little too mythical for real news. I'm not the only one.

> Editor's Note: Some have written in questioning the validity of the source quoted in this report. While we are unable to provide any further identification, per the stipulations under which the source agreed to provide us with the information reported above, the source's identity and credentials are well known and established by Open for Business.

That's the journalistic equivalent of &#8220;trust us&#8221;.

### Let It Be

TCPA and the possibility of its inclusion is something that both Mac and PC users should be prepared to deal with in the future. It's a strong possibility regardless of its inclusion in Apple's development machines. It's still at least six months out before we could possibly see an Intel based Mac, so let's all cool it. Do some research to determine its actual impact on your life and prepare for that possibility. Then we can all cross that bridge together.
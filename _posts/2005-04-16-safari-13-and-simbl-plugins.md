---
id: 397
title: Safari 1.3 and SIMBL Plugins
date: 2005-04-16T16:08:47+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/04/16/safari-13-and-simbl-plugins/
permalink: /weblog/2005/04/16/safari-13-and-simbl-plugins/
dsq_thread_id:
  - "64768544"
shorturl:
  - http://l.derik.us/1z
categories:
  - Macs
---
Upon launching Safari 1.3 for the first time, I got a notification that the version of [PithHelmet](http://culater.net/software/PithHelmet/PithHelmet.php) I was using wasn&#8217;t tested with Safari 1.3, so it would be disabled. Safari then promptly crashed.

Well, that indicated one of three things.

  1. PithHelmet wasn&#8217;t actually disabling itself and crashing Safari.
  2. Something else was killing Safari.
  3. I had a botched install.

The third option was very unpleasant. I knew PithHelmet was a SIMBL plugin, so I went to where my SIMBL plugins are kept. This is at &#8220;/Library/Application Support/SIMBL/Plugins/&#8221;. I noticed that not only PithHelmet, but [AcidSearch](http://www.pozytron.com/?acidsearch) was in there. Just to be sure, I moved both out onto the desktop and started Safari. It launched perfectly. Now, considering that PithHelmet said it was disabling itself and AcidSearch made no such claims, I figured PithHelmet might be safe to put back (though there wasn&#8217;t much point in doing so). I quit Safari, replaced PithHelmet, and started Safari again. It worked.

So, it&#8217;s official, AcidSearch 0.34 is incompatible with Safari 1.3. Drag its bundle out of the above location. You might as well delete it.

But what about PithHelmet? Well, the good news is that you can [trick PithHelmet into working](http://www.macworld.com/forums/ubbthreads/showthreaded.php?Cat=&Board=UBB1&Number=314425&page=0&view=collapsed&sb=5&o=&vc=1). The bad news is that it&#8217;s completely untested so Safari may start crashing regularly on you. You were warned.

**Update:** PithHelmet and AcidSearch have both been updated for use with Safari 1.3. PithHelmet is now version 2.3 and AcidSearch is 0.4.
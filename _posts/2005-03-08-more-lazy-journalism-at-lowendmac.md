---
id: 360
title: More Lazy Journalism at LowEndMac
date: 2005-03-08T15:16:25+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/03/08/more-lazy-journalism-at-lowendmac/
permalink: /weblog/2005/03/08/more-lazy-journalism-at-lowendmac/
dsq_thread_id:
  - "64768153"
shorturl:
  - http://l.derik.us/N
categories:
  - Macs
---
It may start to look like I have a personal jihad against the fine folks at [LowEndMac](http://lowendmac.com), but I really don't. I enjoy a lot of their content. Their archived Mac technical information is pretty good. Well, it used to be. It's now filled with missing files (Error 404 abound!) and all attempts to notify them seem to be directed into /dev/null (or &#8220;sent into the void&#8221; for my less geeky readers). Some of their articles are interesting and inspiring.

Some are not. Today's example is [Four Classic Mac OS Features Still Missing in OS X]() by Jeff Adkins. He brings up four things he misses from OS 9.

  * _Tabbed folders_ &#8211; aka tab drawers. Drag a Finder window to the bottom of the screen and it turns into a tab.
  * _A more complete location function._ Changing locations changes a myriad of settings instead of just network connection ones.
  * _Installing and temporarily disabling system extensions at startup._
  * _Link all kinds of sounds to system events._

I will give Jeff the first two. They were handy features. The latter two are examples of poor journalism.

### Extensions are dead. Long live extensions!

Perhaps the biggest problem of OS 9 and earlier was the existence of extensions. They were essentially little plugins that added all kinds of functionality to the OS. To do anything slightly interesting, a developer generally had to include one of these. Want a new menu in the menu bar? You need an extension. Want to burn CDs? You need an extension. So on and so on.

This wouldn't have been a problem except that extensions had a nasty habit of interfering with one another. Rather than dealing with this somewhat gracefully by disabling features should a conflict occur, these conflicts would cause crashes because OS 9 was rather unstable in this regard. One had to be knowledgable in order to hunt down and solve these problems. You had to know what you could disable, which extensions were interrelated, and when extensions should loaded. It was no small task, and as such, they were done away with.

OS X uses a much different approach. Nearly everything is daemon based. Background applications generate menus and run services for other applications. In more technical terms, more functionality was pushed from the system space into user space. Different users no longer have to run a lot of the same software. It also meant less restarting, vastly improved stability, and more control. Extensions became a thing of the past.

Enter Jeff Adkins take:

> Installing and **temporarily disabling system extensions at startup**. [Editor's note: Okay, they're not called extensions any more, but you know what we mean.] Of course, OS X apologists would have you believe you don't need to fiddle with system extensions because OS X never crashes. Not to burst your bubble or anything, but I've never used a computer I couldn't cause to freeze or crash.
> 
> In fact, in my illustrious career, I've managed to crash (software wise) a copy machine, a calculator, and every operating system I ever used &#8211; OS X, OS 4-9, Apple II, Atari, DOS, all 31 flavors of Windows&trade;, some Linux distribution I used for a day, a Prime minicomputer [I kind of cheated on that one], a VIC-20, a Commodore 64, a Timex-Sinclair 1000, an Atari 2600 home video game, a Pac-man home version I bought in a joystick handle for Christmas, and a red-LED-only football game I got in 1980-something.
> 
> It was nice being able to fix things without a degree in computer science. Now, I've cracked open the Terminal and done a few tricks, but only because I had to. That doesn't mean it was fun.

Well, that was fun. Now that Jeff has dated himself, we'll examine the actual meat of what he wrote. He wants a mechanism to disable system extensions at startup. The thing is, extensions as they were once known, don't exist anymore. It's like asking for a way to disable extensions in Windows. It doesn't make sense. We'll cut him some slack and pretend that what he meant was kernel extensions by that editor's note (though he left it so utterly vague, he could be talking about daemons).

Kernel extensions are somewhat similar to OS 9 style extensions, except that they're not. They have a very special purpose. They provide developers with a very low level way to interface with hardware. This is an important distinction for several reasons. First, because they deal with hardware, it limits the number of them to the number of devices you've attached to your computer. Second, they do not get loaded by the OS unless they are attached. If you disconnect that peripheral, it doesn't get loaded at startup. It's like magic.

Next, there **is** a way to disable them no matter what at startup. You hold shift, like days of old. That's right, just like before. Holding shift even disables the daemons I talked about. Amazing! One can then disable or uninstall that software that they _think_ is causing the problem.

That brings up the next issue. Jeff appears to still be stuck in the OS 9 world where extension troubleshooting was standard procedure. Again, OS X is different from OS 9. Extensions are not the problem when you are having an issue. It's like insisting that one is having an extensions issue when running Windows. Wrong OS. This is further reinforced by the last sentence in the quoted portion.

> It was nice being able to fix things without a degree in computer science. Now, I've cracked open the Terminal and done a few tricks, but only because I had to. That doesn't mean it was fun.

He perpetuates the myth that Unix (accessed via the Terminal) is hard and necessary for troubleshooting in OS X. It's not. Every function that a normal user needs out of the Terminal has had a nice GUI face slapped onto it by a kind developer. Further, running commands in the Terminal that have been supplied by a helpful third party or by some reference guide is not hard. You simply need to type what you have been told. I assume Jeff can type. It hardly requires a degree in computer science.

What's really ludicrous about that passage is the suggestion that in some way it's easier to troubleshoot extension conflicts rather than type a few commands into a prompt. Extensions troubleshooting is so absurdly hard that a product was made to automate it to some degree (Conflict Catcher) but it was never an exact or perfect science. That is not easy for a layperson. This is confusing personal familiarity with ease. Also, extension conflict finding isn't fun either.

### Yelling at the Kids from the Couch

Next up on the agenda is the lack of a utility to connect sounds to certain system events. There's little to say about this. [Xounds](http://www.unsanity.com/haxies/xounds) will do it. No fuss, no muss. It would take someone less than a minute to find it **if they tried** which Jeff admittedly had not.

> I also wish OS X could link all kinds of sounds to system events. I did it with shareware in OS 9 and have never even looked to see if there's such a thing of OS X. It's not essential, but it is fun.

God forbid he look! He's much too busy criticizing that OS X doesn't have an extensions manager to even look. He even says that it was done with shareware in OS 9. How can something that was never in the Classic OS be &#8220;missing&#8221; from OS X? _Hello? Bueller?_ This is no different from the Classic OS.

### Trying Too Hard or Not Enough?

There are legitimate gripes one can have with OS X. I think Jeff brought up two good ones. However, he's inventing problems in order to find a fault in OS X with the third. Then he doesn't even try to look to find a solution for the last gripe. LowEndMac provides a fine service for owners of older Macs. I support them in that. I will not support these inaccurate circle jerks that they are calling columns. Having a website and a large readership doesn't give you license to publish crap.
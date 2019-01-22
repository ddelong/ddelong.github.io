---
id: 422
title: Widget Panic
date: 2005-05-11T13:48:08+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/?p=422
permalink: /weblog/2005/05/11/widget-panic/
dsq_thread_id:
  - "64768795"
shorturl:
  - http://l.derik.us/47
categories:
  - Macs
  - Tiger
---
No doubt by now you've heard about the [Widget security issue](http://www.macworld.com/news/2005/05/09/dashboard/index.php). Thankfully, most of the Mac news sites have been fairly even-handed in their reporting. This hasn't stopped from others on the net from proclaiming this the end of Mac security and that it's no better than Windows (lots of hyperbole, not much substance). I've seen bits and pieces of information on this, but nothing that totally consolidates it yet. The MacCentral article linked probably has the best overview, but I'd like to break it down a little differently. <!--more-->

### The Risks

The risks involved with running an untrusted Dashboard widget is significant. We're not talking about just launching URLs or displaying naughty pictures. The API for Dashboard includes ammenties such as running command-line programs. This includes rm (deletes files) and open (can launch applications and open files). They also have access to AppleScript. The most frightening aspect is being able to utilize the command-line by far.

This is not to say that giving widgets this capability is inherintly bad. All applications have these capabilities and with good reason. It makes the possibilities nearly endless. However, it also means that I could write a widget that would initiate the command _rm -Rf ~/*_, which would destroy your entire user folder and all the associated data. **Ouch.** The damage is limited to files that you have write access to, thankfully.

This possibility goes to further reinforce the hard rule that _one must not use root as their primary login_. Unfortunately, too many users (mainly OS 9 diehards) think it's a clever idea to use it to &#8220;avoid permissions problems&#8221;. Sure, you can edit, read, and delete any file you want, but it also means something else. Any program you run can also do so. What does that mean? A malicious widget could run &#8220;rm -Rf /*&#8221; and destroy your entire drive (possibly even wipe out your external disks). This is why we have permissions and users. It's not something to take lightly. So like drugs, if someone tells you to use the root login for normal use, just say no.

### Saving Grace

While a web page can easily install a widget without your consent, this doesn't mean your system is compromised. A widget does not run until you drag a widget out of the drawer. This is an informal confirmation of whether you want the widget to run or not. So don't drag anything out of your drawer that you don't recognize.

### An Ounce of Prevention

There's a couple of ways to prevent auto-install. The easiest is to simply turn off Safari's auto-open feature. The harder version is to change the permissions for the various widget folders (outlined later) to prevent writing to them. This will allow you to leave auto-open on, but prevent widget auto-install.

### Digging Out

If you have widgets installed against your will that you would like to remove, you'll either need [Widget Manager](http://www.downtownsoftwarehouse.com/WidgetManager/index.php) (free, but donations encouraged) or manually remove them. Widgets are stored in Library folders. Like all files that lives in the Library, there is a series of places they can exist: user local (~/Library/), system local (/Library/), network (in the Library folder inside Network), or stock (/System/Library/). Most users need only look in the first two. Inside those Library folders, a folder named &#8220;Widgets&#8221; may appear (if not, none are installed). One can manually delete widgets from these locations.

### Druthers

If I were in charge of how to fix this issue at Apple, the fix would be simple. Add a confirmation dialog when widgets are being downloaded and installed (much like Apple has now when a disk image or archive contains an application). Allow the user to allow automatic install, allow download (for manual installation), or cancel entirely. At that point, anything that happens because of a malicious widget is the fault of the user. Apple's hands are clean.

### Hyperbole

All that said, maybe we can cut out the ridiculous suggestions that Mac OS X is no more secure than Windows. This security issue is contigent upon user actually invoking the widget, relegating this to Trojan status, which ultimately is a user mistake. I think we can all rest a little easier knowing that it isn't as serious as some would like to suggest.
---
id: 273
title: Making Safari Livable Post Firefox
date: 2004-12-21T08:45:17+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2004/12/21/making-safari-livable-post-firefox/
permalink: /weblog/2004/12/21/making-safari-livable-post-firefox/
dsq_thread_id:
  - "64767424"
shorturl:
  - http://l.derik.us/2E
categories:
  - Macs
---
I'm indecisive about my browser on my Macs (the choice is easy for PCs, Firefox all the way). Pre Safari and Firefox, the choice was easy. Camino (formerly Chimera) was the end all for Mac browsers. Now my choice switches between Firefox and Safari. Firefox is fast most of the time, but after some use seems to slow down. Safari is fairly fast, but tends to have pregnant pauses when connecting to servers (or at least this is what the status bar tells me).

### Making Firefox More like Safari

After fighting it for a long time, I went to Firefox. There were several things that bugged the crap out of me that I made acceptable with the help of some other pieces of software. The first is the lack of bookmark syncing. Safari's implementation is simply so beautiful and transparent that it makes it hard to go back. The other problem was the default widgets that Firefox draws. It doesn't even try to use native buttons, and as such, very boring, ugly, utilitarian buttons are drawn that simply do not fit. Two products mostly solved this for me.

  * [Bookmarks Synchronizer](https://addons.update.mozilla.org/extensions/moreinfo.php?application=firefox&id=14&vid=1187) lets you sync your bookmarks via FTP.
  * [Kevin Gerich's Pretty Widgets](http://kmgerich.com/archive/000072.html) lets you have widgets that look pretty good. This is most easily applied with [Firefoxy](http://homepage.mac.com/amake/software/firefoxy.html).

However, the bookmarks synchonizer doesn't allow for syncing based on intervals of time (instead relying on manual sync and program start and termination). It's possible to loose bookmarks as it doesn't handle changes from multiple locations at relatively similar times gracefully. It's still mostly a kludge solution. As for the Pretty Widgets, they tend to mess up in some situations, making the buttons disappear all together. This happens on my WordPress blog's configuration screen. You can still click the buttons, but you have to know they are there to begin with.

### Making Safari More like Firefox

Part of my problem with Safari (beyond the fact that it refuses to respect stylized elements) was that things seemed to load slowly. I traced some of this back to Mike Solomon's [PithHelmet](http://culater.net/software/PithHelmet/PithHelmet.php), which is just about as good as Firefox's [AdBlock](http://adblock.mozdev.org). It's better in some respects, worse in others. Mike started [working on performance](http://culater.net/thc/index.php?entry=/Development/PithHelmet/performance_progress.txt), forcing me to reevaluate Safari again. Its bookmark syncing is compelling, as is just how damn pretty it makes all pages look. After some time, I've found the three pieces of software that makes Safari good enough for now.

  * [The new 2.2 beta of PithHelmet](http://culater.net/thc/index.php?entry=/Development/PithHelmet/beta_v2_2.txt) has made incredible strides in improving load times and gives me my beloved Machete back.
  * [acidsearch](http://www.pozytron.com/?acidsearch) gives you multiple search channels (a la Firefox) and Find As You Type (AKA Type Ahead Find). It's free too.
  * [CocoaGestures](http://www.bitart.com/CocoaGestures.html) gives me back my gestures, which improve web surfing ease ten fold once you start to learn it. Hold down a mouse button, move the mouse in a specified way and you invoke a command. It's best experienced. They also have a new (for pay) product that looks compelling, but offers more than I'm looking for.

These three products get Safari pretty damn close to what I like. However, Safari still has some very annoying rendering bugs (such as drawing stuff all over the screen in Gmail), but I can live with those until either Safari 1.3 is released (please?) or Tiger and Safari 2.0 grace my Macs.
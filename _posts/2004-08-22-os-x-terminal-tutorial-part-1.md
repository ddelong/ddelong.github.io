---
id: 75
title: 'OS X Terminal Tutorial: Part 1'
date: 2004-08-22T16:11:13+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2004/08/22/os-x-terminal-tutorial-part-1/
permalink: /weblog/2004/08/22/os-x-terminal-tutorial-part-1/
dsq_thread_id:
  - "64765603"
shorturl:
  - http://l.derik.us/19
categories:
  - Terminal Tips
---
I&#8217;m feeling particularly saucy today, so I thought I&#8217;d start in on a series of entries about how to do things with OS X&#8217;s Terminal application. This is the first lesson.

<!--more-->

### Terminal.app is not the only game in town

I&#8217;ll begin by telling users that although the application that Apple includes for command line access is probably the most commonly used (and my personal preference at the moment), it is not the only way to use it.

One can also download the freeware [iTerm](http://iterm.sourceforge.net/). For those of you that love tabbed interfaces (a la Mozilla or Safari), this may be for you. From what I&#8217;ve read, it also outputs text much faster than Apple&#8217;s Terminal.app. I personally had some trouble getting it to behave like I wanted and rather than fight with it, I decided to use Apple&#8217;s.

Another option is to use xterm within Apple&#8217;s X11 application. By default, it should show up when you start X11 (keep in mind, you may have to install X11). It&#8217;s also invoked in X11 by selecting Terminal from the Applications menu. You can also press command-n to open a new window of it. It doesn&#8217;t have scroll bars though, which may be a real hinderance.

Finally, thanks to X11, you have access to wide range of terminal applications developed for other versions of Unix. A Google search will yield a large number of alternatives.

### Navigating the File System

A good place to start when working in the Terminal is to explain the file system because everything in Unix is a file. That&#8217;s particularly important later.

First, we want to know where we are in the file system. To do this, we use the `pwd` (print working directory) command. Type `pwd` and press return. It should print `/Users/<em>yourusername</em>/` to the screen and present you with a fresh prompt. The prompt is the text presented where you enter the commands. By default, it should read _computername_:_yourcurrentlocation_ _yourusername_$ .

Wait a minute though, I just said `/Users/yourusername/` should be the current location. In you prompt it reads `~`. What is this tilde and what does it mean? That&#8217;s a symbol for your home directory. This is `/Users/<em>yourusername</em>/` on OS X. On many Unix systems, this is `/home/<em>yourusername</em>/` instead of the before mentioned path (location).

Knowing where you are is good, but it&#8217;s not everything. Now you&#8217;ll want to see the files and directories where you are. We use the `ls` (list) command. Windows users may know this command as `dir`. This will list the visible files in that directory. You should see your Documents folder as well as anything else in your home directory.

Next we&#8217;ll want to move into the Documents folder. For this we use the `cd` (change directory) command. Type `cd Documents` and press return. Your prompt should now indicate the change of directory and now read `~/Documents`. Use the `pwd` command. It should now read `/Users/<em>yourusername</em>/Documents/`. This is not the only way we could have gotten to this directory. Type `cd` and press return. This will always bring you back to your home directory. If you ever get lost, `cd` by itself will return you home. Now type `cd /Users/<em>yourusername</em>/Documents/`. It should be exactly as before. What does this mean?

### A Rose by Any Other Name

You&#8217;ve just met _relative_ and _absolute_ addressing. What does that mean exactly? Relative means you change your location based upon where you currently are. That is to say, you move relative to your current location. Absolute addressing is regardless of where you are and absolutely indicates the location. These addresses always start with `/` which indicates the root of your filesystem (which is your boot drive).

Let&#8217;s say one wants to get back to the home directory. We already know we can do this with the `cd` command. Instead, we&#8217;re going apply what you just learned. Go back to your home directory using absolute addressing. Try it and then read the next paragraph.

You should have typed `cd /Users/<em>yourusername</em>/` and your prompt should have the tilde. We have a special case for your home directory that allows for short hand. You can substitute the absolute path of your home directory by the tilde. Go back to the `Documents` folder (you can choose relative or absolute). How do you get back to your home directory using relative addressing? We have two more special symbols we can use: `"."` and `".."`.  `"."` refers to the current directory. `".."` refers to the parent directory. Type `cd ..` and press return. You should be back your home directory. Neat, eh?

That concludes this lesson. Post any questions into the comments.
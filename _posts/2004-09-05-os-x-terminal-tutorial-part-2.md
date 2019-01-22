---
id: 88
title: 'OS X Terminal Tutorial: Part 2'
date: 2004-09-05T22:41:54+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2004/09/05/os-x-terminal-tutorial-part-2/
permalink: /weblog/2004/09/05/os-x-terminal-tutorial-part-2/
dsq_thread_id:
  - "64765759"
shorturl:
  - http://l.derik.us/30
categories:
  - Terminal Tips
---
After an extended break, I'm adding a second installment into my Terminal Tutorial. This time I'll be going into the structure of Unix commands.

<!--more-->

### Doing Something with Files

Now that you know how to move around in the filesystem, you'll want to do something with files. For a simple example until I get to text editors, save the source of this web page to your home directory (you just want the HTML source, which is currently Safari's default and only option when you choose Save As). Alternatively, use your favorite text editor (BBEdit, TextEdit, SubEthaEdit, Smultron, etc.) and save a text file with some text in it to your home directory (refrain from using spaces in the file name for now).

Open up your terminal application. Navigate to your home directory if it's not your current working directory. Use the `ls` to list the contents of your home directory. Either the source of the page or your text file should be there. We're going to use the `cat` command now. Type `cat <em>filename</em>` where filename is the name of your file. You should see the text of that file be displayed.

What is this `cat` command do and what does it have to do with your kitty Fluffy? Well, it has nothing to do with fluffy. `Cat`, like all good Unix commands, is short for something. In this case, it stands for &#8220;concatenate and print files&#8221;. You can see this for yourself by typing `man cat` into the terminal. You'll see that under name what I've said is true. Now before the rest of what is output makes any sense, I'll have to introduce you to how Unix commands are formed. For now, press q to exit the man command. This will return you to the prompt.

### Some Structured Education

Unix commands are archaic, hard to understand, complicated, and for programmers only. Right? **Wrong!** Once you get to know them a little bit, they're not so bad. Unix commands are made up of several parts. Once you get them down, you'll start to understand the Unix commands you've dutifully pasted into the terminal window at someone's suggestion. You'll start using your own commands. You'll start to understand `man` pages. Amaze your friends!

The first part of a command is the program being executed. Some examples are `cat`, `ls`, etc. There are many built-in commands. For now, we'll just use the ones I've introduced. Next, we have what are called flags. Like those things we burn? No, no, not those flags. These flags are like preferences or options, they tell the command how to behave. For example, use the `ls` command. Now use `ls -l`. Suddenly, there's a lot more crap being displayed. What does it all mean? You don't care. Let's move on. The &#8220;l&#8221; after the dash is what you are interested in here. That's a flag. The dash is your clue that it is a flag. Characters after a dash are interpreted as a flag. Try `ls -al`. Note that more files are listed, including &#8220;.&#8221; and &#8220;..&#8221; which we encountered in the last lesson.

These flags tell the `ls` command to a couple things. The &#8220;a&#8221; tells `ls` to list **all** files. The &#8220;a&#8221; does stand for something! It's not just an obscure thing scientists know. Likewise, &#8220;l&#8221; stands for **long**. There is a way to look these up, but we'll leave that to the next section.

Next in a command, we have the arguments which can define a sub-command of the command or a file to act upon. In the `cat` command you just used, the filename was an argument. Sometimes arguments following a flag are used by the flag. How these arguments are used are defined by the command. For `cat`, it will list all the files that you list in a row. This usage is defined by the `man` pages.

### Meet the Man

`Man`, or manual, pages define the origins, functionality, and usage of commands. They're useful for figuring out what a command does and formulating your own commands.

Let's break it down a little. The first section is the Name, which generally tells you the name and a quick description of the command. Next we have the Synopsis which describes the general structure of the command. Things enclosed in brackets [] are optional. Almost all flags are optional. Sometimes arguments are optional as well. Ellipses indicate multiple arguments of a certain type (for example in cat).

This was a big chunk and not everyone who uses Unix properly understands how commands are set up (to them, Unix is like a cookbook). By understanding how these commands work, you have a leg up.
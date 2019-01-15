---
id: 633
title: My horribly incomplete backup plan
date: 2010-03-24T16:42:22+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/?p=633
permalink: /weblog/2010/03/24/my-horribly-incomplete-backup-plan/
dsq_thread_id:
  - "79137317"
shorturl:
  - http://l.derik.us/b
categories:
  - Macs
tags:
  - backup
  - crashplan
  - mac
  - timemachine
---
It&#8217;s been a long time since I took a hard look at my backup situation, but a series of blog posts in my reader has caused some naval gazing.

### A long time ago in a computer far far away

My backup plan was once dead simple. I used CCC or Super Duper to create a clone of my boot drive whenever I thought of it. Sometimes I was good and did it weekly, sometimes I went months without.

Thankfully I had no crashes during this period. I never had to experience the frustration of losing a month of data.

### Let&#8217;s do the time warp again

Time Machine! I was so excited when I finally got a drive to use with it. I turned it on and got frustrated any time it monopolized my I/O attempting to back up. Honestly I can&#8217;t tell you if specifically Snow Leopard fixed it, but I haven&#8217;t gone searching for the Time Machine menu to stop the backup for a long time.

I still did my Super Duper backups, but it became less of a priority because it wasn&#8217;t automated.

### Disaster

It finally happened. I lost my boot drive (which was under warranty thankfully). I could cool off the drive and get a few minutes of work, but not enough time to do a Super Duper backup and I/O just made it die faster. I was using my Super Duper drive to temporarily back someone else up.

Luckily, I had a Time Machine backup ready to go. That was almost not the case as just weeks before I finally replaced the power supply on my Time Machine disk (thank you OWC for quick diagnosis and replacement).

It was time to see if the machine would do its job.

### It just worked

Once I got my replacement boot drive, it was time to stick in the SL disk and try the restore. As you can already guess, it worked. I selected my Time Machine disk and initiated the restore.

Your mileage may vary, but Time Machine is now my preferred method for incremental and bulk backup. There are a few reasons why.

  1. I don&#8217;t have to do anything to keep it up to date. Seriously, no matter how many calendar reminders or OCD you are, backup plans fail when you need to do something on a schedule rather than the machine do it for you.
  2. It protects you from your own stupidity. Clones are great, but they won&#8217;t help you dig out a file you deleted three weeks ago unless you either didn&#8217;t backup since then (shame on you) or you keep a clone rotation large enough to have a backup old enough (expensive and impractical for most as well as having the problem of requiring lots or manual interaction).
  3. You can do a bulk restore easily despite it not being a bootable disk. Stick in your Mac OS X install DVD and you can do it with a few clicks.

### The moving target

Time Machine works great if you have a desktop or regularly connect your computer to a series of peripherals, but I haven&#8217;t chained a laptop down like that in years. Needless to say, the cloning plan I used on my MacBook wasn&#8217;t working for me.

I could in theory use a Time Capsule to use Time Machine for this situation. Problem 1 is that I&#8217;m cheap. Time Capsules are expensive. Problem 2 is that assuming I could get it accessible using Back to My Mac behind my FiOS router, it&#8217;s not really supported.

The solution was to use Crashplan. If you use their software to backup to another computer belonging to you or a friend, it&#8217;s free. I have a computer that&#8217;s on a lot with lots of storage and it&#8217;s own backup plan in place! I installed the software, told the Mac Pro to use a specific hard drive as the destination, and initiated backup from the MacBook.

Now anytime the two are on at the same time, the MacBook will back up to my Mac Pro regardless of local network or over the Internet proximity. Crashplan has fantastic in the background incremental backup. It meets the requirement of doing its work without me.

I only have it set up to back up my home directory, but I don&#8217;t store significant irreplaceable data anywhere else, so at worst I reinstall and then restore my home directory.

### The Achilles heel

As written (correctly) elsewhere, my backup plan is incomplete. One fire at my house would wipe it all out. More specifically, my plan doesn&#8217;t include offsite backup.

When I finally stop being cheap (can&#8217;t help it), I will probably sign up for Crashplan&#8217;s subscription service. I have two options for that.

  1. I purchase the single computer plan and backup only the Mac Pro. That actually covers both computers.
  2. I buy the family plan and set both computers to use it. The MacBook would still back up to the Mac Pro as well because assuming I connect it to my network, restoration would be much faster from the Mac Pro. It also lets anyone living with me back up their computers.

I&#8217;m not saying my plan is a blue print for everyone else. I am saying that you need to consider the profound importance of a backup strategy that requires no action on your part. The biggest risk in any backup plan is always you. Backups are for the improbable situation. The most probable unfortunate event is you failing to connect your backup drive and running your backup software. Take it out of the loop, or at the very least, make it a redundant bonus.
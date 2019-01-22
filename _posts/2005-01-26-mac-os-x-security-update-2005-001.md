---
id: 303
title: Mac OS X Security Update 2005-001
date: 2005-01-26T10:13:24+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/01/26/mac-os-x-security-update-2005-001/
permalink: /weblog/2005/01/26/mac-os-x-security-update-2005-001/
shorturl:
  - http://l.derik.us/7N
dsq_thread_id:
  - "64767634"
categories:
  - Macs
---
Apple has released the [2005-001 Security Update for Mac OS X](http://docs.info.apple.com/article.html?artnum=300770). This update fixes several important vulnerabilities.

### at Commands

The at commands (at, atrm, batch, atq, and atrun) allow a user to specify commands be run at a later time. That's not the inherint bad thing. Being able to schedule things on a whim without using cron is good because it's a one time deal. Want to run permissions repair in an hour while you're on lunch, but afraid you'll forget to initiate it later? Use the at command.

Anyway, the problem was that the commands scheduled with at didn't run with the initating user's permissions. For example, a malicious user can't delete your home directory because it's owned by you. The rm command will fail due to lack of permissions. Using the unpatched version of at, that malicious user could schedule that rm command and it would complete successfully. That's not good.

Thankfully, outside of server and large multi-user environments, this isn't a large concern. It first requires that a malicious person has successfully logged into your machine, which shouldn't happen unless you've given them an account.

### Colorsync

ICC (color) profiles that are malformed could run arbitrary code, which means that a program doing anything could be run and wreak havoc on your machine.

### libxml2 Library

Programs linking against this library could take advantage of some buffer overflow problems, again, allowing pretty much any code to be executed, resulting in complete compromise of the machine.

### Tracing Mail(.app)

This security problem is interesting. One of the RFC-822 required email headers is a unique identifier (GUUID). That ID is associated with the ethernet component of the computer. That means that your email messages could be traced back to your particular computer. This is naturally undesirable. That ID is now hashed and concatenated with a random number to complete obscure any data associating your computer with that piece of mail.

### PHP

The exploit that was used a little while ago to make a web worm (many websites suddenly had &#8220;you are pwned&#8221; web pages up instead of their regular content) was present in the default version of PHP included with OS X. They've updated it to [4.3.10](http://www.php.net/release_4_3_10.php).

### Safari

This isn't so much a technology exploit as a social engineering exploit. If pop-up window blocking isn't enabled, aribitrary web pages can display pop ups. They can also do it when in the background (in a different window or tab). If a web page opens up another actually trusted web page (say your bank's site or a e-commerce site), uses a timer while waiting in the background, and then pops up a window prompting for information while you're at the trusted site, you might mistakenly think it's from the trusted site and give out sensitive information. The real problem is that people will assume that the trusted site popped that window up without proof. They happily type out their social security number, mother's maiden name, login ID and password into the bank site. It's fixed anyway.
---
id: 375
title: Security Update 2005-003 Released
date: 2005-03-21T21:23:23+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/03/21/security-update-2005-003-released/
permalink: /weblog/2005/03/21/security-update-2005-003-released/
shorturl:
  - http://l.derik.us/3o
dsq_thread_id:
  - "64768305"
categories:
  - Macs
---
Apple has released yet another [security update](http://docs.info.apple.com/article.html?artnum=301061). Fire up Software Update.

Here&#8217;s what&#8217;s updated, followed by my explanation:

> **AFP Server**
    
> _Available for:_ Mac OS X v10.3.8, Mac OS X Server v10.3.8
    
> _CVE-ID:_ CAN-2005-0340
    
> _Impact:_ A specially crafted packet can cause a Denial of Service against the AFP Server.
    
> _Description:_ A specially crafted packet will terminate the operation of the AFP Server due to an incorrect memory reference.

Basically, if you use Apple File Sharing, someone can knock down the program serving the files. This is more of a pain in the ass than a security risk.

> **AFP Server**
    
> _Available for:_ Mac OS X v10.3.8, Mac OS X Server v10.3.8
    
> _CVE-ID:_ CAN-2005-0715
    
> _Impact:_ The contents of a Drop Box can be discovered.
    
> _Description:_ Fixes the checking of file permissions for access to Drop Boxes. Credit to John M. Glenn of San Francisco for reporting this issue.

This is slightly worse. Basically, a Drop Box is supposed to be a place where people give you files, but no one but you can see in. This problem let people see what was inside (which could be incriminating).

> **Bluetooth Setup Assistant**
    
> _Available for:_ Mac OS X 10.3.8, Mac OS X Server 10.3.8
    
> _CVE-ID:_ CAN-2005-0713
    
> _Impact:_ Local security bypass when using a Bluetooth input device.
    
> _Description:_ The Bluetooth Setup Assistant may be launched on systems without a keyboard or a preconfigured Bluetooth input device. In these cases, access to certain privileged functions has been disabled within the Bluetooth Setup Assistant.

This limits the amount of influence an entirely new Bluetooth device has. Otherwise it might do something malicious. I can&#8217;t say much more. This writeup is really vague.

> **Core Foundation** _Available for:_ Mac OS X v10.3.8, Mac OS X Server v10.3.8
    
> _CVE-ID:_ CAN-2005-0716
    
> _Impact:_ Buffer overflow via an environment variable.
    
> _Description:_ The incorrect handling of an environment variable within Core Foundation can result in a buffer overflow that may be used to execute arbitrary code. This issue has been addressed by correctly handling the environment variable. Credit to iDEFENSE and Adriano Lima of SeedSecurity.com for reporting this issue.

This is **bad**. Unix has data one can set called environment variables. They&#8217;re very commonly used by programmers. Basically, by formatting the data being inserted into one of these slots in a certain way will allow any program to run without restriction. That means a trojan could do anything.

> **Cyrus IMAP**
    
> _Available for:_ Mac OS X Server v10.3.8
    
> _CVE-ID:_ CAN-2004-1011, CAN-2004-1012, CAN-2004-1013, CAN-2004-1015, CAN-2004-1067
    
> _Impact:_ Multiple vulnerabilities in Cyrus IMAP, including remotely exploitable denial of service and buffer overflows.
    
> _Description:_ Cyrus IMAP is updated to version 2.2.12, which includes fixes for buffer overflows in fetchnews, backend, proxyd, and imapd. Further information is available from http://asg.web.cmu.edu/cyrus/download/imapd/changes.html.

This is for server only. Like the first entry, vulnerabilities could knock down the mail server program as well as grant a program full access.

> **Cyrus SASL**
    
> _Available for:_ Mac OS X v10.3.8, Mac OS X Server v10.3.8
    
> _CVE-ID:_ CAN-2002-1347, CAN-2004-0884
    
> _Impact:_ Multiple vulnerabilities in Cyrus SASL, including remote denial of service and possible remote code execution in applications that use this library.
    
> _Description:_ Cyrus SASL is updated to address several security holes caused by improper data validation, memory allocation, and data handling.

This has the same effect as the last one.

> **Folder permissions**
    
> _Available for:_ Mac OS X v10.3.8, Mac OS X Server v10.3.8
    
> _CVE-ID:_ CAN-2005-0712
    
> _Impact:_ World-writable permissions on several directories, allowing potential file race conditions or local privilege escalation.
    
> _Description:_ Secure folder permissions are applied to protect the installer&#8217;s receipt cache and system-level ColorSync profiles. Credit to Eric Hall of DarkArt Consulting Services, Michael Haller (info@cilly.com), and (root at addcom.de) for reporting this issue. 

Certain parts of the filesystem were left with permissions that allowed arbitrary data be written to them (which means a malicious program could be written out or tons of data that would be hard to track down).

> **Mailman**
    
> _Available for:_ Mac OS X Server v10.3.8
    
> _CVE-ID:_ CAN-2005-0202
    
> _Impact:_ Directory traversal issue in Mailman that could allow access to arbitrary files.
    
> _Description:_ Mailman is a software package that provides mailing list management. This update addresses an exposure in Mailman&#8217;s private archive handling that allowed remote access to arbitrary files on the system. Further information is available from http://www.gnu.org/software/mailman/security.html.

Server only again. This allowed remote people to access arbitrary parts of the system, reading your private data or writing in malicious programs.

> **Safari**
    
> _Available for:_ Mac OS X v10.3.8, Mac OS X Server v10.3.8
    
> _CVE-ID:_ CAN-2005-0234
    
> _Impact:_ Maliciously registered International Domain Names (IDN) can make URLs visually appear as legitimate sites.
    
> _Description:_ Support for Unicode characters within domain names (International Domain Name support) can allow maliciously registered domain names to visually appear as legitimate sites. Safari has been modified so that it consults a user-customizable list of scripts that are allowed to be displayed natively. Characters based on scripts that are not in the allowed list are displayed in their Punycode equivalent. The default list of allowed scripts does not include Roman look-alike scripts. Credit to Eric Johanson (ericj@shmoo.com) for reporting this issue to us. More information is available here.

This is by far the most visible fix for most users. Check out [the full writeup](http://www.shmoo.com/idn/) including an example. Basically, using special character combinations, one can make a domain name look identical to another, such as Paypal, or Amazon. This is incredibly bad because phishers could collect your usernames, passwords, and credit card numbers by fooling you into trusting the site. Now these special domain names look different. The fake &#8220;paypal.com&#8221; suddenly becomes &#8220;xn--pypal-4ve.com&#8221;. Whoa. Safari users need this update.
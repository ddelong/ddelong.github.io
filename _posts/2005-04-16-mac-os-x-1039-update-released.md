---
id: 396
title: Mac OS X 10.3.9 Update Released
date: 2005-04-16T14:29:32+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/04/16/mac-os-x-1039-update-released/
permalink: /weblog/2005/04/16/mac-os-x-1039-update-released/
dsq_thread_id:
  - "64768535"
shorturl:
  - http://l.derik.us/5M
categories:
  - Macs
---
[Apple](http://www.apple.com) has released the [10.3.9 update](http://docs.info.apple.com/article.html?artnum=300966) for Mac OS X.

Here are the changes.

> **Stickies**
> 
>   * Addresses an issue in which Stickies could unexpectedly quit when creating a new note.
>   * Addresses an issue in which new Stickies are invisible. 
>   * Stickies windows can now be minimized (an issue with Mac OS X 10.3.4 through 10.3.8).
> 
> **Safari**
> 
>   * Accessing certain websites, such as msnbc.com, mail.yahoo.com, ticketmaster.com, and others, no longer displays a &#8220;bad server response&#8221; alert that could occur in Safari.
>   * Addresses an issue in which &#8220;safe downloads&#8221; files are not automatically opened after downloading.
>   * SSL webpages (pages with URLs that start with &#8220;https://&#8221;) load faster in Safari.
>   * Adds some important Verisign root certificates to Safari, allowing you to connect to certain secure websites that you might not have been able to surf before.
>   * Adds other trusted root certificates to Safari, such as VISA and RSA.
> 
> **Finder**
> 
>   * Addresses an issue in which copied files could become fragmented (but still usable) when you copy more than one file at the same time in the Finder.
>   * Addresses a rare issue in which a file could become damaged when copying to a FAT16- or FAT32-formatted volume.
>   * Improves reliability when mounting (making available) a disk image that&#8217;s larger than 4.7 GB.
> 
> **More**
> 
>   * Addresses slow vertical tracking and intermittent trackpad behavior on PowerBook G4 12-inch 1.5GHz, 15-inch 1.67/1.5GHz, and 17-inch 1.67GHz computers.
>   * Adds an &#8220;Apple Internal 56k Modem (v.32)&#8221; modem choice that you can use if you have difficulty using Verizon&#8217;s Airfone Jet Connect service.
>   * Addresses an issue with Mac OS X 10.3.6 and later in which the Calculator window won&#8217;t appear if the Speak Button Pressed or Speak Total options are enabled.
>   * Fixes an issue at the login window, where clicking the small space just below the bottom user account picture would produce this alert:
>   * &#8220;Internal Error \*** -[NSCF Array objectAtIndex:]: index(-1) beyond bounds (X)&#8221; (where X is the number of user accounts shown).
>   * Addresses an issue in which the startup time in Mac OS X 10.3.6 through 10.3.8 may be extended if a large number of PostScript fonts are installed.
>   * If your PowerBook G4 sometimes wakes up with a kernel panic, installing this update may help.
>   * Addresses a data loss issue that could occur when syncing your iDisk at the same time that .Mac servers are experiencing heavy usage.
>   * Avoids a potential Mail issue if the application is running when Daylight Savings Time changes.
>   * Addresses some formatting issues that could occur when replying to HTML messages in Mail. 

The update is available in both [delta](http://docs.info.apple.com/article.html?artnum=300966) and [combo](http://docs.info.apple.com/article.html?artnum=300967) forms. The update from the notes seems like just another bugfix update.

It&#8217;s not though. I&#8217;m surprised that Apple&#8217;s notes don&#8217;t reflect the huge number of changes in Safari 1.3, which is part of the update. Luckily for us, Dave Hyatt has [delineated these changes](http://weblogs.mozillazine.org/hyatt/archives/2005_04.html#007962) for us.

> **Page Load Performance**
    
> Safari 1.3 loads pages overall 35% faster than 1.2 as measured by IBench. In addition to improving the overall page load, Safari 1.3 will display content sooner than 1.2 did, so that subresources don&#8217;t hold up the initial display of the page.
> 
> **JavaScript Performance**
    
> We have substantially improved the performance of the JavaScript engine in Safari. I encourage you to check out Safari 1.3 on this benchmark for example to see the improvement relative to 1.2.
> 
> **HTML Editing**
    
> Safari 1.3 supports HTML editing, both at the Objective-C WebKit API level and using contenteditable and designMode in a Web page. The new Mail app in Tiger uses WebKit for message composition. You can write apps that make use of WebKit&#8217;s editing technology and deploy them on Panther and Tiger.
> 
> **Compatibility and Security**
    
> Compatibility and security are our number one priority in WebCore, and Safari 1.3 has many important compatibility fixes. For example, percentage heights on blocks, tables and cells now work much better in Safari 1.3. min/max-width/height support has been added. More of the table-related CSS properties are now supported. DOM methods like getComputedStyle are now supported.
> 
> **The DOM Exposed**
    
> The entire level 2 DOM has been exposed a public API in Objective-C. This means various holes have been filled in Safari&#8217;s DOM level 2 support. In addition to exposing the DOM to Objective-C, the JS objects that wrap DOM objects can also be accessed from Objective-C, allowing you to examine and edit the JS objects themselves to inject properties onto them that can then be accessed from your Web page.
> 
> **XSLT**
    
> Safari 1.3 on Panther now supports XSLT. 10.3.9 includes libxslt, and Safari uses this excellent library to handle XSLT processing instructions it encounters in Web pages.
> 
> **Plugin Extensions**
    
> For those of you writing WebKit apps, a new Objective-C WebKit plugin API is supported that lets you put Cocoa widgetry into the Web page more easily. In addition enhancements to the Netscape Plugin API (made in conjunction with Mozilla Foundation) have been implemented for plugins that require cross-browser compatibility.

For the non-geeks among us, the most exciting parts are the huge performance increases and the new HTML editing API. The former is witnessed immediately by using Safari. The HTML editing won&#8217;t appear until applications start using it. Imagine blog editing software with this built-in. You can beautify your posts without knowing HTML. Sweet.
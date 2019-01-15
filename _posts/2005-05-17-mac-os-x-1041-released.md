---
id: 428
title: Mac OS X 10.4.1 Released
date: 2005-05-17T07:14:48+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/?p=428
permalink: /weblog/2005/05/17/mac-os-x-1041-released/
dsq_thread_id:
  - "64768842"
shorturl:
  - http://l.derik.us/8w
categories:
  - Macs
---
Apple has released Mac OS X 10.4.1, the first update to _Tiger_.

In addition to the improvements below, Apple has fixed the [Widget exploit](http://godlikenerd.com/weblog/2005/05/11/widget-panic/) that had so many panties in a twist. In fact, they implmented the fix exactly as I would have, by adding a confirmation dialog when downloading. <!--more-->

[Straight from Apple](http://docs.info.apple.com/article.html?artnum=301517), the improvements are:

#### Mail and Address Book

  * When typing immediately after clicking Reply in a Mail message, all characters typed before the Reply window appeared should now appear in the window.
  * In Mail, opening an attached Pages document could lead to an unexpected &#8220;Name of document may contain an application&#8221; alert&mdash;this update addresses the issue.
  * Sometimes Address Book subgroups (groups within groups) might not sync correctly during .Mac syncing&mdash;this update addresses the issue.
  * Addresses an issue in which Mail might unexpectedly quit after pasting a large graphic into a message and then typing text just before the graphic.
  * When deleting text in a Mail message window, sometimes some of the undeleted text could unexpectedly move to the beginning of the message&mdash;this update resolves the issue.
  * This update prevents a second unnecessary horizontal scroll bar from appearing in a Mail message.
  * Addresses an issue in Mail in which an entire line of text could be inadvertently deleted when deleting a link at the end of the line.
  * Resolves a potential issue in which Mail could unexpectedly quit, stop responding, or fail to import your previous emails if third-party software were installed in a ~/Library/Mail/Bundles or /Library/Mail/Bundles&mdash;this update prevents previously-installed plug-ins from loading. (Click here for more information.)
  * Updates Mail to handle IMAP prefix paths that start with &#8220;/&#8221; better.

#### Dashboard widgets

  * Improves Dashboard widget compatibility with third-party mice with scroll wheels, and also for PowerBook G4 computers that feature trackpad scrolling.
  * You can choose from three font sizes in the Dictionary widget after installing this update (regular, large, and extra-large)&mdash;click the &#8220;i&#8221; button to access the Font size pop-up menu.

#### .Mac, iSync, and syncing

  * Addresses an issue for .Mac syncing in which the alert &#8220;cannot login to the .Mac sync server&#8221; could unexpectedly appear when clicking the Sync tab in .Mac preferences.
  * You can now add a Motorola V180 mobile phone in iSync 2.0 with this update.
  * Improves iSync 2.0 compatibility for Motorola V551 mobile phones.
  * With this update, the default option for the first sync for a mobile phone added to [iSync](http://www.gomug.org/mac-isync-6) 2.0 is now &#8220;Merge data on computer and device,&#8221; though the &#8220;Erase data on device then sync&#8221; option is still available if you need it. (Click here for more information.)
  * This update allows you to register a computer for .Mac whose name (in Sharing preferences) contains an ampersand (&#8220;&&#8221;).

#### Safari, iLife, and other applications

  * With this update, Safari no longer unexpectedly quits when Control-clicking (or right-clicking with a multi-button mouse) some kinds of PDFs or graphics within a [Safari](http://www.gomug.org/how-do-i-make-safari-open-pages-in-a-new-tab-28) window.
  * Addresses an issue where iPhoto could unexpectedly quit.
  * iDVD no longer quits unexpectedly when hiding it while burning a DVD or saving a disc image. (Click here for more information.)
  * With this update, DVD Player no longer unexpectedly quits when opening if Turkish, Central European (Czech, Polish, Hungarian), Cyrillic (Russian, Bulgarian, Ukrainian), or Greek is the primary Mac OS X language in International preferences.
  * With some printers, when printing a PDF webpage file that had been saved from Safari (with the Safari printing option &#8220;Print webpage information in headers and footers&#8221; deselected), only a gray bar would print&mdash;this update addresses the issue.
  * This update addresses an issue in which text in a TextEdit document with lists could disappear (even though it really hadn&#8217;t). (Click here for more information.)
  * Addresses an issue in which iCal could unexpectedly quit after you receive an iCal invitation in Mail (and the invitation doesn&#8217;t appear in iCal).
  * Improves compatibility for Dreamweaver MX 2004 when double-clicking results of an XML validation, and when using &#8220;Launch & Optimize&#8221; with Fireworks MX 2004.
  * Users who subscribed to iCal calendars with long names or special characters, and that were published under Mac OS X 10.3 before upgrading to Mac OS X 10.4, will now see changes made in calendars under Mac OS X 10.4 Tiger.
  * Includes reliability and compatibility improvements for Motion 2.0. (Click here for more information.)

#### Other enhancements

  * When using the [FileVault](http://www.gomug.org/how-to-use-filevault-32) secure erase feature, the progress window now states &#8220;Deleting old Home folder&#8221; when securely deleting files from their original location (instead of &#8220;Unmounting FileVault&#8221;). Note that this option may take a while to complete, during which you shouldn&#8217;t force-restart your Mac. (Click here for more information.)
  * Improves security by disallowing files, applications, and webpages from being opened at the password prompt that appears when waking from sleep or stopping a screen saver (which can be enabled in Security preferences).
  * Addresses issues that could, in certain situations, prevent you from opening (mounting) a disk image that&#8217;s shared by a different computer (in /Network).
  * Improves menu scrolling behavior for third-party mice with scroll wheels, and also for PowerBook G4 computers that feature trackpad scrolling.
  * Addresses an issue in which clicking a Help button or choosing an item from the Help menu would take you to the main page of the application&#8217;s Help content, instead of a more relevant page.
  * Some third-party wireless DHCP servers might not provide an IP address to a computer through AirPort if the computer has a long computer name&mdash;this update addresses the issue.
  * Resolves a potential issue that could occur when moving from one access point to another within the same wireless network&mdash;the IP address could have been lost and not restored unless the DHCP lease was renewed or the computer put to sleep and then awakened.
  * Improves reliability when using the Active Directory plug-in.
  * Improves the Mac OS X 10.4 Keyboard Setup Assistant.
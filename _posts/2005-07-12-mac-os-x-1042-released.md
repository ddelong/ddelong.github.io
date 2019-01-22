---
id: 476
title: Mac OS X 10.4.2 Released
date: 2005-07-12T18:55:34+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/?p=476
permalink: /weblog/2005/07/12/mac-os-x-1042-released/
dsq_thread_id:
  - "64769286"
shorturl:
  - http://l.derik.us/1M
categories:
  - Macs
---
I've already updated all the Macs in the house with no ill effects. The most visual difference is the addition of a Widget Manager (for those afraid to fiddle around in their Library/Widgets folder).

Apple has posted [a knowledge-base article (#301722)](http://docs.info.apple.com/article.html?artnum=301722), as well as a [delta updater](http://www.apple.com/support/downloads/macosxupdate1042.html) and a [combo updater](http://www.apple.com/support/downloads/macosxupdate1042combo.html). The changes as described by Apple, are as follows.

The update mentions improved Safari scroll speed, so I expected that it was a recent WebKit build (with Acid2 test compatibility). Unfortunately, it seems that this hasn't gone mainstream yet, so reliance on NightShift, SafariOnAcid, or your own builds will have to continue. <!--more-->

### AirPort

  * With this update, logging out of Mac OS X automatically disconnects the computer from an AirPort network if it is using WPA Enterprise security settings (this does not affect WPA Personal WEP-secured networks).
  * The AirPort menu extra displays more information when you enable a Software Access Point with this update installed.
  * Adds support for AES encryption of WPA-PSK networks, which are supported by many wireless access points.
  * The Try Again button behaves as expected when attempting to join a third-party, WEP-enabled wireless access point with this update.
  * Improves reliability when associating with wireless networks after waking from sleep.
  * Improves WPA2 wireless encryption support for AirPort Extreme cards.

### Mail

  * In Mail, if you retrieve and sort IMAP mail using multiple email clients, the counts of unread IMAP messages in mailboxes other than what's in your Inbox are more accurate with this update.
  * Addresses an issue in which IMAP messages deleted in Mail could unexpectedly &#8220;reappear&#8221; after a few seconds.
  * In some situations, a Mail message's attached graphic displayed as a small blue box with a question mark inside the message window, even though the attached file was just fine; this update addresses the issue.
  * Mail no longer tries to print an HTML message's remote images if the &#8220;Display remote images in HTML messages&#8221; option is deselected&mdash;the message is printed without the graphics instead&mdash;after this update is installed.
  * This update addresses an issue for Mail in which signatures with graphics were not appearing as expected.

### iChat

  * With this update, you can successfully send and receive AIM messages using iChat after changing network locations (without having to log out and back in)&mdash;from wireless to Ethernet, for example.
  * If iChat is logged in to your AIM account in Mac OS X 10.4 or 10.4.1, logging in to the same account on a different computer disconnects the Tiger computer without warning&mdash;this update adds a preference choice to iChat to avoid this, if desired.
  * iChat no longer states that the network is unavailable if you intentionally disconnect from the Internet using Internet Connect without first quitting iChat.
  * Improves video framerate for iChat when certain kinds of background processes or applications are running.
  * Resolves a situation in which iChat could incorrectly report &#8220;insufficient bandwidth to maintain conference,&#8221; even though enough bandwidth was available.

### Finder

  * Addresses an issue in which the Finder could unexpectedly quit if Show Package Contents was chosen several times from the shortcut menu for the same package.
  * The Finder slideshow feature should now always work as expected.
  * If ACLs were enabled on an SMB volume, a Get Info window in the Finder wouldn't show the Details section when getting info on files stored on the volume&mdash;this update addresses the issue.
  * Addresses an issue in which a supported burning device could unexpectedly be seen as &#8220;unsupported&#8221; by the Finder.
  * The duration of MP3 files is accurately reported in Get Info windows in the Finder with this update.

### Other applications

  * With this update, many applications, including Safari, work better with proxy servers that require authentication.
  * With this update, you can use Safari to log in to MyAccount on cingular.com.
  * Safari pages scroll better with this update when scrolling with a scroll wheel (such as one on a third-party mouse or keyboard).
  * Orange iCal calendars, with alarms that go off while iCal is not open, no longer change color after the alarm is snoozed.
  * Addresses an issue in which Stickies.app notes could disappear unexpectedly if Stickies opens automatically during login (if it was set as a Login Item in Accounts preferences).
  * Addresses an issue for Adobe Premiere 6.5 in which the application could unexpectedly quit when exporting a file.
  * With this update, the Reduce File Size option in Preview works as expected when saving a file as a PDF from the File menu.
  * Addresses a Keychain Scripting issue in which the &#8220;password&#8221; property of a key often could not be retrieved.

### iDisk, WebDAV

  * Improves .Mac iDisk syncing after changing network locations&mdash;an iDisk could incorrectly appear to be offline after switching networks, causing syncing to stop working.
  * With this update, you can access iDisk or other WebDAV servers through HTTP and HTTPS proxies.
  * HTTP/HTTPS proxy account and password settings defined in Network preferences are now used by the WebDAV file system as expected.
  * Addresses some issues that could occur when saving files directly to an iDisk.

### Networking

  * Addresses an issue in which some Apple internal modems would not dial, and the PPP log would include a message such as &#8220;Failed to open /dev/cu.modem: Resource busy&#8221;.
  * Adds improvements to Active Directory support.
  * Addresses an alert &#8220;Error code -8065&#8221; that could occur when copying a file through SMB to a Microsoft Windows-based PC volume a second time, if the file had previously been deleted from the PC.
  * Includes other enhancements related to connecting to and using Windows-based file servers (SMB/CIFS).
  * Allows Active Directory users with Mobile Accounts to authenticate without being connected to the Active Directory network.
  * Allows Active Directory users to log in after a restart.
  * Resolves an issue that prevented Active Directory users from accessing certain Kerberized services, such as ssh, on a Windows 2003 server.
  * Active Directory users can be given local admin privileges on a client computer, with this update.

### Other enhancements

  * Software Update no longer unexpectedly quits in certain situations after upgrading to Mac OS X 10.4 Tiger and changing Network Port settings, after installing this update. More&#8230;.
  * With this update installed, Disk Utility (and fsck) can better resolve &#8220;Overlapped Extent Allocation&#8221; issues that could appear when verifying or repairing a disk.
  * Xgrid can now map multiple input files using the inputFileMap key, and retrieve results from multitask jobs using the command line.
  * The Dashboard widget Unit Converter requires much less CPU usage after installing this update.
  * Improves performance for the web-based Power School student information system (http://www.apple.com/education/powerschool/).
  * Improves compatibility when using an HP Deskjet 5850 printer wirelessly.
  * Improves compatibility for HP LaserJet 1320 printers.
  * This update ensures that periodic background maintenance tasks as scheduled in launchd.conf.
  * Addresses an issue in which custom installations from a Mac OS X 10.4 Tiger Install disc that don't require starting up from the disc could cause Installer to stop responding (&#8220;hang&#8221;) for a couple of minutes if the destination volume was write-protected (eventually, a &#8220;There is not enough space for this item&#8221; message would appear).
  * External disks no longer unmount unexpectedly when switching users, if Fast User Switching is enabled.
  * Addresses an issue in which after performing a NetInstall or restoring Mac OS X from a disk image, you may see certain files and folders at the root level of the Mac OS X volume that are not supposed to be visible, such as etc, tmp, and var. More&#8230;.
  * With this update, the ttys file can be edited in Tiger; for example, if you're creating a login hook.
  * Addresses an issue in which the computer might wake from sleep with a black screen if it went to sleep while prompting you for a keychain password.
  * Allows users to log in with Kerberos authentication when using an edu.mit.Kerberos file.
  * These Automator actions are updated in this update: Add Files to Playlist, Add Songs to Playlist, Import Photos into iPhoto, New Mail Message, Run Shell Script.
  * The AppleScript &#8220;do shell script&#8221; command has been revised.
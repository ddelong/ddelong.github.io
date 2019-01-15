---
id: 541
title: Mac OS X 10.4.3 and a Long Overdue Powerbook/mac Overview
date: 2005-11-02T20:43:24+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/?p=541
permalink: /weblog/2005/11/02/mac-os-x-1043-and-a-long-overdue-powerbookmac-overview/
shorturl:
  - http://l.derik.us/5W
dsq_thread_id:
  - "64769867"
categories:
  - Macs
---
All right, so Apple released [Mac OS X 10.4.3](http://docs.info.apple.com/article.html?artnum=301984). There were a huge number of improvements. The most notable of which Safari passing the [Acid2 Test](http://www.webstandards.org/act/acid2/test.html) (even though this was attainable before the update by [using your own custom WebKit](http://godlikenerd.com/weblog/2005/07/09/roll-your-own-safari/)), homepage URLs in the Address Book are synchronized, iChat sessions over .Mac names can be encrypted, and Disk Utility can verify the boot volume.

We saw a new round of [Powerbooks](http://www.apple.com/powerbook/) that were pretty unexciting without a processor improvement. The screen resolutions were enhanced and DDR2 was added, but only for the 15&#8243; and 17&#8243; models. The 12&#8243; model was completely passed over. The message is clear, nothing big is coming in the Powerbooks until they go Intel.

The [Powermacs](http://www.apple.com/powermac/) got a boost with DDR2 RAM (which they can actually utilize). They also got dual core processors which only really benefit the high end model, the only one retaining two processors. However, the clock speed dropped to 2.5 GHz instead of 2.7 GHz processors. They were also outfitted with dual gigabit ethernet ports. AGP and PCI-X were dropped in favor of PCI Express. They also introduced a Quadro FX 4500 (be prepared to mortgage your home). <!--more-->

### Finder and Spotlight

  * Improves responsiveness during Spotlight searches in the Finder.
  * Spotlight comments entered in the Finder are now preserved when using iDisk syncing.
  * Get Info windows correctly display non-Roman language versions and copyright strings.
  * Improves the alert that appears when replacing an item during a copy when the capitalization of the items&#8217; names is the only difference.
  * Permissions for items inside packages are now correctly set when applying permission changes to enclosed items in the Finder Info window.
  * Items copied into a Drop Box have permissions set correctly.
  * Addresses an issue in which Spotlight cannot find a file after using iPhoto to rename it if the filename originally contained an ampersand (&).
  * The Spotlight image indexer now uses the &#8220;Software&#8221; TIFF property to support graphics rendering and image editing applications that use this property.

### Safari, Internet, and networking

  * Safari can now pass the &#8220;Acid2&#8221; test.
  * Improves compatibility of Safari with many webcams.
  * Improves the handling of Hebrew and Arabic text in Safari and Mail.
  * Improves compatibility for OpenGL-accelerated Macromedia Shockwave 3D webpage content when using Safari.
  * Addresses an issue in which an SMB volume might not mount again after it&#8217;s unmounted.
  * Addresses some issues in which the Finder might not be able to connect to an SMB volume.
  * Bluetooth Setup Assistant now lets you toggle the Modem menu extra on or off (you can also use System Preferences).
  * Resolves an issue in which Internet Connect wouldn&#8217;t connect to a dial-up ISP if the account password contained a double-quote (&#8220;) character.
  * Improves compatibility with Squid proxy servers. 

### Syncing

  * With this update, you no longer need to store Address Book contact URLs in the Notes field when syncing with .Mac.
  * Mac sync error alerts now provide a better description of the issue (for more details about a .Mac sync error, see the dotmacsync.log file).
  * Allows your Address Book contacts that are organized in subgroups to be synced to an iPod using iTunes.

### Mail

  * Addresses an issue in which Mail might prompt you to download items attached to an IMAP email message more than once.
  * In the Fonts & Colors preferences in Mail, you can now customize the font used in the list of Mailbox names.
  * Smart Mailboxes that use &#8220;Entire Message Contains&#8221; and another criteria with the &#8220;any&#8221; qualifier now work as expected.
  * Smart Groups of addresses can now be dragged from Address Book to a message&#8217;s To, Cc, or Bcc field.
  * The number of messages in a Smart Mailbox are now displayed in the title bar.
  * Pressing Tab while composing a Mail message now inserts a tab character, instead of four spaces.
  * Accounts created in Mail after installing this update will avoid an issue in which .Mac mail could not be sent if the Internet Service Provider blocks port 25.
  * Reduces the amount of blank lines Mail might insert into a message when forwarding or replying to it.
  * Addresses an issue in which some Mail rules could be lost or duplicated after a .Mac sync.
  * Addresses in the &#8220;To:&#8221;, &#8220;Cc:&#8221;, &#8220;Bcc:&#8221; fields, as well as the Accounts pop-up menu, no longer appear in red if the address is in a different lettercase than what is entered in the &#8220;Mark addresses not in the domain&#8221; field; for example, &#8220;Mac@MAC.Com&#8221; will no longer be marked in red if the &#8220;Mark addresses not in the domain&#8221; field contains &#8220;mac.com.&#8221;
  * Searches of &#8220;All Mailboxes&#8221; can now, optionally, include items from Junk and Trash.
  * Resolves an issue in which meeting requests sent from Microsoft Outlook to an Exchange account in Mail might not appear.

### iChat

  * iChat preferences now allow you to display emoticons (such as a smiley face) as text (such as &#8221; 🙂 &#8220;) instead of as a graphic.
  * Resolves an issue in Activity Monitor in which you might see &#8220;iChatAgent (Not Responding)&#8221; in red text, even though iChat works just fine.
  * Addresses a &#8220;No data has been received for the last 10 seconds&#8221; alert that could often appear when participating in a video chat in iChat with someone using AIM on a PC.
  * .Mac members can enable encrypted chat sessions after installing this update.
  * Further addresses potential causes of persistent &#8220;insufficient bandwidth&#8221; alerts.

### Other applications

  * Disk Utility can now verify your Mac OS X 10.4 startup volume if it is Mac OS X Extended (Journaled)-formatted.
  * Many improvements for Calculator are included, such as: A black triangle icon no longer appears below &#8220;Infinity.&#8221; Calculator now filters out unusable characters when pasting from the Clipboard, certain &#8220;rounding error&#8221; issues are addressed, and other issues.
  * Addresses an issue in which iCal could not publish or subscribe to a secure URL if your password contained a question mark (?).
  * Addresses an issue in which Preview might only print the first page of a multipage TIFF document.
  * Keychain Access searching is no longer case-sensitive after installing this update.
  * This update allows Keychain Access to directly import .pkcs12 files.
  * X11 windows no longer stay in the background after selecting the X11 application from the Dock or with Application Switcher.

### Other

  * Software Update now lets you know when only ignored (hidden) updates are available for installation.
  * Addresses an issue in which incoming faxes are saved as &#8220;from unknown&#8221; PDF files.
  * Addresses an issue in which some Traditional Chinese input methods, such as Pinyin, limit the number of candidate characters presented in the candidate window.
  * Resolves an issue for Palm Desktop software in which the Command-Q keyboard shortcut would sometimes not quit the application unless it was pressed a second time.
  * Improves compatibility with Microsoft IntelliPoint mouse modifier clicking; that is, mouse buttons configured to act as a Control-click or Command-click, for example.
  * Improves window scrolling when dragging an item into a window that&#8217;s viewed as a list, where not all of the list is visible.
  * Improves compatibility with Microsoft Word and Excel 2004, addressing an issue in which the application could stop responding for several seconds.
  * Addresses an issue in which cases and/or specific user conversion dictionaries could be disabled after upgrading to Tiger.
  * Addresses performance issues affecting three AppleScript commands: do shell script, system info, and delay.
  * The Core Data framework has been updated to improve relationship management issues, resolve issues with data migration, improve Undo and Redo commands, and improve insertion performance.
  * Resolves a potential redraw issue in which an application window&#8217;s scroll bars could appear in the wrong place.
  * Allows Apple Wireless Keyboards to work in single-user mode.
  * Addresses an issue in which high ASCII characters in a password could lead to a blue screen at startup, or prevent log in.
  * MS-DOS-formatted volumes, including the iPod Shuffle, perform better and consistently mount (become available) in the Finder.
  * Improves results when printing to an optional envelope feeder on some printers.
  * Disables Quartz 2D Extreme&mdash;Quartz 2D Extreme is not a supported feature in Tiger, and re-enabling it may lead to video redraw issues or kernel panics.
  * Includes previous standalone security updates.
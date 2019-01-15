---
id: 509
title: D-Link DCM-202 and Firmware How-To
date: 2005-08-26T14:55:57+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/?p=509
permalink: /weblog/2005/08/26/d-link-dcm-202-and-firmware-how-to/
dsq_thread_id:
  - "64769339"
shorturl:
  - http://l.derik.us/a
categories:
  - Macs
  - Reviews
  - Technology
---
Because I&#8217;m a cheap bastard, I decided to buy my cable modem instead of rent or buy from Comcast.

### Review

It&#8217;s hard to review a cable modem really. Sites like CNet can do group comparisons, but I have neither the cash nor the time to do a full comparison like that. I can use it for a bit to see if I need to reset it and what kinds of speeds I can get.

In those two regards, this modem is excellent. I haven&#8217;t needed to reset the modem once. I&#8217;ve also been getting 800 KB/s downloads. That translates to 6.25 Mbps, which is actually a quarter of a Megabit greater than the service I&#8217;m supposedly getting. I&#8217;m happy with that.

I can recommend the [D-Link DCM-202](http://www.amazon.com/exec/obidos/ASIN/B0002JKGRQ/d00dism-20?creative=327641&camp=14573&link_code=as1) without reservation. Go get yours at Amazon.com.

### Updating the Firmware with a Mac

Most routers let anyone with a slightly modern web browser update the firmware using a web page form. It&#8217;s child&#8217;s play. The D-Link DCM-202 isn&#8217;t quite as easy. Fortunately, cable modems don&#8217;t need regular updates.

There is a single update aimed at Comcast users. Keep in mind that my modem was working just fine, but I&#8217;m an update junkie. I simply can&#8217;t leave well enough alone. Well, you can imagine my disappointment when I found out that D-Link only provided files to perform the update on a Windows machine. The update was three parts, the firmware file, the instructions, and a Windows update utility.

The thing is though, the Windows update utility is really just a TFTP server. What happens when you update is that you activate the TFTP client in the modem and tell it to download from a TFTP server (generally the one being run via the Windows utility they supply).

What few people know is that Mac OS X includes a built-in TFTP server. That&#8217;s right, with a stock OS X installation, you too can update this firmware. A few caveats before the instructions. If you are looking for someone to blame should something go wrong, don&#8217;t use these instructions. I can&#8217;t make any guarantees. You&#8217;ll also need to use the Terminal.

  1. **Download the latest relevant firmware update from D-Link.** You should see have three files when you&#8217;re done downloading and decompressing: the instructions, the firmware, and the Windows utility. Verify you have these three files. The name of the firmware at time of publication was _Hitr252.bin_.

  2. **Copy the firmware into the TFTP server directory.** To do this, use the following command in the Terminal and authorize when prompted for password. 
    
        sudo cp /path/to/Hitr252.bin /private/tftpboot/
        

  3. **Activate the TFTP server.** You&#8217;ll also probably want to disable any firewalls. Use the following command in the Terminal to start the TFTP server. 
    
        sudo launchctl load -w /System/Library/LaunchDaemons/tftp.plist
        

  4. **Configure your network settings.** You&#8217;ll need to visit Network in System Preferences. Go to the Ethernet configuration and set it to use 192.168.100.2 as the IP address and 255.255.255.0 as the subnet mask. Make sure you apply those settings.

  5. **Connect your Mac directly to the modem via an Ethernet cable.** You&#8217;ll probably also want to disconnect the coaxial cable from the cable modem.

  6. **Telnet into the cable modem.** You&#8217;ll need to use another Terminal command for this one.
    
        telnet 192.168.100.1 23
        

  7. **Log into the modem.** Use username **dlink** and password **dlink**.

  8. **Tell the modem to download the firmware from the TFTP server you&#8217;re running.** You&#8217;re going to type a command to the modem which you&#8217;ve connected through telnet to. 
    
        dload 192.168.100.2 Hitr252.bin
        

  9. **Wait until the modem resets and the cable light turns blinking amber.** The Ethernet light will also be dark.

 10. **Reset the modem using the pinhole in the back.** Hold down for 7 seconds.

 11. **Verify the firmware correctly updated.** Point your web browser at 192.168.100.1. Log in with username **admin** and password **hitron**. I think my username or password may have differed from these (I&#8217;m basing these instructions of the D-Link provided ones). Once you&#8217;re logged in, look for the firmware version. It should match what you uploaded.

You&#8217;re done! You just did the impossible by doing something that normally would require a PC. Enjoy the new firmware and the satisfaction of doing it yourself.

**Update:** [David](http://www.popcultureshack.com/) notes that he had to use different IP addresses than what I wrote. My bad. I&#8217;m correcting them.

> As a side note, I had to use &#8220;100&#8221; in the following steps rather than &#8220;0&#8221; (zero):
    
> **STEP 4:** 192.168.0.2&#8211;>192.168.100.2
    
> **STEP 6:** 192.168.0.1&#8211;>192.168.100.1
    
> **STEP 11:** 192.168.0.1&#8211;>192.168.100.1

He also confirmed the username and password. Thanks David!
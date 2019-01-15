---
id: 282
title: An Old Truncation Issue Lives On
date: 2005-01-04T13:23:57+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2005/01/04/an-old-truncation-issue-lives-on/
permalink: /weblog/2005/01/04/an-old-truncation-issue-lives-on/
shorturl:
  - http://l.derik.us/39
categories:
  - Macs
---
The stability and speed of Mac OS X 10.2 (Jaguar) built a strong userbase that continues to this day (even with 10.4 Tiger right around the corner). It haunts developers, keeping them from using neat tools like [Cocoa bindings](http://www.cocoadevcentral.com/articles/000080.php) which are present in Panther but not Jaguar. It also haunts its users with old issues that many of us have simply forgotten.

A poster in the Macworld forums recently posted that he mistyped his password and much to his surprise, it was accepted and login continued like normal. Disturbing, no? Even more troubling was that not all passwords were accepted either. This problem was a result of an old authentication mechanism, which used at maximum, 8 characters. But OS X (and more importantly, Keychain) supported longer passwords. The (rather half-assed) solution was to simply truncate the password for comparison. In other words, if my password was _areallylongpassword_, then only _areallyl_ was necessary for login. Additionally, input passwords were also truncated (therefore making this normally completely transparent for the user). That meant you could tack on extra chracters and it would be acceptable. So, all of the following would work:

  * areallyl
  * areallylongpassword
  * areallylippykid
  * areallyl1234

Your once long, strong password is weakened without your knowledge. Thankfully, [car1son](http://homepage.mac.com/car1son/) points out that Keychain uses the full password, so it won&#8217;t be unlocked automatically and that information is kept relatively safe. Panther fixed all this, but Apple never made a patch for Jaguar (which likely would require substantial changes). One can still make a pretty tough password with only 8 characters, so Jaguar users should do so if not already aware.
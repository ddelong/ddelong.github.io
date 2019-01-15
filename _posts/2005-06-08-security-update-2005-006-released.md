---
id: 445
title: Security Update 2005-006 Released
date: 2005-06-08T20:59:28+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/?p=445
permalink: /weblog/2005/06/08/security-update-2005-006-released/
dsq_thread_id:
  - "64769011"
shorturl:
  - http://l.derik.us/8m
categories:
  - Macs
---
Apple released [Security Update 2005-006](http://docs.info.apple.com/article.html?artnum=301742). I&#8217;m not going to do my breakdown this time as I&#8217;m pretty busy. However, Apple&#8217;s notes should be fairy self-explanatory. <!--more-->

  * **AFP Server**
  
    **CVE-ID:** CAN-2005-1721
  
    **Available for:** Mac OS X v10.4.1, Mac OS X Server v10.4.1
  
    **Impact:** A buffer overflow in support for legacy clients could permit the running of arbitrary code. **Description:** The Mac OS X AFP Server supports a number of legacy clients. A buffer overflow in support for one of these clients could permit arbitrary code to run. This update modifies the AFP Server to correct this buffer overflow. This issue does not affect systems prior to Mac OS X 10.4.

  * **AFP Server**
  
    **CVE-ID:** CAN-2005-1720
  
    **Available for:** Mac OS X v10.4.1, Mac OS X Server v10.4.1
  
    **Impact:** On an AFP Server that uses an ACL-enabled volume for storage, copying a file with POSIX-only permissions can leave an ACL attached.
  
    **Description:** When copying a local file to an AFP Server that is using an ACL-enabled volume for storage, a temporary ACL is attached to the remote object during the copy process. This ACL can be left behind if the file copy went into a directory that was not using ACLs. The ACL that is left behind could cause confusion, as it will override the POSIX file permissions for the file owner. The ACL does not permit other users to access the file. This update modifies the AFP Server so that it correctly removes the ACL that is used for copying the file. This issue does not affect systems prior to Mac OS X 10.4.

  * **Bluetooth**
  
    **CVE-ID:** CAN-2005-1333
  
    **Available for:** Mac OS X v10.4.1, Mac OS X Server v10.4.1, Mac OS X v10.3.9, Mac OS X Server v10.3.9
  
    **Impact:** Directory traversal via Bluetooth object exchange
  
    **Description:** Due to insufficient input checking, the Bluetooth object exchange services could be used to access files outside of the default file exchange directory. This update provides an additional security improvement over the previous release by adding enhanced filtering for path-delimiting characters. Credit to kf_lists[at]digitalmunition[dot]com for reporting this issue.

  * **CoreGraphics**
  
    **CVE-ID:** CAN-2005-1722
  
    **Available for:** Mac OS X v10.4.1, Mac OS X Server v10.4.1
  
    **Impact:** Applications that use either PDFKit or CoreGraphics to render poorly-formed PDF documents could abort due to a NULL pointer dereference.
  
    **Description:** If a poorly-formed PDF document is passed to PDFKit or CoreGraphics for rendering, the rending engine will detect an error and stop processing. As part of the cleanup process, a check for a NULL pointer is omitted. This omission can cause an application that handles PDF documents to abort, requiring that the application be restarted. CoreGraphics is updated to correctly handle the cleanup of poorly-formed PDF documents. This issue does not affect systems prior to Mac OS X 10.4. Credit to Chris Evans for reporting this issue.

  * **CoreGraphics**
  
    **CVE-ID:** CAN-2005-1726
  
    **Available for:** Mac OS X v10.4.1, Mac OS X Server v10.4.1
  
    **Impact:** Console users can gain root privileges.
  
    **Description:** The CoreGraphics Window Server is updated to disallow unprivileged users from launching commands into root sessions. This issue does not affect systems prior to Mac OS X v10.4.

  * **Folder Permissions**
  
    **CVE-ID:** CAN-2005-1727
  
    **Available for:** Mac OS X v10.4.1, Mac OS X Server v10.4.1
  
    **Impact:** Potential file race condition via world- and group-writable permissions on two directories.
  
    **Description:** Secure folder permissions are applied to protect the system&#8217;s cache folder and Dashboard system widgets. This exposure does not exist in systems prior to Mac OS X v10.4. Credit to Michael Haller at info@cilly.com for reporting this issue.

  * **launchd**
  
    **CVE-ID:** CAN-2005-1725
  
    **Available for:** Mac OS X v10.4.1, Mac OS X Server v10.4.1
  
    **Impact:** The setuid program launchd can allow local privilege escalation.
  
    **Description:** A vulnerability in launchd allows local users to gain ownership of arbitrary files. The launchd command is updated to safely change ownership of files. Credit to Neil Archibald of Suresec LTD for reporting this issue. This issue does not affect systems prior to Mac OS X v10.4.

  * **LaunchServices**
  
    **CVE-ID:** CAN-2005-1723
  
    **Available for:** Mac OS X v10.4.1, Mac OS X Server v10.4.1
  
    **Impact:** File extensions and mime types marked as unsafe but not mapped to an Apple UTI could bypass download safety checks.
  
    **Description:** Mac OS X 10.4 contains a database of known unsafe file extensions and mime types. If an addition to the unsafe types database was made without a corresponding Apple UTI (Uniform Type Identifier), then a query on certain forms of the file extension or mime type would not be marked as unsafe. All entries in the current unsafe type database are mapped to an Apple UTI. This update corrects the query code to correctly identify unsafe file extensions and mime types regardless of the presence of an Apple UTI. This issue does not affect systems prior to Mac OS X 10.4.

  * **MCX Client**
  
    **CVE-ID:** CAN-2005-1728
  
    **Available for:** Mac OS X v10.4.1, Mac OS X Server v10.4.1
  
    **Impact:** Portable Home Directory credentials may be available to local system users.
  
    **Description:** MCX Client is updated to not log portable home directory mounting credentials. This issue does not affect systems prior to Mac OS X v10.4.

  * **NFS**
  
    **CVE-ID:** CAN-2005-1724
  
    **Available for:** Mac OS X v10.4.1, Mac OS X Server v10.4.1
  
    **Impact:** An NFS export that&#8217;s restricted using -network and -mask flags will export to &#8220;everyone.&#8221;
  
    **Description:** The use of -network and -mask on a filesystem listed in the NFS exports file would result in that filesystem being exported to &#8220;everyone.&#8221; This update modifies the NFS exporting code to correctly set the network and mask parameters. This issue does not affect systems prior to Mac OS X 10.4.

  * **PHP**
  
    **CVE-ID:** CAN-2005-0524, CAN-2005-0525, CAN-2005-1042, CAN-2005-1043
  
    **Available for:** Mac OS X v10.4.1, Mac OS X Server v10.4.1, Mac OS X v10.3.9, Mac OS X Server v10.3.9
  
    **Impact:** Multiple vulnerabilities in PHP, including remote denial of service and execution of arbitrary code.
  
    **Description:** PHP is updated to version 4.3.11 to address several issues. The PHP release announcement for version 4.3.11 is located at <http://www.php.net/release_4_3_11.php>.

  * **VPN**
  
    **CVE-ID:** CAN-2005-1343
  
    **Available for:** Mac OS X v10.4.1, Mac OS X Server v10.4.1
  
    **Impact:** A local user can obtain root privileges if the system is being used as a VPN server.
  
    **Description:** A buffer overflow in &#8220;vpnd&#8221; could be used by a local user to obtain root privileges if the system is configured as a VPN server. This issue does not occur on systems that are configured as a VPN client. This issue cannot be exploited remotely. This update prevents the buffer overflow from occurring. This issue was fixed for Mac OS X v10.3.9 via Security Update 2005-005. Credit to Pieter de Boer of the master SNB at the Universiteit van Amsterdam (UvA) for reporting this issue.
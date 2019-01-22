---
id: 463
title: iTunes RSS 2.0 Podcasting Namespace Additions
date: 2005-06-29T12:12:21+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/?p=463
permalink: /weblog/2005/06/29/itunes-rss-20-podcasting-namespace-additions/
dsq_thread_id:
  - "64769180"
shorturl:
  - http://l.derik.us/5z
categories:
  - Apple
---
Apple, as part of its new podcasting initiative, has added extra metadata for iTunes to use. Naturally, when you touch any existing &#8220;open&#8221; standard as a corporation, you get a shitstorm of criticism. That's not to say that sometimes it's not deserved, but a lot of the time resentment forces out more criticism than is necessary or real. [Dave Winer](http://www.reallysimplesyndication.com/2005/06/28#a682) and [Edd Dumbill](http://usefulinc.com/edd/blog/contents/2005/06/28-rss-apple-itunes/read) both had some beefs. I know, I know. It's a real shocker that Dave is pissed. Edd seems to be a little more balanced, but still misses some important points. <!--more-->

### Bingo

Here's what I agree with. Let's begin with Edd.

> First up, the namespace, http://www.itunes.com/DTDs/Podcast-1.0.dtd. Apparently DTD as a namespace, containing a version number in the name. Almost always a bad idea. Versioning and namespaces are a complex mix, and limiting future flexibility by changing the namespace with each revision can be a bad idea. Try resolving that URI, and you get redirected to an HTML page. **Verdict: poor.**
> 
> Let's look at something helpful now. The itunes:duration element is useful, carrying some much-needed extra metadata about audio content. **Verdict: good.**
> 
> There's an itunes:image element, for specifying imagery for the iTunes store. Reuse is less likely in this case, so a dedicated element makes total sense. **Verdict: good.**
> 
> A selection of elements cover textual description. We all know about RSS's description, but iTunes adds itunes:summary and itunes:subtitle. Both of these elements are mandated to be plain text. In most cases, it looks like summary should be the same as description. The egregious practice of including escaped HTML in description&#8211;which was meant to be a plaintext field&#8211;has meant this situation is just about unavoidable. I do worry that with title, description, summary and subtitle this is all getting rather too complex. **Verdict: okay.**
> 
> Some miscellaneous observations. iTunes wants RSS feeds in UTF-8. **Verdict: good.** Aside from itunes:summary, &#8220;all fields will be truncated to 255 characters&#8221;. **Verdict: daft.**
> 
> I'd like to provide more detail, but on clicking the &#8220;Learn more&#8221; link on Apple's podcasting page results in a blank page on my Firefox, with an error &#8220;itmss is not a registered protocol&#8221;. **Verdict: gob-smackingly ignorant.**

And from Dave.

> 5. Further, I think it's kind of a bad idea to use a trademark in the name of a namespace. I think Apple may regret doing this. Also their competitors, already objecting to the use of &#8220;pod&#8221; in the name of the category, may further object to supporting information with a trademark of a competitor as its name.

I'll give Dave the fact that Apple using the word &#8220;itunes&#8221; for something that's likely to be used by other things isn't quite right. In their defense, if they used a more generic term, pundits (and Dave) would be jumping down their throats for being presumptuous. Classic rock and a hard place. At the same time, waiting forever while people hashed out what should be in it wasn't an option for Apple.

### Hold Up

Here's all the complaints. They're largely repetitious and I apologize for that, but I didn't write it. First Edd.

> Next up, there's a bunch of replicated Dublin Core type metadata, all in the iTunes namespace: owner, name, email, author, keywords. It would have been nice if existing conventions for dc:publisher, dc:creator etc. could have been re-used. That way RSS feeds won't get cluttered with multiple redundant elements. Nevertheless, I can see why iTunes might want all this stuff completely disambiguated. They don't imagine finding RSS in the wild and adding it to the iTunes store, instead they expect people to create RSS with the express purpose of lodging it with iTunes. **Verdict: so-so.**
> 
> Categorisation within the iTunes store is handled by the itunes:category element. You have to see this markup to believe it:
> 
>        <itunes:category text="Technology">
>        <itunes:category text="Gadgets" />
>        </itunes:category>
>     
> 
> Add to that a prose restriction that categories can only be nested to two levels and I'm left scratching my head. It also stands out as just about the only attribute-carried text content within RSS. **Verdict: nuts.**
> 
> The remaining elements are used to control content restrictions within iTunes. The itunes:explicit element is meant to be included if your content is &#8220;explicit&#8221;. Okay&#8230; And itunes:block can be used to block a podcast from appearing in the iTunes store. These elements seem vague, underspecified and certainly open to abuse. **Verdict: poor.**

Now Dave.

> 1. Their category element is a duplicate of the existing RSS 2.0 category element, although more verbose. I love the part where they say it's okay to duplicate information, in other words we're funky and we know it. I suggest ignoring the itunes:category element, their software seems to work fine without it (Morning Coffee Notes is listed, apparently, we don't have any of their extensions, nor do I expect to add them any time soon).
> 
> 2. Same with author. RSS 2.0 has an item-level author element. They don't say why they reinvented this, giving theirs (again) the same name as the core element, indicating that they probably knew it was there. (The RSS 2.0 element is a mail address, but a person's name is easily included in a mail address.)

Basically, most of the repetition is ironically enough, complaining about the repetition the namespace addition introduces. However, this entirely misses the point. The reason for the replication is that the posting person may not be the author of the enclosure. That bears repeating. **The posting person may not be the author of the enclosure.** Imagine if you will, a podcast that consists of a person posting new songs from a variety of people. The poster didn't make those songs. The creator of those songs didn't post it either. The failure here is that the enclosure needs its own metadata, independent of the post. That idea must be recognized. Apple did.

The categories are a slightly different issue. It's true that RSS already supplies a way to specify arbitrary categorization (with hierarchies). Apple is avoiding this so it can enforce a category depth of two. If it gets any deeper, it becomes hard to navigate for most users (which was the main reason people stopped using's Yahoo's directory).

Finally, the explicit and block tags are good to have. The explicit tag isn't all that vague and at the very least, it gives the iTunes moderation staff a heads up. The block tag isn't vague at all and allows artists to keep out of the iTunes directory if they don't want to be in it. Nothing wrong with that.

### Ego the Giant

Naturally, as with anything Dave Winer writes, his ego gets in the way.

> I suggest ignoring the itunes:category element, their software seems to work fine without it (Morning Coffee Notes is listed, apparently, we don't have any of their extensions, nor do I expect to add them any time soon).

Dave seems to be suffering from a disease that Steve Jobs has been reported to have, the deadly NIH. Not Invented Here syndrome is the entire reason that Dave doesn't want to use the new tags. Nevermind that it's helpful and trivial to do, Dave is raising the hairs on his back and growling. That's productive.

> It would have been _really smart_ to review this stuff with the community before releasing their software.

Let's clear something up here. By &#8220;the community&#8221; Dave means him. He refuses to be honest because he sounds like the blowhard he is if he does. The fact is that he's pissed that he got left out of the loop. He's the self-proclaimed father of RSS. How dare they not consult him for every move they make? Even if he did actually mean some kind of community, look at how RSS 2.0 turned out. It didn't include this stuff to begin with, and seeing as Dave doesn't see the distinction between post and enclosure metadata, it would have been all watered down and broken. Don't even get me started on why pubDate being optional is totally lame.

> Come on Apple, we can do better.

Pointless chest beating. Does Dave want to goat Apple into some useless pissing contest, or does he realize that they won't waste the time to do so, letting him look like a big toughie taking on the big bad corporation?

### sigh

At any rate, the iTunes additions aren't perfect, but they add substantial functionality to an existing standard. What I don't see is constructive criticism or even an attempt to comprehend Apple's motivations, which is too bad.

**Follow-up:** Dave has finally [flown off the handle](http://archive.scripting.com/2005/06/30#morningCoffeeNotes) about not being acknowledged.
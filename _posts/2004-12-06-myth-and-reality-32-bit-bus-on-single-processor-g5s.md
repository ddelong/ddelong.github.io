---
id: 260
title: 'Myth and Reality: 32-bit Bus on Single Processor G5s'
date: 2004-12-06T12:10:00+00:00
author: Derik
layout: single
guid: http://godlikenerd.com/weblog/2004/12/06/myth-and-reality-32-bit-bus-on-single-processor-g5s/
permalink: /weblog/2004/12/06/myth-and-reality-32-bit-bus-on-single-processor-g5s/
dsq_thread_id:
  - "64767261"
shorturl:
  - Generating...
categories:
  - Macs
---
Sometimes a little bit of knowledge can be a dangerous thing. It gives someone the ability to make a bogus assertion about something while sounding somewhat authoritative. Even worse, it makes laypeople think the entirely wrong thing about a subject that has lots of subtlety. The nightly news does this every night, breaking complex issues down into sound bites.

The technology news is no better, saying things that are outright wrong in order to break it down for their readership. An example of this was the reporting on the latest G5 model, a single 1.8 GHz tower. [Macworld reported](http://www.macworld.com/2004/11/reviews/singlecpupowermac/index.php) that this model has a 32-bit bus instead of 64-bit like its brethren.

> Unlike its siblings in the current Power Mac family, the new model has only a single processor- a 1.8GHz G5. Its front-side bus &#8211; the channel connecting the CPU to the rest of the system &#8211; can handle only 32 bits of data at a time, and it operates at one-third the clock speed of the processor (600 MHz). By contrast, the current dual-processor Power Macs have 64-bit front-side buses running at half the processorâ€™s speed (900 MHz, 1 GHz, or 1.25 GHz).

Explanation of this concept is complete devoid in this article, letting readers draw some very inept conclusions. There is a lot of nuance here that is being overlooked. Further, coupling the different bus/clock cycle ratio with this fact is enough to suggest to some users that the bus being 64-bit is dependent somehow upon a certain ratio being maintained. That&#8217;s not true. I consider that fairly irresponsible. Let&#8217;s examine instead where this myth&#8217;s element of truth originates.

To begin, we will examine [Apple&#8217;s architecture page for the G5](http://www.apple.com/powermac/architecture.html). The most relevant section is below.

> Designed to harness the power of the PowerPC G5 processor, a 1.25GHz, 64-bit bidirectional Double Data Rate (DDR) front-side bus maximizes throughput between the processor and the system controller. And unlike most processor interfaces, which can carry data in only one direction at a time and waste precious time changing directions, the PowerPC G5 features two high-speed unidirectional 32-bit data paths &#8211; one flowing continuously into the processor and one flowing from the processor.

Note, each G5 processor has its own 64-bit front-side bus. The confusion settles in because of the nature of that bus. 32-bits are dedicated to going into the processor and 32-bits are dedicated into leaving the processor. A person sophisticated enough to recognize this distinction is now given some compelling information. Only 32-bits at a time can flow into the processor in any given cycle. We can now identify how the myth was created. It only stands to reason that because each G5 processor has its own front-side bus and each direction has 32 bits of bandwidth, that a dual processor G5 would have a 64-bit bus while a single processor machine would have a 32-bit bus. It sounds good, right?

It may _sound_ good, but it isn&#8217;t. In this case, we are making the wildly naive assumption that bus bit-width is defined by aggregation. We can see how absurd this is by a simple extension. If we have a 4 processor machine, we would have a 32 x 4 = 128 bit bus. Astonishing. If it has 8 processors, the bus would be 32 x 8 = 256 bit. Does that make any sense? No, it doesn&#8217;t. The original assumption is a bad one. Further, because of the math involved, less sophisticated users draw the conclusion that because 32 and 64 aren&#8217;t equal, that the single processor G5&#8217;s are hamstrung in some way (or &#8220;not really 64 bit&#8221; if you want to get even more extreme). This is a bad conclusion.

Further, we completely ignore the fact that the bus is still bi-directional with the ability to transport a total of 64 bits in any clock cycle. In order to reduce such a bus to 32 bit is assuming that we are interested in only a single direction. Which direction do we deem the important one and why? This is an important question that must be overlooked for the purposes of this conclusion. Again, in order to make the original conclusion, we would be forced to overlook this important aspect of the bus itself.

To get even more technical and exact about why bus bit-width aggregation is wrong, we need to get more into how a computer works. In order to take full advantage of this aggregated bit-width, our 64-bit chunk of data has to be split into two 32-bit chunks. Each chunk goes to a different processor. Their destinations must be different. This is important because it means that each piece of data has to be worked on independently. If our original data was a single 64-bit long integer, it has lost all meaning by being sent to two different processors. The only utility in this situation is if those two 32-bit pieces are not directly related and processing can be split into two independent activities. In other words, this is only an advantage if you have two separate processes to begin with. We only gain if we are taking advantage of the multi-processor nature of the machine. Dual processor G5&#8217;s are only better than single processor G5&#8217;s because of the fact that they have an extra processor. The bus is no more wide in practical terms.

One can make a case for the bus being inferior on this new G5 and the iMacs to the current dual processor G5&#8217;s by virtue of the fact that the operating ratio is 1/3 instead of 1/2, but not based on some silly claim that the bus is 32 bit instead of 64. To report and publicize such an absurd conclusion without showing the (weak) reasoning behind it is misleading and irresponsible. How can one expect his readers to appreciate the subtlety of this argument when one does not correctly grasp the fundamentals of the argument to begin with? It&#8217;s obvious that in order to draw this conclusion, the author knew enough about computers to grasp some things, but not nearly enough to make the statement he did. Further, giving this information digested (to the point where its origin could not be ascertained) causes the audience to make even worse conclusions.

To sum up:
  
**Myth:** Single processor G5&#8217;s have a 32-bit bus while dual processor G5&#8217;s have a 64-bit bus. Single G5&#8217;s aren&#8217;t really 64-bit.
  
**Reality:** The front-side bus for every G5 processor is identical, save for cycle ratio. Dual processor G5&#8217;s are no more 64-bit than single processor G5&#8217;s.
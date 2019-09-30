### Jets Application
### Overview
This program simulates controlling jets at an airbase.
### How to run
#### Installation
1. Copy the package and paste it into your own eclipse instance
2. Ensure the class and package names match
3. Click Run Java Application
#### Using the app
1. The jets from the text file are preloaded before the menu occurs
2. The main menu immediately starts and you have 9 options

### Technologies/topics used
1. Superclasses - Jets is superclass of 3 jet types
2. Abstract class - Use to allow subclasses to use their methods and not confuse with superclass, as well as not having to type @Override on subclasses since the superclass is Abstract
3. Polymorphism - Used to get info from superclass and instantiate them into the subclasses
4. Wrapper classes - Was used when getting doing jet create on the app from a text file.
5. Interfaces - Used interface of dogfight and loadcargo for their respective objects
6. Arraylist - Is how I stored the jets into the airbase, and get information about whats currently stored and removing and adding things to the storage. Cornerstone of this project was Arraylist.
7. Exceptions - Was used a few times, was not very helpful, this is something I understand but just can't seem to make it work as intended. My thoughts on exceptions is having the program not crash when someone types a String into something expecting and Integer.
8. Input/Output reader - buffered reader and filereader, to read the text file and extract the information to create jets from the text file.
9. Encapsulation - Making information private and extracting the information by using setters and getters, and from instanceof.
### Lessons learned
1. Debugging - I struggled with and tried to use is debugging, when trying to use it, I somehow deleted all my project folders, so I no longer have java1, java2, and jfop folders, all the packages are now in no folder. I believe it caused other errors with eclipse, this was a little setback trying to get things working properly again. Thankfully it did not delete my packages because looking back at previous work was helpful. I think if I could get it work as shown in class it would have been super helpful.
2. Abstract - I think not knowing how strong this makes classes, held me back a lot. I was struggling with buffered and filereader, being able to see the info but its not converting to planes in the app. It took me awhile to finally make the subclasses rather than trying to get jets from the abstract Jet.
3. Bufferedreader, filereader - I'm thinking about if I really need both of them or could I have saved some lines just using the one that does the work, anyways it took me awhile to get this to work since I was unfamiliar and I was dealing with an abstract. Feel like I still don't know much about this feature but somewhat confident in being able to extract information from text file and into the app now.
4. Foreach - That method seemed really useful, because arraylist is pretty much cornerstone to this project. If the purpose of this project was to become familar with foreach and arraylist, my feedback to the instructors is that I feel more confident than before by using those 2 things so many times in this project. I now use the shortcut rather than typing it out, I'm familiar with the for shortcut now too from revisting the for command.
5. I feel like there is a lot of vocabulary that was taught and used in this project, I need to study and familiarize myself with them so my readme's sound more like I know what is going on and really understanding what I'm being taught. Maybe getting a really good feeling of the vocabulary and meaning will help me write code better.
6. Having methods, lists, etc. in the proper place was a big deal too. If I recall correctly having the arraylist in the wrong area held me back for a long time as well as using the right variable in the readers. Also, I had a list or method inside the static method and using it in nonstatic method. Silly errors, that I will remember and not do them again, hopefully.

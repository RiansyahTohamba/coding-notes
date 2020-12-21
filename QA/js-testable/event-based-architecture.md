event-based-architecture

Using factories of various abstractions, façades, and other patterns is not the only way to decouple dependencies and isolate code. 

A more JavaScript-oriented approach involves the use of events. 

The functional nature of JavaScript makes it an ideal language for event-based programming. 

# The Benefits of Event-Based Programming
The Benefits of Event-Based Programming At their core, all applications revolve around message passing. 

Tight coupling can occur because the code needs to have a reference to another object so that it can send the object a message and perhaps receive a reply. 

These objects are global, passed in, or injected via a function parameter, or they are instantiated locally. 

Our use of factories in the preceding chapter enabled us to pry away the local instantiation requirement; however, we still need the object to be available locally in order to pass messages to it, which means we still must deal with global or injected dependencies. 

Global dependencies are dangerous: any part of the system can touch them, making bugs very difficult to track down; we can accidentally change them if we have a variable by the same or a similar name declared locally; and they cause data encapsulation to break since they are available everywhere, making debugging very difficult. 

JavaScript makes declaration and use of global variables very easy, and the environment typically provides several global variables (e.g., the window object in the global scope), as well as global functions and objects (e.g., the YUI object, or $ from jQuery). 

This means we must be careful to not just dump variables into the global scope, as there already are a lot of them there.

If we want to neither instantiate objects locally nor put them in the global namespace, we are left with injection. 

Injection is not a panacea, though, as we now must have setter functions and/or update constructors to handle injection, and more importantly, we now must deal with the care and feeding of either factories or a dependency injection framework. 

This is boilerplate code that must be maintained and managed and is code that is not specific to our application. 

To recap, the problem with dependencies arises because we need to interact with other pieces of code that may be internal or external to our application. 

We may need to pass parameters to this other code. We may expect a result from this other code. This code may take a long time to run or return. We may want to wait for this code to finish and return before continuing, or keep plowing ahead while it churns away. Typically, this is all accomplished by holding direct references to other objects. We have these references; we shake them up by calling methods or setting properties, and then get the results.

But event-based programming provides an alternative way to pass messages to objects.
By itself, the use of events is not much different from calling a method with a level of indirection through an event-handling framework. You still need to have a local reference to the object to throw an event to it, or to listen for events coming from it. 

Interestingly, the JavaScript language has no formal support for events and callbacks; historically, the language has only provided functions as first-class objects. 

This allowed JavaScript to ditch the interface-based model of Java event listeners wherein everything must be an object, leading to some very clunky syntax. 

The event model provided by the DOM in browsers brought event-based JavaScript programming to the core, followed by the Node.js approach of asynchronous programming utilizing callbacks extensively. 

Event-based programming all boils down to two primary pieces: the call and the return. 

It transforms the call into a parameterized thrown event and the return into a parameterized callback. The magic occurs when the requirement for a local reference to make these calls and returns is abstracted away, allowing us to interact with other code without having to have a local reference to it.

# The event hub

# Recap
Event-based architectures are not a panacea. However, their high modularity, loose coupling, small dependency count, and high reusability provide an excellent basis upon which to create testable JavaScript. 

By taking away a large swath of boilerplate code, event hubs let you focus on the 15% of the application’s code that makes your project unique. The sample event hub implementation has a very small code size, built upon the excellent socket.io library. 

The crux of the event hub code itself consists of fewer than 20 lines. The YUI3, jQuery, and Node.js clients are also vanishingly small. Given the functionality, testability, maintainability, and scalability provided, it is a no-brainer to actively investigate and prove how easy and natural using an event hub can be, instead of locally instantiating objects.

The MVC paradigm is actually enhanced using events. 

The controller and views are kept separate from the models and themselves. 

Models are passed around as event data and the logic is encapsulated into independent services. 

Views are notified via events of changes. 

The controller is merely the event hub itself. 

The essence of MVC, separation of concerns, is made more explicit.

Event-based architectures enable the Software as a Service model, whereby small, independent bits of functionality are added and removed dynamically as needed, providing services to the application.

Deploying event-based applications is much easier using an event switch. It allows in‐
dividual modules to be shut down and new ones started without losing any events. This
allows your application to be deployed in piecemeal fashion instead of all at once. Instead
of a Big Bang when upgrading, you can upgrade individual modules in isolation, al‐
lowing your code and processes to be much more agile.
Testing the already isolated modules is also much more straightforward, and depend‐
ency and fan-out counts are greatly reduced. Give an event-based architecture a whirl today!
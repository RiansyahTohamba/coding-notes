# Why need electron?

When you’re writing applications for a web browser, you have to be conservative in 
1. what technologies you choose to use ? and 
2. cautious in how you write your code. 

This is because—unlike many server-side situations—you’re writing code that will be executed on someone else’s computer.


Your users could be using  
1. the latest version of a modern browser such as : Chrome or Firefox, or 
2. they could be using an outdated version of Internet Explorer. 

You have little to no say in where your code is being rendered and executed. 
You have to be ready for anything !.

You typically must write code for the lowest common denominator of features that have the widest support across all versions of all browsers in use today. 


# Improving skill for desktop app

JS user pasti web dev, tapi sekarang ada tuntutan untuk membuat desktop app.
Jika kita mau buat desktop application dengan target Windows, macOS, and Linux maka harus belajar at least 3 bahasa dan framework.

# Access to native operating system APIs
Electron applications are similar to any other desktop application. They live in the
filesystem with the rest of your native applications. 
They sit in 
1. the dock in macOS or 
2. taskbar in Windows and Linux where all the other native applications hang out. 

Electron applications can trigger native Open and Save File dialog boxes. These dialog boxes can be configured to allow the operating system to select only files with a particular file extension, whole directories, or multiple files at the same time. 
You can drag files onto your Electron applications and trigger different actions.

Additionally, Electron applications can set custom application menus like any other application. 

They can create custom context menus that spring into action when the user right-clicks from within the application. 
You can use Chromium’s notification API to trigger system-level notifications. 
They can read from the system clipboard and write text, images, and other media to it as well.

Electron = Chromium (UI/UX) + V8(untuk akses API OS)

V8 untuk generate report (xls,pdf ETC)

kita tidak bisa generate report dari html 
instead kita harus melemparnya ke server terlebih dahulu
lalu server (dengan library OS nya) menggenerate file untuk kita. 

example-vscode.md



# content
This PR fixes #62783
This PR implements the API proposal here: #139225

PR ini menyelesaikan issue/proposal apa?
Bagaimana caramu memastikan bahwa kode ini sudah betul?


I largely followed the existing patterns for how the TreeView and WebView processes state changes through the extension host into the main application. I do have a few questions of the details of what I did, which I've added as PR comments.

I have only tested this manually, by modifying the TreeView and WebviewView sample extensions to provide badges, and running them in my own local build. It works as expected. I am not sure what the expectations are for writing automated tests for something like this, please let me know where I should add tests to a particular test suite.


# Anything you want reviewers to scrutinize.
I did notice one thing while working on this, which I think is worth discussing: in the WebView View badge case, I am not sure how badges can be provided after extension activation. Webview Views specify a badge through WebviewView.badge, but you can only reference a WebViewView once it has been created (ie, once the user has opened up the Webview View, and WebviewViewProvider.resolveWebviewView has been called). I'm wondering if this is insufficient though: imagine a TODO extension, like https://github.com/Gruntfuggly/todo-tree (they are one extension that wants to use this API). If I used such an extension, I would expect that the badge would show up on the activation bar showing that I have TODOs as soon as I open up the workspace, even if I haven't yet opened up that extension's Webview View.

This is not a problem for TreeView badges, because an extension can call createTreeView to force the TreeView to be created when the extension is activated, and can provide badges at that point.
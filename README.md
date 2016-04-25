# Scala Project for testing ENSIME Atom

This is a simple and standard Scala sbt project.
It should work just fine with ENSIME Atom.

## Before you try this...

You'll need:

- Java installed 
- [sbt installed](http://www.scala-sbt.org/download.html)
- Atom installed
- ENSIME Atom package installed inside Atom: Se the [_Inside Atom_ instruction](http://ensime.github.io/editors/atom/installation/)

## How to use this example

1. clone this project (or download it)

2. inside the folder run: `sbt gen-ensime`.  This will create a file called `.ensime`

3. open the folder in Atom (e.g., `atom .`)

4. start ENSIME by selecting View / Toggle Command Pallet and then type "Ensime" and select "Ensime: start". First time you run this, ENSIME will download which may take a few seconds.

Eventually you'll see "Ensime connected!"

Open the `src/main/scala/Example.scala` file in Atom, and you should have all the features available to you.

For example...

- if you mouse over `y` on line 5, a popup will tell you the type of `y`: `Option[Int]`. Or try the `n` on the same line. You'll be told it is of type `Int`.

(For Mac Users the Toggle Command Pallet short cut is CMD-ALT-P, which is what I'll say from now on [@d6y: I sometimes get "Scopes and Cursor" info, rather than the command pallet with this keyboard combination])

- put your cursor inside `Some` on line 3, then select CMD-ALT-P "Ensime: Go To Definition" and you'll be taken to the source for `Some`

- With your cursor back inside `Some`, select CMD-ALT-P and pick "Ensime: Go To Doc" to open a browser with the source documentation [@d6y: I currently get undefined for the port in the URL]

- In _Example.scala_, bring up the command pallet and select "Ensime: Public Symbol Search". A type-in area will appear to allow you to search for classes. For example, type "DTF" and you can select "DateTimeForamtter"

- Make a mistake in _Example.scala_.  For example, type the word `wibble` on line 5.  You'll see an error popup.  Remove the word to fix the error.

- On line 6 type `y.` and press CTRL+SPACE to bring up code completion.






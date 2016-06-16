# ShaMan: Shape Manipulation Language

An experiment in creating a sablecc-based interpreter for a language that describes
the creation and manipulation of visual shapes on a canvas.

### Some high level goal are:
 - Make it English: Instructions should be normal English sentences.
 - Make it intuitive: Instructions should be what an uninituated person
 would naturally want to say in order to achieve the effect.
 - Support complex programming-language like features including blocks,
 sequences, user defined behaviors and shapes, naming, etc. 
 - Provide powerful control over the shapes, including animations

### Commands that work so far:
`draw a COLOR SHAPE`
Commands like "draw a red dot" or "draw a yellow square" work as expected
and render the appropriate shape.

`move it DIRECTION`
Commands like "move it down" cause the appropriate shape to slide animatedly
to its new position.
The phrase "it" is remembered as the last shape explicitly referred to.
Direction instructions are understood for `up`, `down`, `left`, and `right`.

### Todo:
 - Add a Gradle task to regenerate the parser
 - Support multiple sentences per line like `draw a red dot. move it up.`
 - Add ability to specify shape size
 - Add ability to specify shape position
 - Add ability to move shapes
 - Animations for transitions
 - Add some basic loops like "every number seconds"
 - Add ability to remove like "Remove a yellow square", "Remove any square", "Remove any shape"
 
 
### Commands to support:
`add a shape` - defaults to random shape color and size
`add a dot` - default to random size and color
`add a large dot` - defaults to random color
`add 10 red dots`
`add a yellow dot and a blue dot`
`every 5 seconds, remove a yellow dot and add a blue square`
`every 10 seconds, replace a green dot with a blue dot`

### Selection phrases to support:
`it` is now supported, as in the sequence `draw a dot. make it small.`
`them` See `Them-sreaks` below.
`a` select any element from the set that matches, for example `make a small red dot disappear`
`half of` and similar portions, such as `move half of the red dots left`

#### Them-streaks
Observe the following sequence of commands:

```
draw a red dot
draw a blue dot
move them left
draw a yelow dot
draw a green dot
move them right
```

Note how an English speaker expects the first command to apply to the red and blue dots,
and expects the second command to apply to only the yellow and green dots.
The red and blue dots are left, the yellow and green dots are right.
We will call this expectation "them-streaks".

### Some animation command ideas
`make a blue dot called bobby`
`make bobby bounce`
`stop bobby bouncing`
`continuously make bobby larger. when he is extra larger, make him smaller. when he  is extra small, make him larger`
 
### Regenerate grammar

```
java -jar ../sablecc/sablecc/lib/sablecc.jar ./src/main/java/visual-shapes-manipulator.grammar
```
# ShaMan: Shape Manipulation Language

An experiment in creating a sablecc-based interpreter for a language that describes
the creation and manipulation of visual shapes on a canvas.

### Some high level goal are:
 - Keep the language English
 - Keep the language intuitive
 - Support complex programming-language like features
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

### Some animation command ideas
`make a blue dot called bobby`
`make bobby bounce`
`stop bobby bouncing`
`continuously make bobby larger. when he is extra larger, make him smaller. when he  is extra small, make him larger`
 
### Regenerate grammar

```
java -jar ../sablecc/sablecc/lib/sablecc.jar ./src/main/java/visual-shapes-manipulator.grammar
```
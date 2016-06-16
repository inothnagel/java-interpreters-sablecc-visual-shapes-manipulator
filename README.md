Experimenting with a simple grammar to manipulate shapes on a canvas.

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
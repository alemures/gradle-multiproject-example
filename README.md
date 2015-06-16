gradle-multiproject-example
===

This is a simple piece of code where you can see how to configure two different gradle projects to be compiled in once. The configuration define as well a dependency between `App` and `Lib` so, App can use methods of the module `Lib`.

Both modules have to be in the same folder because `App` is using a relative path to find its dependency `Lib`, this dependency is defined in the file `App/settings.gradle`.

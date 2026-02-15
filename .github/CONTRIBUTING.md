# Contributing to discord-json

## Pull Requests

### Development workflow

Discord4J development is done over multiple branches, favoring our oldest supported branch first and then **merging**
changes forward. For this reason, it is likely that your PR should target that older maintenance branch instead of 
`master`.

As a general rule, if our stable releases are from `1.6.x` branch, changes should always target that. This allows
us to avoid backports and instead merge changes forward applying all necessary changes to newer branches up to `master`.

On the other hand, if the change only affects `1.7.x` line, changes should target that branch, or `master` if it's the 
latest. For more information about our versions check our [docs](https://docs.discord4j.com/versions)

### Style Requirements
* Make sure your IDE is respecting the [.editorconfig](../.editorconfig)
* This project uses space indents.
* Javadocs should be edited appropriately for your changes.
* All new files should have the same LGPL 3 boilerplate header found in existing files.

Finally, thanks again for contributing to Discord4J. When your changes are accepted, make sure to ask about the 
Contributor role in our [Discord server](https://discord.gg/d4j).

![mf-logo](https://raw.githubusercontent.com/boredhero/morefuelsmod-1.14/master/src/main/resources/mf-logo.png)
# morefuelsmod-1.14
This is the active developemnt repo for MFM for Minecraft 1.14.4 v1.7.1+

### Contributors
* Noah Martino (personal.boredhero@gmail.com)

### Credits
* [Cadiboo's Modding Tutorial](https://cadiboo.github.io/tutorials/1.14.4/forge/) + [Example GitHub Repo](https://github.com/Cadiboo/Example-Mod)
* [Skylinerw's Guide](https://github.com/skylinerw/guides/blob/master/java/recipes.md#smelting)
* The Forge Folks
* The Mojang Folks

### License
* [Don't Be a Dick Public License v1.1](https://github.com/boredhero/morefuelsmod-1.14/blob/master/LICENSE.md)  

### Basic Setup Instructions

#### Dependencies:
* Eclipse for Java Developers
* JDK 8 (preferred), 9, or 10 (11+ will not work with this version of Minecraft/Forge)
	* Linux users of the world, yes, OpenJDK is just fine. 
* git command line tools (preferred) OR GUI git client

#### Steps:
* run command: "git clone https://github.com/boredhero/morefuelsmod-1.14"
* cd into morefuelsmod-1.14 folder
* run command: "gradlew eclipse" or "./gradlew eclipse" (for Linux/Mac)
* run command: "gradlew genEclipseRuns" or "./gradlew genEclipseRuns" (for Linux/Mac)
* Open Eclipse, File > Import > Existing Project > Select Folder > Import
* Un-collapse the imported project and make sure there are no errors and that there is a "Referenced Libraries" item

#### Further Notes:
* While it *IS* possible to use IntelliJ IDEA, I **strongly prefer** contributors to use Eclipse just to keep the code nice n pure since this repo has more than just the src folder.
* You can configure the amount of RAM used for script operations/build operations in gradle.properties. Default for this repo is 5 GB but adjust accordingly.

### Building a Jar

#### Basic Instructions:
* cd into morefuelsmod-1.14 directory
* run command: "gradlew build" or "./gradlew build" (for Linux/Mac)
* jar file will be in /morefuelsmod-1.14/build/libs/

#### Advanced:
* jar filename is set to modid-version.jar
* You can change these variables in the file "build.gradle"
	* version = 'version-number"
		* Please use something like Semantic Versioning.
	* group = 'com.yourname.modid'
		* The packaging format for forge mods must be this way.
		* Your main class file should be your modid.
		* The last level/directory name of your package should be your modid.
	* archivesBaseName = 'modid'
		* This can actually be whatever you want but **should** be your modid.
		* It will show up on the other side of the - before the version in the outputted built jar file.

### Test in Game without building
* Make sure you edit the launch files to make sure any reference to "examplemod" is replaced with your modid
* You can run this from Eclipse if you want, but I've had issues with this working on 1.14
* The easiest way is to run command: "gradlew runClient"/"gradlew runServer" or "./gradlew runClient"/"./gradlew runServer" (for Linux/Mac)

## TODO:

* Launch Release Build v1.7.0 on all channels.

## PUSH TO v1.7.1
* Look into combining all of the dried plant smelting json files into one ala [this method](https://github.com/skylinerw/guides/blob/master/java/recipes.md#smelting-ingredient)
* Look into dynamically generating all json files ala [this](https://wiki.mcjty.eu/modding/index.php?title=Tut14_Ep7) to help aid in making them enableable/disableable via a config switch.
* Better config
	* Maayyyybeeeeee GUI config...will still probably push that to v1.8.0
	* Allow RFtL disable from config.
		* Unsure how to control JSONs from config code....
	* Fix the bug currently preventing the config for ore spawning from working
* Adjust build.gradle to include a sources jar in the build folder when building
* Make a stripped down version and release as More Fuels Mod Light
	* Try to do this as a branch on this GitHub repo for better organization going forward.
* Investigate supporting Forge 1.14.2 and 1.14.3 as one jar
	* This may be a little more complicated now because of the mods.toml format. Not sure if it'll allow this at all.

## PUSH TO v1.8.0
* Make chorus and purpur flammable using rEfLeCtIoN (or Block Properties??)
* Add scrap metal
* Make a furance that burns all the wood and outputs scrap metal
* Add processing methods for scrap metal to return back to usable ingots
* GUI Config

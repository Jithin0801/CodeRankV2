# CodeRankV2

Clone the project and build it with the command: mvn clean install -DprojectVersion=1.0 -Duser=Jithin

Changes (Dec 6, 2025):
-Added base project structure
-Added 'util' module for common helper methods which should be added in all micro service's lib folder
-Added base POM and module build support - For new micro services create a new folder in the root path and write the build logic/dependencies in the respective POM and add the module in the root POM and you are good to go.
-Updated gitignore
-Added common response models in util module

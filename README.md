# cmdbuild version 3.3 - build from source on Windows

# Prerequisite
1. Install Sencha CMD version 6.2.2


# Changes made for Build
	1. Src/pom.xml
		a. Removed reference to utils/bugreportcollector Module and utils/alfresco-migrator (just commented out for now.
	2. Src/parent/pom.xml
		a. Updated maven-jar-plugin.version to 3.0.2 (from 2.6)
		b. Updated maven-war-plugin.version to 3.3.1 (from 2.6)
	3. Src/auth/commons/pom.xml
		a. Updated the file path to static path for RolePrivilege and RolePrivilegeAuthority
		b. Updated groovy maven plugin to 2.1.1 (may not be necessary) 
	4. Src/parent/pom.xml
		a. Updated osgeo entry as below
    <repository>
        <id>osgeo</id>
        <name>OSGeo Release Repository</name>
        <url>https://repo.osgeo.org/repository/release/</url>
        <snapshots><enabled>false</enabled></snapshots>
        <releases><enabled>true</enabled></releases>
      </repository>
	5. Remove reference to Alfresco Migrator as the source is missing from thedistribution
		a. Remove cli\src\main\java\org\cmdbuild\utils\cli\commands\AlfrescoCommandRunner.java
		b. Update cli\src\main\java\org\cmdbuild\utils\cli\Main.java to remove the reference to above 
	6. Add _JAVA_OPTIONS environment variable (
	-Xms512m -Xmx2048m
	From <https://forum.sencha.com/forum/showthread.php?304342-com-sencha-exceptions-ExBuild-Failed-to-compress-input> 
	7. Src/ui/pom.xml
		a. Updated maven-war-plugin version to 3.3.1 (from 2.6)
	8. Src/cmdbuild/pom.xml
		a. Provided static path to groovy scripts
		b. Commented out the cm-git-issues execution
	9. Src/utils/quick/pom.xml
		a. Added dependencies for javaxActivation and javax.Annotation 
		<dependency>
			<groupId>com.sun.activation</groupId>
			<artifactId>jakarta.activation</artifactId>
			<version>1.2.2</version>
		</dependency>

		<dependency>
		  <groupId>javax.annotation</groupId>
		  <artifactId>javax.annotation-api</artifactId>
		  <version>1.3.2</version>
		</dependency>
	10. Make the below changes as cmdbuild clustering packages are missing required for shark
		a. Src/test/pom.cml
			i. Remove entry for shark module
		b. Src/shark/pom.xml
Remove enntry for extension-test
